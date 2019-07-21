package com.ingweb.car;

import java.util.stream.Stream;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.ingweb.car.model.Car;
import com.ingweb.car.model.Owner;
import com.ingweb.car.repository.CarRepository;
import com.ingweb.car.repository.OwnerRepository;

@SpringBootApplication
public class CarServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarServiceApplication.class, args);
	}
	
	@Bean
    ApplicationRunner init(CarRepository repository) {
        return args -> {
            Stream.of("Ferrari", "Jaguar", "Porsche", "Lamborghini", "Bugatti",
                      "AMC Gremlin", "Triumph Stag", "Ford Pinto", "Yugo GV").forEach(name -> {
                Car car = new Car();
                car.setName(name);
                repository.save(car);
            });
            
            repository.findAll().forEach(System.out::println);
        };
    }
	
	@Bean
    ApplicationRunner init2(OwnerRepository repository) {
        return args -> {
            Owner owner = new Owner();
            owner.setDni("1037582890");
            owner.setName("Carlos Mauricio Duque Restrepo");
            owner.setProfession("Software Engineer");
            repository.save(owner);
            repository.findAll().forEach(System.out::println);
        };
    }

}
