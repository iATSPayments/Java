/**
 * UpdateCreditCardCustomerCodeV1Response.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.iatspayments.www.NetGate;

public class UpdateCreditCardCustomerCodeV1Response  implements java.io.Serializable {
    private com.iatspayments.www.NetGate.UpdateCreditCardCustomerCodeV1ResponseUpdateCreditCardCustomerCodeV1Result updateCreditCardCustomerCodeV1Result;

    public UpdateCreditCardCustomerCodeV1Response() {
    }

    public UpdateCreditCardCustomerCodeV1Response(
           com.iatspayments.www.NetGate.UpdateCreditCardCustomerCodeV1ResponseUpdateCreditCardCustomerCodeV1Result updateCreditCardCustomerCodeV1Result) {
           this.updateCreditCardCustomerCodeV1Result = updateCreditCardCustomerCodeV1Result;
    }


    /**
     * Gets the updateCreditCardCustomerCodeV1Result value for this UpdateCreditCardCustomerCodeV1Response.
     * 
     * @return updateCreditCardCustomerCodeV1Result
     */
    public com.iatspayments.www.NetGate.UpdateCreditCardCustomerCodeV1ResponseUpdateCreditCardCustomerCodeV1Result getUpdateCreditCardCustomerCodeV1Result() {
        return updateCreditCardCustomerCodeV1Result;
    }


    /**
     * Sets the updateCreditCardCustomerCodeV1Result value for this UpdateCreditCardCustomerCodeV1Response.
     * 
     * @param updateCreditCardCustomerCodeV1Result
     */
    public void setUpdateCreditCardCustomerCodeV1Result(com.iatspayments.www.NetGate.UpdateCreditCardCustomerCodeV1ResponseUpdateCreditCardCustomerCodeV1Result updateCreditCardCustomerCodeV1Result) {
        this.updateCreditCardCustomerCodeV1Result = updateCreditCardCustomerCodeV1Result;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateCreditCardCustomerCodeV1Response)) return false;
        UpdateCreditCardCustomerCodeV1Response other = (UpdateCreditCardCustomerCodeV1Response) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.updateCreditCardCustomerCodeV1Result==null && other.getUpdateCreditCardCustomerCodeV1Result()==null) || 
             (this.updateCreditCardCustomerCodeV1Result!=null &&
              this.updateCreditCardCustomerCodeV1Result.equals(other.getUpdateCreditCardCustomerCodeV1Result())));
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
        if (getUpdateCreditCardCustomerCodeV1Result() != null) {
            _hashCode += getUpdateCreditCardCustomerCodeV1Result().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateCreditCardCustomerCodeV1Response.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">UpdateCreditCardCustomerCodeV1Response"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updateCreditCardCustomerCodeV1Result");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", "UpdateCreditCardCustomerCodeV1Result"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">>UpdateCreditCardCustomerCodeV1Response>UpdateCreditCardCustomerCodeV1Result"));
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
