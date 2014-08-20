/**
 * DirectDebitCreateACHEFTCustomerCodeV1Response.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.iatspayments.www.NetGate;

public class DirectDebitCreateACHEFTCustomerCodeV1Response  implements java.io.Serializable {
    private com.iatspayments.www.NetGate.DirectDebitCreateACHEFTCustomerCodeV1ResponseDirectDebitCreateACHEFTCustomerCodeV1Result directDebitCreateACHEFTCustomerCodeV1Result;

    public DirectDebitCreateACHEFTCustomerCodeV1Response() {
    }

    public DirectDebitCreateACHEFTCustomerCodeV1Response(
           com.iatspayments.www.NetGate.DirectDebitCreateACHEFTCustomerCodeV1ResponseDirectDebitCreateACHEFTCustomerCodeV1Result directDebitCreateACHEFTCustomerCodeV1Result) {
           this.directDebitCreateACHEFTCustomerCodeV1Result = directDebitCreateACHEFTCustomerCodeV1Result;
    }


    /**
     * Gets the directDebitCreateACHEFTCustomerCodeV1Result value for this DirectDebitCreateACHEFTCustomerCodeV1Response.
     * 
     * @return directDebitCreateACHEFTCustomerCodeV1Result
     */
    public com.iatspayments.www.NetGate.DirectDebitCreateACHEFTCustomerCodeV1ResponseDirectDebitCreateACHEFTCustomerCodeV1Result getDirectDebitCreateACHEFTCustomerCodeV1Result() {
        return directDebitCreateACHEFTCustomerCodeV1Result;
    }


    /**
     * Sets the directDebitCreateACHEFTCustomerCodeV1Result value for this DirectDebitCreateACHEFTCustomerCodeV1Response.
     * 
     * @param directDebitCreateACHEFTCustomerCodeV1Result
     */
    public void setDirectDebitCreateACHEFTCustomerCodeV1Result(com.iatspayments.www.NetGate.DirectDebitCreateACHEFTCustomerCodeV1ResponseDirectDebitCreateACHEFTCustomerCodeV1Result directDebitCreateACHEFTCustomerCodeV1Result) {
        this.directDebitCreateACHEFTCustomerCodeV1Result = directDebitCreateACHEFTCustomerCodeV1Result;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DirectDebitCreateACHEFTCustomerCodeV1Response)) return false;
        DirectDebitCreateACHEFTCustomerCodeV1Response other = (DirectDebitCreateACHEFTCustomerCodeV1Response) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.directDebitCreateACHEFTCustomerCodeV1Result==null && other.getDirectDebitCreateACHEFTCustomerCodeV1Result()==null) || 
             (this.directDebitCreateACHEFTCustomerCodeV1Result!=null &&
              this.directDebitCreateACHEFTCustomerCodeV1Result.equals(other.getDirectDebitCreateACHEFTCustomerCodeV1Result())));
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
        if (getDirectDebitCreateACHEFTCustomerCodeV1Result() != null) {
            _hashCode += getDirectDebitCreateACHEFTCustomerCodeV1Result().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DirectDebitCreateACHEFTCustomerCodeV1Response.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">DirectDebitCreateACHEFTCustomerCodeV1Response"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("directDebitCreateACHEFTCustomerCodeV1Result");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", "DirectDebitCreateACHEFTCustomerCodeV1Result"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">>DirectDebitCreateACHEFTCustomerCodeV1Response>DirectDebitCreateACHEFTCustomerCodeV1Result"));
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
