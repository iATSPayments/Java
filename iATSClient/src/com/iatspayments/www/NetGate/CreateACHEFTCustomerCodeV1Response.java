/**
 * CreateACHEFTCustomerCodeV1Response.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.iatspayments.www.NetGate;

public class CreateACHEFTCustomerCodeV1Response  implements java.io.Serializable {
    private com.iatspayments.www.NetGate.CreateACHEFTCustomerCodeV1ResponseCreateACHEFTCustomerCodeV1Result createACHEFTCustomerCodeV1Result;

    public CreateACHEFTCustomerCodeV1Response() {
    }

    public CreateACHEFTCustomerCodeV1Response(
           com.iatspayments.www.NetGate.CreateACHEFTCustomerCodeV1ResponseCreateACHEFTCustomerCodeV1Result createACHEFTCustomerCodeV1Result) {
           this.createACHEFTCustomerCodeV1Result = createACHEFTCustomerCodeV1Result;
    }


    /**
     * Gets the createACHEFTCustomerCodeV1Result value for this CreateACHEFTCustomerCodeV1Response.
     * 
     * @return createACHEFTCustomerCodeV1Result
     */
    public com.iatspayments.www.NetGate.CreateACHEFTCustomerCodeV1ResponseCreateACHEFTCustomerCodeV1Result getCreateACHEFTCustomerCodeV1Result() {
        return createACHEFTCustomerCodeV1Result;
    }


    /**
     * Sets the createACHEFTCustomerCodeV1Result value for this CreateACHEFTCustomerCodeV1Response.
     * 
     * @param createACHEFTCustomerCodeV1Result
     */
    public void setCreateACHEFTCustomerCodeV1Result(com.iatspayments.www.NetGate.CreateACHEFTCustomerCodeV1ResponseCreateACHEFTCustomerCodeV1Result createACHEFTCustomerCodeV1Result) {
        this.createACHEFTCustomerCodeV1Result = createACHEFTCustomerCodeV1Result;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreateACHEFTCustomerCodeV1Response)) return false;
        CreateACHEFTCustomerCodeV1Response other = (CreateACHEFTCustomerCodeV1Response) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.createACHEFTCustomerCodeV1Result==null && other.getCreateACHEFTCustomerCodeV1Result()==null) || 
             (this.createACHEFTCustomerCodeV1Result!=null &&
              this.createACHEFTCustomerCodeV1Result.equals(other.getCreateACHEFTCustomerCodeV1Result())));
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
        if (getCreateACHEFTCustomerCodeV1Result() != null) {
            _hashCode += getCreateACHEFTCustomerCodeV1Result().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreateACHEFTCustomerCodeV1Response.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">CreateACHEFTCustomerCodeV1Response"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createACHEFTCustomerCodeV1Result");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", "CreateACHEFTCustomerCodeV1Result"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">>CreateACHEFTCustomerCodeV1Response>CreateACHEFTCustomerCodeV1Result"));
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
