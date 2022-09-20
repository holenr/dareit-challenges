package com.dareit.challenge5.springboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController {

	@RequestMapping("/addresses")
	public List<Address> retrieveAllAddresses() {
		return Arrays.asList(
				new Address("Via Generale Guisan", 1, 6900, "Lugano", "Schweiz"),
				new Address("Im Lindengarten", 2, 9242, "Oberuzwil", "Schweiz")
				);
	}


	@RequestMapping("/addresses/{id}")
	public Address retrieveAddress() {
		return (new Address("Via Generale Guisan", 1, 6900, "Lugano", "Schweiz"));

	}




}
