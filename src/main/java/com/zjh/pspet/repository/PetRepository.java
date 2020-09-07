package com.zjh.pspet.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.zjh.pspet.entity.Pet;
import com.zjh.pspet.enums.Status;

@Repository
public interface PetRepository extends MongoRepository<Pet, String> {

	// @Query()
	List<Pet> getPetsByStatus(Status status);
}
