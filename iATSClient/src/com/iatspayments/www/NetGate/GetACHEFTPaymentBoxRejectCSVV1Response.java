/**
 * GetACHEFTPaymentBoxRejectCSVV1Response.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.iatspayments.www.NetGate;

public class GetACHEFTPaymentBoxRejectCSVV1Response  implements java.io.Serializable {
    private com.iatspayments.www.NetGate.GetACHEFTPaymentBoxRejectCSVV1ResponseGetACHEFTPaymentBoxRejectCSVV1Result getACHEFTPaymentBoxRejectCSVV1Result;

    public GetACHEFTPaymentBoxRejectCSVV1Response() {
    }

    public GetACHEFTPaymentBoxRejectCSVV1Response(
           com.iatspayments.www.NetGate.GetACHEFTPaymentBoxRejectCSVV1ResponseGetACHEFTPaymentBoxRejectCSVV1Result getACHEFTPaymentBoxRejectCSVV1Result) {
           this.getACHEFTPaymentBoxRejectCSVV1Result = getACHEFTPaymentBoxRejectCSVV1Result;
    }


    /**
     * Gets the getACHEFTPaymentBoxRejectCSVV1Result value for this GetACHEFTPaymentBoxRejectCSVV1Response.
     * 
     * @return getACHEFTPaymentBoxRejectCSVV1Result
     */
    public com.iatspayments.www.NetGate.GetACHEFTPaymentBoxRejectCSVV1ResponseGetACHEFTPaymentBoxRejectCSVV1Result getGetACHEFTPaymentBoxRejectCSVV1Result() {
        return getACHEFTPaymentBoxRejectCSVV1Result;
    }


    /**
     * Sets the getACHEFTPaymentBoxRejectCSVV1Result value for this GetACHEFTPaymentBoxRejectCSVV1Response.
     * 
     * @param getACHEFTPaymentBoxRejectCSVV1Result
     */
    public void setGetACHEFTPaymentBoxRejectCSVV1Result(com.iatspayments.www.NetGate.GetACHEFTPaymentBoxRejectCSVV1ResponseGetACHEFTPaymentBoxRejectCSVV1Result getACHEFTPaymentBoxRejectCSVV1Result) {
        this.getACHEFTPaymentBoxRejectCSVV1Result = getACHEFTPaymentBoxRejectCSVV1Result;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetACHEFTPaymentBoxRejectCSVV1Response)) return false;
        GetACHEFTPaymentBoxRejectCSVV1Response other = (GetACHEFTPaymentBoxRejectCSVV1Response) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getACHEFTPaymentBoxRejectCSVV1Result==null && other.getGetACHEFTPaymentBoxRejectCSVV1Result()==null) || 
             (this.getACHEFTPaymentBoxRejectCSVV1Result!=null &&
              this.getACHEFTPaymentBoxRejectCSVV1Result.equals(other.getGetACHEFTPaymentBoxRejectCSVV1Result())));
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
        if (getGetACHEFTPaymentBoxRejectCSVV1Result() != null) {
            _hashCode += getGetACHEFTPaymentBoxRejectCSVV1Result().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetACHEFTPaymentBoxRejectCSVV1Response.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">GetACHEFTPaymentBoxRejectCSVV1Response"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getACHEFTPaymentBoxRejectCSVV1Result");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", "GetACHEFTPaymentBoxRejectCSVV1Result"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">>GetACHEFTPaymentBoxRejectCSVV1Response>GetACHEFTPaymentBoxRejectCSVV1Result"));
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
