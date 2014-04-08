/**
 * ProcessCreditCardV1Response.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.iatspayments.www.NetGate;

public class ProcessCreditCardV1Response  implements java.io.Serializable {
    private com.iatspayments.www.NetGate.ProcessCreditCardV1ResponseProcessCreditCardV1Result processCreditCardV1Result;

    public ProcessCreditCardV1Response() {
    }

    public ProcessCreditCardV1Response(
           com.iatspayments.www.NetGate.ProcessCreditCardV1ResponseProcessCreditCardV1Result processCreditCardV1Result) {
           this.processCreditCardV1Result = processCreditCardV1Result;
    }


    /**
     * Gets the processCreditCardV1Result value for this ProcessCreditCardV1Response.
     * 
     * @return processCreditCardV1Result
     */
    public com.iatspayments.www.NetGate.ProcessCreditCardV1ResponseProcessCreditCardV1Result getProcessCreditCardV1Result() {
        return processCreditCardV1Result;
    }


    /**
     * Sets the processCreditCardV1Result value for this ProcessCreditCardV1Response.
     * 
     * @param processCreditCardV1Result
     */
    public void setProcessCreditCardV1Result(com.iatspayments.www.NetGate.ProcessCreditCardV1ResponseProcessCreditCardV1Result processCreditCardV1Result) {
        this.processCreditCardV1Result = processCreditCardV1Result;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProcessCreditCardV1Response)) return false;
        ProcessCreditCardV1Response other = (ProcessCreditCardV1Response) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.processCreditCardV1Result==null && other.getProcessCreditCardV1Result()==null) || 
             (this.processCreditCardV1Result!=null &&
              this.processCreditCardV1Result.equals(other.getProcessCreditCardV1Result())));
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
        if (getProcessCreditCardV1Result() != null) {
            _hashCode += getProcessCreditCardV1Result().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProcessCreditCardV1Response.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">ProcessCreditCardV1Response"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processCreditCardV1Result");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", "ProcessCreditCardV1Result"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">>ProcessCreditCardV1Response>ProcessCreditCardV1Result"));
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
