/**
 * ReportLinkLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.iatspayments.www.NetGate;

public class ReportLinkLocator extends org.apache.axis.client.Service implements com.iatspayments.www.NetGate.ReportLink {

    public ReportLinkLocator() {
    }


    public ReportLinkLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ReportLinkLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ReportLinkSoap
    private java.lang.String ReportLinkSoap_address = "https://www.iatspayments.com/NetGate/ReportLink.asmx";

    public java.lang.String getReportLinkSoapAddress() {
        return ReportLinkSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ReportLinkSoapWSDDServiceName = "ReportLinkSoap";

    public java.lang.String getReportLinkSoapWSDDServiceName() {
        return ReportLinkSoapWSDDServiceName;
    }

    public void setReportLinkSoapWSDDServiceName(java.lang.String name) {
        ReportLinkSoapWSDDServiceName = name;
    }

    public com.iatspayments.www.NetGate.ReportLinkSoap getReportLinkSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ReportLinkSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getReportLinkSoap(endpoint);
    }

    public com.iatspayments.www.NetGate.ReportLinkSoap getReportLinkSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.iatspayments.www.NetGate.ReportLinkSoapStub _stub = new com.iatspayments.www.NetGate.ReportLinkSoapStub(portAddress, this);
            _stub.setPortName(getReportLinkSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setReportLinkSoapEndpointAddress(java.lang.String address) {
        ReportLinkSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.iatspayments.www.NetGate.ReportLinkSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                com.iatspayments.www.NetGate.ReportLinkSoapStub _stub = new com.iatspayments.www.NetGate.ReportLinkSoapStub(new java.net.URL(ReportLinkSoap_address), this);
                _stub.setPortName(getReportLinkSoapWSDDServiceName());
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
        if ("ReportLinkSoap".equals(inputPortName)) {
            return getReportLinkSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", "ReportLink");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", "ReportLinkSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ReportLinkSoap".equals(portName)) {
            setReportLinkSoapEndpointAddress(address);
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
