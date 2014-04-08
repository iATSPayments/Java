package com.iatspayments.www.NetGate;

public class ReportLinkSoapProxy implements com.iatspayments.www.NetGate.ReportLinkSoap {
  private String _endpoint = null;
  private com.iatspayments.www.NetGate.ReportLinkSoap reportLinkSoap = null;
  
  public ReportLinkSoapProxy() {
    _initReportLinkSoapProxy();
  }
  
  public ReportLinkSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initReportLinkSoapProxy();
  }
  
  private void _initReportLinkSoapProxy() {
    try {
      reportLinkSoap = (new com.iatspayments.www.NetGate.ReportLinkLocator()).getReportLinkSoap();
      if (reportLinkSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)reportLinkSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)reportLinkSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (reportLinkSoap != null)
      ((javax.xml.rpc.Stub)reportLinkSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.iatspayments.www.NetGate.ReportLinkSoap getReportLinkSoap() {
    if (reportLinkSoap == null)
      _initReportLinkSoapProxy();
    return reportLinkSoap;
  }
  
  public com.iatspayments.www.NetGate.GetCCJournalCSV_x0020_V1Response getCCJournalCSV(com.iatspayments.www.NetGate.GetCCJournalCSV_x0020_V1 parameters) throws java.rmi.RemoteException{
    if (reportLinkSoap == null)
      _initReportLinkSoapProxy();
    return reportLinkSoap.getCCJournalCSV(parameters);
  }
  
  public com.iatspayments.www.NetGate.GetCreditCardJournalCSVV1Response getCreditCardJournalCSV(com.iatspayments.www.NetGate.GetCreditCardJournalCSVV1 parameters) throws java.rmi.RemoteException{
    if (reportLinkSoap == null)
      _initReportLinkSoapProxy();
    return reportLinkSoap.getCreditCardJournalCSV(parameters);
  }
  
  public com.iatspayments.www.NetGate.GetCreditCardJournalV1Response getCreditCardJournal(com.iatspayments.www.NetGate.GetCreditCardJournalV1 parameters) throws java.rmi.RemoteException{
    if (reportLinkSoap == null)
      _initReportLinkSoapProxy();
    return reportLinkSoap.getCreditCardJournal(parameters);
  }
  
  public com.iatspayments.www.NetGate.GetCreditCardRejectCSVV1Response getCreditCardRejectCSV(com.iatspayments.www.NetGate.GetCreditCardRejectCSVV1 parameters) throws java.rmi.RemoteException{
    if (reportLinkSoap == null)
      _initReportLinkSoapProxy();
    return reportLinkSoap.getCreditCardRejectCSV(parameters);
  }
  
  public com.iatspayments.www.NetGate.GetCreditCardRejectV1Response getCreditCardReject(com.iatspayments.www.NetGate.GetCreditCardRejectV1 parameters) throws java.rmi.RemoteException{
    if (reportLinkSoap == null)
      _initReportLinkSoapProxy();
    return reportLinkSoap.getCreditCardReject(parameters);
  }
  
  public com.iatspayments.www.NetGate.GetACHJournalCSV_x0020_V1Response getACHJournalCSV(com.iatspayments.www.NetGate.GetACHJournalCSV_x0020_V1 parameters) throws java.rmi.RemoteException{
    if (reportLinkSoap == null)
      _initReportLinkSoapProxy();
    return reportLinkSoap.getACHJournalCSV(parameters);
  }
  
  public com.iatspayments.www.NetGate.GetACHEFTJournalCSVV1Response getACHEFTJournalCSV(com.iatspayments.www.NetGate.GetACHEFTJournalCSVV1 parameters) throws java.rmi.RemoteException{
    if (reportLinkSoap == null)
      _initReportLinkSoapProxy();
    return reportLinkSoap.getACHEFTJournalCSV(parameters);
  }
  
  public com.iatspayments.www.NetGate.GetACHEFTJournalV1Response getACHEFTJournal(com.iatspayments.www.NetGate.GetACHEFTJournalV1 parameters) throws java.rmi.RemoteException{
    if (reportLinkSoap == null)
      _initReportLinkSoapProxy();
    return reportLinkSoap.getACHEFTJournal(parameters);
  }
  
  public com.iatspayments.www.NetGate.GetACHEFTRejectCSVV1Response getACHEFTRejectCSV(com.iatspayments.www.NetGate.GetACHEFTRejectCSVV1 parameters) throws java.rmi.RemoteException{
    if (reportLinkSoap == null)
      _initReportLinkSoapProxy();
    return reportLinkSoap.getACHEFTRejectCSV(parameters);
  }
  
  public com.iatspayments.www.NetGate.GetACHEFTRejectV1Response getACHEFTReject(com.iatspayments.www.NetGate.GetACHEFTRejectV1 parameters) throws java.rmi.RemoteException{
    if (reportLinkSoap == null)
      _initReportLinkSoapProxy();
    return reportLinkSoap.getACHEFTReject(parameters);
  }
  
  public com.iatspayments.www.NetGate.GetACHEFTReturnCSVV1Response getACHEFTReturnCSV(com.iatspayments.www.NetGate.GetACHEFTReturnCSVV1 parameters) throws java.rmi.RemoteException{
    if (reportLinkSoap == null)
      _initReportLinkSoapProxy();
    return reportLinkSoap.getACHEFTReturnCSV(parameters);
  }
  
  public com.iatspayments.www.NetGate.GetACHEFTReturnV1Response getACHEFTReturn(com.iatspayments.www.NetGate.GetACHEFTReturnV1 parameters) throws java.rmi.RemoteException{
    if (reportLinkSoap == null)
      _initReportLinkSoapProxy();
    return reportLinkSoap.getACHEFTReturn(parameters);
  }
  
  public com.iatspayments.www.NetGate.GetCCPaymentBoxJournalCSV_x0020_V1Response getCCPaymentBoxJournalCSV(com.iatspayments.www.NetGate.GetCCPaymentBoxJournalCSV_x0020_V1 parameters) throws java.rmi.RemoteException{
    if (reportLinkSoap == null)
      _initReportLinkSoapProxy();
    return reportLinkSoap.getCCPaymentBoxJournalCSV(parameters);
  }
  
  public com.iatspayments.www.NetGate.GetCreditCardPaymentBoxJournalCSVV1Response getCreditCardPaymentBoxJournalCSV(com.iatspayments.www.NetGate.GetCreditCardPaymentBoxJournalCSVV1 parameters) throws java.rmi.RemoteException{
    if (reportLinkSoap == null)
      _initReportLinkSoapProxy();
    return reportLinkSoap.getCreditCardPaymentBoxJournalCSV(parameters);
  }
  
  public com.iatspayments.www.NetGate.GetCreditCardPaymentBoxRejectCSVV1Response getCreditCardPaymentBoxRejectCSV(com.iatspayments.www.NetGate.GetCreditCardPaymentBoxRejectCSVV1 parameters) throws java.rmi.RemoteException{
    if (reportLinkSoap == null)
      _initReportLinkSoapProxy();
    return reportLinkSoap.getCreditCardPaymentBoxRejectCSV(parameters);
  }
  
  public com.iatspayments.www.NetGate.GetACHEFTPaymentBoxJournalCSV_x0020_V1Response getACHEFTPaymentBoxJournalCSV(com.iatspayments.www.NetGate.GetACHEFTPaymentBoxJournalCSV_x0020_V1 parameters) throws java.rmi.RemoteException{
    if (reportLinkSoap == null)
      _initReportLinkSoapProxy();
    return reportLinkSoap.getACHEFTPaymentBoxJournalCSV(parameters);
  }
  
  public com.iatspayments.www.NetGate.GetACHEFTPaymentBoxJournalCSVV1Response getACHEFTPaymentBoxJournalCSV(com.iatspayments.www.NetGate.GetACHEFTPaymentBoxJournalCSVV1 parameters) throws java.rmi.RemoteException{
    if (reportLinkSoap == null)
      _initReportLinkSoapProxy();
    return reportLinkSoap.getACHEFTPaymentBoxJournalCSV(parameters);
  }
  
  public com.iatspayments.www.NetGate.GetACHEFTPaymentBoxRejectCSVV1Response getACHEFTPaymentBoxRejectCSV(com.iatspayments.www.NetGate.GetACHEFTPaymentBoxRejectCSVV1 parameters) throws java.rmi.RemoteException{
    if (reportLinkSoap == null)
      _initReportLinkSoapProxy();
    return reportLinkSoap.getACHEFTPaymentBoxRejectCSV(parameters);
  }
  
  public com.iatspayments.www.NetGate.GetCreditCardBankReconciliationReportCSVV1Response getCreditCardBankReconciliationReportCSV(com.iatspayments.www.NetGate.GetCreditCardBankReconciliationReportCSVV1 parameters) throws java.rmi.RemoteException{
    if (reportLinkSoap == null)
      _initReportLinkSoapProxy();
    return reportLinkSoap.getCreditCardBankReconciliationReportCSV(parameters);
  }
  
  public com.iatspayments.www.NetGate.GetACHEFTBankReconciliationReportCSVV1Response getACHEFTBankReconciliationReportCSV(com.iatspayments.www.NetGate.GetACHEFTBankReconciliationReportCSVV1 parameters) throws java.rmi.RemoteException{
    if (reportLinkSoap == null)
      _initReportLinkSoapProxy();
    return reportLinkSoap.getACHEFTBankReconciliationReportCSV(parameters);
  }
  
  
}