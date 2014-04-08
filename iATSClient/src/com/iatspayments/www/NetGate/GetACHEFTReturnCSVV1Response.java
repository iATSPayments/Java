/**
 * GetACHEFTReturnCSVV1Response.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.iatspayments.www.NetGate;

public class GetACHEFTReturnCSVV1Response  implements java.io.Serializable {
    private com.iatspayments.www.NetGate.GetACHEFTReturnCSVV1ResponseGetACHEFTReturnCSVV1Result getACHEFTReturnCSVV1Result;

    public GetACHEFTReturnCSVV1Response() {
    }

    public GetACHEFTReturnCSVV1Response(
           com.iatspayments.www.NetGate.GetACHEFTReturnCSVV1ResponseGetACHEFTReturnCSVV1Result getACHEFTReturnCSVV1Result) {
           this.getACHEFTReturnCSVV1Result = getACHEFTReturnCSVV1Result;
    }


    /**
     * Gets the getACHEFTReturnCSVV1Result value for this GetACHEFTReturnCSVV1Response.
     * 
     * @return getACHEFTReturnCSVV1Result
     */
    public com.iatspayments.www.NetGate.GetACHEFTReturnCSVV1ResponseGetACHEFTReturnCSVV1Result getGetACHEFTReturnCSVV1Result() {
        return getACHEFTReturnCSVV1Result;
    }


    /**
     * Sets the getACHEFTReturnCSVV1Result value for this GetACHEFTReturnCSVV1Response.
     * 
     * @param getACHEFTReturnCSVV1Result
     */
    public void setGetACHEFTReturnCSVV1Result(com.iatspayments.www.NetGate.GetACHEFTReturnCSVV1ResponseGetACHEFTReturnCSVV1Result getACHEFTReturnCSVV1Result) {
        this.getACHEFTReturnCSVV1Result = getACHEFTReturnCSVV1Result;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetACHEFTReturnCSVV1Response)) return false;
        GetACHEFTReturnCSVV1Response other = (GetACHEFTReturnCSVV1Response) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getACHEFTReturnCSVV1Result==null && other.getGetACHEFTReturnCSVV1Result()==null) || 
             (this.getACHEFTReturnCSVV1Result!=null &&
              this.getACHEFTReturnCSVV1Result.equals(other.getGetACHEFTReturnCSVV1Result())));
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
        if (getGetACHEFTReturnCSVV1Result() != null) {
            _hashCode += getGetACHEFTReturnCSVV1Result().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetACHEFTReturnCSVV1Response.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">GetACHEFTReturnCSVV1Response"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getACHEFTReturnCSVV1Result");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", "GetACHEFTReturnCSVV1Result"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">>GetACHEFTReturnCSVV1Response>GetACHEFTReturnCSVV1Result"));
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
