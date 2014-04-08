/**
 * GetCreditCardJournalV1Response.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.iatspayments.www.NetGate;

public class GetCreditCardJournalV1Response  implements java.io.Serializable {
    private com.iatspayments.www.NetGate.GetCreditCardJournalV1ResponseGetCreditCardJournalV1Result getCreditCardJournalV1Result;

    public GetCreditCardJournalV1Response() {
    }

    public GetCreditCardJournalV1Response(
           com.iatspayments.www.NetGate.GetCreditCardJournalV1ResponseGetCreditCardJournalV1Result getCreditCardJournalV1Result) {
           this.getCreditCardJournalV1Result = getCreditCardJournalV1Result;
    }


    /**
     * Gets the getCreditCardJournalV1Result value for this GetCreditCardJournalV1Response.
     * 
     * @return getCreditCardJournalV1Result
     */
    public com.iatspayments.www.NetGate.GetCreditCardJournalV1ResponseGetCreditCardJournalV1Result getGetCreditCardJournalV1Result() {
        return getCreditCardJournalV1Result;
    }


    /**
     * Sets the getCreditCardJournalV1Result value for this GetCreditCardJournalV1Response.
     * 
     * @param getCreditCardJournalV1Result
     */
    public void setGetCreditCardJournalV1Result(com.iatspayments.www.NetGate.GetCreditCardJournalV1ResponseGetCreditCardJournalV1Result getCreditCardJournalV1Result) {
        this.getCreditCardJournalV1Result = getCreditCardJournalV1Result;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetCreditCardJournalV1Response)) return false;
        GetCreditCardJournalV1Response other = (GetCreditCardJournalV1Response) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getCreditCardJournalV1Result==null && other.getGetCreditCardJournalV1Result()==null) || 
             (this.getCreditCardJournalV1Result!=null &&
              this.getCreditCardJournalV1Result.equals(other.getGetCreditCardJournalV1Result())));
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
        if (getGetCreditCardJournalV1Result() != null) {
            _hashCode += getGetCreditCardJournalV1Result().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetCreditCardJournalV1Response.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">GetCreditCardJournalV1Response"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getCreditCardJournalV1Result");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", "GetCreditCardJournalV1Result"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">>GetCreditCardJournalV1Response>GetCreditCardJournalV1Result"));
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
