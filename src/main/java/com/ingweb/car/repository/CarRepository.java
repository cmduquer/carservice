package com.ingweb.car.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ingweb.car.model.Car;

public interface CarRepository extends JpaRepository<Car, Long> {

}
