package com.iatspayments.www.NetGate;

import java.io.StringReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;


public class ProcessLinkService {
	
	private ProcessLinkSoapProxy service = null;
	private Unmarshaller unmarshaller = null;
	
	/**
	 * Creates instance for NA region
	 * @throws JAXBException
	 */
	public ProcessLinkService() throws JAXBException {
		service = new ProcessLinkSoapProxy();
		JAXBContext context = JAXBContext.newInstance(IATSResponse.class);
		unmarshaller = context.createUnmarshaller();
	}

	/**
	 * Creates instance for the specified EndPoint
	 * @param endPoint
	 * @throws JAXBException
	 */
	public ProcessLinkService(String endPoint) throws JAXBException {
		service = new ProcessLinkSoapProxy(endPoint);
		JAXBContext context = JAXBContext.newInstance(IATSResponse.class);
		unmarshaller = context.createUnmarshaller();
	}

	/**
	 * This service is for when you want to create a credit card customer code (Recurring is set to false) and to process a cedit card transaction at the same time.
	 * The customer code can be used to process single transactions in the future or be set for subsequent, recurring transactions (Recurring is updated to true).
	 * @param CreateCustomerCodeAndProcessCreditCardV1
	 * @return IATSResponse
	 * @throws java.rmi.RemoteException
	 * @throws JAXBException
	 */
	public IATSResponse createCustomerCodeAndProcessCreditCard(CreateCustomerCodeAndProcessCreditCardV1 parameters) throws java.rmi.RemoteException, JAXBException{
		CreateCustomerCodeAndProcessCreditCardV1Response response = service.createCustomerCodeAndProcessCreditCard(parameters);
		CreateCustomerCodeAndProcessCreditCardV1ResponseCreateCustomerCodeAndProcessCreditCardV1Result result = response.getCreateCustomerCodeAndProcessCreditCardV1Result();
		IATSResponse iatsResponse = (IATSResponse) unmarshaller.unmarshal(new StringReader(result.get_any()[0].toString()));
		return iatsResponse;
	}

	/**
	 * This service is for when you want to process a single credit card transaction using an existing credit card customer code
	 * @param ProcessCreditCardWithCustomerCodeV1
	 * @return IATSResponse
	 * @throws java.rmi.RemoteException
	 * @throws JAXBException
	 */
	public IATSResponse processCreditCardWithCustomerCode(ProcessCreditCardWithCustomerCodeV1 parameters) throws java.rmi.RemoteException, JAXBException{
		ProcessCreditCardWithCustomerCodeV1Response response = service.processCreditCardWithCustomerCode(parameters);
		ProcessCreditCardWithCustomerCodeV1ResponseProcessCreditCardWithCustomerCodeV1Result result = response.getProcessCreditCardWithCustomerCodeV1Result();
		IATSResponse iatsResponse = (IATSResponse) unmarshaller.unmarshal(new StringReader(result.get_any()[0].toString()));
		return iatsResponse;
	}

	/**
	 * This is when you want to do a once-off credit card transaction without needing a customer code (token) to be used or created
	 * @param ProcessCreditCardV1
	 * @return IATSResponse
	 * @throws java.rmi.RemoteException
	 * @throws JAXBException
	 * 
	 */
	public IATSResponse processCreditCard(ProcessCreditCardV1 parameters) throws java.rmi.RemoteException, JAXBException{
		ProcessCreditCardV1Response response = service.processCreditCard(parameters);
		ProcessCreditCardV1ResponseProcessCreditCardV1Result result = response.getProcessCreditCardV1Result();
		IATSResponse iatsResponse = (IATSResponse) unmarshaller.unmarshal(new StringReader(result.get_any()[0].toString()));
		return iatsResponse;
	}
	
	/**
	 * This service is for when you want to create a direct debit (ACHEFT) customer code (Recurring is set to false) and to processing an ACHEFT transaction at the same time. The customer code can be used to process single transactions in the future or be set for subsequent, recurring transactions (Recurrin is updated to true).
	 *	Note that this service is for NA customers only  
	 * @param CreateCustomerCodeAndProcessACHEFTV1
	 * @return IATSResponse
	 * @throws java.rmi.RemoteException
	 * @throws JAXBException
	 */
	
