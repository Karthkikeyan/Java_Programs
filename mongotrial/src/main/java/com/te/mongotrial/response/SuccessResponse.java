package com.te.mongotrial.response;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SuccessResponse {

	private Boolean error;
	
	private String msg;
	
	private Object data;
	
	private List obj;
}
