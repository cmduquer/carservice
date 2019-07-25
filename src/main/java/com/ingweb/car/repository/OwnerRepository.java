package com.ingweb.car.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.ingweb.car.model.Owner;

@CrossOrigin(origins = "http://localhost:4200")
public interface OwnerRepository extends JpaRepository<Owner, Long> {
	
	List<Owner> findByDni(String dni);

}
