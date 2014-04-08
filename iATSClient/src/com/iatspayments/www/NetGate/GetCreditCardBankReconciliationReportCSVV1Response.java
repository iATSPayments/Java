/**
 * GetCreditCardBankReconciliationReportCSVV1Response.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.iatspayments.www.NetGate;

public class GetCreditCardBankReconciliationReportCSVV1Response  implements java.io.Serializable {
    private com.iatspayments.www.NetGate.GetCreditCardBankReconciliationReportCSVV1ResponseGetCreditCardBankReconciliationReportCSVV1Result getCreditCardBankReconciliationReportCSVV1Result;

    public GetCreditCardBankReconciliationReportCSVV1Response() {
    }

    public GetCreditCardBankReconciliationReportCSVV1Response(
           com.iatspayments.www.NetGate.GetCreditCardBankReconciliationReportCSVV1ResponseGetCreditCardBankReconciliationReportCSVV1Result getCreditCardBankReconciliationReportCSVV1Result) {
           this.getCreditCardBankReconciliationReportCSVV1Result = getCreditCardBankReconciliationReportCSVV1Result;
    }


    /**
     * Gets the getCreditCardBankReconciliationReportCSVV1Result value for this GetCreditCardBankReconciliationReportCSVV1Response.
     * 
     * @return getCreditCardBankReconciliationReportCSVV1Result
     */
    public com.iatspayments.www.NetGate.GetCreditCardBankReconciliationReportCSVV1ResponseGetCreditCardBankReconciliationReportCSVV1Result getGetCreditCardBankReconciliationReportCSVV1Result() {
        return getCreditCardBankReconciliationReportCSVV1Result;
    }


    /**
     * Sets the getCreditCardBankReconciliationReportCSVV1Result value for this GetCreditCardBankReconciliationReportCSVV1Response.
     * 
     * @param getCreditCardBankReconciliationReportCSVV1Result
     */
    public void setGetCreditCardBankReconciliationReportCSVV1Result(com.iatspayments.www.NetGate.GetCreditCardBankReconciliationReportCSVV1ResponseGetCreditCardBankReconciliationReportCSVV1Result getCreditCardBankReconciliationReportCSVV1Result) {
        this.getCreditCardBankReconciliationReportCSVV1Result = getCreditCardBankReconciliationReportCSVV1Result;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetCreditCardBankReconciliationReportCSVV1Response)) return false;
        GetCreditCardBankReconciliationReportCSVV1Response other = (GetCreditCardBankReconciliationReportCSVV1Response) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getCreditCardBankReconciliationReportCSVV1Result==null && other.getGetCreditCardBankReconciliationReportCSVV1Result()==null) || 
             (this.getCreditCardBankReconciliationReportCSVV1Result!=null &&
              this.getCreditCardBankReconciliationReportCSVV1Result.equals(other.getGetCreditCardBankReconciliationReportCSVV1Result())));
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
        if (getGetCreditCardBankReconciliationReportCSVV1Result() != null) {
            _hashCode += getGetCreditCardBankReconciliationReportCSVV1Result().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetCreditCardBankReconciliationReportCSVV1Response.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">GetCreditCardBankReconciliationReportCSVV1Response"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getCreditCardBankReconciliationReportCSVV1Result");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", "GetCreditCardBankReconciliationReportCSVV1Result"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">>GetCreditCardBankReconciliationReportCSVV1Response>GetCreditCardBankReconciliationReportCSVV1Result"));
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
