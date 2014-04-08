/**
 * ProcessLinkSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.iatspayments.www.NetGate;

public interface ProcessLinkSoap extends java.rmi.Remote {
    public com.iatspayments.www.NetGate.CreateCustomerCodeAndProcessCreditCardV1Response createCustomerCodeAndProcessCreditCard(com.iatspayments.www.NetGate.CreateCustomerCodeAndProcessCreditCardV1 parameters) throws java.rmi.RemoteException;
    public com.iatspayments.www.NetGate.ProcessCreditCardWithCustomerCodeV1Response processCreditCardWithCustomerCode(com.iatspayments.www.NetGate.ProcessCreditCardWithCustomerCodeV1 parameters) throws java.rmi.RemoteException;
    public com.iatspayments.www.NetGate.ProcessCreditCardV1Response processCreditCard(com.iatspayments.www.NetGate.ProcessCreditCardV1 parameters) throws java.rmi.RemoteException;
    public com.iatspayments.www.NetGate.CreateCustomerCodeAndProcessACHEFTV1Response createCustomerCodeAndProcessACHEFT(com.iatspayments.www.NetGate.CreateCustomerCodeAndProcessACHEFTV1 parameters) throws java.rmi.RemoteException;
    public com.iatspayments.www.NetGate.ProcessACHEFTWithCustomerCodeV1Response processACHEFTWithCustomerCode(com.iatspayments.www.NetGate.ProcessACHEFTWithCustomerCodeV1 parameters) throws java.rmi.RemoteException;
    public com.iatspayments.www.NetGate.ProcessACHEFTV1Response processACHEFT(com.iatspayments.www.NetGate.ProcessACHEFTV1 parameters) throws java.rmi.RemoteException;
    public com.iatspayments.www.NetGate.ProcessCreditCardRefundWithTransactionIdV1Response processCreditCardRefundWithTransactionId(com.iatspayments.www.NetGate.ProcessCreditCardRefundWithTransactionIdV1 parameters) throws java.rmi.RemoteException;
    public com.iatspayments.www.NetGate.ProcessACHEFTRefundWithTransactionIdV1Response processACHEFTRefundWithTransactionId(com.iatspayments.www.NetGate.ProcessACHEFTRefundWithTransactionIdV1 parameters) throws java.rmi.RemoteException;
    public com.iatspayments.www.NetGate.ProcessCreditCardBatchV1Response processCreditCardBatch(com.iatspayments.www.NetGate.ProcessCreditCardBatchV1 parameters) throws java.rmi.RemoteException;
    public com.iatspayments.www.NetGate.ProcessACHEFTChargeBatchV1Response processACHEFTChargeBatch(com.iatspayments.www.NetGate.ProcessACHEFTChargeBatchV1 parameters) throws java.rmi.RemoteException;
    public com.iatspayments.www.NetGate.ProcessACHEFTRefundBatchV1Response processACHEFTRefundBatch(com.iatspayments.www.NetGate.ProcessACHEFTRefundBatchV1 parameters) throws java.rmi.RemoteException;
    public com.iatspayments.www.NetGate.GetBatchProcessResultFileV1Response getBatchProcessResultFile(com.iatspayments.www.NetGate.GetBatchProcessResultFileV1 parameters) throws java.rmi.RemoteException;
}
