package com.iatspayments.www.NetGate;

import java.rmi.RemoteException;
import java.util.Calendar;

import javax.xml.bind.JAXBException;

public class TestWS {

	public static void main(String[] args) throws RemoteException, JAXBException {
		// Create Creditcard object and fill it with card details & user details
		/*ProcessCreditCardV1 processCard = new ProcessCreditCardV1();
		processCard.setAgentCode("TEST88");
		processCard.setPassword("TEST88");
		processCard.setCustomerIPAddress("123.123.123.1");
		processCard.setInvoiceNum("");
		processCard.setCreditCardNum("4222222222222220");
		processCard.setCreditCardExpiry("03/15");
		processCard.setCvv2("");
		processCard.setMop("VISA");
		processCard.setFirstName("Sreekanth");
		processCard.setLastName("G");
		processCard.setAddress("Uppal");
		processCard.setCity("HYD");
		processCard.setState("AP");
		processCard.setZipCode("500039");
		processCard.setTotal("1");
		processCard.setComment("Test From Java");*/

		// create an instance for ProcessLinkService
		//ProcessLinkService processLinkService = new ProcessLinkService();
		
		// invoke the service and capture the response
		//IATSResponse response = processLinkService.processCreditCard(processCard);

		// verify the response
		//System.out.println("Response : " + response);
		
		// Creating Customer code using credit card.
		
		/*CreateCreditCardCustomerCodeV1 cardCustomerCodeV1 = new CreateCreditCardCustomerCodeV1();
		cardCustomerCodeV1.setAgentCode("TEST88");
		cardCustomerCodeV1.setPassword("TEST88");
		cardCustomerCodeV1.setCustomerIPAddress("123.123.4.4");
		cardCustomerCodeV1.setFirstName("Sunera");
		cardCustomerCodeV1.setLastName("Technologies");
		cardCustomerCodeV1.setAddress("Uppal");
		cardCustomerCodeV1.setAlternatePhone("12345678");
		cardCustomerCodeV1.setAmount("2");
		cardCustomerCodeV1.setBeginDate(Calendar.getInstance());
		cardCustomerCodeV1.setCity("Hyd");
		cardCustomerCodeV1.setComment("Test");
		cardCustomerCodeV1.setCompanyName("Sunera");
		cardCustomerCodeV1.setCreditCardCustomerName("Test");
		cardCustomerCodeV1.setCreditCardExpiry("03/15");
		cardCustomerCodeV1.setCreditCardNum("4222222222222220");
		cardCustomerCodeV1.setEmail("iats@example.com");
		cardCustomerCodeV1.setEndDate(Calendar.getInstance());
		cardCustomerCodeV1.setMop("VISA");
		
		CustomerLinkService service = new CustomerLinkService();
		IATSResponse response = service.createCreditCardCustomerCode(cardCustomerCodeV1);
		System.out.println("Customer code: "+ response.getProcessResult().getCustomerCode());
*/		
		/*GetCustomerCodeDetailV1 customerCodeDetailV1 = new GetCustomerCodeDetailV1();
		
		customerCodeDetailV1.setAgentCode("TEST88");
		customerCodeDetailV1.setCustomerCode("A10898248");
		customerCodeDetailV1.setCustomerIPAddress("123.123.4.4");
		customerCodeDetailV1.setPassword("TEST88");
		
		CustomerLinkService service = new CustomerLinkService();
		IATSResponse response = service.getCustomerCodeDetail(customerCodeDetailV1);
		
		System.out.println(response.getProcessResult().getCustomerCode());*/
	}

}
