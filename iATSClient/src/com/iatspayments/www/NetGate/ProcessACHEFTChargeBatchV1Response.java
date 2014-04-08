/**
 * ProcessACHEFTChargeBatchV1Response.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.iatspayments.www.NetGate;

public class ProcessACHEFTChargeBatchV1Response  implements java.io.Serializable {
    private com.iatspayments.www.NetGate.ProcessACHEFTChargeBatchV1ResponseProcessACHEFTChargeBatchV1Result processACHEFTChargeBatchV1Result;

    public ProcessACHEFTChargeBatchV1Response() {
    }

    public ProcessACHEFTChargeBatchV1Response(
           com.iatspayments.www.NetGate.ProcessACHEFTChargeBatchV1ResponseProcessACHEFTChargeBatchV1Result processACHEFTChargeBatchV1Result) {
           this.processACHEFTChargeBatchV1Result = processACHEFTChargeBatchV1Result;
    }


    /**
     * Gets the processACHEFTChargeBatchV1Result value for this ProcessACHEFTChargeBatchV1Response.
     * 
     * @return processACHEFTChargeBatchV1Result
     */
    public com.iatspayments.www.NetGate.ProcessACHEFTChargeBatchV1ResponseProcessACHEFTChargeBatchV1Result getProcessACHEFTChargeBatchV1Result() {
        return processACHEFTChargeBatchV1Result;
    }


    /**
     * Sets the processACHEFTChargeBatchV1Result value for this ProcessACHEFTChargeBatchV1Response.
     * 
     * @param processACHEFTChargeBatchV1Result
     */
    public void setProcessACHEFTChargeBatchV1Result(com.iatspayments.www.NetGate.ProcessACHEFTChargeBatchV1ResponseProcessACHEFTChargeBatchV1Result processACHEFTChargeBatchV1Result) {
        this.processACHEFTChargeBatchV1Result = processACHEFTChargeBatchV1Result;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProcessACHEFTChargeBatchV1Response)) return false;
        ProcessACHEFTChargeBatchV1Response other = (ProcessACHEFTChargeBatchV1Response) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.processACHEFTChargeBatchV1Result==null && other.getProcessACHEFTChargeBatchV1Result()==null) || 
             (this.processACHEFTChargeBatchV1Result!=null &&
              this.processACHEFTChargeBatchV1Result.equals(other.getProcessACHEFTChargeBatchV1Result())));
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
        if (getProcessACHEFTChargeBatchV1Result() != null) {
            _hashCode += getProcessACHEFTChargeBatchV1Result().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProcessACHEFTChargeBatchV1Response.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">ProcessACHEFTChargeBatchV1Response"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processACHEFTChargeBatchV1Result");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", "ProcessACHEFTChargeBatchV1Result"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">>ProcessACHEFTChargeBatchV1Response>ProcessACHEFTChargeBatchV1Result"));
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
