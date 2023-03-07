package com.te.springsecurity.dto;

import lombok.Data;

@Data
public class AuthenticationRequest {

	private String empId;
	
	private String pasword;
	
}
