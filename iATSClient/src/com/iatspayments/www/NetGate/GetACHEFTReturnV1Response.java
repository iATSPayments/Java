/**
 * GetACHEFTReturnV1Response.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.iatspayments.www.NetGate;

public class GetACHEFTReturnV1Response  implements java.io.Serializable {
    private com.iatspayments.www.NetGate.GetACHEFTReturnV1ResponseGetACHEFTReturnV1Result getACHEFTReturnV1Result;

    public GetACHEFTReturnV1Response() {
    }

    public GetACHEFTReturnV1Response(
           com.iatspayments.www.NetGate.GetACHEFTReturnV1ResponseGetACHEFTReturnV1Result getACHEFTReturnV1Result) {
           this.getACHEFTReturnV1Result = getACHEFTReturnV1Result;
    }


    /**
     * Gets the getACHEFTReturnV1Result value for this GetACHEFTReturnV1Response.
     * 
     * @return getACHEFTReturnV1Result
     */
    public com.iatspayments.www.NetGate.GetACHEFTReturnV1ResponseGetACHEFTReturnV1Result getGetACHEFTReturnV1Result() {
        return getACHEFTReturnV1Result;
    }


    /**
     * Sets the getACHEFTReturnV1Result value for this GetACHEFTReturnV1Response.
     * 
     * @param getACHEFTReturnV1Result
     */
    public void setGetACHEFTReturnV1Result(com.iatspayments.www.NetGate.GetACHEFTReturnV1ResponseGetACHEFTReturnV1Result getACHEFTReturnV1Result) {
        this.getACHEFTReturnV1Result = getACHEFTReturnV1Result;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetACHEFTReturnV1Response)) return false;
        GetACHEFTReturnV1Response other = (GetACHEFTReturnV1Response) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getACHEFTReturnV1Result==null && other.getGetACHEFTReturnV1Result()==null) || 
             (this.getACHEFTReturnV1Result!=null &&
              this.getACHEFTReturnV1Result.equals(other.getGetACHEFTReturnV1Result())));
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
        if (getGetACHEFTReturnV1Result() != null) {
            _hashCode += getGetACHEFTReturnV1Result().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetACHEFTReturnV1Response.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">GetACHEFTReturnV1Response"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getACHEFTReturnV1Result");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", "GetACHEFTReturnV1Result"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">>GetACHEFTReturnV1Response>GetACHEFTReturnV1Result"));
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
