package com.te.springsecurity.successresponse;

import lombok.Builder;
import lombok.Data;

@Data

@Builder
public class SuccessResponse<T> {
	
	private Integer count;
	
	private T t;

}
