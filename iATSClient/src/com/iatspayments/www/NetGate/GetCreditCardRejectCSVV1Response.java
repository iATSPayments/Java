/**
 * GetCreditCardRejectCSVV1Response.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.iatspayments.www.NetGate;

public class GetCreditCardRejectCSVV1Response  implements java.io.Serializable {
    private com.iatspayments.www.NetGate.GetCreditCardRejectCSVV1ResponseGetCreditCardRejectCSVV1Result getCreditCardRejectCSVV1Result;

    public GetCreditCardRejectCSVV1Response() {
    }

    public GetCreditCardRejectCSVV1Response(
           com.iatspayments.www.NetGate.GetCreditCardRejectCSVV1ResponseGetCreditCardRejectCSVV1Result getCreditCardRejectCSVV1Result) {
           this.getCreditCardRejectCSVV1Result = getCreditCardRejectCSVV1Result;
    }


    /**
     * Gets the getCreditCardRejectCSVV1Result value for this GetCreditCardRejectCSVV1Response.
     * 
     * @return getCreditCardRejectCSVV1Result
     */
    public com.iatspayments.www.NetGate.GetCreditCardRejectCSVV1ResponseGetCreditCardRejectCSVV1Result getGetCreditCardRejectCSVV1Result() {
        return getCreditCardRejectCSVV1Result;
    }


    /**
     * Sets the getCreditCardRejectCSVV1Result value for this GetCreditCardRejectCSVV1Response.
     * 
     * @param getCreditCardRejectCSVV1Result
     */
    public void setGetCreditCardRejectCSVV1Result(com.iatspayments.www.NetGate.GetCreditCardRejectCSVV1ResponseGetCreditCardRejectCSVV1Result getCreditCardRejectCSVV1Result) {
        this.getCreditCardRejectCSVV1Result = getCreditCardRejectCSVV1Result;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetCreditCardRejectCSVV1Response)) return false;
        GetCreditCardRejectCSVV1Response other = (GetCreditCardRejectCSVV1Response) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getCreditCardRejectCSVV1Result==null && other.getGetCreditCardRejectCSVV1Result()==null) || 
             (this.getCreditCardRejectCSVV1Result!=null &&
              this.getCreditCardRejectCSVV1Result.equals(other.getGetCreditCardRejectCSVV1Result())));
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
        if (getGetCreditCardRejectCSVV1Result() != null) {
            _hashCode += getGetCreditCardRejectCSVV1Result().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetCreditCardRejectCSVV1Response.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">GetCreditCardRejectCSVV1Response"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getCreditCardRejectCSVV1Result");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", "GetCreditCardRejectCSVV1Result"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">>GetCreditCardRejectCSVV1Response>GetCreditCardRejectCSVV1Result"));
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
