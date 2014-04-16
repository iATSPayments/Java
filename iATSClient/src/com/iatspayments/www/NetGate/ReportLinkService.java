package com.iatspayments.www.NetGate;

import java.io.StringReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class ReportLinkService {

	private ReportLinkSoapProxy service = null;
	private Unmarshaller unmarshaller = null;

	public ReportLinkService() throws JAXBException {
		service = new ReportLinkSoapProxy();
		JAXBContext context = JAXBContext.newInstance(IATSResponse.class);
		unmarshaller = context.createUnmarshaller();
	}

	// FILE object methods

	/**
	 * This service is for request a report of approved credit card transactions. The returned reports will include a record of all approved credit card transactions for the date specified in the parameters.
	 * @param GetCreditCardJournalCSVV1
	 * @return IATSResponse
	 * @throws java.rmi.RemoteException
	 * @throws JAXBException
	 */
	public IATSResponse getCreditCardJournalCSV(
			GetCreditCardJournalCSVV1 parameters)
			throws java.rmi.RemoteException, JAXBException {
		GetCreditCardJournalCSVV1Response response = service
				.getCreditCardJournalCSV(parameters);
		GetCreditCardJournalCSVV1ResponseGetCreditCardJournalCSVV1Result result = response
				.getGetCreditCardJournalCSVV1Result();
		IATSResponse iatsResponse = (IATSResponse) unmarshaller
				.unmarshal(new StringReader(result.get_any()[0].toString()));
		return iatsResponse;
	}

	/**
	 * This service is for request a report of rejected credit card transactions. The returned reports will include a record of all rejected credit card transactions for the date specified in the parameters.
	 * @param GetCreditCardRejectCSVV1
	 * @return IATSResponse
	 * @throws java.rmi.RemoteException
	 * @throws JAXBException
	 */
	
	public IATSResponse getCreditCardRejectCSV(
			GetCreditCardRejectCSVV1 parameters)
			throws java.rmi.RemoteException, JAXBException {
		GetCreditCardRejectCSVV1Response response = service
				.getCreditCardRejectCSV(parameters);
		GetCreditCardRejectCSVV1ResponseGetCreditCardRejectCSVV1Result result = response
				.getGetCreditCardRejectCSVV1Result();
		IATSResponse iatsResponse = (IATSResponse) unmarshaller
				.unmarshal(new StringReader(result.get_any()[0].toString()));
		return iatsResponse;
	}

	/**
	 * This service is for request a report of approved ACHEFT transactions. The returned report will include a record of all approved ACHEFT transactions for the date specified in the parameters..
	 * @param GetACHEFTJournalCSVV1
	 * @return IATSResponse
	 * @throws java.rmi.RemoteException
	 * @throws JAXBException
	 */
	
	public IATSResponse getACHEFTJournalCSV(GetACHEFTJournalCSVV1 parameters)
			throws java.rmi.RemoteException, JAXBException {
		GetACHEFTJournalCSVV1Response response = service
				.getACHEFTJournalCSV(parameters);
		GetACHEFTJournalCSVV1ResponseGetACHEFTJournalCSVV1Result result = response
				.getGetACHEFTJournalCSVV1Result();
		IATSResponse iatsResponse = (IATSResponse) unmarshaller
				.unmarshal(new StringReader(result.get_any()[0].toString()));
		return iatsResponse;
	}

	/**
	 * This service is for request a report of ACHEFT transactions that have been returned. The reports will include a record of all ACHEFT returns for the date specified in the parameters.
	 * @param GetACHEFTReturnCSVV1
	 * @return IATSResponse
	 * @throws java.rmi.RemoteException
	 * @throws JAXBException
	 */
	
	public IATSResponse getACHEFTReturnCSV(GetACHEFTReturnCSVV1 parameters)
			throws java.rmi.RemoteException, JAXBException {
		GetACHEFTReturnCSVV1Response response = service
				.getACHEFTReturnCSV(parameters);
		GetACHEFTReturnCSVV1ResponseGetACHEFTReturnCSVV1Result result = response
				.getGetACHEFTReturnCSVV1Result();
		IATSResponse iatsResponse = (IATSResponse) unmarshaller
				.unmarshal(new StringReader(result.get_any()[0].toString()));
		return iatsResponse;
	}

	/**
	 * This service is for request a report of credit card transactions between two dates.
	 * @param GetCreditCardPaymentBoxJournalCSVV1
	 * @return IATSResponse
	 * @throws java.rmi.RemoteException
	 * @throws JAXBException
	 */
	
	public IATSResponse getCreditCardPaymentBoxJournalCSV(
			GetCreditCardPaymentBoxJournalCSVV1 parameters)
			throws java.rmi.RemoteException, JAXBException {
		GetCreditCardPaymentBoxJournalCSVV1Response response = service
				.getCreditCardPaymentBoxJournalCSV(parameters);
		GetCreditCardPaymentBoxJournalCSVV1ResponseGetCreditCardPaymentBoxJournalCSVV1Result result = response
				.getGetCreditCardPaymentBoxJournalCSVV1Result();
		IATSResponse iatsResponse = (IATSResponse) unmarshaller
				.unmarshal(new StringReader(result.get_any()[0].toString()));
		return iatsResponse;
	}

	/**
	 * This service is for request a report of rejected credit card transactions between two dates.
	 * @param GetCreditCardPaymentBoxRejectCSVV1
	 * @return IATSResponse
	 * @throws java.rmi.RemoteException
	 * @throws JAXBException
	 */
	
	public IATSResponse getCreditCardPaymentBoxRejectCSV(
			GetCreditCardPaymentBoxRejectCSVV1 parameters)
			throws java.rmi.RemoteException, JAXBException {
		GetCreditCardPaymentBoxRejectCSVV1Response response = service
				.getCreditCardPaymentBoxRejectCSV(parameters);
		GetCreditCardPaymentBoxRejectCSVV1ResponseGetCreditCardPaymentBoxRejectCSVV1Result result = response
				.getGetCreditCardPaymentBoxRejectCSVV1Result();
		IATSResponse iatsResponse = (IATSResponse) unmarshaller
				.unmarshal(new StringReader(result.get_any()[0].toString()));
		return iatsResponse;
	}

	/**
	 * This service is for request a detail report of approved ACHEFT transactions between two dates.
	 * @param GetACHEFTPaymentBoxJournalCSVV1
	 * @return IATSResponse
	 * @throws java.rmi.RemoteException
	 * @throws JAXBException
	 */
	
	public IATSResponse getACHEFTPaymentBoxJournalCSV(
			GetACHEFTPaymentBoxJournalCSVV1 parameters)
			throws java.rmi.RemoteException, JAXBException {
		GetACHEFTPaymentBoxJournalCSVV1Response response = service
				.getACHEFTPaymentBoxJournalCSV(parameters);
		GetACHEFTPaymentBoxJournalCSVV1ResponseGetACHEFTPaymentBoxJournalCSVV1Result result = response
				.getGetACHEFTPaymentBoxJournalCSVV1Result();
		IATSResponse iatsResponse = (IATSResponse) unmarshaller
				.unmarshal(new StringReader(result.get_any()[0].toString()));
		return iatsResponse;
	}

	/**
	 * This service is for request a detail report of rejected ACHEFT transactions between two dates.
	 * @param GetACHEFTPaymentBoxRejectCSVV1
	 * @return IATSResponse
	 * @throws java.rmi.RemoteException
	 * @throws JAXBException
	 */
	
	public IATSResponse getACHEFTPaymentBoxRejectCSV(
			GetACHEFTPaymentBoxRejectCSVV1 parameters)
			throws java.rmi.RemoteException, JAXBException {
		GetACHEFTPaymentBoxRejectCSVV1Response response = service
				.getACHEFTPaymentBoxRejectCSV(parameters);
		GetACHEFTPaymentBoxRejectCSVV1ResponseGetACHEFTPaymentBoxRejectCSVV1Result result = response
				.getGetACHEFTPaymentBoxRejectCSVV1Result();
		IATSResponse iatsResponse = (IATSResponse) unmarshaller
				.unmarshal(new StringReader(result.get_any()[0].toString()));
		return iatsResponse;
	}

	/**
	 * This service is for request a report of the bank balance of credit card transactions. The report will include a balance statement for credit card transactions between the two dates specified in the fromDate and toDate fields.
	 * @param GetCreditCardBankReconciliationReportCSVV1
	 * @return IATSResponse
	 * @throws java.rmi.RemoteException
	 * @throws JAXBException
	 */
	
	public IATSResponse getCreditCardBankReconciliationReportCSV(
			GetCreditCardBankReconciliationReportCSVV1 parameters)
			throws java.rmi.RemoteException, JAXBException {
		GetCreditCardBankReconciliationReportCSVV1Response response = service
				.getCreditCardBankReconciliationReportCSV(parameters);
		GetCreditCardBankReconciliationReportCSVV1ResponseGetCreditCardBankReconciliationReportCSVV1Result result = response
				.getGetCreditCardBankReconciliationReportCSVV1Result();
		IATSResponse iatsResponse = (IATSResponse) unmarshaller
				.unmarshal(new StringReader(result.get_any()[0].toString()));
		return iatsResponse;
	}

	/**
	 * This service is for request a report of the bank balance of ACHEFT transactions. The report will include a balance statement for ACHEFT transactions between the two dates specified in the fromDate and toDate fields.
	 * @param GetACHEFTBankReconciliationReportCSVV1
	 * @return IATSResponse
	 * @throws java.rmi.RemoteException
	 * @throws JAXBException
	 */
	
	public IATSResponse getACHEFTBankReconciliationReportCSV(
			GetACHEFTBankReconciliationReportCSVV1 parameters)
			throws java.rmi.RemoteException, JAXBException {
		GetACHEFTBankReconciliationReportCSVV1Response response = service
				.getACHEFTBankReconciliationReportCSV(parameters);
		GetACHEFTBankReconciliationReportCSVV1ResponseGetACHEFTBankReconciliationReportCSVV1Result result = response
				.getGetACHEFTBankReconciliationReportCSVV1Result();
		IATSResponse iatsResponse = (IATSResponse) unmarshaller
				.unmarshal(new StringReader(result.get_any()[0].toString()));
		return iatsResponse;
	}

	/**
	 * This service is for request a report of rejected ACHEFT transactions. The returned reports will include a record of all rejected ACHEFT transactions for the date specified in the parameters.
	 * @param GetACHEFTRejectCSVV1
	 * @return IATSResponse
	 * @throws java.rmi.RemoteException
	 * @throws JAXBException
	 */
	
	public IATSResponse getACHEFTRejectCSV(GetACHEFTRejectCSVV1 parameters)
			throws java.rmi.RemoteException, JAXBException {
		GetACHEFTRejectCSVV1Response response = service
				.getACHEFTRejectCSV(parameters);
		GetACHEFTRejectCSVV1ResponseGetACHEFTRejectCSVV1Result result = response
				.getGetACHEFTRejectCSVV1Result();
		IATSResponse iatsResponse = (IATSResponse) unmarshaller
				.unmarshal(new StringReader(result.get_any()[0].toString()));
		return iatsResponse;
	}

	// Byte array response

	/**
	 * This service is for request a report of Credit card transaction.   
	 * @param GetCCJournalCSV_x0020_V1
	 * @return byte[]
	 * @throws java.rmi.RemoteException
	 * @throws JAXBException
	 */
	
	public byte[] getCCJournalCSV(GetCCJournalCSV_x0020_V1 parameters)
			throws java.rmi.RemoteException {
		GetCCJournalCSV_x0020_V1Response response = service
				.getCCJournalCSV(parameters);
		return response.getGetCCJournalCSV_x0020_V1Result();
	}

	/**
	 * This service will generate an encoded base64binary response
	 * @param GetACHJournalCSV_x0020_V1
	 * @return byte[]
	 * @throws java.rmi.RemoteException
	 * @throws JAXBException
	 */
	
	public byte[] getACHJournalCSV(GetACHJournalCSV_x0020_V1 parameters)
			throws java.rmi.RemoteException {
		GetACHJournalCSV_x0020_V1Response response = service
				.getACHJournalCSV(parameters);
		return response.getGetACHJournalCSV_x0020_V1Result();
	}

	/**
	 * This service will generate an encoded base64binary response.
	 * @param GetCCPaymentBoxJournalCSV_x0020_V1
	 * @return byte[]
	 * @throws java.rmi.RemoteException
	 * @throws JAXBException
	 */
	
	public byte[] getCCPaymentBoxJournalCSV(
			GetCCPaymentBoxJournalCSV_x0020_V1 parameters)
			throws java.rmi.RemoteException {
		GetCCPaymentBoxJournalCSV_x0020_V1Response response = service
				.getCCPaymentBoxJournalCSV(parameters);
		return response.getGetCCPaymentBoxJournalCSV_x0020_V1Result();
	}

	/**
	 * This service will generate an encoded base64binary response.
	 * @param GetACHEFTPaymentBoxJournalCSV_x0020_V1
	 * @return byte[]
	 * @throws java.rmi.RemoteException
	 * @throws JAXBException
	 */
	
	public byte[] getACHEFTPaymentBoxJournalCSV(
			GetACHEFTPaymentBoxJournalCSV_x0020_V1 parameters)
			throws java.rmi.RemoteException {
		GetACHEFTPaymentBoxJournalCSV_x0020_V1Response response = service
				.getACHEFTPaymentBoxJournalCSV(parameters);
		return response.getGetACHEFTPaymentBoxJournalCSV_x0020_V1Result();
	}

	// Journal Report

	/**
	 * This service will generate an encoded base64binary response.
	 * @param GetCreditCardJournalV1
	 * @return IATSResponse
	 * @throws java.rmi.RemoteException
	 * @throws JAXBException
	 */
	
	public IATSResponse getCreditCardJournal(GetCreditCardJournalV1 parameters)
			throws java.rmi.RemoteException, JAXBException {
		GetCreditCardJournalV1Response response = service
				.getCreditCardJournal(parameters);
		GetCreditCardJournalV1ResponseGetCreditCardJournalV1Result result = response
				.getGetCreditCardJournalV1Result();
		IATSResponse iatsResponse = (IATSResponse) unmarshaller
				.unmarshal(new StringReader(result.get_any()[0].toString()));
		return iatsResponse;
	}

	/**
	 * This service will generate an encoded base64binary response.
	 * @param GetCreditCardRejectV1
	 * @return IATSResponse
	 * @throws java.rmi.RemoteException
	 * @throws JAXBException
	 */
	
	public IATSResponse getCreditCardReject(GetCreditCardRejectV1 parameters)
			throws java.rmi.RemoteException, JAXBException {
		GetCreditCardRejectV1Response response = service
				.getCreditCardReject(parameters);
		GetCreditCardRejectV1ResponseGetCreditCardRejectV1Result result = response
				.getGetCreditCardRejectV1Result();
		IATSResponse iatsResponse = (IATSResponse) unmarshaller
				.unmarshal(new StringReader(result.get_any()[0].toString()));
		return iatsResponse;
	}

	/**
	 * This service will generate an encoded base64binary response.
	 * @param GetACHEFTJournalV1
	 * @return IATSResponse
	 * @throws java.rmi.RemoteException
	 * @throws JAXBException
	 */
	
	public IATSResponse getACHEFTJournal(GetACHEFTJournalV1 parameters)
			throws java.rmi.RemoteException, JAXBException {
		GetACHEFTJournalV1Response response = service
				.getACHEFTJournal(parameters);
		GetACHEFTJournalV1ResponseGetACHEFTJournalV1Result result = response
				.getGetACHEFTJournalV1Result();
		IATSResponse iatsResponse = (IATSResponse) unmarshaller
				.unmarshal(new StringReader(result.get_any()[0].toString()));
		return iatsResponse;
	}

	/**
	 * This service will generate an encoded base64binary response.
	 * @param GetACHEFTRejectV1
	 * @return IATSResponse
	 * @throws java.rmi.RemoteException
	 * @throws JAXBException
	 */
	
	public IATSResponse getACHEFTReject(GetACHEFTRejectV1 parameters)
			throws java.rmi.RemoteException, JAXBException {
		GetACHEFTRejectV1Response response = service
				.getACHEFTReject(parameters);
		GetACHEFTRejectV1ResponseGetACHEFTRejectV1Result result = response
				.getGetACHEFTRejectV1Result();
		IATSResponse iatsResponse = (IATSResponse) unmarshaller
				.unmarshal(new StringReader(result.get_any()[0].toString()));
		return iatsResponse;
	}

	/**
	 * This service will generate an encoded base64binary response.
	 * @param GetACHEFTReturnV1
	 * @return IATSResponse
	 * @throws java.rmi.RemoteException
	 * @throws JAXBException
	 */
	
	public IATSResponse getACHEFTReturn(GetACHEFTReturnV1 parameters)
			throws java.rmi.RemoteException, JAXBException {
		GetACHEFTReturnV1Response response = service
				.getACHEFTReturn(parameters);
		GetACHEFTReturnV1ResponseGetACHEFTReturnV1Result result = response
				.getGetACHEFTReturnV1Result();
		IATSResponse iatsResponse = (IATSResponse) unmarshaller
				.unmarshal(new StringReader(result.get_any()[0].toString()));
		return iatsResponse;
	}

}
