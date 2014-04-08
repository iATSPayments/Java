package com.iatspayments.www.NetGate;

import java.io.StringReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class ProcessLinkService {
	
	private ProcessLinkSoapProxy service = null;
	private Unmarshaller unmarshaller = null;
	public ProcessLinkService() throws JAXBException {
		service = new ProcessLinkSoapProxy();
		JAXBContext context = JAXBContext.newInstance(IATSResponse.class);
		unmarshaller = context.createUnmarshaller();
	}

	public IATSResponse createCustomerCodeAndProcessCreditCard(CreateCustomerCodeAndProcessCreditCardV1 parameters) throws java.rmi.RemoteException, JAXBException{
		CreateCustomerCodeAndProcessCreditCardV1Response response = service.createCustomerCodeAndProcessCreditCard(parameters);
		CreateCustomerCodeAndProcessCreditCardV1ResponseCreateCustomerCodeAndProcessCreditCardV1Result result = response.getCreateCustomerCodeAndProcessCreditCardV1Result();
		IATSResponse iatsResponse = (IATSResponse) unmarshaller.unmarshal(new StringReader(result.get_any()[0].toString()));
		return iatsResponse;
	}

	public IATSResponse processCreditCardWithCustomerCode(ProcessCreditCardWithCustomerCodeV1 parameters) throws java.rmi.RemoteException, JAXBException{
		ProcessCreditCardWithCustomerCodeV1Response response = service.processCreditCardWithCustomerCode(parameters);
		ProcessCreditCardWithCustomerCodeV1ResponseProcessCreditCardWithCustomerCodeV1Result result = response.getProcessCreditCardWithCustomerCodeV1Result();
		IATSResponse iatsResponse = (IATSResponse) unmarshaller.unmarshal(new StringReader(result.get_any()[0].toString()));
		return iatsResponse;
	}

	public IATSResponse processCreditCard(ProcessCreditCardV1 parameters) throws java.rmi.RemoteException, JAXBException{
		ProcessCreditCardV1Response response = service.processCreditCard(parameters);
		ProcessCreditCardV1ResponseProcessCreditCardV1Result result = response.getProcessCreditCardV1Result();
		IATSResponse iatsResponse = (IATSResponse) unmarshaller.unmarshal(new StringReader(result.get_any()[0].toString()));
		return iatsResponse;
	}

	public IATSResponse createCustomerCodeAndProcessACHEFT(CreateCustomerCodeAndProcessACHEFTV1 parameters) throws java.rmi.RemoteException, JAXBException{
		CreateCustomerCodeAndProcessACHEFTV1Response response = service.createCustomerCodeAndProcessACHEFT(parameters);
		CreateCustomerCodeAndProcessACHEFTV1ResponseCreateCustomerCodeAndProcessACHEFTV1Result result = response.getCreateCustomerCodeAndProcessACHEFTV1Result();
		IATSResponse iatsResponse = (IATSResponse) unmarshaller.unmarshal(new StringReader(result.get_any()[0].toString()));
		return iatsResponse;
	}

	public IATSResponse processACHEFTWithCustomerCode(ProcessACHEFTWithCustomerCodeV1 parameters) throws java.rmi.RemoteException, JAXBException{
		ProcessACHEFTWithCustomerCodeV1Response response = service.processACHEFTWithCustomerCode(parameters);
		ProcessACHEFTWithCustomerCodeV1ResponseProcessACHEFTWithCustomerCodeV1Result result = response.getProcessACHEFTWithCustomerCodeV1Result();
		IATSResponse iatsResponse = (IATSResponse) unmarshaller.unmarshal(new StringReader(result.get_any()[0].toString()));
		return iatsResponse;
	}

	public IATSResponse processACHEFT(ProcessACHEFTV1 parameters) throws java.rmi.RemoteException, JAXBException{
		ProcessACHEFTV1Response response = service.processACHEFT(parameters);
		ProcessACHEFTV1ResponseProcessACHEFTV1Result result = response.getProcessACHEFTV1Result();
		IATSResponse iatsResponse = (IATSResponse) unmarshaller.unmarshal(new StringReader(result.get_any()[0].toString()));
		return iatsResponse;
	}

	public IATSResponse processCreditCardRefundWithTransactionId(ProcessCreditCardRefundWithTransactionIdV1 parameters) throws java.rmi.RemoteException, JAXBException{
		ProcessCreditCardRefundWithTransactionIdV1Response response = service.processCreditCardRefundWithTransactionId(parameters);
		ProcessCreditCardRefundWithTransactionIdV1ResponseProcessCreditCardRefundWithTransactionIdV1Result result = response.getProcessCreditCardRefundWithTransactionIdV1Result();
		IATSResponse iatsResponse = (IATSResponse) unmarshaller.unmarshal(new StringReader(result.get_any()[0].toString()));
		return iatsResponse;
	}

	public IATSResponse processACHEFTRefundWithTransactionId(ProcessACHEFTRefundWithTransactionIdV1 parameters) throws java.rmi.RemoteException, JAXBException{
		ProcessACHEFTRefundWithTransactionIdV1Response response = service.processACHEFTRefundWithTransactionId(parameters);
		ProcessACHEFTRefundWithTransactionIdV1ResponseProcessACHEFTRefundWithTransactionIdV1Result result = response.getProcessACHEFTRefundWithTransactionIdV1Result();
		IATSResponse iatsResponse = (IATSResponse) unmarshaller.unmarshal(new StringReader(result.get_any()[0].toString()));
		return iatsResponse;
	}

	public IATSResponse processCreditCardBatch(ProcessCreditCardBatchV1 parameters) throws java.rmi.RemoteException, JAXBException{
		ProcessCreditCardBatchV1Response response = service.processCreditCardBatch(parameters);
		ProcessCreditCardBatchV1ResponseProcessCreditCardBatchV1Result result = response.getProcessCreditCardBatchV1Result();
		IATSResponse iatsResponse = (IATSResponse) unmarshaller.unmarshal(new StringReader(result.get_any()[0].toString()));
		return iatsResponse;
	}

	public IATSResponse processACHEFTChargeBatch(ProcessACHEFTChargeBatchV1 parameters) throws java.rmi.RemoteException, JAXBException{
		ProcessACHEFTChargeBatchV1Response response = service.processACHEFTChargeBatch(parameters);
		ProcessACHEFTChargeBatchV1ResponseProcessACHEFTChargeBatchV1Result result = response.getProcessACHEFTChargeBatchV1Result();
		IATSResponse iatsResponse = (IATSResponse) unmarshaller.unmarshal(new StringReader(result.get_any()[0].toString()));
		return iatsResponse;
	}

	public IATSResponse processACHEFTRefundBatch(ProcessACHEFTRefundBatchV1 parameters) throws java.rmi.RemoteException, JAXBException{
		ProcessACHEFTRefundBatchV1Response response = service.processACHEFTRefundBatch(parameters);
		ProcessACHEFTRefundBatchV1ResponseProcessACHEFTRefundBatchV1Result result = response.getProcessACHEFTRefundBatchV1Result();
		IATSResponse iatsResponse = (IATSResponse) unmarshaller.unmarshal(new StringReader(result.get_any()[0].toString()));
		return iatsResponse;
	}

	public IATSResponse getBatchProcessResultFile(GetBatchProcessResultFileV1 parameters) throws java.rmi.RemoteException, JAXBException{
		GetBatchProcessResultFileV1Response response = service.getBatchProcessResultFile(parameters);
		GetBatchProcessResultFileV1ResponseGetBatchProcessResultFileV1Result result = response.getGetBatchProcessResultFileV1Result();
		IATSResponse iatsResponse = (IATSResponse) unmarshaller.unmarshal(new StringReader(result.get_any()[0].toString()));
		return iatsResponse;
	}

}
