/**
 * CreateCustomerCodeAndProcessCreditCardV1.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.iatspayments.www.NetGate;

public class CreateCustomerCodeAndProcessCreditCardV1  implements java.io.Serializable {
    private java.lang.String agentCode;

    private java.lang.String password;

    private java.lang.String customerIPAddress;

    private java.lang.String invoiceNum;

    private java.lang.String ccNum;

    private java.lang.String ccExp;

    private java.lang.String firstName;

    private java.lang.String lastName;

    private java.lang.String address;

    private java.lang.String city;

    private java.lang.String state;

    private java.lang.String zipCode;

    private java.lang.String cvv2;

    private java.lang.String total;

    public CreateCustomerCodeAndProcessCreditCardV1() {
    }

    public CreateCustomerCodeAndProcessCreditCardV1(
           java.lang.String agentCode,
           java.lang.String password,
           java.lang.String customerIPAddress,
           java.lang.String invoiceNum,
           java.lang.String ccNum,
           java.lang.String ccExp,
           java.lang.String firstName,
           java.lang.String lastName,
           java.lang.String address,
           java.lang.String city,
           java.lang.String state,
           java.lang.String zipCode,
           java.lang.String cvv2,
           java.lang.String total) {
           this.agentCode = agentCode;
           this.password = password;
           this.customerIPAddress = customerIPAddress;
           this.invoiceNum = invoiceNum;
           this.ccNum = ccNum;
           this.ccExp = ccExp;
           this.firstName = firstName;
           this.lastName = lastName;
           this.address = address;
           this.city = city;
           this.state = state;
           this.zipCode = zipCode;
           this.cvv2 = cvv2;
           this.total = total;
    }


    /**
     * Gets the agentCode value for this CreateCustomerCodeAndProcessCreditCardV1.
     * 
     * @return agentCode
     */
    public java.lang.String getAgentCode() {
        return agentCode;
    }


    /**
     * Sets the agentCode value for this CreateCustomerCodeAndProcessCreditCardV1.
     * 
     * @param agentCode
     */
    public void setAgentCode(java.lang.String agentCode) {
        this.agentCode = agentCode;
    }


    /**
     * Gets the password value for this CreateCustomerCodeAndProcessCreditCardV1.
     * 
     * @return password
     */
    public java.lang.String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this CreateCustomerCodeAndProcessCreditCardV1.
     * 
     * @param password
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }


    /**
     * Gets the customerIPAddress value for this CreateCustomerCodeAndProcessCreditCardV1.
     * 
     * @return customerIPAddress
     */
    public java.lang.String getCustomerIPAddress() {
        return customerIPAddress;
    }


    /**
     * Sets the customerIPAddress value for this CreateCustomerCodeAndProcessCreditCardV1.
     * 
     * @param customerIPAddress
     */
    public void setCustomerIPAddress(java.lang.String customerIPAddress) {
        this.customerIPAddress = customerIPAddress;
    }


    /**
     * Gets the invoiceNum value for this CreateCustomerCodeAndProcessCreditCardV1.
     * 
     * @return invoiceNum
     */
    public java.lang.String getInvoiceNum() {
        return invoiceNum;
    }


    /**
     * Sets the invoiceNum value for this CreateCustomerCodeAndProcessCreditCardV1.
     * 
     * @param invoiceNum
     */
    public void setInvoiceNum(java.lang.String invoiceNum) {
        this.invoiceNum = invoiceNum;
    }


    /**
     * Gets the ccNum value for this CreateCustomerCodeAndProcessCreditCardV1.
     * 
     * @return ccNum
     */
    public java.lang.String getCcNum() {
        return ccNum;
    }


    /**
     * Sets the ccNum value for this CreateCustomerCodeAndProcessCreditCardV1.
     * 
     * @param ccNum
     */
    public void setCcNum(java.lang.String ccNum) {
        this.ccNum = ccNum;
    }


    /**
     * Gets the ccExp value for this CreateCustomerCodeAndProcessCreditCardV1.
     * 
     * @return ccExp
     */
    public java.lang.String getCcExp() {
        return ccExp;
    }


    /**
     * Sets the ccExp value for this CreateCustomerCodeAndProcessCreditCardV1.
     * 
     * @param ccExp
     */
    public void setCcExp(java.lang.String ccExp) {
        this.ccExp = ccExp;
    }


    /**
     * Gets the firstName value for this CreateCustomerCodeAndProcessCreditCardV1.
     * 
     * @return firstName
     */
    public java.lang.String getFirstName() {
        return firstName;
    }


    /**
     * Sets the firstName value for this CreateCustomerCodeAndProcessCreditCardV1.
     * 
     * @param firstName
     */
    public void setFirstName(java.lang.String firstName) {
        this.firstName = firstName;
    }


    /**
     * Gets the lastName value for this CreateCustomerCodeAndProcessCreditCardV1.
     * 
     * @return lastName
     */
    public java.lang.String getLastName() {
        return lastName;
    }


    /**
     * Sets the lastName value for this CreateCustomerCodeAndProcessCreditCardV1.
     * 
     * @param lastName
     */
    public void setLastName(java.lang.String lastName) {
        this.lastName = lastName;
    }


    /**
     * Gets the address value for this CreateCustomerCodeAndProcessCreditCardV1.
     * 
     * @return address
     */
    public java.lang.String getAddress() {
        return address;
    }


    /**
     * Sets the address value for this CreateCustomerCodeAndProcessCreditCardV1.
     * 
     * @param address
     */
    public void setAddress(java.lang.String address) {
        this.address = address;
    }


    /**
     * Gets the city value for this CreateCustomerCodeAndProcessCreditCardV1.
     * 
     * @return city
     */
    public java.lang.String getCity() {
        return city;
    }


    /**
     * Sets the city value for this CreateCustomerCodeAndProcessCreditCardV1.
     * 
     * @param city
     */
    public void setCity(java.lang.String city) {
        this.city = city;
    }


    /**
     * Gets the state value for this CreateCustomerCodeAndProcessCreditCardV1.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this CreateCustomerCodeAndProcessCreditCardV1.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the zipCode value for this CreateCustomerCodeAndProcessCreditCardV1.
     * 
     * @return zipCode
     */
    public java.lang.String getZipCode() {
        return zipCode;
    }


    /**
     * Sets the zipCode value for this CreateCustomerCodeAndProcessCreditCardV1.
     * 
     * @param zipCode
     */
    public void setZipCode(java.lang.String zipCode) {
        this.zipCode = zipCode;
    }


    /**
     * Gets the cvv2 value for this CreateCustomerCodeAndProcessCreditCardV1.
     * 
     * @return cvv2
     */
    public java.lang.String getCvv2() {
        return cvv2;
    }


    /**
     * Sets the cvv2 value for this CreateCustomerCodeAndProcessCreditCardV1.
     * 
     * @param cvv2
     */
    public void setCvv2(java.lang.String cvv2) {
        this.cvv2 = cvv2;
    }


    /**
     * Gets the total value for this CreateCustomerCodeAndProcessCreditCardV1.
     * 
     * @return total
     */
    public java.lang.String getTotal() {
        return total;
    }


    /**
     * Sets the total value for this CreateCustomerCodeAndProcessCreditCardV1.
     * 
     * @param total
     */
    public void setTotal(java.lang.String total) {
        this.total = total;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreateCustomerCodeAndProcessCreditCardV1)) return false;
        CreateCustomerCodeAndProcessCreditCardV1 other = (CreateCustomerCodeAndProcessCreditCardV1) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.agentCode==null && other.getAgentCode()==null) || 
             (this.agentCode!=null &&
              this.agentCode.equals(other.getAgentCode()))) &&
            ((this.password==null && other.getPassword()==null) || 
             (this.password!=null &&
              this.password.equals(other.getPassword()))) &&
            ((this.customerIPAddress==null && other.getCustomerIPAddress()==null) || 
             (this.customerIPAddress!=null &&
              this.customerIPAddress.equals(other.getCustomerIPAddress()))) &&
            ((this.invoiceNum==null && other.getInvoiceNum()==null) || 
             (this.invoiceNum!=null &&
              this.invoiceNum.equals(other.getInvoiceNum()))) &&
            ((this.ccNum==null && other.getCcNum()==null) || 
             (this.ccNum!=null &&
              this.ccNum.equals(other.getCcNum()))) &&
            ((this.ccExp==null && other.getCcExp()==null) || 
             (this.ccExp!=null &&
              this.ccExp.equals(other.getCcExp()))) &&
            ((this.firstName==null && other.getFirstName()==null) || 
             (this.firstName!=null &&
              this.firstName.equals(other.getFirstName()))) &&
            ((this.lastName==null && other.getLastName()==null) || 
             (this.lastName!=null &&
              this.lastName.equals(other.getLastName()))) &&
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              this.address.equals(other.getAddress()))) &&
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              this.city.equals(other.getCity()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.zipCode==null && other.getZipCode()==null) || 
             (this.zipCode!=null &&
              this.zipCode.equals(other.getZipCode()))) &&
            ((this.cvv2==null && other.getCvv2()==null) || 
             (this.cvv2!=null &&
              this.cvv2.equals(other.getCvv2()))) &&
            ((this.total==null && other.getTotal()==null) || 
             (this.total!=null &&
              this.total.equals(other.getTotal())));
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
        if (getAgentCode() != null) {
            _hashCode += getAgentCode().hashCode();
        }
        if (getPassword() != null) {
            _hashCode += getPassword().hashCode();
        }
        if (getCustomerIPAddress() != null) {
            _hashCode += getCustomerIPAddress().hashCode();
        }
        if (getInvoiceNum() != null) {
            _hashCode += getInvoiceNum().hashCode();
        }
        if (getCcNum() != null) {
            _hashCode += getCcNum().hashCode();
        }
        if (getCcExp() != null) {
            _hashCode += getCcExp().hashCode();
        }
        if (getFirstName() != null) {
            _hashCode += getFirstName().hashCode();
        }
        if (getLastName() != null) {
            _hashCode += getLastName().hashCode();
        }
        if (getAddress() != null) {
            _hashCode += getAddress().hashCode();
        }
        if (getCity() != null) {
            _hashCode += getCity().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getZipCode() != null) {
            _hashCode += getZipCode().hashCode();
        }
        if (getCvv2() != null) {
            _hashCode += getCvv2().hashCode();
        }
        if (getTotal() != null) {
            _hashCode += getTotal().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreateCustomerCodeAndProcessCreditCardV1.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">CreateCustomerCodeAndProcessCreditCardV1"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agentCode");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", "agentCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("password");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", "password"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerIPAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", "customerIPAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceNum");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", "invoiceNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ccNum");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", "ccNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ccExp");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", "ccExp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", "firstName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", "lastName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", "address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("city");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", "city"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", "state"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zipCode");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", "zipCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cvv2");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", "cvv2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("total");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", "total"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
