package com.te.bootwithstream.response;

import java.util.List;

import com.te.bootwithstream.entity.Product;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SuccessResponse <T>{

	private Integer records;
	
	private T reponse;
	
	private Boolean error;
	
	private String msg;
	
	private Object data;
	
	private List obj;
}