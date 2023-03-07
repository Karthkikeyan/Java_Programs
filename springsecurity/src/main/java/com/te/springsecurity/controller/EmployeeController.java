package com.te.springsecurity.controller;

import java.net.http.HttpRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.te.springsecurity.dto.AuthenticationRequest;
import com.te.springsecurity.dto.AuthenticationResponse;
import com.te.springsecurity.entity.Employee;
import com.te.springsecurity.jwtutil.EmployeeJWT;
import com.te.springsecurity.service.EmployeeService;
import com.te.springsecurity.service.EmployeeServiceImpl;
import com.te.springsecurity.successresponse.SuccessResponse;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService serv;
	
	@Autowired
	private AuthenticationManager manager;
	
	@Autowired
	private EmployeeJWT jwt;
	
	@Autowired
	private UserDetailsService detailsService;

	@PostMapping("/authenticate")
	public ResponseEntity<AuthenticationResponse> getAuthenticate(@RequestBody AuthenticationRequest request) {
		manager.authenticate(new UsernamePasswordAuthenticationToken(request.getEmpId(), request.getPasword()));
		UserDetails loadUserByUsername = detailsService.loadUserByUsername(request.getEmpId());
		String generateToken = jwt.generateToken(loadUserByUsername);
		return new ResponseEntity<AuthenticationResponse> (new AuthenticationResponse(generateToken),HttpStatus.OK);
		
	}
	
	@PostMapping("/add")
	public ResponseEntity<?> register (@RequestBody Employee employee ) {
		Employee addEmployee = serv.addEmployee(employee);
		if (addEmployee!=null) {
			
			return new ResponseEntity<String>("DATA SAVED",HttpStatus.OK);
		} else {
			return new ResponseEntity<String>("DATA NOT SAVED",HttpStatus.BAD_GATEWAY);
		}
	}
	
	@GetMapping("/get")
	public ResponseEntity<SuccessResponse> getEmployee (HttpServletRequest request) {
		
			String header=request.getHeader("Authorization");
			String substring = header.substring(7);
			Employee employee = serv.getEmployee(jwt.extractUsername(substring));
			
			if (employee!=null) {
				return new ResponseEntity<SuccessResponse>(SuccessResponse.builder().t(employee).build(),HttpStatus.OK);
			} else {
				return new ResponseEntity<SuccessResponse>(SuccessResponse.builder().t(employee).build(),HttpStatus.BAD_GATEWAY);
			}
	}
	
	
}
