package com.iatspayments.www.NetGate;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="IATSRESPONSE")
public class IATSResponse {
	
	@XmlElement(name="STATUS")
	private String status;
	
	@XmlElement(name="ERRORS")
	private String errors;
	
	@XmlElement(name="PROCESSRESULT")
	private ProcessResult processResult;

	@XmlElement(name="BATCHRESULT")
	private BatchResult batchResult;
	
	@XmlElement(name="AUTHRESULT")
	private AuthResult authResult;
	
	@XmlElement(name="CUSTOMERS")
	private List<Customer> customers;
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getErrors() {
		return errors;
	}
	public void setErrors(String errors) {
		this.errors = errors;
	}
	
	public ProcessResult getProcessResult() {
		return processResult;
	}
	public void setProcessResult(ProcessResult processResult) {
		this.processResult = processResult;
	}
	@Override
	public String toString() {
		return "IatsResponse [status=" + status + ", errors=" + errors
				+ ", processResult=" + processResult + ", batchResult="
				+ batchResult + ", authResult=" + authResult + "]";
	}
	
	
}
