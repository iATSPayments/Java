/**
 * ProcessCreditCardRefundWithTransactionIdV1Response.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.iatspayments.www.NetGate;

public class ProcessCreditCardRefundWithTransactionIdV1Response  implements java.io.Serializable {
    private com.iatspayments.www.NetGate.ProcessCreditCardRefundWithTransactionIdV1ResponseProcessCreditCardRefundWithTransactionIdV1Result processCreditCardRefundWithTransactionIdV1Result;

    public ProcessCreditCardRefundWithTransactionIdV1Response() {
    }

    public ProcessCreditCardRefundWithTransactionIdV1Response(
           com.iatspayments.www.NetGate.ProcessCreditCardRefundWithTransactionIdV1ResponseProcessCreditCardRefundWithTransactionIdV1Result processCreditCardRefundWithTransactionIdV1Result) {
           this.processCreditCardRefundWithTransactionIdV1Result = processCreditCardRefundWithTransactionIdV1Result;
    }


    /**
     * Gets the processCreditCardRefundWithTransactionIdV1Result value for this ProcessCreditCardRefundWithTransactionIdV1Response.
     * 
     * @return processCreditCardRefundWithTransactionIdV1Result
     */
    public com.iatspayments.www.NetGate.ProcessCreditCardRefundWithTransactionIdV1ResponseProcessCreditCardRefundWithTransactionIdV1Result getProcessCreditCardRefundWithTransactionIdV1Result() {
        return processCreditCardRefundWithTransactionIdV1Result;
    }


    /**
     * Sets the processCreditCardRefundWithTransactionIdV1Result value for this ProcessCreditCardRefundWithTransactionIdV1Response.
     * 
     * @param processCreditCardRefundWithTransactionIdV1Result
     */
    public void setProcessCreditCardRefundWithTransactionIdV1Result(com.iatspayments.www.NetGate.ProcessCreditCardRefundWithTransactionIdV1ResponseProcessCreditCardRefundWithTransactionIdV1Result processCreditCardRefundWithTransactionIdV1Result) {
        this.processCreditCardRefundWithTransactionIdV1Result = processCreditCardRefundWithTransactionIdV1Result;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProcessCreditCardRefundWithTransactionIdV1Response)) return false;
        ProcessCreditCardRefundWithTransactionIdV1Response other = (ProcessCreditCardRefundWithTransactionIdV1Response) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.processCreditCardRefundWithTransactionIdV1Result==null && other.getProcessCreditCardRefundWithTransactionIdV1Result()==null) || 
             (this.processCreditCardRefundWithTransactionIdV1Result!=null &&
              this.processCreditCardRefundWithTransactionIdV1Result.equals(other.getProcessCreditCardRefundWithTransactionIdV1Result())));
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
        if (getProcessCreditCardRefundWithTransactionIdV1Result() != null) {
            _hashCode += getProcessCreditCardRefundWithTransactionIdV1Result().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProcessCreditCardRefundWithTransactionIdV1Response.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">ProcessCreditCardRefundWithTransactionIdV1Response"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processCreditCardRefundWithTransactionIdV1Result");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", "ProcessCreditCardRefundWithTransactionIdV1Result"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">>ProcessCreditCardRefundWithTransactionIdV1Response>ProcessCreditCardRefundWithTransactionIdV1Result"));
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
