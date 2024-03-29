package com.ingweb.car.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@Data
@NoArgsConstructor
public class Owner {
	@Id @GeneratedValue
    private Long id;
	private String dni;
	private String profession;
    private @NonNull String name;

}
