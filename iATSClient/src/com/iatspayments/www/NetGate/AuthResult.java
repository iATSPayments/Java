package com.iatspayments.www.NetGate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType
public class AuthResult {

	@XmlElement(name="AUTHSTATUS")
	private String authStatus;
	
	@XmlElement(name="AUTHCODE")
	private String authCode;

	@XmlElement(name="ACHREFNUM")
	private String achRefNum;
	
	@XmlElement(name="BANKERROR")
	private String bankError;
	
	@XmlElement(name="BANK_NAME")
	private String bankName;
	
	@XmlElement(name="BANK_BRANCH")
	private String bankBranch;
	
	@XmlElement(name="BANKADDRESS1")
	private String bankAddress1;
	
	@XmlElement(name="BANKADDRESS2")
	private String bankAddress2;
	
	@XmlElement(name="BANKADDRESS3")
	private String bankAddress3;
	
	@XmlElement(name="BANKADDRESS4")
	private String bankAddress4;
	
	@XmlElement(name="BANK_CITY")
	private String bankCity;
	
	@XmlElement(name="BANK_STATE")
	private String bankState;
	
	@XmlElement(name="BANK_POSTCODE")
	private String bankPostcode;

	public String getAuthStatus() {
		return authStatus;
	}

	public void setAuthStatus(String authStatus) {
		this.authStatus = authStatus;
	}

	public String getAuthCode() {
		return authCode;
	}

	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}

	public String getAchRefNum() {
		return achRefNum;
	}

	public void setAchRefNum(String achRefNum) {
		this.achRefNum = achRefNum;
	}

	public String getBankError() {
		return bankError;
	}

	public void setBankError(String bankError) {
		this.bankError = bankError;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBankBranch() {
		return bankBranch;
	}

	public void setBankBranch(String bankBranch) {
		this.bankBranch = bankBranch;
	}

	public String getBankAddress1() {
		return bankAddress1;
	}

	public void setBankAddress1(String bankAddress1) {
		this.bankAddress1 = bankAddress1;
	}

	public String getBankAddress2() {
		return bankAddress2;
	}

	public void setBankAddress2(String bankAddress2) {
		this.bankAddress2 = bankAddress2;
	}

	public String getBankAddress3() {
		return bankAddress3;
	}

	public void setBankAddress3(String bankAddress3) {
		this.bankAddress3 = bankAddress3;
	}

	public String getBankAddress4() {
		return bankAddress4;
	}

	public void setBankAddress4(String bankAddress4) {
		this.bankAddress4 = bankAddress4;
	}

	public String getBankCity() {
		return bankCity;
	}

	public void setBankCity(String bankCity) {
		this.bankCity = bankCity;
	}

	public String getBankState() {
		return bankState;
	}

	public void setBankState(String bankState) {
		this.bankState = bankState;
	}

	public String getBankPostcode() {
		return bankPostcode;
	}

	public void setBankPostcode(String bankPostcode) {
		this.bankPostcode = bankPostcode;
	}

	@Override
	public String toString() {
		return "AuthResult [authStatus=" + authStatus + ", authCode="
				+ authCode + ", achRefNum=" + achRefNum + ", bankError="
				+ bankError + ", bankName=" + bankName + ", bankBranch="
				+ bankBranch + ", bankAddress1=" + bankAddress1
				+ ", bankAddress2=" + bankAddress2 + ", bankAddress3="
				+ bankAddress3 + ", bankAddress4=" + bankAddress4
				+ ", bankCity=" + bankCity + ", bankState=" + bankState
				+ ", bankPostcode=" + bankPostcode + "]";
	}
}
