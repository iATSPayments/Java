/**
 * GetCreditCardRejectV1Response.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.iatspayments.www.NetGate;

public class GetCreditCardRejectV1Response  implements java.io.Serializable {
    private com.iatspayments.www.NetGate.GetCreditCardRejectV1ResponseGetCreditCardRejectV1Result getCreditCardRejectV1Result;

    public GetCreditCardRejectV1Response() {
    }

    public GetCreditCardRejectV1Response(
           com.iatspayments.www.NetGate.GetCreditCardRejectV1ResponseGetCreditCardRejectV1Result getCreditCardRejectV1Result) {
           this.getCreditCardRejectV1Result = getCreditCardRejectV1Result;
    }


    /**
     * Gets the getCreditCardRejectV1Result value for this GetCreditCardRejectV1Response.
     * 
     * @return getCreditCardRejectV1Result
     */
    public com.iatspayments.www.NetGate.GetCreditCardRejectV1ResponseGetCreditCardRejectV1Result getGetCreditCardRejectV1Result() {
        return getCreditCardRejectV1Result;
    }


    /**
     * Sets the getCreditCardRejectV1Result value for this GetCreditCardRejectV1Response.
     * 
     * @param getCreditCardRejectV1Result
     */
    public void setGetCreditCardRejectV1Result(com.iatspayments.www.NetGate.GetCreditCardRejectV1ResponseGetCreditCardRejectV1Result getCreditCardRejectV1Result) {
        this.getCreditCardRejectV1Result = getCreditCardRejectV1Result;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetCreditCardRejectV1Response)) return false;
        GetCreditCardRejectV1Response other = (GetCreditCardRejectV1Response) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getCreditCardRejectV1Result==null && other.getGetCreditCardRejectV1Result()==null) || 
             (this.getCreditCardRejectV1Result!=null &&
              this.getCreditCardRejectV1Result.equals(other.getGetCreditCardRejectV1Result())));
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
        if (getGetCreditCardRejectV1Result() != null) {
            _hashCode += getGetCreditCardRejectV1Result().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetCreditCardRejectV1Response.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">GetCreditCardRejectV1Response"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getCreditCardRejectV1Result");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", "GetCreditCardRejectV1Result"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">>GetCreditCardRejectV1Response>GetCreditCardRejectV1Result"));
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
