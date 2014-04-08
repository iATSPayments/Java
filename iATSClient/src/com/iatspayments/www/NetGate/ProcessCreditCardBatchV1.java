/**
 * ProcessCreditCardBatchV1.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.iatspayments.www.NetGate;

public class ProcessCreditCardBatchV1  implements java.io.Serializable {
    private java.lang.String agentCode;

    private java.lang.String password;

    private java.lang.String customerIPAddress;

    private byte[] batchFile;

    public ProcessCreditCardBatchV1() {
    }

    public ProcessCreditCardBatchV1(
           java.lang.String agentCode,
           java.lang.String password,
           java.lang.String customerIPAddress,
           byte[] batchFile) {
           this.agentCode = agentCode;
           this.password = password;
           this.customerIPAddress = customerIPAddress;
           this.batchFile = batchFile;
    }


    /**
     * Gets the agentCode value for this ProcessCreditCardBatchV1.
     * 
     * @return agentCode
     */
    public java.lang.String getAgentCode() {
        return agentCode;
    }


    /**
     * Sets the agentCode value for this ProcessCreditCardBatchV1.
     * 
     * @param agentCode
     */
    public void setAgentCode(java.lang.String agentCode) {
        this.agentCode = agentCode;
    }


    /**
     * Gets the password value for this ProcessCreditCardBatchV1.
     * 
     * @return password
     */
    public java.lang.String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this ProcessCreditCardBatchV1.
     * 
     * @param password
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }


    /**
     * Gets the customerIPAddress value for this ProcessCreditCardBatchV1.
     * 
     * @return customerIPAddress
     */
    public java.lang.String getCustomerIPAddress() {
        return customerIPAddress;
    }


    /**
     * Sets the customerIPAddress value for this ProcessCreditCardBatchV1.
     * 
     * @param customerIPAddress
     */
    public void setCustomerIPAddress(java.lang.String customerIPAddress) {
        this.customerIPAddress = customerIPAddress;
    }


    /**
     * Gets the batchFile value for this ProcessCreditCardBatchV1.
     * 
     * @return batchFile
     */
    public byte[] getBatchFile() {
        return batchFile;
    }


    /**
     * Sets the batchFile value for this ProcessCreditCardBatchV1.
     * 
     * @param batchFile
     */
    public void setBatchFile(byte[] batchFile) {
        this.batchFile = batchFile;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProcessCreditCardBatchV1)) return false;
        ProcessCreditCardBatchV1 other = (ProcessCreditCardBatchV1) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.agentCode==null && other.getAgentCode()==null) || 
             (this.agentCode!=null &&
              this.agentCode.equals(other.getAgentCode()))) &&
            ((this.password==null && other.getPassword()==null) || 
             (this.password!=null &&
              this.password.equals(other.getPassword()))) &&
            ((this.customerIPAddress==null && other.getCustomerIPAddress()==null) || 
             (this.customerIPAddress!=null &&
              this.customerIPAddress.equals(other.getCustomerIPAddress()))) &&
            ((this.batchFile==null && other.getBatchFile()==null) || 
             (this.batchFile!=null &&
              java.util.Arrays.equals(this.batchFile, other.getBatchFile())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getAgentCode() != null) {
            _hashCode += getAgentCode().hashCode();
        }
        if (getPassword() != null) {
            _hashCode += getPassword().hashCode();
        }
        if (getCustomerIPAddress() != null) {
            _hashCode += getCustomerIPAddress().hashCode();
        }
        if (getBatchFile() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBatchFile());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBatchFile(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProcessCreditCardBatchV1.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">ProcessCreditCardBatchV1"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agentCode");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", "agentCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("password");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", "password"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerIPAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", "customerIPAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("batchFile");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", "batchFile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
