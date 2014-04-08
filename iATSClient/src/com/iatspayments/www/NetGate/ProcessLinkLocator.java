/**
 * ProcessLinkLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.iatspayments.www.NetGate;

public class ProcessLinkLocator extends org.apache.axis.client.Service implements com.iatspayments.www.NetGate.ProcessLink {

    public ProcessLinkLocator() {
    }


    public ProcessLinkLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ProcessLinkLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ProcessLinkSoap
    private java.lang.String ProcessLinkSoap_address = "https://www.iatspayments.com/NetGate/ProcessLink.asmx";

    public java.lang.String getProcessLinkSoapAddress() {
        return ProcessLinkSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ProcessLinkSoapWSDDServiceName = "ProcessLinkSoap";

    public java.lang.String getProcessLinkSoapWSDDServiceName() {
        return ProcessLinkSoapWSDDServiceName;
    }

    public void setProcessLinkSoapWSDDServiceName(java.lang.String name) {
        ProcessLinkSoapWSDDServiceName = name;
    }

    public com.iatspayments.www.NetGate.ProcessLinkSoap getProcessLinkSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ProcessLinkSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getProcessLinkSoap(endpoint);
    }

    public com.iatspayments.www.NetGate.ProcessLinkSoap getProcessLinkSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.iatspayments.www.NetGate.ProcessLinkSoapStub _stub = new com.iatspayments.www.NetGate.ProcessLinkSoapStub(portAddress, this);
            _stub.setPortName(getProcessLinkSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setProcessLinkSoapEndpointAddress(java.lang.String address) {
        ProcessLinkSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.iatspayments.www.NetGate.ProcessLinkSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                com.iatspayments.www.NetGate.ProcessLinkSoapStub _stub = new com.iatspayments.www.NetGate.ProcessLinkSoapStub(new java.net.URL(ProcessLinkSoap_address), this);
                _stub.setPortName(getProcessLinkSoapWSDDServiceName());
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
        if ("ProcessLinkSoap".equals(inputPortName)) {
            return getProcessLinkSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", "ProcessLink");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", "ProcessLinkSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ProcessLinkSoap".equals(portName)) {
            setProcessLinkSoapEndpointAddress(address);
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
