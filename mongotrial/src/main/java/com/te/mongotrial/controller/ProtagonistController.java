package com.te.mongotrial.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.te.mongotrial.object.Protagonist;
import com.te.mongotrial.response.SuccessResponse;
import com.te.mongotrial.service.ProtagonistService;

@RestController
public class ProtagonistController {

	@Autowired
	private ProtagonistService serv;
	
	@PostMapping ("/add")
	public ResponseEntity<?> addProtagonist(@RequestBody Protagonist prot){
		
		Protagonist add = serv.add(prot);
		
		if (add!=null) {
			return new ResponseEntity<>(SuccessResponse.builder().data(add).error(true).msg("ADDED").build(),HttpStatus.OK);
		} else {
			return new ResponseEntity<>(SuccessResponse.builder().data(add).error(false).msg("NOT ADDED").build(),HttpStatus.BAD_GATEWAY);
		}
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<SuccessResponse>  getAll() {
		
		List<Protagonist> all = serv.getAll();
		
		if (all!=null) {
			return new ResponseEntity<SuccessResponse>(SuccessResponse.builder().error(true).msg("FOUND").obj(all).build(),HttpStatus.OK);
		} else {
			return new ResponseEntity<SuccessResponse>(SuccessResponse.builder().error(false).msg("NO DATA FOUND").obj(all).build(),HttpStatus.BAD_REQUEST);
		}
		
	}
	
	@GetMapping("/delete")
	public ResponseEntity<SuccessResponse> delete(String name) {
		Boolean delete = serv.delete(name);
		if (delete) {
			return new ResponseEntity<SuccessResponse>(SuccessResponse.builder().error(true).msg("DELETED").build(),HttpStatus.OK); 
		} else {
			return new ResponseEntity<SuccessResponse>(SuccessResponse.builder().error(false).msg("NOT FOUND").build(),HttpStatus.OK);
		}
		
	}
	
	@PostMapping("/updateFind")
	public ResponseEntity<SuccessResponse> updateFind (@RequestBody Protagonist prot) {
		
		 Protagonist updateFind = serv.updateFind(prot);
		 
		 if (updateFind!=null) {
			 return new ResponseEntity<>(SuccessResponse.builder().data(updateFind).error(true).msg("UPDATED").build(),HttpStatus.OK);
		} else {
			return new ResponseEntity<>(SuccessResponse.builder().data(updateFind).error(false).msg("NOT UPDATED").build(),HttpStatus.OK);
		}
		
		
	}
	
//	@PostMapping("/update")
//public ResponseEntity<SuccessResponse> update (@RequestBody Protagonist prot) {
//		
//		 Protagonist update = serv.update(prot);
//		
//		if (update != null) {
//			return new ResponseEntity<SuccessResponse>(SuccessResponse.builder().error(true).data(update).msg("UPDATED").build(),HttpStatus.OK);
//		} else {
//			return new ResponseEntity<SuccessResponse>(SuccessResponse.builder().msg("NOT DONE").data(update).error(false).build(),HttpStatus.BAD_GATEWAY);
//		}
//	}
	
}
