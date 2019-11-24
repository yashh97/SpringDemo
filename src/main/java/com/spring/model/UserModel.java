package com.spring.model;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component
@Getter@Setter
public class UserModel 
{
	private String userName;
	private String age;
	private LocalDate dob;
	private Address address;
}
