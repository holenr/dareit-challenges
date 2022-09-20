package com.dareit.challenge5.springboot.data;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

import com.dareit.challenge5.springboot.model.Address;

@Component
public class AddressData {

	private ArrayList<Address> addresses;

	// TODO: no comments allowed
	// initial sample Address data: (should come come from a database)
	public AddressData() {
		addresses = new ArrayList<>();
		addresses.add(new Address(2, "Via Generale Guisan", 1, 6900, "Lugano", "Schweiz")); // TODO not DRY
		addresses.add(new Address(3, "Im Lindengarten", 2, 9242, "Oberuzwil", "Schweiz"));
	}

	public ArrayList<Address> retreiveAllAddresses() {
		return addresses;
	} // TODO typo

	public Address retreiveAddress(int id) {
		for (Address a : addresses) {
			if (a.getUserId() == id) {
				return a;
			}
		}
		return null;
	}

}
