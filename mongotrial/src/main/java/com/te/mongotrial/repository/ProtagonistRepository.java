package com.te.mongotrial.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.te.mongotrial.object.Protagonist;

@Repository
public interface ProtagonistRepository extends MongoRepository<Protagonist, String> {

}
