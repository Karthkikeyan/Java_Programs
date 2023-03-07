package com.te.mongotrial.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.mongotrial.object.Protagonist;
import com.te.mongotrial.repository.ProtagonistRepository;

@Service
public class ProtagonistServiceImpl implements ProtagonistService{

	@Autowired
	private ProtagonistRepository repo;
	@Override
	public Protagonist add(Protagonist prot) {
		
		return repo.save(prot);
	}
	@Override
	public List<Protagonist> getAll() {
		
		return repo.findAll();
	}
	@Override
	public Boolean delete(String name) {
		
		Optional<Protagonist> findById = repo.findById(name);
		
		if (findById.isPresent()) {
			repo.deleteById(name);
			return true;
		} else {
              return false;
		}
		
		
		
	}
	@Override
	public Protagonist updateFind(Protagonist prot) {
		 Optional<Protagonist> findById = repo.findById(prot.getName());
          
		 
		if (findById.isPresent()) {
			Protagonist protagonist = findById.get();
			protagonist.setName(prot.getName());
			protagonist.setPowers(prot.getPowers());
			
			return repo.save(protagonist);
		} else {
             return null;
		}
	
	}
//	@Override
//	public Protagonist update(Protagonist prot) {
//		
//		return repo.insert(prot);
//	}

}
