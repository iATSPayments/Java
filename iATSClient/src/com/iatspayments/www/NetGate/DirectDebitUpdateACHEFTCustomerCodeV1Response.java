/**
 * DirectDebitUpdateACHEFTCustomerCodeV1Response.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.iatspayments.www.NetGate;

public class DirectDebitUpdateACHEFTCustomerCodeV1Response  implements java.io.Serializable {
    private com.iatspayments.www.NetGate.DirectDebitUpdateACHEFTCustomerCodeV1ResponseDirectDebitUpdateACHEFTCustomerCodeV1Result directDebitUpdateACHEFTCustomerCodeV1Result;

    public DirectDebitUpdateACHEFTCustomerCodeV1Response() {
    }

    public DirectDebitUpdateACHEFTCustomerCodeV1Response(
           com.iatspayments.www.NetGate.DirectDebitUpdateACHEFTCustomerCodeV1ResponseDirectDebitUpdateACHEFTCustomerCodeV1Result directDebitUpdateACHEFTCustomerCodeV1Result) {
           this.directDebitUpdateACHEFTCustomerCodeV1Result = directDebitUpdateACHEFTCustomerCodeV1Result;
    }


    /**
     * Gets the directDebitUpdateACHEFTCustomerCodeV1Result value for this DirectDebitUpdateACHEFTCustomerCodeV1Response.
     * 
     * @return directDebitUpdateACHEFTCustomerCodeV1Result
     */
    public com.iatspayments.www.NetGate.DirectDebitUpdateACHEFTCustomerCodeV1ResponseDirectDebitUpdateACHEFTCustomerCodeV1Result getDirectDebitUpdateACHEFTCustomerCodeV1Result() {
        return directDebitUpdateACHEFTCustomerCodeV1Result;
    }


    /**
     * Sets the directDebitUpdateACHEFTCustomerCodeV1Result value for this DirectDebitUpdateACHEFTCustomerCodeV1Response.
     * 
     * @param directDebitUpdateACHEFTCustomerCodeV1Result
     */
    public void setDirectDebitUpdateACHEFTCustomerCodeV1Result(com.iatspayments.www.NetGate.DirectDebitUpdateACHEFTCustomerCodeV1ResponseDirectDebitUpdateACHEFTCustomerCodeV1Result directDebitUpdateACHEFTCustomerCodeV1Result) {
        this.directDebitUpdateACHEFTCustomerCodeV1Result = directDebitUpdateACHEFTCustomerCodeV1Result;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DirectDebitUpdateACHEFTCustomerCodeV1Response)) return false;
        DirectDebitUpdateACHEFTCustomerCodeV1Response other = (DirectDebitUpdateACHEFTCustomerCodeV1Response) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.directDebitUpdateACHEFTCustomerCodeV1Result==null && other.getDirectDebitUpdateACHEFTCustomerCodeV1Result()==null) || 
             (this.directDebitUpdateACHEFTCustomerCodeV1Result!=null &&
              this.directDebitUpdateACHEFTCustomerCodeV1Result.equals(other.getDirectDebitUpdateACHEFTCustomerCodeV1Result())));
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
        if (getDirectDebitUpdateACHEFTCustomerCodeV1Result() != null) {
            _hashCode += getDirectDebitUpdateACHEFTCustomerCodeV1Result().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DirectDebitUpdateACHEFTCustomerCodeV1Response.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">DirectDebitUpdateACHEFTCustomerCodeV1Response"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("directDebitUpdateACHEFTCustomerCodeV1Result");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", "DirectDebitUpdateACHEFTCustomerCodeV1Result"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">>DirectDebitUpdateACHEFTCustomerCodeV1Response>DirectDebitUpdateACHEFTCustomerCodeV1Result"));
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
