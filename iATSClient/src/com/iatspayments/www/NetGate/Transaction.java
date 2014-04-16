package com.iatspayments.www.NetGate;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType
public class Transaction {

	@XmlElement(name="TNTYP")
	private String transactionType;
	
	@XmlElement(name="TNID")
	private String transactionId;
	
	@XmlElement(name="AGT")
	private String agent;
	
	@XmlElement(name="CST")
	private Customer customer;
	
	@XmlElement(name="CC")
	private CreditCard creditCard;
	
	@XmlElement(name="INV")
	private String invoiceNum;
	
	@XmlElement(name="DTM")
	private Date dateTime;
	
	@XmlElement(name="RE")
	private String receiveEmail;
	
	@XmlElement(name="ANM")
	private String anonymously;
	
	@XmlElement(name="IT1")
	private String item1;
	
	@XmlElement(name="IT2")
	private String item2;
	
	@XmlElement(name="IT3")
	private String item3;
	
	@XmlElement(name="IT4")
	private String item4;
	
	@XmlElement(name="IT5")
	private String item5;
	
	@XmlElement(name="IT6")
	private String item6;
	
	@XmlElement(name="AMT")
	private Double amount;
	
	@XmlElement(name="RST")
	private String result;
	
	@XmlElement(name="CM")
	private String comment;
	
	@XmlElement(name="ACH")
	private ACHEFT ach;

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public String getAgent() {
		return agent;
	}

	public void setAgent(String agent) {
		this.agent = agent;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public CreditCard getCreditCard() {
		return creditCard;
	}

	public void setCreditCard(CreditCard creditCard) {
		this.creditCard = creditCard;
	}

	public String getInvoiceNum() {
		return invoiceNum;
	}

	public void setInvoiceNum(String invoiceNum) {
		this.invoiceNum = invoiceNum;
	}

	public Date getDateTime() {
		return dateTime;
	}

	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}

	public String getReceiveEmail() {
		return receiveEmail;
	}

	public void setReceiveEmail(String receiveEmail) {
		this.receiveEmail = receiveEmail;
	}

	public String getAnonymously() {
		return anonymously;
	}

	public void setAnonymously(String anonymously) {
		this.anonymously = anonymously;
	}

	public String getItem1() {
		return item1;
	}

	public void setItem1(String item1) {
		this.item1 = item1;
	}

	public String getItem2() {
		return item2;
	}

	public void setItem2(String item2) {
		this.item2 = item2;
	}

	public String getItem3() {
		return item3;
	}

	public void setItem3(String item3) {
		this.item3 = item3;
	}

	public String getItem4() {
		return item4;
	}

	public void setItem4(String item4) {
		this.item4 = item4;
	}

	public String getItem5() {
		return item5;
	}

	public void setItem5(String item5) {
		this.item5 = item5;
	}

	public String getItem6() {
		return item6;
	}

	public void setItem6(String item6) {
		this.item6 = item6;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public ACHEFT getAch() {
		return ach;
	}

	public void setAch(ACHEFT ach) {
		this.ach = ach;
	}
	
}
