package com.te.day10assignment4;

import java.util.Map;
import java.util.Scanner;

public class UserMainCode {
   
    
    
    public static Float costEstimator(Map <String,Float> map,String[] input ) {
       Float out=0.0f;
    	for (int i = 0; i < input.length; i++) {
			for (Map.Entry<String, Float> entry : map.entrySet()) {
				
				if (input[i].equalsIgnoreCase(entry.getKey())) {
					out+=entry.getValue();
				}
				
				
				
			}
		}
     return out;
	}


}
