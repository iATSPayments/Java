/**
 * DeleteCustomerCodeV1Response.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.iatspayments.www.NetGate;

public class DeleteCustomerCodeV1Response  implements java.io.Serializable {
    private com.iatspayments.www.NetGate.DeleteCustomerCodeV1ResponseDeleteCustomerCodeV1Result deleteCustomerCodeV1Result;

    public DeleteCustomerCodeV1Response() {
    }

    public DeleteCustomerCodeV1Response(
           com.iatspayments.www.NetGate.DeleteCustomerCodeV1ResponseDeleteCustomerCodeV1Result deleteCustomerCodeV1Result) {
           this.deleteCustomerCodeV1Result = deleteCustomerCodeV1Result;
    }


    /**
     * Gets the deleteCustomerCodeV1Result value for this DeleteCustomerCodeV1Response.
     * 
     * @return deleteCustomerCodeV1Result
     */
    public com.iatspayments.www.NetGate.DeleteCustomerCodeV1ResponseDeleteCustomerCodeV1Result getDeleteCustomerCodeV1Result() {
        return deleteCustomerCodeV1Result;
    }


    /**
     * Sets the deleteCustomerCodeV1Result value for this DeleteCustomerCodeV1Response.
     * 
     * @param deleteCustomerCodeV1Result
     */
    public void setDeleteCustomerCodeV1Result(com.iatspayments.www.NetGate.DeleteCustomerCodeV1ResponseDeleteCustomerCodeV1Result deleteCustomerCodeV1Result) {
        this.deleteCustomerCodeV1Result = deleteCustomerCodeV1Result;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DeleteCustomerCodeV1Response)) return false;
        DeleteCustomerCodeV1Response other = (DeleteCustomerCodeV1Response) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.deleteCustomerCodeV1Result==null && other.getDeleteCustomerCodeV1Result()==null) || 
             (this.deleteCustomerCodeV1Result!=null &&
              this.deleteCustomerCodeV1Result.equals(other.getDeleteCustomerCodeV1Result())));
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
        if (getDeleteCustomerCodeV1Result() != null) {
            _hashCode += getDeleteCustomerCodeV1Result().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DeleteCustomerCodeV1Response.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">DeleteCustomerCodeV1Response"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deleteCustomerCodeV1Result");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", "DeleteCustomerCodeV1Result"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">>DeleteCustomerCodeV1Response>DeleteCustomerCodeV1Result"));
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
