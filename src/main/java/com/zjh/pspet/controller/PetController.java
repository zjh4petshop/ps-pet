package com.zjh.pspet.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zjh.pspet.entity.Pet;
import com.zjh.pspet.repository.PetRepository;

@RestController
@RequestMapping("/pet")
public class PetController {

	@Autowired
	private PetRepository petRepository;

	@PostMapping("/")
	public ResponseEntity<Pet> createPet(@RequestBody Pet pet) {
		Pet newPet = petRepository.save(pet);
		return ResponseEntity.ok(newPet);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Pet> getPetById(@PathVariable String id) {
		Optional<Pet> optionalPet = petRepository.findById(id);
		if (optionalPet.isPresent()) {
			return ResponseEntity.ok(optionalPet.get());
		} else {
			return ResponseEntity.notFound().build();
		}
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deletePetById(@PathVariable String id) {
		petRepository.deleteById(id);
		return ResponseEntity.ok().build();
	}
}
