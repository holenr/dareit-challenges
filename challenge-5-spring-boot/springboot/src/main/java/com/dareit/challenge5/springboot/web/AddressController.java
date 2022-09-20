package com.dareit.challenge5.springboot.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dareit.challenge5.springboot.data.AddressData;
import com.dareit.challenge5.springboot.model.Address;

@RestController
public class AddressController {

	@Autowired // TODO dont use autowired, use ctor injection instead
	private AddressData addressData;

	@RequestMapping("/addresses")
	public List<Address> retrieveAllAddresses() {
		return addressData.retreiveAllAddresses();
	}

	@RequestMapping("/address")
	public Address retrieveAddress(@RequestParam int id) {
		return addressData.retreiveAddress(id);

	}

}
