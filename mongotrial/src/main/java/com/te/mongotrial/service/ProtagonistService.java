package com.te.mongotrial.service;

import java.util.List;

import com.te.mongotrial.object.Protagonist;

public interface ProtagonistService {

	public Protagonist add(Protagonist prot);
	
	public  List<Protagonist> getAll();
	
	public Boolean delete(String name);
	
	public Protagonist updateFind(Protagonist prot);
	
	//public Protagonist update(Protagonist prot);
}