	public IATSResponse createCustomerCodeAndProcessACHEFT(CreateCustomerCodeAndProcessACHEFTV1 parameters) throws java.rmi.RemoteException, JAXBException{
		CreateCustomerCodeAndProcessACHEFTV1Response response = service.createCustomerCodeAndProcessACHEFT(parameters);
		CreateCustomerCodeAndProcessACHEFTV1ResponseCreateCustomerCodeAndProcessACHEFTV1Result result = response.getCreateCustomerCodeAndProcessACHEFTV1Result();
		IATSResponse iatsResponse = (IATSResponse) unmarshaller.unmarshal(new StringReader(result.get_any()[0].toString()));
		return iatsResponse;
	}

	/**
	 * This service is for when you want to process a single direct debit (ACHEFT) transaction with an existing customer code.
	 * @param ProcessACHEFTWithCustomerCodeV1
	 * @return IATSResponse
	 * @throws java.rmi.RemoteException
	 * @throws JAXBException
	 */
	
	public IATSResponse processACHEFTWithCustomerCode(ProcessACHEFTWithCustomerCodeV1 parameters) throws java.rmi.RemoteException, JAXBException{
		ProcessACHEFTWithCustomerCodeV1Response response = service.processACHEFTWithCustomerCode(parameters);
		ProcessACHEFTWithCustomerCodeV1ResponseProcessACHEFTWithCustomerCodeV1Result result = response.getProcessACHEFTWithCustomerCodeV1Result();
		IATSResponse iatsResponse = (IATSResponse) unmarshaller.unmarshal(new StringReader(result.get_any()[0].toString()));
		return iatsResponse;
	}

	/**
	 * This service is used when you want to make a transaction using an existing direct debit account in your system and no customer code is available or required.
	 * @param ProcessACHEFTV1
	 * @return IATSResponse
	 * @throws java.rmi.RemoteException
	 * @throws JAXBException
	 */
	
	public IATSResponse processACHEFT(ProcessACHEFTV1 parameters) throws java.rmi.RemoteException, JAXBException{
		ProcessACHEFTV1Response response = service.processACHEFT(parameters);
		ProcessACHEFTV1ResponseProcessACHEFTV1Result result = response.getProcessACHEFTV1Result();
		IATSResponse iatsResponse = (IATSResponse) unmarshaller.unmarshal(new StringReader(result.get_any()[0].toString()));
		return iatsResponse;
	}

	/**
	 * This service is for when you need to refund a specific transaction made on a credit card in your system. It is possible to do partial and multiple partial refunds through this process. 
	 * @param ProcessCreditCardRefundWithTransactionIdV1
	 * @return IATSResponse
	 * @throws java.rmi.RemoteException
	 * @throws JAXBException
	 */
	
	public IATSResponse processCreditCardRefundWithTransactionId(ProcessCreditCardRefundWithTransactionIdV1 parameters) throws java.rmi.RemoteException, JAXBException{
		ProcessCreditCardRefundWithTransactionIdV1Response response = service.processCreditCardRefundWithTransactionId(parameters);
		ProcessCreditCardRefundWithTransactionIdV1ResponseProcessCreditCardRefundWithTransactionIdV1Result result = response.getProcessCreditCardRefundWithTransactionIdV1Result();
		IATSResponse iatsResponse = (IATSResponse) unmarshaller.unmarshal(new StringReader(result.get_any()[0].toString()));
		return iatsResponse;
	}

	/**
	 * This service is for when you need to refund a specific transaction made using ACHEFT. 
	 * It is possible to do partial and multiple partial refunds through this process.
	 * Note that this service is for NA customers only.
	 * @param ProcessACHEFTRefundWithTransactionIdV1
	 * @return IATSResponse
	 * @throws java.rmi.RemoteException
	 * @throws JAXBException
	 */
	
