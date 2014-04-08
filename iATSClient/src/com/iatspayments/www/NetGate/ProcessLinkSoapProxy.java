package com.iatspayments.www.NetGate;

public class ProcessLinkSoapProxy implements com.iatspayments.www.NetGate.ProcessLinkSoap {
  private String _endpoint = null;
  private com.iatspayments.www.NetGate.ProcessLinkSoap processLinkSoap = null;
  
  public ProcessLinkSoapProxy() {
    _initProcessLinkSoapProxy();
  }
  
  public ProcessLinkSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initProcessLinkSoapProxy();
  }
  
  private void _initProcessLinkSoapProxy() {
    try {
      processLinkSoap = (new com.iatspayments.www.NetGate.ProcessLinkLocator()).getProcessLinkSoap();
      if (processLinkSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)processLinkSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)processLinkSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (processLinkSoap != null)
      ((javax.xml.rpc.Stub)processLinkSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.iatspayments.www.NetGate.ProcessLinkSoap getProcessLinkSoap() {
    if (processLinkSoap == null)
      _initProcessLinkSoapProxy();
    return processLinkSoap;
  }
  
  public com.iatspayments.www.NetGate.CreateCustomerCodeAndProcessCreditCardV1Response createCustomerCodeAndProcessCreditCard(com.iatspayments.www.NetGate.CreateCustomerCodeAndProcessCreditCardV1 parameters) throws java.rmi.RemoteException{
    if (processLinkSoap == null)
      _initProcessLinkSoapProxy();
    return processLinkSoap.createCustomerCodeAndProcessCreditCard(parameters);
  }
  
  public com.iatspayments.www.NetGate.ProcessCreditCardWithCustomerCodeV1Response processCreditCardWithCustomerCode(com.iatspayments.www.NetGate.ProcessCreditCardWithCustomerCodeV1 parameters) throws java.rmi.RemoteException{
    if (processLinkSoap == null)
      _initProcessLinkSoapProxy();
    return processLinkSoap.processCreditCardWithCustomerCode(parameters);
  }
  
  public com.iatspayments.www.NetGate.ProcessCreditCardV1Response processCreditCard(com.iatspayments.www.NetGate.ProcessCreditCardV1 parameters) throws java.rmi.RemoteException{
    if (processLinkSoap == null)
      _initProcessLinkSoapProxy();
    return processLinkSoap.processCreditCard(parameters);
  }
  
  public com.iatspayments.www.NetGate.CreateCustomerCodeAndProcessACHEFTV1Response createCustomerCodeAndProcessACHEFT(com.iatspayments.www.NetGate.CreateCustomerCodeAndProcessACHEFTV1 parameters) throws java.rmi.RemoteException{
    if (processLinkSoap == null)
      _initProcessLinkSoapProxy();
    return processLinkSoap.createCustomerCodeAndProcessACHEFT(parameters);
  }
  
  public com.iatspayments.www.NetGate.ProcessACHEFTWithCustomerCodeV1Response processACHEFTWithCustomerCode(com.iatspayments.www.NetGate.ProcessACHEFTWithCustomerCodeV1 parameters) throws java.rmi.RemoteException{
    if (processLinkSoap == null)
      _initProcessLinkSoapProxy();
    return processLinkSoap.processACHEFTWithCustomerCode(parameters);
  }
  
  public com.iatspayments.www.NetGate.ProcessACHEFTV1Response processACHEFT(com.iatspayments.www.NetGate.ProcessACHEFTV1 parameters) throws java.rmi.RemoteException{
    if (processLinkSoap == null)
      _initProcessLinkSoapProxy();
    return processLinkSoap.processACHEFT(parameters);
  }
  
  public com.iatspayments.www.NetGate.ProcessCreditCardRefundWithTransactionIdV1Response processCreditCardRefundWithTransactionId(com.iatspayments.www.NetGate.ProcessCreditCardRefundWithTransactionIdV1 parameters) throws java.rmi.RemoteException{
    if (processLinkSoap == null)
      _initProcessLinkSoapProxy();
    return processLinkSoap.processCreditCardRefundWithTransactionId(parameters);
  }
  
  public com.iatspayments.www.NetGate.ProcessACHEFTRefundWithTransactionIdV1Response processACHEFTRefundWithTransactionId(com.iatspayments.www.NetGate.ProcessACHEFTRefundWithTransactionIdV1 parameters) throws java.rmi.RemoteException{
    if (processLinkSoap == null)
      _initProcessLinkSoapProxy();
    return processLinkSoap.processACHEFTRefundWithTransactionId(parameters);
  }
  
  public com.iatspayments.www.NetGate.ProcessCreditCardBatchV1Response processCreditCardBatch(com.iatspayments.www.NetGate.ProcessCreditCardBatchV1 parameters) throws java.rmi.RemoteException{
    if (processLinkSoap == null)
      _initProcessLinkSoapProxy();
    return processLinkSoap.processCreditCardBatch(parameters);
  }
  
  public com.iatspayments.www.NetGate.ProcessACHEFTChargeBatchV1Response processACHEFTChargeBatch(com.iatspayments.www.NetGate.ProcessACHEFTChargeBatchV1 parameters) throws java.rmi.RemoteException{
    if (processLinkSoap == null)
      _initProcessLinkSoapProxy();
    return processLinkSoap.processACHEFTChargeBatch(parameters);
  }
  
  public com.iatspayments.www.NetGate.ProcessACHEFTRefundBatchV1Response processACHEFTRefundBatch(com.iatspayments.www.NetGate.ProcessACHEFTRefundBatchV1 parameters) throws java.rmi.RemoteException{
    if (processLinkSoap == null)
      _initProcessLinkSoapProxy();
    return processLinkSoap.processACHEFTRefundBatch(parameters);
  }
  
  public com.iatspayments.www.NetGate.GetBatchProcessResultFileV1Response getBatchProcessResultFile(com.iatspayments.www.NetGate.GetBatchProcessResultFileV1 parameters) throws java.rmi.RemoteException{
    if (processLinkSoap == null)
      _initProcessLinkSoapProxy();
    return processLinkSoap.getBatchProcessResultFile(parameters);
  }
  
  
}