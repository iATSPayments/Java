/**
 * CustomerLinkSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.iatspayments.www.NetGate;

public interface CustomerLinkSoap extends java.rmi.Remote {
    public com.iatspayments.www.NetGate.CreateCreditCardCustomerCodeV1Response createCreditCardCustomerCode(com.iatspayments.www.NetGate.CreateCreditCardCustomerCodeV1 parameters) throws java.rmi.RemoteException;
    public com.iatspayments.www.NetGate.CreateACHEFTCustomerCodeV1Response createACHEFTCustomerCode(com.iatspayments.www.NetGate.CreateACHEFTCustomerCodeV1 parameters) throws java.rmi.RemoteException;
    public com.iatspayments.www.NetGate.UpdateCreditCardCustomerCodeV1Response updateCreditCardCustomerCode(com.iatspayments.www.NetGate.UpdateCreditCardCustomerCodeV1 parameters) throws java.rmi.RemoteException;
    public com.iatspayments.www.NetGate.UpdateACHEFTCustomerCodeV1Response updateACHEFTCustomerCode(com.iatspayments.www.NetGate.UpdateACHEFTCustomerCodeV1 parameters) throws java.rmi.RemoteException;
    public com.iatspayments.www.NetGate.DeleteCustomerCodeV1Response deleteCustomerCode(com.iatspayments.www.NetGate.DeleteCustomerCodeV1 parameters) throws java.rmi.RemoteException;
    public com.iatspayments.www.NetGate.GetCustomerCodeDetailV1Response getCustomerCodeDetail(com.iatspayments.www.NetGate.GetCustomerCodeDetailV1 parameters) throws java.rmi.RemoteException;
}
