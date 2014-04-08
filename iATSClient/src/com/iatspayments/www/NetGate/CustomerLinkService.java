package com.iatspayments.www.NetGate;

import java.io.StringReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class CustomerLinkService {

	private CustomerLinkSoapProxy service = null;
	private Unmarshaller unmarshaller = null;
	public CustomerLinkService() throws JAXBException {
		service = new CustomerLinkSoapProxy();
		JAXBContext context = JAXBContext.newInstance(IATSResponse.class);
		unmarshaller = context.createUnmarshaller();
	}

	public IATSResponse createCreditCardCustomerCode(CreateCreditCardCustomerCodeV1 parameters) throws java.rmi.RemoteException, JAXBException{
		CreateCreditCardCustomerCodeV1Response response = service.createCreditCardCustomerCode(parameters);
		CreateCreditCardCustomerCodeV1ResponseCreateCreditCardCustomerCodeV1Result result = response.getCreateCreditCardCustomerCodeV1Result();
		IATSResponse iatsResponse = (IATSResponse) unmarshaller.unmarshal(new StringReader(result.get_any()[0].toString()));
		return iatsResponse;
	}

	public IATSResponse createACHEFTCustomerCode(CreateACHEFTCustomerCodeV1 parameters) throws java.rmi.RemoteException, JAXBException{
		CreateACHEFTCustomerCodeV1Response response = service.createACHEFTCustomerCode(parameters);
		CreateACHEFTCustomerCodeV1ResponseCreateACHEFTCustomerCodeV1Result result = response.getCreateACHEFTCustomerCodeV1Result();
		IATSResponse iatsResponse = (IATSResponse) unmarshaller.unmarshal(new StringReader(result.get_any()[0].toString()));
		return iatsResponse;
	}

	public IATSResponse updateCreditCardCustomerCode(UpdateCreditCardCustomerCodeV1 parameters) throws java.rmi.RemoteException, JAXBException{
		UpdateCreditCardCustomerCodeV1Response response = service.updateCreditCardCustomerCode(parameters);
		UpdateCreditCardCustomerCodeV1ResponseUpdateCreditCardCustomerCodeV1Result result = response.getUpdateCreditCardCustomerCodeV1Result();
		IATSResponse iatsResponse = (IATSResponse) unmarshaller.unmarshal(new StringReader(result.get_any()[0].toString()));
		return iatsResponse;
	}

	public IATSResponse updateACHEFTCustomerCode(UpdateACHEFTCustomerCodeV1 parameters) throws java.rmi.RemoteException, JAXBException{
		UpdateACHEFTCustomerCodeV1Response response = service.updateACHEFTCustomerCode(parameters);
		UpdateACHEFTCustomerCodeV1ResponseUpdateACHEFTCustomerCodeV1Result result = response.getUpdateACHEFTCustomerCodeV1Result();
		IATSResponse iatsResponse = (IATSResponse) unmarshaller.unmarshal(new StringReader(result.get_any()[0].toString()));
		return iatsResponse;
	}

	public IATSResponse deleteCustomerCode(DeleteCustomerCodeV1 parameters) throws java.rmi.RemoteException, JAXBException{
		DeleteCustomerCodeV1Response response = service.deleteCustomerCode(parameters);
		DeleteCustomerCodeV1ResponseDeleteCustomerCodeV1Result result = response.getDeleteCustomerCodeV1Result();
		IATSResponse iatsResponse = (IATSResponse) unmarshaller.unmarshal(new StringReader(result.get_any()[0].toString()));
		return iatsResponse;
	}

	public IATSResponse getCustomerCodeDetail(GetCustomerCodeDetailV1 parameters) throws java.rmi.RemoteException, JAXBException{
		GetCustomerCodeDetailV1Response response = service.getCustomerCodeDetail(parameters);
		GetCustomerCodeDetailV1ResponseGetCustomerCodeDetailV1Result result = response.getGetCustomerCodeDetailV1Result();
		IATSResponse iatsResponse = (IATSResponse) unmarshaller.unmarshal(new StringReader(result.get_any()[0].toString()));
		return iatsResponse;
	}

}
