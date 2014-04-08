/**
 * CustomerLinkLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.iatspayments.www.NetGate;

public class CustomerLinkLocator extends org.apache.axis.client.Service implements com.iatspayments.www.NetGate.CustomerLink {

    public CustomerLinkLocator() {
    }


    public CustomerLinkLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CustomerLinkLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for CustomerLinkSoap
    private java.lang.String CustomerLinkSoap_address = "https://www.iatspayments.com/NetGate/CustomerLink.asmx";

    public java.lang.String getCustomerLinkSoapAddress() {
        return CustomerLinkSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CustomerLinkSoapWSDDServiceName = "CustomerLinkSoap";

    public java.lang.String getCustomerLinkSoapWSDDServiceName() {
        return CustomerLinkSoapWSDDServiceName;
    }

    public void setCustomerLinkSoapWSDDServiceName(java.lang.String name) {
        CustomerLinkSoapWSDDServiceName = name;
    }

    public com.iatspayments.www.NetGate.CustomerLinkSoap getCustomerLinkSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CustomerLinkSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCustomerLinkSoap(endpoint);
    }

    public com.iatspayments.www.NetGate.CustomerLinkSoap getCustomerLinkSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.iatspayments.www.NetGate.CustomerLinkSoapStub _stub = new com.iatspayments.www.NetGate.CustomerLinkSoapStub(portAddress, this);
            _stub.setPortName(getCustomerLinkSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCustomerLinkSoapEndpointAddress(java.lang.String address) {
        CustomerLinkSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.iatspayments.www.NetGate.CustomerLinkSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                com.iatspayments.www.NetGate.CustomerLinkSoapStub _stub = new com.iatspayments.www.NetGate.CustomerLinkSoapStub(new java.net.URL(CustomerLinkSoap_address), this);
                _stub.setPortName(getCustomerLinkSoapWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("CustomerLinkSoap".equals(inputPortName)) {
            return getCustomerLinkSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", "CustomerLink");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", "CustomerLinkSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("CustomerLinkSoap".equals(portName)) {
            setCustomerLinkSoapEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
