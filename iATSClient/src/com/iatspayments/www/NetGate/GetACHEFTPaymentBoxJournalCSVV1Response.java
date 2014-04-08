/**
 * GetACHEFTPaymentBoxJournalCSVV1Response.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.iatspayments.www.NetGate;

public class GetACHEFTPaymentBoxJournalCSVV1Response  implements java.io.Serializable {
    private com.iatspayments.www.NetGate.GetACHEFTPaymentBoxJournalCSVV1ResponseGetACHEFTPaymentBoxJournalCSVV1Result getACHEFTPaymentBoxJournalCSVV1Result;

    public GetACHEFTPaymentBoxJournalCSVV1Response() {
    }

    public GetACHEFTPaymentBoxJournalCSVV1Response(
           com.iatspayments.www.NetGate.GetACHEFTPaymentBoxJournalCSVV1ResponseGetACHEFTPaymentBoxJournalCSVV1Result getACHEFTPaymentBoxJournalCSVV1Result) {
           this.getACHEFTPaymentBoxJournalCSVV1Result = getACHEFTPaymentBoxJournalCSVV1Result;
    }


    /**
     * Gets the getACHEFTPaymentBoxJournalCSVV1Result value for this GetACHEFTPaymentBoxJournalCSVV1Response.
     * 
     * @return getACHEFTPaymentBoxJournalCSVV1Result
     */
    public com.iatspayments.www.NetGate.GetACHEFTPaymentBoxJournalCSVV1ResponseGetACHEFTPaymentBoxJournalCSVV1Result getGetACHEFTPaymentBoxJournalCSVV1Result() {
        return getACHEFTPaymentBoxJournalCSVV1Result;
    }


    /**
     * Sets the getACHEFTPaymentBoxJournalCSVV1Result value for this GetACHEFTPaymentBoxJournalCSVV1Response.
     * 
     * @param getACHEFTPaymentBoxJournalCSVV1Result
     */
    public void setGetACHEFTPaymentBoxJournalCSVV1Result(com.iatspayments.www.NetGate.GetACHEFTPaymentBoxJournalCSVV1ResponseGetACHEFTPaymentBoxJournalCSVV1Result getACHEFTPaymentBoxJournalCSVV1Result) {
        this.getACHEFTPaymentBoxJournalCSVV1Result = getACHEFTPaymentBoxJournalCSVV1Result;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetACHEFTPaymentBoxJournalCSVV1Response)) return false;
        GetACHEFTPaymentBoxJournalCSVV1Response other = (GetACHEFTPaymentBoxJournalCSVV1Response) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getACHEFTPaymentBoxJournalCSVV1Result==null && other.getGetACHEFTPaymentBoxJournalCSVV1Result()==null) || 
             (this.getACHEFTPaymentBoxJournalCSVV1Result!=null &&
              this.getACHEFTPaymentBoxJournalCSVV1Result.equals(other.getGetACHEFTPaymentBoxJournalCSVV1Result())));
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
        if (getGetACHEFTPaymentBoxJournalCSVV1Result() != null) {
            _hashCode += getGetACHEFTPaymentBoxJournalCSVV1Result().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetACHEFTPaymentBoxJournalCSVV1Response.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">GetACHEFTPaymentBoxJournalCSVV1Response"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getACHEFTPaymentBoxJournalCSVV1Result");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", "GetACHEFTPaymentBoxJournalCSVV1Result"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">>GetACHEFTPaymentBoxJournalCSVV1Response>GetACHEFTPaymentBoxJournalCSVV1Result"));
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
