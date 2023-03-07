package com.te.day10assignment;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.chrono.Chronology;
import java.util.Date;
import java.util.Scanner;



public class UserMain {

	static Scanner scanner=new Scanner (System.in);
	
	public static Integer getLastdate(String date) {
	
	  String[] split = date.split("-");
      LocalDate dae=LocalDate.of(Integer.parseInt(split[0]),Integer.parseInt(split[1]),Integer.parseInt(split[2]));
      int days=dae.lengthOfMonth();
      
      return days;
	}
}
