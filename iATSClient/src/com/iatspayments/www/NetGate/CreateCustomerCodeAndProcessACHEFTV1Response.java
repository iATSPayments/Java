/**
 * CreateCustomerCodeAndProcessACHEFTV1Response.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.iatspayments.www.NetGate;

public class CreateCustomerCodeAndProcessACHEFTV1Response  implements java.io.Serializable {
    private com.iatspayments.www.NetGate.CreateCustomerCodeAndProcessACHEFTV1ResponseCreateCustomerCodeAndProcessACHEFTV1Result createCustomerCodeAndProcessACHEFTV1Result;

    public CreateCustomerCodeAndProcessACHEFTV1Response() {
    }

    public CreateCustomerCodeAndProcessACHEFTV1Response(
           com.iatspayments.www.NetGate.CreateCustomerCodeAndProcessACHEFTV1ResponseCreateCustomerCodeAndProcessACHEFTV1Result createCustomerCodeAndProcessACHEFTV1Result) {
           this.createCustomerCodeAndProcessACHEFTV1Result = createCustomerCodeAndProcessACHEFTV1Result;
    }


    /**
     * Gets the createCustomerCodeAndProcessACHEFTV1Result value for this CreateCustomerCodeAndProcessACHEFTV1Response.
     * 
     * @return createCustomerCodeAndProcessACHEFTV1Result
     */
    public com.iatspayments.www.NetGate.CreateCustomerCodeAndProcessACHEFTV1ResponseCreateCustomerCodeAndProcessACHEFTV1Result getCreateCustomerCodeAndProcessACHEFTV1Result() {
        return createCustomerCodeAndProcessACHEFTV1Result;
    }


    /**
     * Sets the createCustomerCodeAndProcessACHEFTV1Result value for this CreateCustomerCodeAndProcessACHEFTV1Response.
     * 
     * @param createCustomerCodeAndProcessACHEFTV1Result
     */
    public void setCreateCustomerCodeAndProcessACHEFTV1Result(com.iatspayments.www.NetGate.CreateCustomerCodeAndProcessACHEFTV1ResponseCreateCustomerCodeAndProcessACHEFTV1Result createCustomerCodeAndProcessACHEFTV1Result) {
        this.createCustomerCodeAndProcessACHEFTV1Result = createCustomerCodeAndProcessACHEFTV1Result;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreateCustomerCodeAndProcessACHEFTV1Response)) return false;
        CreateCustomerCodeAndProcessACHEFTV1Response other = (CreateCustomerCodeAndProcessACHEFTV1Response) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.createCustomerCodeAndProcessACHEFTV1Result==null && other.getCreateCustomerCodeAndProcessACHEFTV1Result()==null) || 
             (this.createCustomerCodeAndProcessACHEFTV1Result!=null &&
              this.createCustomerCodeAndProcessACHEFTV1Result.equals(other.getCreateCustomerCodeAndProcessACHEFTV1Result())));
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
        if (getCreateCustomerCodeAndProcessACHEFTV1Result() != null) {
            _hashCode += getCreateCustomerCodeAndProcessACHEFTV1Result().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreateCustomerCodeAndProcessACHEFTV1Response.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">CreateCustomerCodeAndProcessACHEFTV1Response"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createCustomerCodeAndProcessACHEFTV1Result");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", "CreateCustomerCodeAndProcessACHEFTV1Result"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">>CreateCustomerCodeAndProcessACHEFTV1Response>CreateCustomerCodeAndProcessACHEFTV1Result"));
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
