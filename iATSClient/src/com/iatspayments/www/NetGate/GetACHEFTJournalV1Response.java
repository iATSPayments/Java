/**
 * GetACHEFTJournalV1Response.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.iatspayments.www.NetGate;

public class GetACHEFTJournalV1Response  implements java.io.Serializable {
    private com.iatspayments.www.NetGate.GetACHEFTJournalV1ResponseGetACHEFTJournalV1Result getACHEFTJournalV1Result;

    public GetACHEFTJournalV1Response() {
    }

    public GetACHEFTJournalV1Response(
           com.iatspayments.www.NetGate.GetACHEFTJournalV1ResponseGetACHEFTJournalV1Result getACHEFTJournalV1Result) {
           this.getACHEFTJournalV1Result = getACHEFTJournalV1Result;
    }


    /**
     * Gets the getACHEFTJournalV1Result value for this GetACHEFTJournalV1Response.
     * 
     * @return getACHEFTJournalV1Result
     */
    public com.iatspayments.www.NetGate.GetACHEFTJournalV1ResponseGetACHEFTJournalV1Result getGetACHEFTJournalV1Result() {
        return getACHEFTJournalV1Result;
    }


    /**
     * Sets the getACHEFTJournalV1Result value for this GetACHEFTJournalV1Response.
     * 
     * @param getACHEFTJournalV1Result
     */
    public void setGetACHEFTJournalV1Result(com.iatspayments.www.NetGate.GetACHEFTJournalV1ResponseGetACHEFTJournalV1Result getACHEFTJournalV1Result) {
        this.getACHEFTJournalV1Result = getACHEFTJournalV1Result;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetACHEFTJournalV1Response)) return false;
        GetACHEFTJournalV1Response other = (GetACHEFTJournalV1Response) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getACHEFTJournalV1Result==null && other.getGetACHEFTJournalV1Result()==null) || 
             (this.getACHEFTJournalV1Result!=null &&
              this.getACHEFTJournalV1Result.equals(other.getGetACHEFTJournalV1Result())));
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
        if (getGetACHEFTJournalV1Result() != null) {
            _hashCode += getGetACHEFTJournalV1Result().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetACHEFTJournalV1Response.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">GetACHEFTJournalV1Response"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getACHEFTJournalV1Result");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", "GetACHEFTJournalV1Result"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">>GetACHEFTJournalV1Response>GetACHEFTJournalV1Result"));
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
