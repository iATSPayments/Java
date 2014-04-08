/**
 * CreateCustomerCodeAndProcessCreditCardV1Response.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.iatspayments.www.NetGate;

public class CreateCustomerCodeAndProcessCreditCardV1Response  implements java.io.Serializable {
    private com.iatspayments.www.NetGate.CreateCustomerCodeAndProcessCreditCardV1ResponseCreateCustomerCodeAndProcessCreditCardV1Result createCustomerCodeAndProcessCreditCardV1Result;

    public CreateCustomerCodeAndProcessCreditCardV1Response() {
    }

    public CreateCustomerCodeAndProcessCreditCardV1Response(
           com.iatspayments.www.NetGate.CreateCustomerCodeAndProcessCreditCardV1ResponseCreateCustomerCodeAndProcessCreditCardV1Result createCustomerCodeAndProcessCreditCardV1Result) {
           this.createCustomerCodeAndProcessCreditCardV1Result = createCustomerCodeAndProcessCreditCardV1Result;
    }


    /**
     * Gets the createCustomerCodeAndProcessCreditCardV1Result value for this CreateCustomerCodeAndProcessCreditCardV1Response.
     * 
     * @return createCustomerCodeAndProcessCreditCardV1Result
     */
    public com.iatspayments.www.NetGate.CreateCustomerCodeAndProcessCreditCardV1ResponseCreateCustomerCodeAndProcessCreditCardV1Result getCreateCustomerCodeAndProcessCreditCardV1Result() {
        return createCustomerCodeAndProcessCreditCardV1Result;
    }


    /**
     * Sets the createCustomerCodeAndProcessCreditCardV1Result value for this CreateCustomerCodeAndProcessCreditCardV1Response.
     * 
     * @param createCustomerCodeAndProcessCreditCardV1Result
     */
    public void setCreateCustomerCodeAndProcessCreditCardV1Result(com.iatspayments.www.NetGate.CreateCustomerCodeAndProcessCreditCardV1ResponseCreateCustomerCodeAndProcessCreditCardV1Result createCustomerCodeAndProcessCreditCardV1Result) {
        this.createCustomerCodeAndProcessCreditCardV1Result = createCustomerCodeAndProcessCreditCardV1Result;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreateCustomerCodeAndProcessCreditCardV1Response)) return false;
        CreateCustomerCodeAndProcessCreditCardV1Response other = (CreateCustomerCodeAndProcessCreditCardV1Response) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.createCustomerCodeAndProcessCreditCardV1Result==null && other.getCreateCustomerCodeAndProcessCreditCardV1Result()==null) || 
             (this.createCustomerCodeAndProcessCreditCardV1Result!=null &&
              this.createCustomerCodeAndProcessCreditCardV1Result.equals(other.getCreateCustomerCodeAndProcessCreditCardV1Result())));
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
        if (getCreateCustomerCodeAndProcessCreditCardV1Result() != null) {
            _hashCode += getCreateCustomerCodeAndProcessCreditCardV1Result().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreateCustomerCodeAndProcessCreditCardV1Response.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">CreateCustomerCodeAndProcessCreditCardV1Response"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createCustomerCodeAndProcessCreditCardV1Result");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", "CreateCustomerCodeAndProcessCreditCardV1Result"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">>CreateCustomerCodeAndProcessCreditCardV1Response>CreateCustomerCodeAndProcessCreditCardV1Result"));
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
