package com.iatspayments.www.NetGate;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
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
	
	@XmlElementWrapper(name="CUSTOMERS")
	@XmlElement(name="CST")
	private List<Customer> customers;
	
	@XmlElement(name="FILE")
	private String file;
	
	@XmlElement(name="JOURNALREPORT")
	private JournalReport journalReport;
	
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
	public String getFile() {
		return file;
	}
	public void setFile(String file) {
		this.file = file;
	}
	public BatchResult getBatchResult() {
		return batchResult;
	}
	public void setBatchResult(BatchResult batchResult) {
		this.batchResult = batchResult;
	}
	public AuthResult getAuthResult() {
		return authResult;
	}
	public void setAuthResult(AuthResult authResult) {
		this.authResult = authResult;
	}
	public List<Customer> getCustomers() {
		return customers;
	}
	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}
	public JournalReport getJournalReport() {
		return journalReport;
	}
	public void setJournalReport(JournalReport journalReport) {
		this.journalReport = journalReport;
	}
	
	
}
