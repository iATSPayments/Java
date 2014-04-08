/**
 * ProcessCreditCardWithCustomerCodeV1Response.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.iatspayments.www.NetGate;

public class ProcessCreditCardWithCustomerCodeV1Response  implements java.io.Serializable {
    private com.iatspayments.www.NetGate.ProcessCreditCardWithCustomerCodeV1ResponseProcessCreditCardWithCustomerCodeV1Result processCreditCardWithCustomerCodeV1Result;

    public ProcessCreditCardWithCustomerCodeV1Response() {
    }

    public ProcessCreditCardWithCustomerCodeV1Response(
           com.iatspayments.www.NetGate.ProcessCreditCardWithCustomerCodeV1ResponseProcessCreditCardWithCustomerCodeV1Result processCreditCardWithCustomerCodeV1Result) {
           this.processCreditCardWithCustomerCodeV1Result = processCreditCardWithCustomerCodeV1Result;
    }


    /**
     * Gets the processCreditCardWithCustomerCodeV1Result value for this ProcessCreditCardWithCustomerCodeV1Response.
     * 
     * @return processCreditCardWithCustomerCodeV1Result
     */
    public com.iatspayments.www.NetGate.ProcessCreditCardWithCustomerCodeV1ResponseProcessCreditCardWithCustomerCodeV1Result getProcessCreditCardWithCustomerCodeV1Result() {
        return processCreditCardWithCustomerCodeV1Result;
    }


    /**
     * Sets the processCreditCardWithCustomerCodeV1Result value for this ProcessCreditCardWithCustomerCodeV1Response.
     * 
     * @param processCreditCardWithCustomerCodeV1Result
     */
    public void setProcessCreditCardWithCustomerCodeV1Result(com.iatspayments.www.NetGate.ProcessCreditCardWithCustomerCodeV1ResponseProcessCreditCardWithCustomerCodeV1Result processCreditCardWithCustomerCodeV1Result) {
        this.processCreditCardWithCustomerCodeV1Result = processCreditCardWithCustomerCodeV1Result;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProcessCreditCardWithCustomerCodeV1Response)) return false;
        ProcessCreditCardWithCustomerCodeV1Response other = (ProcessCreditCardWithCustomerCodeV1Response) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.processCreditCardWithCustomerCodeV1Result==null && other.getProcessCreditCardWithCustomerCodeV1Result()==null) || 
             (this.processCreditCardWithCustomerCodeV1Result!=null &&
              this.processCreditCardWithCustomerCodeV1Result.equals(other.getProcessCreditCardWithCustomerCodeV1Result())));
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
        if (getProcessCreditCardWithCustomerCodeV1Result() != null) {
            _hashCode += getProcessCreditCardWithCustomerCodeV1Result().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProcessCreditCardWithCustomerCodeV1Response.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">ProcessCreditCardWithCustomerCodeV1Response"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processCreditCardWithCustomerCodeV1Result");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", "ProcessCreditCardWithCustomerCodeV1Result"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">>ProcessCreditCardWithCustomerCodeV1Response>ProcessCreditCardWithCustomerCodeV1Result"));
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
