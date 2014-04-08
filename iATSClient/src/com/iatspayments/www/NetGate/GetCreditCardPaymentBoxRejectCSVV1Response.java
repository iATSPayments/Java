/**
 * GetCreditCardPaymentBoxRejectCSVV1Response.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.iatspayments.www.NetGate;

public class GetCreditCardPaymentBoxRejectCSVV1Response  implements java.io.Serializable {
    private com.iatspayments.www.NetGate.GetCreditCardPaymentBoxRejectCSVV1ResponseGetCreditCardPaymentBoxRejectCSVV1Result getCreditCardPaymentBoxRejectCSVV1Result;

    public GetCreditCardPaymentBoxRejectCSVV1Response() {
    }

    public GetCreditCardPaymentBoxRejectCSVV1Response(
           com.iatspayments.www.NetGate.GetCreditCardPaymentBoxRejectCSVV1ResponseGetCreditCardPaymentBoxRejectCSVV1Result getCreditCardPaymentBoxRejectCSVV1Result) {
           this.getCreditCardPaymentBoxRejectCSVV1Result = getCreditCardPaymentBoxRejectCSVV1Result;
    }


    /**
     * Gets the getCreditCardPaymentBoxRejectCSVV1Result value for this GetCreditCardPaymentBoxRejectCSVV1Response.
     * 
     * @return getCreditCardPaymentBoxRejectCSVV1Result
     */
    public com.iatspayments.www.NetGate.GetCreditCardPaymentBoxRejectCSVV1ResponseGetCreditCardPaymentBoxRejectCSVV1Result getGetCreditCardPaymentBoxRejectCSVV1Result() {
        return getCreditCardPaymentBoxRejectCSVV1Result;
    }


    /**
     * Sets the getCreditCardPaymentBoxRejectCSVV1Result value for this GetCreditCardPaymentBoxRejectCSVV1Response.
     * 
     * @param getCreditCardPaymentBoxRejectCSVV1Result
     */
    public void setGetCreditCardPaymentBoxRejectCSVV1Result(com.iatspayments.www.NetGate.GetCreditCardPaymentBoxRejectCSVV1ResponseGetCreditCardPaymentBoxRejectCSVV1Result getCreditCardPaymentBoxRejectCSVV1Result) {
        this.getCreditCardPaymentBoxRejectCSVV1Result = getCreditCardPaymentBoxRejectCSVV1Result;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetCreditCardPaymentBoxRejectCSVV1Response)) return false;
        GetCreditCardPaymentBoxRejectCSVV1Response other = (GetCreditCardPaymentBoxRejectCSVV1Response) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getCreditCardPaymentBoxRejectCSVV1Result==null && other.getGetCreditCardPaymentBoxRejectCSVV1Result()==null) || 
             (this.getCreditCardPaymentBoxRejectCSVV1Result!=null &&
              this.getCreditCardPaymentBoxRejectCSVV1Result.equals(other.getGetCreditCardPaymentBoxRejectCSVV1Result())));
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
        if (getGetCreditCardPaymentBoxRejectCSVV1Result() != null) {
            _hashCode += getGetCreditCardPaymentBoxRejectCSVV1Result().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetCreditCardPaymentBoxRejectCSVV1Response.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">GetCreditCardPaymentBoxRejectCSVV1Response"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getCreditCardPaymentBoxRejectCSVV1Result");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", "GetCreditCardPaymentBoxRejectCSVV1Result"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">>GetCreditCardPaymentBoxRejectCSVV1Response>GetCreditCardPaymentBoxRejectCSVV1Result"));
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
