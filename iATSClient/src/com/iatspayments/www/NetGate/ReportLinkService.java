/*package com.iatspayments.www.NetGate;

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
	
	  
	  public IATSResponse getCCJournalCSV(GetCCJournalCSV_x0020_V1 parameters) throws java.rmi.RemoteException{
		  GetCCJournalCSV_x0020_V1Response response = service.getCCJournalCSV(parameters);
			byte[] result = response.getGetCCJournalCSV_x0020_V1Result();
			IATSResponse iatsResponse = (IATSResponse) unmarshaller.unmarshal(new StringReader(result.get_any()[0].toString()));
			return iatsResponse;  	  
		  
	  }
	  
	  public IATSResponse getCreditCardJournalCSV(GetCreditCardJournalCSVV1 parameters) throws java.rmi.RemoteException{
		  CreateCreditCardCustomerCodeV1Response response = service.createCreditCardCustomerCode(parameters);
			CreateCreditCardCustomerCodeV1ResponseCreateCreditCardCustomerCodeV1Result result = response.getCreateCreditCardCustomerCodeV1Result();
			IATSResponse iatsResponse = (IATSResponse) unmarshaller.unmarshal(new StringReader(result.get_any()[0].toString()));
			return iatsResponse;
	  }
	  
	  public IATSResponse getCreditCardJournal(GetCreditCardJournalV1 parameters) throws java.rmi.RemoteException{
		  CreateCreditCardCustomerCodeV1Response response = service.createCreditCardCustomerCode(parameters);
			CreateCreditCardCustomerCodeV1ResponseCreateCreditCardCustomerCodeV1Result result = response.getCreateCreditCardCustomerCodeV1Result();
			IATSResponse iatsResponse = (IATSResponse) unmarshaller.unmarshal(new StringReader(result.get_any()[0].toString()));
			return iatsResponse;
	  }
	  
	  public IATSResponse getCreditCardRejectCSV(GetCreditCardRejectCSVV1 parameters) throws java.rmi.RemoteException{
		  CreateCreditCardCustomerCodeV1Response response = service.createCreditCardCustomerCode(parameters);
			CreateCreditCardCustomerCodeV1ResponseCreateCreditCardCustomerCodeV1Result result = response.getCreateCreditCardCustomerCodeV1Result();
			IATSResponse iatsResponse = (IATSResponse) unmarshaller.unmarshal(new StringReader(result.get_any()[0].toString()));
			return iatsResponse;
	  }
	  
	  public IATSResponse getCreditCardReject(GetCreditCardRejectV1 parameters) throws java.rmi.RemoteException{
		  CreateCreditCardCustomerCodeV1Response response = service.createCreditCardCustomerCode(parameters);
			CreateCreditCardCustomerCodeV1ResponseCreateCreditCardCustomerCodeV1Result result = response.getCreateCreditCardCustomerCodeV1Result();
			IATSResponse iatsResponse = (IATSResponse) unmarshaller.unmarshal(new StringReader(result.get_any()[0].toString()));
			return iatsResponse;
	  }
	  
	  public IATSResponse getACHJournalCSV(GetACHJournalCSV_x0020_V1 parameters) throws java.rmi.RemoteException{
		  CreateCreditCardCustomerCodeV1Response response = service.createCreditCardCustomerCode(parameters);
			CreateCreditCardCustomerCodeV1ResponseCreateCreditCardCustomerCodeV1Result result = response.getCreateCreditCardCustomerCodeV1Result();
			IATSResponse iatsResponse = (IATSResponse) unmarshaller.unmarshal(new StringReader(result.get_any()[0].toString()));
			return iatsResponse;
	  }
	  
	  public IATSResponse getACHEFTJournalCSV(GetACHEFTJournalCSVV1 parameters) throws java.rmi.RemoteException{
		  CreateCreditCardCustomerCodeV1Response response = service.createCreditCardCustomerCode(parameters);
			CreateCreditCardCustomerCodeV1ResponseCreateCreditCardCustomerCodeV1Result result = response.getCreateCreditCardCustomerCodeV1Result();
			IATSResponse iatsResponse = (IATSResponse) unmarshaller.unmarshal(new StringReader(result.get_any()[0].toString()));
			return iatsResponse;
	  }
	  
	  public IATSResponse getACHEFTJournal(GetACHEFTJournalV1 parameters) throws java.rmi.RemoteException{
		  CreateCreditCardCustomerCodeV1Response response = service.createCreditCardCustomerCode(parameters);
			CreateCreditCardCustomerCodeV1ResponseCreateCreditCardCustomerCodeV1Result result = response.getCreateCreditCardCustomerCodeV1Result();
			IATSResponse iatsResponse = (IATSResponse) unmarshaller.unmarshal(new StringReader(result.get_any()[0].toString()));
			return iatsResponse;
	  }
	  
	  public IATSResponse getACHEFTRejectCSV(GetACHEFTRejectCSVV1 parameters) throws java.rmi.RemoteException{
		  CreateCreditCardCustomerCodeV1Response response = service.createCreditCardCustomerCode(parameters);
			CreateCreditCardCustomerCodeV1ResponseCreateCreditCardCustomerCodeV1Result result = response.getCreateCreditCardCustomerCodeV1Result();
			IATSResponse iatsResponse = (IATSResponse) unmarshaller.unmarshal(new StringReader(result.get_any()[0].toString()));
			return iatsResponse;
	  }
	  
	  public IATSResponse getACHEFTReject(GetACHEFTRejectV1 parameters) throws java.rmi.RemoteException{
		  CreateCreditCardCustomerCodeV1Response response = service.createCreditCardCustomerCode(parameters);
			CreateCreditCardCustomerCodeV1ResponseCreateCreditCardCustomerCodeV1Result result = response.getCreateCreditCardCustomerCodeV1Result();
			IATSResponse iatsResponse = (IATSResponse) unmarshaller.unmarshal(new StringReader(result.get_any()[0].toString()));
			return iatsResponse;
	  }
	  
	  public IATSResponse getACHEFTReturnCSV(GetACHEFTReturnCSVV1 parameters) throws java.rmi.RemoteException{
		  CreateCreditCardCustomerCodeV1Response response = service.createCreditCardCustomerCode(parameters);
			CreateCreditCardCustomerCodeV1ResponseCreateCreditCardCustomerCodeV1Result result = response.getCreateCreditCardCustomerCodeV1Result();
			IATSResponse iatsResponse = (IATSResponse) unmarshaller.unmarshal(new StringReader(result.get_any()[0].toString()));
			return iatsResponse;
	  }
	  
	  public IATSResponse getACHEFTReturn(GetACHEFTReturnV1 parameters) throws java.rmi.RemoteException{
		  CreateCreditCardCustomerCodeV1Response response = service.createCreditCardCustomerCode(parameters);
			CreateCreditCardCustomerCodeV1ResponseCreateCreditCardCustomerCodeV1Result result = response.getCreateCreditCardCustomerCodeV1Result();
			IATSResponse iatsResponse = (IATSResponse) unmarshaller.unmarshal(new StringReader(result.get_any()[0].toString()));
			return iatsResponse;
	  }
	  
	  public IATSResponse getCCPaymentBoxJournalCSV(GetCCPaymentBoxJournalCSV_x0020_V1 parameters) throws java.rmi.RemoteException{
		  CreateCreditCardCustomerCodeV1Response response = service.createCreditCardCustomerCode(parameters);
			CreateCreditCardCustomerCodeV1ResponseCreateCreditCardCustomerCodeV1Result result = response.getCreateCreditCardCustomerCodeV1Result();
			IATSResponse iatsResponse = (IATSResponse) unmarshaller.unmarshal(new StringReader(result.get_any()[0].toString()));
			return iatsResponse;
	  }
	  
	  public IATSResponse getCreditCardPaymentBoxJournalCSV(GetCreditCardPaymentBoxJournalCSVV1 parameters) throws java.rmi.RemoteException{
		  CreateCreditCardCustomerCodeV1Response response = service.createCreditCardCustomerCode(parameters);
			CreateCreditCardCustomerCodeV1ResponseCreateCreditCardCustomerCodeV1Result result = response.getCreateCreditCardCustomerCodeV1Result();
			IATSResponse iatsResponse = (IATSResponse) unmarshaller.unmarshal(new StringReader(result.get_any()[0].toString()));
			return iatsResponse;
	  }
	  
	  public IATSResponse getCreditCardPaymentBoxRejectCSV(GetCreditCardPaymentBoxRejectCSVV1 parameters) throws java.rmi.RemoteException{
		  CreateCreditCardCustomerCodeV1Response response = service.createCreditCardCustomerCode(parameters);
			CreateCreditCardCustomerCodeV1ResponseCreateCreditCardCustomerCodeV1Result result = response.getCreateCreditCardCustomerCodeV1Result();
			IATSResponse iatsResponse = (IATSResponse) unmarshaller.unmarshal(new StringReader(result.get_any()[0].toString()));
			return iatsResponse;
	  }
	  
	  public IATSResponse getACHEFTPaymentBoxJournalCSV(GetACHEFTPaymentBoxJournalCSV_x0020_V1 parameters) throws java.rmi.RemoteException{
		  CreateCreditCardCustomerCodeV1Response response = service.createCreditCardCustomerCode(parameters);
			CreateCreditCardCustomerCodeV1ResponseCreateCreditCardCustomerCodeV1Result result = response.getCreateCreditCardCustomerCodeV1Result();
			IATSResponse iatsResponse = (IATSResponse) unmarshaller.unmarshal(new StringReader(result.get_any()[0].toString()));
			return iatsResponse;
	  }
	  
	  public IATSResponse getACHEFTPaymentBoxJournalCSV(GetACHEFTPaymentBoxJournalCSVV1 parameters) throws java.rmi.RemoteException{
		  CreateCreditCardCustomerCodeV1Response response = service.createCreditCardCustomerCode(parameters);
			CreateCreditCardCustomerCodeV1ResponseCreateCreditCardCustomerCodeV1Result result = response.getCreateCreditCardCustomerCodeV1Result();
			IATSResponse iatsResponse = (IATSResponse) unmarshaller.unmarshal(new StringReader(result.get_any()[0].toString()));
			return iatsResponse;
	  }
	  
	  public IATSResponse getACHEFTPaymentBoxRejectCSV(GetACHEFTPaymentBoxRejectCSVV1 parameters) throws java.rmi.RemoteException{
		  CreateCreditCardCustomerCodeV1Response response = service.createCreditCardCustomerCode(parameters);
			CreateCreditCardCustomerCodeV1ResponseCreateCreditCardCustomerCodeV1Result result = response.getCreateCreditCardCustomerCodeV1Result();
			IATSResponse iatsResponse = (IATSResponse) unmarshaller.unmarshal(new StringReader(result.get_any()[0].toString()));
			return iatsResponse;
	  }
	  
	  public IATSResponse getCreditCardBankReconciliationReportCSV(GetCreditCardBankReconciliationReportCSVV1 parameters) throws java.rmi.RemoteException{
		  CreateCreditCardCustomerCodeV1Response response = service.createCreditCardCustomerCode(parameters);
			CreateCreditCardCustomerCodeV1ResponseCreateCreditCardCustomerCodeV1Result result = response.getCreateCreditCardCustomerCodeV1Result();
			IATSResponse iatsResponse = (IATSResponse) unmarshaller.unmarshal(new StringReader(result.get_any()[0].toString()));
			return iatsResponse;
	  }
	  
	  public IATSResponse getACHEFTBankReconciliationReportCSV(GetACHEFTBankReconciliationReportCSVV1 parameters) throws java.rmi.RemoteException{
		  CreateCreditCardCustomerCodeV1Response response = service.createCreditCardCustomerCode(parameters);
			CreateCreditCardCustomerCodeV1ResponseCreateCreditCardCustomerCodeV1Result result = response.getCreateCreditCardCustomerCodeV1Result();
			IATSResponse iatsResponse = (IATSResponse) unmarshaller.unmarshal(new StringReader(result.get_any()[0].toString()));
			return iatsResponse;
	  }
	  
	  

	
	

}
*/