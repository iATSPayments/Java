/**
 * GetCCJournalCSV_x0020_V1Response.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.iatspayments.www.NetGate;

public class GetCCJournalCSV_x0020_V1Response  implements java.io.Serializable {
    private byte[] getCCJournalCSV_x0020_V1Result;

    public GetCCJournalCSV_x0020_V1Response() {
    }

    public GetCCJournalCSV_x0020_V1Response(
           byte[] getCCJournalCSV_x0020_V1Result) {
           this.getCCJournalCSV_x0020_V1Result = getCCJournalCSV_x0020_V1Result;
    }


    /**
     * Gets the getCCJournalCSV_x0020_V1Result value for this GetCCJournalCSV_x0020_V1Response.
     * 
     * @return getCCJournalCSV_x0020_V1Result
     */
    public byte[] getGetCCJournalCSV_x0020_V1Result() {
        return getCCJournalCSV_x0020_V1Result;
    }


    /**
     * Sets the getCCJournalCSV_x0020_V1Result value for this GetCCJournalCSV_x0020_V1Response.
     * 
     * @param getCCJournalCSV_x0020_V1Result
     */
    public void setGetCCJournalCSV_x0020_V1Result(byte[] getCCJournalCSV_x0020_V1Result) {
        this.getCCJournalCSV_x0020_V1Result = getCCJournalCSV_x0020_V1Result;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetCCJournalCSV_x0020_V1Response)) return false;
        GetCCJournalCSV_x0020_V1Response other = (GetCCJournalCSV_x0020_V1Response) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getCCJournalCSV_x0020_V1Result==null && other.getGetCCJournalCSV_x0020_V1Result()==null) || 
             (this.getCCJournalCSV_x0020_V1Result!=null &&
              java.util.Arrays.equals(this.getCCJournalCSV_x0020_V1Result, other.getGetCCJournalCSV_x0020_V1Result())));
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
        if (getGetCCJournalCSV_x0020_V1Result() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGetCCJournalCSV_x0020_V1Result());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGetCCJournalCSV_x0020_V1Result(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetCCJournalCSV_x0020_V1Response.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">GetCCJournalCSV_x0020_V1Response"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getCCJournalCSV_x0020_V1Result");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", "GetCCJournalCSV_x0020_V1Result"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
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
