/**
 * GetCustomerCodeDetailV1Response.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.iatspayments.www.NetGate;

public class GetCustomerCodeDetailV1Response  implements java.io.Serializable {
    private com.iatspayments.www.NetGate.GetCustomerCodeDetailV1ResponseGetCustomerCodeDetailV1Result getCustomerCodeDetailV1Result;

    public GetCustomerCodeDetailV1Response() {
    }

    public GetCustomerCodeDetailV1Response(
           com.iatspayments.www.NetGate.GetCustomerCodeDetailV1ResponseGetCustomerCodeDetailV1Result getCustomerCodeDetailV1Result) {
           this.getCustomerCodeDetailV1Result = getCustomerCodeDetailV1Result;
    }


    /**
     * Gets the getCustomerCodeDetailV1Result value for this GetCustomerCodeDetailV1Response.
     * 
     * @return getCustomerCodeDetailV1Result
     */
    public com.iatspayments.www.NetGate.GetCustomerCodeDetailV1ResponseGetCustomerCodeDetailV1Result getGetCustomerCodeDetailV1Result() {
        return getCustomerCodeDetailV1Result;
    }


    /**
     * Sets the getCustomerCodeDetailV1Result value for this GetCustomerCodeDetailV1Response.
     * 
     * @param getCustomerCodeDetailV1Result
     */
    public void setGetCustomerCodeDetailV1Result(com.iatspayments.www.NetGate.GetCustomerCodeDetailV1ResponseGetCustomerCodeDetailV1Result getCustomerCodeDetailV1Result) {
        this.getCustomerCodeDetailV1Result = getCustomerCodeDetailV1Result;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetCustomerCodeDetailV1Response)) return false;
        GetCustomerCodeDetailV1Response other = (GetCustomerCodeDetailV1Response) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getCustomerCodeDetailV1Result==null && other.getGetCustomerCodeDetailV1Result()==null) || 
             (this.getCustomerCodeDetailV1Result!=null &&
              this.getCustomerCodeDetailV1Result.equals(other.getGetCustomerCodeDetailV1Result())));
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
        if (getGetCustomerCodeDetailV1Result() != null) {
            _hashCode += getGetCustomerCodeDetailV1Result().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetCustomerCodeDetailV1Response.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">GetCustomerCodeDetailV1Response"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getCustomerCodeDetailV1Result");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", "GetCustomerCodeDetailV1Result"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">>GetCustomerCodeDetailV1Response>GetCustomerCodeDetailV1Result"));
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
