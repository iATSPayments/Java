# iATS JAVA API 

A JAVA wrapper for the iATS SOAP API.

iATS Web Services provides the facility to securely process payments using credit cards, ACH, or direct debit through your website or software.

iATS Web Services [overview](http://home.iatspayments.com/developers/underlying-soap-api)

## Requirements

* An account with [iATS Payments](http://www.iatspayments.com/)
    * [Request an account](http://home.iatspayments.com/iats-Ruby)
* NB! If you are already an iATS customer, please contact us to verify your Account settings
    * The Java wrapper requires certain features to be set up to your existing account
    * Please [contact us](http://home.iatspayments.com/iats-Ruby) with your Client Code
    
## Components

### CustomerLink

The CustomerLink service is used to create and update customer records. CustomerLink may be used with the
ProcessLink service to process single or recurring transactions for customers.

**iATS documentation**
* Request / response overview: https://www.iatspayments.com/NetGate/CustomerLink.asmx
* Detailed API [guide](http://home.iatspayments.com/developers/underlying-soap-api)
 
### ProcessLink

The ProcessLink service is used to process single, recurring and bulk transactions for customers. ProcessLink can
also be used to refund transactions.

**iATS documentation**
* Request / response overview: https://www.iatspayments.com/NetGate/ProcessLink.asmx
* Detailed API [guide](http://home.iatspayments.com/developers/underlying-soap-api)

### ReportLink

The ReportLink service is used to generate transaction reports for the other services. Available reports include
credit / debit card transactions, rejected transactions and returns.

## Usage

### Use Case 1 - ProcessLink - Transaction using a Credit Card    

1) Download iATSClient-4.1.0.jar and add it to java classpath.

2) Add below imports to your Java class.

`import java.rmi.RemoteException;`

`import java.util.Calendar;`

`import java.util.TimeZone;`

`import javax.xml.bind.JAXBException;`

`import com.iatspayments.www.NetGate.*;`

3) Create an instance for ProcessLinkService as follows

For NA region, create ProcessLinkService instance as shown below.
```  
ProcessLinkService processLinkService = new ProcessLinkService();
                                OR
ProcessLinkService processLinkService = new ProcessLinkService("https://www.iatspayments.com/NetGate/ProcessLink.asmx");                        
```    
For UK region, create ProcessLinkService instance with UK region's endpoint as shown below.
```        
ProcessLinkService processLinkService = new ProcessLinkService("https://www.uk.iatspayments.com/NetGate/ProcessLink.asmx");
```

4) Create ProcessCreditCardV1 object and set with customer and card details
```
        ProcessCreditCardV1 processCard = new ProcessCreditCardV1();
        processCard.setAgentCode("TEST88");
		processCard.setPassword("TEST88");
		processCard.setCustomerIPAddress("123.123.123.1");
		processCard.setInvoiceNum("");
		processCard.setCreditCardNum("4222222222222220");
		processCard.setCreditCardExpiry("03/15");
		processCard.setCvv2("");
		processCard.setMop("VISA");
		processCard.setFirstName("John");
		processCard.setLastName("Smith");
		processCard.setAddress("West Georgia St");
		processCard.setCity("BC");
		processCard.setState("AP");
		processCard.setZipCode("500039");
		processCard.setTotal("1");
		processCard.setComment("Test From Java");
```			
5) Invoke the service and capture the response as follows
```
IATSResponse response = processLinkService.processCreditCard(processCard);
 ```   
6) Verify response
```
System.out.println(response.getProcessResult().getTransactionId());

```

7) Here is the complete sample client example.

```
import java.rmi.RemoteException;
import java.util.Calendar;
import java.util.TimeZone;

import javax.xml.bind.JAXBException;

import com.iatspayments.www.NetGate.*;

public class ProcessClient{
	public static void main(String a[]) throws Exception{
		ProcessLinkService processLinkService = new ProcessLinkService();
		ProcessCreditCardV1 processCard = new ProcessCreditCardV1();
        processCard.setAgentCode("TEST88");
        processCard.setPassword("TEST88");
        processCard.setCustomerIPAddress("123.123.123.1");
        processCard.setInvoiceNum("");
        processCard.setCreditCardNum("4222222222222220");
        processCard.setCreditCardExpiry("03/15");
        processCard.setCvv2("");
        processCard.setMop("VISA");
        processCard.setFirstName("John");
        processCard.setLastName("Smith");
        processCard.setAddress("West Georgia St");
        processCard.setCity("BC");
        processCard.setState("AP");
        processCard.setZipCode("500039");
        processCard.setTotal("1");
        processCard.setComment("Test From Java");
		IATSResponse response = processLinkService.processCreditCard(processCard);
		System.out.println(response.getProcessResult().getTransactionId()+" Generated Transaction ID");
	}
}
```
