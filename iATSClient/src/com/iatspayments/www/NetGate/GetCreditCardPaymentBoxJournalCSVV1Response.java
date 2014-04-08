/**
 * GetCreditCardPaymentBoxJournalCSVV1Response.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.iatspayments.www.NetGate;

public class GetCreditCardPaymentBoxJournalCSVV1Response  implements java.io.Serializable {
    private com.iatspayments.www.NetGate.GetCreditCardPaymentBoxJournalCSVV1ResponseGetCreditCardPaymentBoxJournalCSVV1Result getCreditCardPaymentBoxJournalCSVV1Result;

    public GetCreditCardPaymentBoxJournalCSVV1Response() {
    }

    public GetCreditCardPaymentBoxJournalCSVV1Response(
           com.iatspayments.www.NetGate.GetCreditCardPaymentBoxJournalCSVV1ResponseGetCreditCardPaymentBoxJournalCSVV1Result getCreditCardPaymentBoxJournalCSVV1Result) {
           this.getCreditCardPaymentBoxJournalCSVV1Result = getCreditCardPaymentBoxJournalCSVV1Result;
    }


    /**
     * Gets the getCreditCardPaymentBoxJournalCSVV1Result value for this GetCreditCardPaymentBoxJournalCSVV1Response.
     * 
     * @return getCreditCardPaymentBoxJournalCSVV1Result
     */
    public com.iatspayments.www.NetGate.GetCreditCardPaymentBoxJournalCSVV1ResponseGetCreditCardPaymentBoxJournalCSVV1Result getGetCreditCardPaymentBoxJournalCSVV1Result() {
        return getCreditCardPaymentBoxJournalCSVV1Result;
    }


    /**
     * Sets the getCreditCardPaymentBoxJournalCSVV1Result value for this GetCreditCardPaymentBoxJournalCSVV1Response.
     * 
     * @param getCreditCardPaymentBoxJournalCSVV1Result
     */
    public void setGetCreditCardPaymentBoxJournalCSVV1Result(com.iatspayments.www.NetGate.GetCreditCardPaymentBoxJournalCSVV1ResponseGetCreditCardPaymentBoxJournalCSVV1Result getCreditCardPaymentBoxJournalCSVV1Result) {
        this.getCreditCardPaymentBoxJournalCSVV1Result = getCreditCardPaymentBoxJournalCSVV1Result;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetCreditCardPaymentBoxJournalCSVV1Response)) return false;
        GetCreditCardPaymentBoxJournalCSVV1Response other = (GetCreditCardPaymentBoxJournalCSVV1Response) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getCreditCardPaymentBoxJournalCSVV1Result==null && other.getGetCreditCardPaymentBoxJournalCSVV1Result()==null) || 
             (this.getCreditCardPaymentBoxJournalCSVV1Result!=null &&
              this.getCreditCardPaymentBoxJournalCSVV1Result.equals(other.getGetCreditCardPaymentBoxJournalCSVV1Result())));
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
        if (getGetCreditCardPaymentBoxJournalCSVV1Result() != null) {
            _hashCode += getGetCreditCardPaymentBoxJournalCSVV1Result().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetCreditCardPaymentBoxJournalCSVV1Response.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">GetCreditCardPaymentBoxJournalCSVV1Response"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getCreditCardPaymentBoxJournalCSVV1Result");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", "GetCreditCardPaymentBoxJournalCSVV1Result"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">>GetCreditCardPaymentBoxJournalCSVV1Response>GetCreditCardPaymentBoxJournalCSVV1Result"));
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
