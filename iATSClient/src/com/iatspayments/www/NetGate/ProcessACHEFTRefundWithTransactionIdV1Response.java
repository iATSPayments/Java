/**
 * ProcessACHEFTRefundWithTransactionIdV1Response.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.iatspayments.www.NetGate;

public class ProcessACHEFTRefundWithTransactionIdV1Response  implements java.io.Serializable {
    private com.iatspayments.www.NetGate.ProcessACHEFTRefundWithTransactionIdV1ResponseProcessACHEFTRefundWithTransactionIdV1Result processACHEFTRefundWithTransactionIdV1Result;

    public ProcessACHEFTRefundWithTransactionIdV1Response() {
    }

    public ProcessACHEFTRefundWithTransactionIdV1Response(
           com.iatspayments.www.NetGate.ProcessACHEFTRefundWithTransactionIdV1ResponseProcessACHEFTRefundWithTransactionIdV1Result processACHEFTRefundWithTransactionIdV1Result) {
           this.processACHEFTRefundWithTransactionIdV1Result = processACHEFTRefundWithTransactionIdV1Result;
    }


    /**
     * Gets the processACHEFTRefundWithTransactionIdV1Result value for this ProcessACHEFTRefundWithTransactionIdV1Response.
     * 
     * @return processACHEFTRefundWithTransactionIdV1Result
     */
    public com.iatspayments.www.NetGate.ProcessACHEFTRefundWithTransactionIdV1ResponseProcessACHEFTRefundWithTransactionIdV1Result getProcessACHEFTRefundWithTransactionIdV1Result() {
        return processACHEFTRefundWithTransactionIdV1Result;
    }


    /**
     * Sets the processACHEFTRefundWithTransactionIdV1Result value for this ProcessACHEFTRefundWithTransactionIdV1Response.
     * 
     * @param processACHEFTRefundWithTransactionIdV1Result
     */
    public void setProcessACHEFTRefundWithTransactionIdV1Result(com.iatspayments.www.NetGate.ProcessACHEFTRefundWithTransactionIdV1ResponseProcessACHEFTRefundWithTransactionIdV1Result processACHEFTRefundWithTransactionIdV1Result) {
        this.processACHEFTRefundWithTransactionIdV1Result = processACHEFTRefundWithTransactionIdV1Result;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProcessACHEFTRefundWithTransactionIdV1Response)) return false;
        ProcessACHEFTRefundWithTransactionIdV1Response other = (ProcessACHEFTRefundWithTransactionIdV1Response) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.processACHEFTRefundWithTransactionIdV1Result==null && other.getProcessACHEFTRefundWithTransactionIdV1Result()==null) || 
             (this.processACHEFTRefundWithTransactionIdV1Result!=null &&
              this.processACHEFTRefundWithTransactionIdV1Result.equals(other.getProcessACHEFTRefundWithTransactionIdV1Result())));
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
        if (getProcessACHEFTRefundWithTransactionIdV1Result() != null) {
            _hashCode += getProcessACHEFTRefundWithTransactionIdV1Result().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProcessACHEFTRefundWithTransactionIdV1Response.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">ProcessACHEFTRefundWithTransactionIdV1Response"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processACHEFTRefundWithTransactionIdV1Result");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", "ProcessACHEFTRefundWithTransactionIdV1Result"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">>ProcessACHEFTRefundWithTransactionIdV1Response>ProcessACHEFTRefundWithTransactionIdV1Result"));
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
