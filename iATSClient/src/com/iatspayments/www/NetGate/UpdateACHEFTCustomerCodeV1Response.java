/**
 * UpdateACHEFTCustomerCodeV1Response.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.iatspayments.www.NetGate;

public class UpdateACHEFTCustomerCodeV1Response  implements java.io.Serializable {
    private com.iatspayments.www.NetGate.UpdateACHEFTCustomerCodeV1ResponseUpdateACHEFTCustomerCodeV1Result updateACHEFTCustomerCodeV1Result;

    public UpdateACHEFTCustomerCodeV1Response() {
    }

    public UpdateACHEFTCustomerCodeV1Response(
           com.iatspayments.www.NetGate.UpdateACHEFTCustomerCodeV1ResponseUpdateACHEFTCustomerCodeV1Result updateACHEFTCustomerCodeV1Result) {
           this.updateACHEFTCustomerCodeV1Result = updateACHEFTCustomerCodeV1Result;
    }


    /**
     * Gets the updateACHEFTCustomerCodeV1Result value for this UpdateACHEFTCustomerCodeV1Response.
     * 
     * @return updateACHEFTCustomerCodeV1Result
     */
    public com.iatspayments.www.NetGate.UpdateACHEFTCustomerCodeV1ResponseUpdateACHEFTCustomerCodeV1Result getUpdateACHEFTCustomerCodeV1Result() {
        return updateACHEFTCustomerCodeV1Result;
    }


    /**
     * Sets the updateACHEFTCustomerCodeV1Result value for this UpdateACHEFTCustomerCodeV1Response.
     * 
     * @param updateACHEFTCustomerCodeV1Result
     */
    public void setUpdateACHEFTCustomerCodeV1Result(com.iatspayments.www.NetGate.UpdateACHEFTCustomerCodeV1ResponseUpdateACHEFTCustomerCodeV1Result updateACHEFTCustomerCodeV1Result) {
        this.updateACHEFTCustomerCodeV1Result = updateACHEFTCustomerCodeV1Result;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateACHEFTCustomerCodeV1Response)) return false;
        UpdateACHEFTCustomerCodeV1Response other = (UpdateACHEFTCustomerCodeV1Response) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.updateACHEFTCustomerCodeV1Result==null && other.getUpdateACHEFTCustomerCodeV1Result()==null) || 
             (this.updateACHEFTCustomerCodeV1Result!=null &&
              this.updateACHEFTCustomerCodeV1Result.equals(other.getUpdateACHEFTCustomerCodeV1Result())));
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
        if (getUpdateACHEFTCustomerCodeV1Result() != null) {
            _hashCode += getUpdateACHEFTCustomerCodeV1Result().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateACHEFTCustomerCodeV1Response.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">UpdateACHEFTCustomerCodeV1Response"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updateACHEFTCustomerCodeV1Result");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", "UpdateACHEFTCustomerCodeV1Result"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">>UpdateACHEFTCustomerCodeV1Response>UpdateACHEFTCustomerCodeV1Result"));
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
