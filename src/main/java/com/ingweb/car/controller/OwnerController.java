package com.ingweb.car.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ingweb.car.model.Owner;
import com.ingweb.car.repository.OwnerRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class OwnerController {
	
	private OwnerRepository repository;

	public OwnerController(OwnerRepository repository) {
		this.repository = repository;
	}
	
	@GetMapping("/owner")
    @CrossOrigin(origins = "http://localhost:4200")
    public List<Owner> owner(@RequestParam int dni) {
        return repository.findByDni(dni);
    }

}
