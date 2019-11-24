package com.spring.model;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class UserAddress {
	
	public UserAddress(String addrLine1, String addrLine2, Integer zipCode) {
		super();
		this.addrLine1 = addrLine1;
		this.addrLine2 = addrLine2;
		this.zipCode = zipCode;
	}
	private String addrLine1;
	private String addrLine2;
	private Integer zipCode;

}
