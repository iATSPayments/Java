package com.iatspayments.www.NetGate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType
public class AccountType {

	@XmlElement(name="ACH")
	private ACHEFT ach;
	
	@XmlElement(name="CC")
	private CreditCard creditCard;

	public ACHEFT getAch() {
		return ach;
	}

	public void setAch(ACHEFT ach) {
		this.ach = ach;
	}

	public CreditCard getCreditCard() {
		return creditCard;
	}

	public void setCreditCard(CreditCard creditCard) {
		this.creditCard = creditCard;
	}
	
	
}
