/**
 * ProcessACHEFTWithCustomerCodeV1Response.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.iatspayments.www.NetGate;

public class ProcessACHEFTWithCustomerCodeV1Response  implements java.io.Serializable {
    private com.iatspayments.www.NetGate.ProcessACHEFTWithCustomerCodeV1ResponseProcessACHEFTWithCustomerCodeV1Result processACHEFTWithCustomerCodeV1Result;

    public ProcessACHEFTWithCustomerCodeV1Response() {
    }

    public ProcessACHEFTWithCustomerCodeV1Response(
           com.iatspayments.www.NetGate.ProcessACHEFTWithCustomerCodeV1ResponseProcessACHEFTWithCustomerCodeV1Result processACHEFTWithCustomerCodeV1Result) {
           this.processACHEFTWithCustomerCodeV1Result = processACHEFTWithCustomerCodeV1Result;
    }


    /**
     * Gets the processACHEFTWithCustomerCodeV1Result value for this ProcessACHEFTWithCustomerCodeV1Response.
     * 
     * @return processACHEFTWithCustomerCodeV1Result
     */
    public com.iatspayments.www.NetGate.ProcessACHEFTWithCustomerCodeV1ResponseProcessACHEFTWithCustomerCodeV1Result getProcessACHEFTWithCustomerCodeV1Result() {
        return processACHEFTWithCustomerCodeV1Result;
    }


    /**
     * Sets the processACHEFTWithCustomerCodeV1Result value for this ProcessACHEFTWithCustomerCodeV1Response.
     * 
     * @param processACHEFTWithCustomerCodeV1Result
     */
    public void setProcessACHEFTWithCustomerCodeV1Result(com.iatspayments.www.NetGate.ProcessACHEFTWithCustomerCodeV1ResponseProcessACHEFTWithCustomerCodeV1Result processACHEFTWithCustomerCodeV1Result) {
        this.processACHEFTWithCustomerCodeV1Result = processACHEFTWithCustomerCodeV1Result;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProcessACHEFTWithCustomerCodeV1Response)) return false;
        ProcessACHEFTWithCustomerCodeV1Response other = (ProcessACHEFTWithCustomerCodeV1Response) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.processACHEFTWithCustomerCodeV1Result==null && other.getProcessACHEFTWithCustomerCodeV1Result()==null) || 
             (this.processACHEFTWithCustomerCodeV1Result!=null &&
              this.processACHEFTWithCustomerCodeV1Result.equals(other.getProcessACHEFTWithCustomerCodeV1Result())));
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
        if (getProcessACHEFTWithCustomerCodeV1Result() != null) {
            _hashCode += getProcessACHEFTWithCustomerCodeV1Result().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProcessACHEFTWithCustomerCodeV1Response.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">ProcessACHEFTWithCustomerCodeV1Response"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processACHEFTWithCustomerCodeV1Result");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", "ProcessACHEFTWithCustomerCodeV1Result"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">>ProcessACHEFTWithCustomerCodeV1Response>ProcessACHEFTWithCustomerCodeV1Result"));
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
