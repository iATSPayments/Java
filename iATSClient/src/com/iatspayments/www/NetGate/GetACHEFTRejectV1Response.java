/**
 * GetACHEFTRejectV1Response.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.iatspayments.www.NetGate;

public class GetACHEFTRejectV1Response  implements java.io.Serializable {
    private com.iatspayments.www.NetGate.GetACHEFTRejectV1ResponseGetACHEFTRejectV1Result getACHEFTRejectV1Result;

    public GetACHEFTRejectV1Response() {
    }

    public GetACHEFTRejectV1Response(
           com.iatspayments.www.NetGate.GetACHEFTRejectV1ResponseGetACHEFTRejectV1Result getACHEFTRejectV1Result) {
           this.getACHEFTRejectV1Result = getACHEFTRejectV1Result;
    }


    /**
     * Gets the getACHEFTRejectV1Result value for this GetACHEFTRejectV1Response.
     * 
     * @return getACHEFTRejectV1Result
     */
    public com.iatspayments.www.NetGate.GetACHEFTRejectV1ResponseGetACHEFTRejectV1Result getGetACHEFTRejectV1Result() {
        return getACHEFTRejectV1Result;
    }


    /**
     * Sets the getACHEFTRejectV1Result value for this GetACHEFTRejectV1Response.
     * 
     * @param getACHEFTRejectV1Result
     */
    public void setGetACHEFTRejectV1Result(com.iatspayments.www.NetGate.GetACHEFTRejectV1ResponseGetACHEFTRejectV1Result getACHEFTRejectV1Result) {
        this.getACHEFTRejectV1Result = getACHEFTRejectV1Result;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetACHEFTRejectV1Response)) return false;
        GetACHEFTRejectV1Response other = (GetACHEFTRejectV1Response) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getACHEFTRejectV1Result==null && other.getGetACHEFTRejectV1Result()==null) || 
             (this.getACHEFTRejectV1Result!=null &&
              this.getACHEFTRejectV1Result.equals(other.getGetACHEFTRejectV1Result())));
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
        if (getGetACHEFTRejectV1Result() != null) {
            _hashCode += getGetACHEFTRejectV1Result().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetACHEFTRejectV1Response.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">GetACHEFTRejectV1Response"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getACHEFTRejectV1Result");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", "GetACHEFTRejectV1Result"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">>GetACHEFTRejectV1Response>GetACHEFTRejectV1Result"));
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
