package com.spring.model;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class UserModel 
{
	private String userName;
	private String age;
	private LocalDate dob;
	private UserAddress address;
}
