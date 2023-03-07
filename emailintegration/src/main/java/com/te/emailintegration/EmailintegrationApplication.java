package com.te.emailintegration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import com.te.emailintegration.service.EmailService;

import jakarta.mail.MessagingException;

@SpringBootApplication
public class EmailintegrationApplication {
	
//	@Autowired
//	private EmailService service;

	public static void main(String[] args) {
		SpringApplication.run(EmailintegrationApplication.class, args);
	}

	//FOR MAIL WITH NO ATTACHEMNT
//	@EventListener(ApplicationReadyEvent.class)
//	public void sendEmail() {
//		service.sendEmail("karthikeyanin17@gmail.com","TESTING EMAIL INTEGRATION","IT'S WORKING");
//	}
	
//	@EventListener(ApplicationReadyEvent.class)
//	public void mailWithAttachment () throws MessagingException {
//		
//		String [] str=new String[3];
//		
//		str[0]="karthikeyanin17@gmail.com";
//		str[1]="sathishenfield1996@gmail.com";
//		str[2]="faridhere1326@gmail.com";
//		
//		service.sendEmailWithAttachment(str,"ATTACHMENT","GOTCHA","C:\\Users\\HP\\Desktop\\TY RESUME\\Testyantra_KarthiKeyan_Java_Developer_2.1Yrs.pdf");
//	}
	
	
	

}
