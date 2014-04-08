/**
 * GetACHEFTBankReconciliationReportCSVV1Response.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.iatspayments.www.NetGate;

public class GetACHEFTBankReconciliationReportCSVV1Response  implements java.io.Serializable {
    private com.iatspayments.www.NetGate.GetACHEFTBankReconciliationReportCSVV1ResponseGetACHEFTBankReconciliationReportCSVV1Result getACHEFTBankReconciliationReportCSVV1Result;

    public GetACHEFTBankReconciliationReportCSVV1Response() {
    }

    public GetACHEFTBankReconciliationReportCSVV1Response(
           com.iatspayments.www.NetGate.GetACHEFTBankReconciliationReportCSVV1ResponseGetACHEFTBankReconciliationReportCSVV1Result getACHEFTBankReconciliationReportCSVV1Result) {
           this.getACHEFTBankReconciliationReportCSVV1Result = getACHEFTBankReconciliationReportCSVV1Result;
    }


    /**
     * Gets the getACHEFTBankReconciliationReportCSVV1Result value for this GetACHEFTBankReconciliationReportCSVV1Response.
     * 
     * @return getACHEFTBankReconciliationReportCSVV1Result
     */
    public com.iatspayments.www.NetGate.GetACHEFTBankReconciliationReportCSVV1ResponseGetACHEFTBankReconciliationReportCSVV1Result getGetACHEFTBankReconciliationReportCSVV1Result() {
        return getACHEFTBankReconciliationReportCSVV1Result;
    }


    /**
     * Sets the getACHEFTBankReconciliationReportCSVV1Result value for this GetACHEFTBankReconciliationReportCSVV1Response.
     * 
     * @param getACHEFTBankReconciliationReportCSVV1Result
     */
    public void setGetACHEFTBankReconciliationReportCSVV1Result(com.iatspayments.www.NetGate.GetACHEFTBankReconciliationReportCSVV1ResponseGetACHEFTBankReconciliationReportCSVV1Result getACHEFTBankReconciliationReportCSVV1Result) {
        this.getACHEFTBankReconciliationReportCSVV1Result = getACHEFTBankReconciliationReportCSVV1Result;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetACHEFTBankReconciliationReportCSVV1Response)) return false;
        GetACHEFTBankReconciliationReportCSVV1Response other = (GetACHEFTBankReconciliationReportCSVV1Response) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getACHEFTBankReconciliationReportCSVV1Result==null && other.getGetACHEFTBankReconciliationReportCSVV1Result()==null) || 
             (this.getACHEFTBankReconciliationReportCSVV1Result!=null &&
              this.getACHEFTBankReconciliationReportCSVV1Result.equals(other.getGetACHEFTBankReconciliationReportCSVV1Result())));
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
        if (getGetACHEFTBankReconciliationReportCSVV1Result() != null) {
            _hashCode += getGetACHEFTBankReconciliationReportCSVV1Result().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetACHEFTBankReconciliationReportCSVV1Response.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">GetACHEFTBankReconciliationReportCSVV1Response"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getACHEFTBankReconciliationReportCSVV1Result");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", "GetACHEFTBankReconciliationReportCSVV1Result"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">>GetACHEFTBankReconciliationReportCSVV1Response>GetACHEFTBankReconciliationReportCSVV1Result"));
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
