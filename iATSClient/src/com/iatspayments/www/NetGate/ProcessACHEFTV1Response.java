/**
 * ProcessACHEFTV1Response.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.iatspayments.www.NetGate;

public class ProcessACHEFTV1Response  implements java.io.Serializable {
    private com.iatspayments.www.NetGate.ProcessACHEFTV1ResponseProcessACHEFTV1Result processACHEFTV1Result;

    public ProcessACHEFTV1Response() {
    }

    public ProcessACHEFTV1Response(
           com.iatspayments.www.NetGate.ProcessACHEFTV1ResponseProcessACHEFTV1Result processACHEFTV1Result) {
           this.processACHEFTV1Result = processACHEFTV1Result;
    }


    /**
     * Gets the processACHEFTV1Result value for this ProcessACHEFTV1Response.
     * 
     * @return processACHEFTV1Result
     */
    public com.iatspayments.www.NetGate.ProcessACHEFTV1ResponseProcessACHEFTV1Result getProcessACHEFTV1Result() {
        return processACHEFTV1Result;
    }


    /**
     * Sets the processACHEFTV1Result value for this ProcessACHEFTV1Response.
     * 
     * @param processACHEFTV1Result
     */
    public void setProcessACHEFTV1Result(com.iatspayments.www.NetGate.ProcessACHEFTV1ResponseProcessACHEFTV1Result processACHEFTV1Result) {
        this.processACHEFTV1Result = processACHEFTV1Result;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProcessACHEFTV1Response)) return false;
        ProcessACHEFTV1Response other = (ProcessACHEFTV1Response) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.processACHEFTV1Result==null && other.getProcessACHEFTV1Result()==null) || 
             (this.processACHEFTV1Result!=null &&
              this.processACHEFTV1Result.equals(other.getProcessACHEFTV1Result())));
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
        if (getProcessACHEFTV1Result() != null) {
            _hashCode += getProcessACHEFTV1Result().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProcessACHEFTV1Response.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">ProcessACHEFTV1Response"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processACHEFTV1Result");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", "ProcessACHEFTV1Result"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">>ProcessACHEFTV1Response>ProcessACHEFTV1Result"));
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
