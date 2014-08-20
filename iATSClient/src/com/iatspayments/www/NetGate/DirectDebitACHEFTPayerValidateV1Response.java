/**
 * DirectDebitACHEFTPayerValidateV1Response.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.iatspayments.www.NetGate;

public class DirectDebitACHEFTPayerValidateV1Response  implements java.io.Serializable {
    private com.iatspayments.www.NetGate.DirectDebitACHEFTPayerValidateV1ResponseDirectDebitACHEFTPayerValidateV1Result directDebitACHEFTPayerValidateV1Result;

    public DirectDebitACHEFTPayerValidateV1Response() {
    }

    public DirectDebitACHEFTPayerValidateV1Response(
           com.iatspayments.www.NetGate.DirectDebitACHEFTPayerValidateV1ResponseDirectDebitACHEFTPayerValidateV1Result directDebitACHEFTPayerValidateV1Result) {
           this.directDebitACHEFTPayerValidateV1Result = directDebitACHEFTPayerValidateV1Result;
    }


    /**
     * Gets the directDebitACHEFTPayerValidateV1Result value for this DirectDebitACHEFTPayerValidateV1Response.
     * 
     * @return directDebitACHEFTPayerValidateV1Result
     */
    public com.iatspayments.www.NetGate.DirectDebitACHEFTPayerValidateV1ResponseDirectDebitACHEFTPayerValidateV1Result getDirectDebitACHEFTPayerValidateV1Result() {
        return directDebitACHEFTPayerValidateV1Result;
    }


    /**
     * Sets the directDebitACHEFTPayerValidateV1Result value for this DirectDebitACHEFTPayerValidateV1Response.
     * 
     * @param directDebitACHEFTPayerValidateV1Result
     */
    public void setDirectDebitACHEFTPayerValidateV1Result(com.iatspayments.www.NetGate.DirectDebitACHEFTPayerValidateV1ResponseDirectDebitACHEFTPayerValidateV1Result directDebitACHEFTPayerValidateV1Result) {
        this.directDebitACHEFTPayerValidateV1Result = directDebitACHEFTPayerValidateV1Result;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DirectDebitACHEFTPayerValidateV1Response)) return false;
        DirectDebitACHEFTPayerValidateV1Response other = (DirectDebitACHEFTPayerValidateV1Response) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.directDebitACHEFTPayerValidateV1Result==null && other.getDirectDebitACHEFTPayerValidateV1Result()==null) || 
             (this.directDebitACHEFTPayerValidateV1Result!=null &&
              this.directDebitACHEFTPayerValidateV1Result.equals(other.getDirectDebitACHEFTPayerValidateV1Result())));
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
        if (getDirectDebitACHEFTPayerValidateV1Result() != null) {
            _hashCode += getDirectDebitACHEFTPayerValidateV1Result().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DirectDebitACHEFTPayerValidateV1Response.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">DirectDebitACHEFTPayerValidateV1Response"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("directDebitACHEFTPayerValidateV1Result");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", "DirectDebitACHEFTPayerValidateV1Result"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">>DirectDebitACHEFTPayerValidateV1Response>DirectDebitACHEFTPayerValidateV1Result"));
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