	public IATSResponse processACHEFTRefundWithTransactionId(ProcessACHEFTRefundWithTransactionIdV1 parameters) throws java.rmi.RemoteException, JAXBException{
		ProcessACHEFTRefundWithTransactionIdV1Response response = service.processACHEFTRefundWithTransactionId(parameters);
		ProcessACHEFTRefundWithTransactionIdV1ResponseProcessACHEFTRefundWithTransactionIdV1Result result = response.getProcessACHEFTRefundWithTransactionIdV1Result();
		IATSResponse iatsResponse = (IATSResponse) unmarshaller.unmarshal(new StringReader(result.get_any()[0].toString()));
		return iatsResponse;
	}

	/**
	 * This service is for when you wish to process multiple credit card transactions (made on multiple credit cards) in one request.  
	 * @param ProcessCreditCardBatchV1
	 * @return IATSResponse
	 * @throws java.rmi.RemoteException
	 * @throws JAXBException
	 */
	
	public IATSResponse processCreditCardBatch(ProcessCreditCardBatchV1 parameters) throws java.rmi.RemoteException, JAXBException{
		ProcessCreditCardBatchV1Response response = service.processCreditCardBatch(parameters);
		ProcessCreditCardBatchV1ResponseProcessCreditCardBatchV1Result result = response.getProcessCreditCardBatchV1Result();
		IATSResponse iatsResponse = (IATSResponse) unmarshaller.unmarshal(new StringReader(result.get_any()[0].toString()));
		return iatsResponse;
	}

	/**
	 * This service is for when you wish to process ACHEFT transactions from more than one donor in one request.   
	 * @param ProcessACHEFTChargeBatchV1
	 * @return IATSResponse
	 * @throws java.rmi.RemoteException
	 * @throws JAXBException
	 */
	
	public IATSResponse processACHEFTChargeBatch(ProcessACHEFTChargeBatchV1 parameters) throws java.rmi.RemoteException, JAXBException{
		ProcessACHEFTChargeBatchV1Response response = service.processACHEFTChargeBatch(parameters);
		ProcessACHEFTChargeBatchV1ResponseProcessACHEFTChargeBatchV1Result result = response.getProcessACHEFTChargeBatchV1Result();
		IATSResponse iatsResponse = (IATSResponse) unmarshaller.unmarshal(new StringReader(result.get_any()[0].toString()));
		return iatsResponse;
	}

	/**
	 * This service is for when you wish to refund multiple ACHEFT transactions from more than one donor in one request
	 * @param ProcessACHEFTRefundBatchV1
	 * @return IATSResponse
	 * @throws java.rmi.RemoteException
	 * @throws JAXBException
	 */
	
	public IATSResponse processACHEFTRefundBatch(ProcessACHEFTRefundBatchV1 parameters) throws java.rmi.RemoteException, JAXBException{
		ProcessACHEFTRefundBatchV1Response response = service.processACHEFTRefundBatch(parameters);
		ProcessACHEFTRefundBatchV1ResponseProcessACHEFTRefundBatchV1Result result = response.getProcessACHEFTRefundBatchV1Result();
		IATSResponse iatsResponse = (IATSResponse) unmarshaller.unmarshal(new StringReader(result.get_any()[0].toString()));
		return iatsResponse;
	}

	/**
	 * 
	 * This service is for when you want to request the results of a previous batch request. 
	 * The returned file will contain the original request details with a status message appended to each individual request
	 * @param GetBatchProcessResultFileV1
	 * @return IATSResponse
	 * @throws java.rmi.RemoteException
	 * @throws JAXBException
	 */
	public IATSResponse getBatchProcessResultFile(GetBatchProcessResultFileV1 parameters) throws java.rmi.RemoteException, JAXBException{
		GetBatchProcessResultFileV1Response response = service.getBatchProcessResultFile(parameters);
		GetBatchProcessResultFileV1ResponseGetBatchProcessResultFileV1Result result = response.getGetBatchProcessResultFileV1Result();
		IATSResponse iatsResponse = (IATSResponse) unmarshaller.unmarshal(new StringReader(result.get_any()[0].toString()));
		return iatsResponse;
	}

}
