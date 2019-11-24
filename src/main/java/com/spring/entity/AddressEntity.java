package com.spring.entity;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter@Setter
public class AddressEntity {

	private String addrLine1;
	private String addrLine2;
	private Integer zipCode;
}
