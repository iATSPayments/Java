package com.iatspayments.www.NetGate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType
public class ProcessResult {
	
	@XmlElement(name="AUTHORIZATIONRESULT")
	private String authorizationResult;

	@XmlElement(name="CUSTOMERCODE")
	private String customerCode;
	
	@XmlElement(name="REGISTERREFNUMRESULT")
	private String registerRefnumResult;

	@XmlElement(name="BANKERROR")
	private String bankError;

	@XmlElement(name="ACHEFTREFERENCENUM")
	private String acheftReferenceNum;

	@XmlElement(name="SETTLEMENTBATCHDATE")
	private String settlementBatchDate;

	@XmlElement(name="SETTLEMENTDATE")
	private String settlementDate;

	@XmlElement(name="TRANSACTIONID")
	private String transactionId;
	
	public String getAuthorizationResult() {
		return authorizationResult;
	}
	public void setAuthorizationResult(String authorizationResult) {
		this.authorizationResult = authorizationResult;
	}
	public String getCustomerCode() {
		return customerCode;
	}
	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}
	public String getRegisterRefnumResult() {
		return registerRefnumResult;
	}
	public void setRegisterRefnumResult(String registerRefnumResult) {
		this.registerRefnumResult = registerRefnumResult;
	}
	public String getBankError() {
		return bankError;
	}
	public void setBankError(String bankError) {
		this.bankError = bankError;
	}
	public String getAcheftReferenceNum() {
		return acheftReferenceNum;
	}
	public void setAcheftReferenceNum(String acheftReferenceNum) {
		this.acheftReferenceNum = acheftReferenceNum;
	}
	public String getSettlementBatchDate() {
		return settlementBatchDate;
	}
	public void setSettlementBatchDate(String settlementBatchDate) {
		this.settlementBatchDate = settlementBatchDate;
	}
	public String getSettlementDate() {
		return settlementDate;
	}
	public void setSettlementDate(String settlementDate) {
		this.settlementDate = settlementDate;
	}
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	@Override
	public String toString() {
		return "ProcessResult [authorizationResult=" + authorizationResult
				+ ", customerCode=" + customerCode + ", registerRefnumResult="
				+ registerRefnumResult + ", bankError=" + bankError
				+ ", acheftReferenceNum=" + acheftReferenceNum
				+ ", settlementBatchDate=" + settlementBatchDate
				+ ", settlementDate=" + settlementDate + ", transactionId="
				+ transactionId + "]";
	}
	
	
}
