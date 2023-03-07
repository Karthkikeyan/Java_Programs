package com.te.day10assignment4;

import java.util.Scanner;

public class Devices {

	static Scanner scanner=new Scanner (System.in);
	
	private String name;
	
	private Integer price;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Devices(String name, Integer price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	
}
