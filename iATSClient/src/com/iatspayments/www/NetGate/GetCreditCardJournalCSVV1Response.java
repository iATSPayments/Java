/**
 * GetCreditCardJournalCSVV1Response.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.iatspayments.www.NetGate;

public class GetCreditCardJournalCSVV1Response  implements java.io.Serializable {
    private com.iatspayments.www.NetGate.GetCreditCardJournalCSVV1ResponseGetCreditCardJournalCSVV1Result getCreditCardJournalCSVV1Result;

    public GetCreditCardJournalCSVV1Response() {
    }

    public GetCreditCardJournalCSVV1Response(
           com.iatspayments.www.NetGate.GetCreditCardJournalCSVV1ResponseGetCreditCardJournalCSVV1Result getCreditCardJournalCSVV1Result) {
           this.getCreditCardJournalCSVV1Result = getCreditCardJournalCSVV1Result;
    }


    /**
     * Gets the getCreditCardJournalCSVV1Result value for this GetCreditCardJournalCSVV1Response.
     * 
     * @return getCreditCardJournalCSVV1Result
     */
    public com.iatspayments.www.NetGate.GetCreditCardJournalCSVV1ResponseGetCreditCardJournalCSVV1Result getGetCreditCardJournalCSVV1Result() {
        return getCreditCardJournalCSVV1Result;
    }


    /**
     * Sets the getCreditCardJournalCSVV1Result value for this GetCreditCardJournalCSVV1Response.
     * 
     * @param getCreditCardJournalCSVV1Result
     */
    public void setGetCreditCardJournalCSVV1Result(com.iatspayments.www.NetGate.GetCreditCardJournalCSVV1ResponseGetCreditCardJournalCSVV1Result getCreditCardJournalCSVV1Result) {
        this.getCreditCardJournalCSVV1Result = getCreditCardJournalCSVV1Result;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetCreditCardJournalCSVV1Response)) return false;
        GetCreditCardJournalCSVV1Response other = (GetCreditCardJournalCSVV1Response) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getCreditCardJournalCSVV1Result==null && other.getGetCreditCardJournalCSVV1Result()==null) || 
             (this.getCreditCardJournalCSVV1Result!=null &&
              this.getCreditCardJournalCSVV1Result.equals(other.getGetCreditCardJournalCSVV1Result())));
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
        if (getGetCreditCardJournalCSVV1Result() != null) {
            _hashCode += getGetCreditCardJournalCSVV1Result().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetCreditCardJournalCSVV1Response.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">GetCreditCardJournalCSVV1Response"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getCreditCardJournalCSVV1Result");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", "GetCreditCardJournalCSVV1Result"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">>GetCreditCardJournalCSVV1Response>GetCreditCardJournalCSVV1Result"));
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
