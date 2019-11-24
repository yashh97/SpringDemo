package com.spring.entity;

import java.time.LocalDate;

import javax.persistence.Entity;

import com.spring.model.Address;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter@Setter
public class UserEntity {

	private String userName;
	private String age;
	private LocalDate dob;
	private Address address;
}
