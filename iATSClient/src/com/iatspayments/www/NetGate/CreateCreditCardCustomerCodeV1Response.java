/**
 * CreateCreditCardCustomerCodeV1Response.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.iatspayments.www.NetGate;

public class CreateCreditCardCustomerCodeV1Response  implements java.io.Serializable {
    private com.iatspayments.www.NetGate.CreateCreditCardCustomerCodeV1ResponseCreateCreditCardCustomerCodeV1Result createCreditCardCustomerCodeV1Result;

    public CreateCreditCardCustomerCodeV1Response() {
    }

    public CreateCreditCardCustomerCodeV1Response(
           com.iatspayments.www.NetGate.CreateCreditCardCustomerCodeV1ResponseCreateCreditCardCustomerCodeV1Result createCreditCardCustomerCodeV1Result) {
           this.createCreditCardCustomerCodeV1Result = createCreditCardCustomerCodeV1Result;
    }


    /**
     * Gets the createCreditCardCustomerCodeV1Result value for this CreateCreditCardCustomerCodeV1Response.
     * 
     * @return createCreditCardCustomerCodeV1Result
     */
    public com.iatspayments.www.NetGate.CreateCreditCardCustomerCodeV1ResponseCreateCreditCardCustomerCodeV1Result getCreateCreditCardCustomerCodeV1Result() {
        return createCreditCardCustomerCodeV1Result;
    }


    /**
     * Sets the createCreditCardCustomerCodeV1Result value for this CreateCreditCardCustomerCodeV1Response.
     * 
     * @param createCreditCardCustomerCodeV1Result
     */
    public void setCreateCreditCardCustomerCodeV1Result(com.iatspayments.www.NetGate.CreateCreditCardCustomerCodeV1ResponseCreateCreditCardCustomerCodeV1Result createCreditCardCustomerCodeV1Result) {
        this.createCreditCardCustomerCodeV1Result = createCreditCardCustomerCodeV1Result;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreateCreditCardCustomerCodeV1Response)) return false;
        CreateCreditCardCustomerCodeV1Response other = (CreateCreditCardCustomerCodeV1Response) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.createCreditCardCustomerCodeV1Result==null && other.getCreateCreditCardCustomerCodeV1Result()==null) || 
             (this.createCreditCardCustomerCodeV1Result!=null &&
              this.createCreditCardCustomerCodeV1Result.equals(other.getCreateCreditCardCustomerCodeV1Result())));
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
        if (getCreateCreditCardCustomerCodeV1Result() != null) {
            _hashCode += getCreateCreditCardCustomerCodeV1Result().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreateCreditCardCustomerCodeV1Response.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">CreateCreditCardCustomerCodeV1Response"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createCreditCardCustomerCodeV1Result");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", "CreateCreditCardCustomerCodeV1Result"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">>CreateCreditCardCustomerCodeV1Response>CreateCreditCardCustomerCodeV1Result"));
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
