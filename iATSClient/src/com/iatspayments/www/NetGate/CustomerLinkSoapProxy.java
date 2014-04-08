package com.iatspayments.www.NetGate;

public class CustomerLinkSoapProxy implements com.iatspayments.www.NetGate.CustomerLinkSoap {
  private String _endpoint = null;
  private com.iatspayments.www.NetGate.CustomerLinkSoap customerLinkSoap = null;
  
  public CustomerLinkSoapProxy() {
    _initCustomerLinkSoapProxy();
  }
  
  public CustomerLinkSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initCustomerLinkSoapProxy();
  }
  
  private void _initCustomerLinkSoapProxy() {
    try {
      customerLinkSoap = (new com.iatspayments.www.NetGate.CustomerLinkLocator()).getCustomerLinkSoap();
      if (customerLinkSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)customerLinkSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)customerLinkSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (customerLinkSoap != null)
      ((javax.xml.rpc.Stub)customerLinkSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.iatspayments.www.NetGate.CustomerLinkSoap getCustomerLinkSoap() {
    if (customerLinkSoap == null)
      _initCustomerLinkSoapProxy();
    return customerLinkSoap;
  }
  
  public com.iatspayments.www.NetGate.CreateCreditCardCustomerCodeV1Response createCreditCardCustomerCode(com.iatspayments.www.NetGate.CreateCreditCardCustomerCodeV1 parameters) throws java.rmi.RemoteException{
    if (customerLinkSoap == null)
      _initCustomerLinkSoapProxy();
    return customerLinkSoap.createCreditCardCustomerCode(parameters);
  }
  
  public com.iatspayments.www.NetGate.CreateACHEFTCustomerCodeV1Response createACHEFTCustomerCode(com.iatspayments.www.NetGate.CreateACHEFTCustomerCodeV1 parameters) throws java.rmi.RemoteException{
    if (customerLinkSoap == null)
      _initCustomerLinkSoapProxy();
    return customerLinkSoap.createACHEFTCustomerCode(parameters);
  }
  
  public com.iatspayments.www.NetGate.UpdateCreditCardCustomerCodeV1Response updateCreditCardCustomerCode(com.iatspayments.www.NetGate.UpdateCreditCardCustomerCodeV1 parameters) throws java.rmi.RemoteException{
    if (customerLinkSoap == null)
      _initCustomerLinkSoapProxy();
    return customerLinkSoap.updateCreditCardCustomerCode(parameters);
  }
  
  public com.iatspayments.www.NetGate.UpdateACHEFTCustomerCodeV1Response updateACHEFTCustomerCode(com.iatspayments.www.NetGate.UpdateACHEFTCustomerCodeV1 parameters) throws java.rmi.RemoteException{
    if (customerLinkSoap == null)
      _initCustomerLinkSoapProxy();
    return customerLinkSoap.updateACHEFTCustomerCode(parameters);
  }
  
  public com.iatspayments.www.NetGate.DeleteCustomerCodeV1Response deleteCustomerCode(com.iatspayments.www.NetGate.DeleteCustomerCodeV1 parameters) throws java.rmi.RemoteException{
    if (customerLinkSoap == null)
      _initCustomerLinkSoapProxy();
    return customerLinkSoap.deleteCustomerCode(parameters);
  }
  
  public com.iatspayments.www.NetGate.GetCustomerCodeDetailV1Response getCustomerCodeDetail(com.iatspayments.www.NetGate.GetCustomerCodeDetailV1 parameters) throws java.rmi.RemoteException{
    if (customerLinkSoap == null)
      _initCustomerLinkSoapProxy();
    return customerLinkSoap.getCustomerCodeDetail(parameters);
  }
  
  
}