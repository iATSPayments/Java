# iATS JAVA API 

A JAVA wrapper for the iATS SOAP API.

iATS Web Services provides the facility to securely process payments using credit cards, ACH, or direct debit through your website or software.

iATS Web Services overview: http://home.iatspayments.com/sites/default/files/iats_webservices_overview_version_4.0_0.pdf

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
* Detailed service guide: http://home.iatspayments.com/sites/default/files/iats_webservices_customerlink_version_4.0.pdf

### ProcessLink

The ProcessLink service is used to process single, recurring and bulk transactions for customers. ProcessLink can
also be used to refund transactions.

**iATS documentation**
* Request / response overview: https://www.iatspayments.com/NetGate/ProcessLink.asmx
* Detailed service guide: http://home.iatspayments.com/sites/default/files/iats_webservices_processlink_version_4.0.pdf

### ReportLink

The ReportLink service is used to generate transaction reports for the other services. Available reports include
credit / debit card transactions, rejected transactions and returns.

## Usage

### Use Case 1 - ProcessLink - Transaction using a Credit Card    

1) Download iATSClient-V4.X.jar and add it Java classpath.

2) Create an instance for ProcessLinkService as follows
```
If you want to use service for NA region, create instance as below.
    
        ProcessLinkService processLinkService = new ProcessLinkService();
                                OR
        ProcessLinkService processLinkService = new ProcessLinkService("https://www.iatspayments.com/NetGate/ProcessLink.asmx");                        
    
If you want to use service for UK region, create instance as below with end point.
        
        ProcessLinkService processLinkService = new ProcessLinkService("https://www.uk.iatspayments.com/NetGate/ProcessLink.asmx");
```

3) Create ProcessCreditCardV1 object and set with customer and card details
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
		processCard.setFirstName("Sreekanth");
		processCard.setLastName("G");
		processCard.setAddress("Uppal");
		processCard.setCity("HYD");
		processCard.setState("AP");
		processCard.setZipCode("500039");
		processCard.setTotal("1");
		processCard.setComment("Test From Java");
```			
4) Invoke the service and capture the response as follows
```
IATSResponse response = processLinkService.processCreditCard(processCard);
 ```   
5) Verify response
```
System.out.println(response.getProcessResult().getTransactionId());

```
