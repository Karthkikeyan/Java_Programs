package com.te.springsecurity.filter;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.authentication.WebAuthenticationDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import com.te.springsecurity.jwtutil.EmployeeJWT;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class EmployeeJWTFilter  extends OncePerRequestFilter{

	@Autowired
	private EmployeeJWT employeeJWT;
	
	@Autowired
	private UserDetailsService detailsService;
	
	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		String jwt=null;
		String extractUserName=null;
		String header=request.getHeader("Authorization");
		if (header!=null && header.startsWith("Bearer ") ) {
			jwt=header.substring(7);
			extractUserName=employeeJWT.extractUsername(jwt);
		}
		if (extractUserName!=null && SecurityContextHolder.getContext().getAuthentication()==null) {
			UserDetails userDetails=detailsService.loadUserByUsername(extractUserName);
			if (employeeJWT.validateToken(jwt, userDetails)) {
				UsernamePasswordAuthenticationToken authenticationToken=new UsernamePasswordAuthenticationToken(null,userDetails,userDetails.getAuthorities());
				authenticationToken.setDetails(new WebAuthenticationDetailsSource());
				SecurityContextHolder.getContext().setAuthentication(authenticationToken);
			}
			
		}
		filterChain.doFilter(request, response);
	}

}
