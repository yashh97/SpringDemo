package com.spring.model;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component
@Getter@Setter
public class Address {
	
	public Address(String addrLine1, String addrLine2, Integer zipCode) {
		super();
		this.addrLine1 = addrLine1;
		this.addrLine2 = addrLine2;
		this.zipCode = zipCode;
	}
	private String addrLine1;
	private String addrLine2;
	private Integer zipCode;

}
