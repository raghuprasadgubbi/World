package com.raghu.processor;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.raghu.eo.Country;

@Component
public class WorldProcessor {

	public List<Country> getCountries() {
		
		Country c1 = new Country();
		c1.setCapital(new BigDecimal(123));
		c1.setCode2("IN");
		c1.setContinent("Asia");
		c1.setCtyCode("IND");
		c1.setCtyName("India");
		c1.setGnp(new BigDecimal(447114.00));
		c1.setGnpOld(new BigDecimal(430572.00));
		c1.setGovernmentForm("Federal Republic");
		c1.setHeadOfState("Kocheril Raman Narayanan");
		c1.setIndepYear(new BigDecimal(1947));
		c1.setLifeExpectancy(new BigDecimal(62.5));
		c1.setLocalName("Bharat/India");
		c1.setPopulation(new BigDecimal(1013662000));
		c1.setRegion("Southern and Central Asia");
		c1.setSurfaceArea(new BigDecimal(3287263.00));

		List<Country> countryList = new ArrayList<Country>();
		countryList.add(c1);
		return countryList;
	}
}
