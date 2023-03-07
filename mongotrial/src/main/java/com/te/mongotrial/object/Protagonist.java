package com.te.mongotrial.object;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document (collection = "Protagonist")
public class Protagonist {

	@Id
	private String name;
	
	private String powers;
	
	
	
}
