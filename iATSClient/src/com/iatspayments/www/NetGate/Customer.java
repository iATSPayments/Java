package com.iatspayments.www.NetGate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType
public class Customer {
	
	@XmlElement(name="CSTC")
	private String customerCode;	
	
	@XmlElement(name="FLN")
	private String fullName;
	
	@XmlElement(name="CO")
	private String companyName;
	
	@XmlElement(name="ADD")
	private String address;
	
	@XmlElement(name="CTY")
	private String city;
	
	@XmlElement(name="ST")
	private String state;
	
	@XmlElement(name="ZC")
	private String postcode;
	
	@XmlElement(name="PH")
	private String phoneNumber;
	
	@XmlElement(name="MB")
	private String mobileNumber;
	
	@XmlElement(name="FX")
	private String fax;
	
	@XmlElement(name="EM")
	private String email;
	
	@XmlElement(name="CM")
	private String comment;
	
	@XmlElement(name="RCR")
	private Recurring recurring;
	
	@XmlElement(name="AC1")
	private AccountType accountType1;
	
	@XmlElement(name="AC2")
	private AccountType accountType2;
	
	@XmlElement(name="FN")
	private String firstName;
	
	@XmlElement(name="LN")
	private String lastName;
	

	public String getCustomerCode() {
		return customerCode;
	}

	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Recurring getRecurring() {
		return recurring;
	}

	public void setRecurring(Recurring recurring) {
		this.recurring = recurring;
	}

	public AccountType getAccountType1() {
		return accountType1;
	}

	public void setAccountType1(AccountType accountType1) {
		this.accountType1 = accountType1;
	}

	public AccountType getAccountType2() {
		return accountType2;
	}

	public void setAccountType2(AccountType accountType2) {
		this.accountType2 = accountType2;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	
	
}
