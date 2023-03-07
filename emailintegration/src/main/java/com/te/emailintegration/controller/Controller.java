package com.te.emailintegration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.te.emailintegration.service.EmailService;

import jakarta.mail.MessagingException;

@RestController
public class Controller {

	@Autowired
	private EmailService serv;
	
	
	@GetMapping("/Without attachment")
	public ResponseEntity<?> sendEmail() throws MessagingException {
		Boolean sendEmail = serv.sendEmail("karthikeyanin17@gmail.com","SUBJECT TESTING MAIL"," BODY IT'S WORKING");
		if (sendEmail) {
			return new ResponseEntity<String>("MAIL SENT WITHOUT ATTACHMENT",HttpStatus.OK);
		} else {
			return new ResponseEntity<String>("MAIL NOT  SENT WITHOUT ATTACHMENT",HttpStatus.BAD_GATEWAY);
		}
	}
	
	
	@GetMapping("/with attachment")
	public ResponseEntity<?> withAttachemnt () throws MessagingException {

		
		String [] str=new String[3];
		
		str[0]="karthikeyanin17@gmail.com";
		str[1]="sathishenfield1996@gmail.com";
		str[2]="faridhere1326@gmail.com";
		
		serv.sendEmailWithAttachment(str,"ATTACHMENT","GOTCHA","C:\\Users\\HP\\Desktop\\TY RESUME\\Testyantra_KarthiKeyan_Java_Developer_2.1Yrs.pdf");
		
		return new ResponseEntity<String>("ATTACHEMNT SENT",HttpStatus.OK);
	}
	}
	
	

