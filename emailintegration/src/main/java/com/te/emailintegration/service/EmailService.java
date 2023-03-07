package com.te.emailintegration.service;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;

@Service
public class EmailService {

	@Autowired
	private JavaMailSender sender;

	public Boolean sendEmail(String toEmail,String subject,String body ) throws MessagingException {
	
		//FOR WITHOUT ATTACHMENTS
		SimpleMailMessage message=new SimpleMailMessage();
		
		message.setFrom("karthikeyan5k5k5@gmail.com");
		message.setTo(toEmail);
		message.setText(body);
		message.setSubject(subject);
		
		sender.send(message);
	
		
		if (message != null) {
			return true;
		}
		
		return false;
		

	}
		public void sendEmailWithAttachment(String[] toEmail,String subject,String body,String attachment) throws MessagingException {
			MimeMessage mime=sender.createMimeMessage();
			
			MimeMessageHelper helper=new MimeMessageHelper(mime,true);
			
			helper.setFrom("karthikeyan5k5k5@gmail.com");
			helper.setTo(toEmail);
			helper.setText(body);
			helper.setSubject(subject);
			
			FileSystemResource fileSystemResource=new FileSystemResource(new File(attachment));
			
			helper.addAttachment(fileSystemResource.getFilename(),fileSystemResource);
			
			sender.send(mime);
		
		}
			
	
}
