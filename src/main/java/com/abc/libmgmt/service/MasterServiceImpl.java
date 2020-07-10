package com.abc.libmgmt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.ApplicationScope;
import org.springframework.web.context.annotation.RequestScope;

import com.abc.libmgmt.tos.Country;

@Service
@ApplicationScope
public class MasterServiceImpl implements MasterServiceIntf {
	
	private List<Country> countries;
	
	public MasterServiceImpl() {
		System.out.println("Master service bean instantiated");
		System.out.println("Initializing the list of countries data");
		countries = new ArrayList<>();
		countries.add(new Country("India", "IN"));
		countries.add(new Country("United states of america", "USA"));
		countries.add(new Country("Australia", "AU"));
		countries.add(new Country("United Kingdom", "UK"));
	}

	@Override
	public List<Country> getCountries() {
		return countries;
	}

}
