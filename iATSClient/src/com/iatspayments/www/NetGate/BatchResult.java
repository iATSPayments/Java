package com.iatspayments.www.NetGate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType
public class BatchResult {

	@XmlElement(name="AUTHORIZATIONRESULT")
	private String authorizationResult;
	
	@XmlElement(name="BATCHID")
	private String batchId;
	
	@XmlElement(name="BATCHPROCESSRESULTFILE")
	private String batchprocessResultFile;

	public String getAuthorizationResult() {
		return authorizationResult;
	}
	public void setAuthorizationResult(String authorizationResult) {
		this.authorizationResult = authorizationResult;
	}
	public String getBatchId() {
		return batchId;
	}
	public void setBatchId(String batchId) {
		this.batchId = batchId;
	}
	public String getBatchprocessResultFile() {
		return batchprocessResultFile;
	}
	public void setBatchprocessResultFile(String batchprocessResultFile) {
		this.batchprocessResultFile = batchprocessResultFile;
	}
	@Override
	public String toString() {
		return "BatchResult [authorizationResult=" + authorizationResult
				+ ", batchId=" + batchId + ", batchprocessResultFile="
				+ batchprocessResultFile + "]";
	}
}
