package com.test.address.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.address.domain.Address;

@RestController
@RequestMapping("/api/address/v1")
public class AddressController {
	
	@GetMapping("/get")
	public Address getAddress() {
		Address address = new Address();
		address.setAddressId(1);
		address.setAddressLine1("KPHB");
		address.setAddressLine2("Kukatpally");
		address.setCity("Hyerabad");
		address.setState("TS");
		address.setZipCode("500072");
		
		return address;
	}

}
