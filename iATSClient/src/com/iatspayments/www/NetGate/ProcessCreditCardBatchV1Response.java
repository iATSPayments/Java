/**
 * ProcessCreditCardBatchV1Response.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.iatspayments.www.NetGate;

public class ProcessCreditCardBatchV1Response  implements java.io.Serializable {
    private com.iatspayments.www.NetGate.ProcessCreditCardBatchV1ResponseProcessCreditCardBatchV1Result processCreditCardBatchV1Result;

    public ProcessCreditCardBatchV1Response() {
    }

    public ProcessCreditCardBatchV1Response(
           com.iatspayments.www.NetGate.ProcessCreditCardBatchV1ResponseProcessCreditCardBatchV1Result processCreditCardBatchV1Result) {
           this.processCreditCardBatchV1Result = processCreditCardBatchV1Result;
    }


    /**
     * Gets the processCreditCardBatchV1Result value for this ProcessCreditCardBatchV1Response.
     * 
     * @return processCreditCardBatchV1Result
     */
    public com.iatspayments.www.NetGate.ProcessCreditCardBatchV1ResponseProcessCreditCardBatchV1Result getProcessCreditCardBatchV1Result() {
        return processCreditCardBatchV1Result;
    }


    /**
     * Sets the processCreditCardBatchV1Result value for this ProcessCreditCardBatchV1Response.
     * 
     * @param processCreditCardBatchV1Result
     */
    public void setProcessCreditCardBatchV1Result(com.iatspayments.www.NetGate.ProcessCreditCardBatchV1ResponseProcessCreditCardBatchV1Result processCreditCardBatchV1Result) {
        this.processCreditCardBatchV1Result = processCreditCardBatchV1Result;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProcessCreditCardBatchV1Response)) return false;
        ProcessCreditCardBatchV1Response other = (ProcessCreditCardBatchV1Response) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.processCreditCardBatchV1Result==null && other.getProcessCreditCardBatchV1Result()==null) || 
             (this.processCreditCardBatchV1Result!=null &&
              this.processCreditCardBatchV1Result.equals(other.getProcessCreditCardBatchV1Result())));
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
        if (getProcessCreditCardBatchV1Result() != null) {
            _hashCode += getProcessCreditCardBatchV1Result().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProcessCreditCardBatchV1Response.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">ProcessCreditCardBatchV1Response"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processCreditCardBatchV1Result");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", "ProcessCreditCardBatchV1Result"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">>ProcessCreditCardBatchV1Response>ProcessCreditCardBatchV1Result"));
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
