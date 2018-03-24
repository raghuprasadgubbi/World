package com.raghu.eo;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Country {
	
	@Id
	@Column(name="code")
	private String ctyCode;
	
	@Column(name="name")
	private String ctyName;
	
	@Column(name="continent")
	private String continent;
	@Column(name="region")
	private String region;
	@Column(name="surfacearea")
	private BigDecimal surfaceArea;
	@Column(name="indepyear")
	private BigDecimal indepYear;
	@Column(name="population")
	private BigDecimal population;
	@Column(name="lifeexpectancy")
	private BigDecimal lifeExpectancy;
	@Column(name="gnp")
	private BigDecimal gnp;
	@Column(name="gnpold")
	private BigDecimal gnpOld;
	@Column(name="localname")
	private String localName;
	@Column(name="governmentform")
	private String governmentForm;
	@Column(name="headofstate")
	private String headOfState;
	@Column(name="capital")
	private BigDecimal capital;
	@Column(name="code2")
	private String code2;
	
	public String getCtyCode() {
		return ctyCode;
	}
	public void setCtyCode(String ctyCode) {
		this.ctyCode = ctyCode;
	}
	public String getCtyName() {
		return ctyName;
	}
	public void setCtyName(String ctyName) {
		this.ctyName = ctyName;
	}
	public String getContinent() {
		return continent;
	}
	public void setContinent(String continent) {
		this.continent = continent;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public BigDecimal getSurfaceArea() {
		return surfaceArea;
	}
	public void setSurfaceArea(BigDecimal surfaceArea) {
		this.surfaceArea = surfaceArea;
	}
	public BigDecimal getIndepYear() {
		return indepYear;
	}
	public void setIndepYear(BigDecimal indepYear) {
		this.indepYear = indepYear;
	}
	public BigDecimal getPopulation() {
		return population;
	}
	public void setPopulation(BigDecimal population) {
		this.population = population;
	}
	public BigDecimal getLifeExpectancy() {
		return lifeExpectancy;
	}
	public void setLifeExpectancy(BigDecimal lifeExpectancy) {
		this.lifeExpectancy = lifeExpectancy;
	}
	public BigDecimal getGnp() {
		return gnp;
	}
	public void setGnp(BigDecimal gnp) {
		this.gnp = gnp;
	}
	public BigDecimal getGnpOld() {
		return gnpOld;
	}
	public void setGnpOld(BigDecimal gnpOld) {
		this.gnpOld = gnpOld;
	}
	public String getLocalName() {
		return localName;
	}
	public void setLocalName(String localName) {
		this.localName = localName;
	}
	
	public String getGovernmentForm() {
		return governmentForm;
	}
	public void setGovernmentForm(String governmentForm) {
		this.governmentForm = governmentForm;
	}
	public String getHeadOfState() {
		return headOfState;
	}
	public void setHeadOfState(String headOfState) {
		this.headOfState = headOfState;
	}
	public BigDecimal getCapital() {
		return capital;
	}
	public void setCapital(BigDecimal capital) {
		this.capital = capital;
	}
	public String getCode2() {
		return code2;
	}
	public void setCode2(String code2) {
		this.code2 = code2;
	}
	
	
	

}
