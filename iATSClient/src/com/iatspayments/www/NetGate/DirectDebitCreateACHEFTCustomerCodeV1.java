/**
 * DirectDebitCreateACHEFTCustomerCodeV1.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.iatspayments.www.NetGate;

public class DirectDebitCreateACHEFTCustomerCodeV1  implements java.io.Serializable {
    private java.lang.String agentCode;

    private java.lang.String password;

    private java.lang.String customerIPAddress;

    private java.lang.String customerCode;

    private java.lang.String ACHEFTReferenceNum;

    private java.lang.String firstName;

    private java.lang.String lastName;

    private java.lang.String companyName;

    private java.lang.String address;

    private java.lang.String city;

    private java.lang.String state;

    private java.lang.String zipCode;

    private java.lang.String phone;

    private java.lang.String fax;

    private java.lang.String alternatePhone;

    private java.lang.String email;

    private java.lang.String comment;

    private boolean recurring;

    private java.lang.String amount;

    private java.util.Calendar beginDate;

    private java.util.Calendar endDate;

    private java.lang.String scheduleType;

    private java.lang.String scheduleDate;

    private java.lang.String accountCustomerName;

    private java.lang.String accountNum;

    private java.lang.String accountType;

    public DirectDebitCreateACHEFTCustomerCodeV1() {
    }

    public DirectDebitCreateACHEFTCustomerCodeV1(
           java.lang.String agentCode,
           java.lang.String password,
           java.lang.String customerIPAddress,
           java.lang.String customerCode,
           java.lang.String ACHEFTReferenceNum,
           java.lang.String firstName,
           java.lang.String lastName,
           java.lang.String companyName,
           java.lang.String address,
           java.lang.String city,
           java.lang.String state,
           java.lang.String zipCode,
           java.lang.String phone,
           java.lang.String fax,
           java.lang.String alternatePhone,
           java.lang.String email,
           java.lang.String comment,
           boolean recurring,
           java.lang.String amount,
           java.util.Calendar beginDate,
           java.util.Calendar endDate,
           java.lang.String scheduleType,
           java.lang.String scheduleDate,
           java.lang.String accountCustomerName,
           java.lang.String accountNum,
           java.lang.String accountType) {
           this.agentCode = agentCode;
           this.password = password;
           this.customerIPAddress = customerIPAddress;
           this.customerCode = customerCode;
           this.ACHEFTReferenceNum = ACHEFTReferenceNum;
           this.firstName = firstName;
           this.lastName = lastName;
           this.companyName = companyName;
           this.address = address;
           this.city = city;
           this.state = state;
           this.zipCode = zipCode;
           this.phone = phone;
           this.fax = fax;
           this.alternatePhone = alternatePhone;
           this.email = email;
           this.comment = comment;
           this.recurring = recurring;
           this.amount = amount;
           this.beginDate = beginDate;
           this.endDate = endDate;
           this.scheduleType = scheduleType;
           this.scheduleDate = scheduleDate;
           this.accountCustomerName = accountCustomerName;
           this.accountNum = accountNum;
           this.accountType = accountType;
    }


    /**
     * Gets the agentCode value for this DirectDebitCreateACHEFTCustomerCodeV1.
     * 
     * @return agentCode
     */
    public java.lang.String getAgentCode() {
        return agentCode;
    }


    /**
     * Sets the agentCode value for this DirectDebitCreateACHEFTCustomerCodeV1.
     * 
     * @param agentCode
     */
    public void setAgentCode(java.lang.String agentCode) {
        this.agentCode = agentCode;
    }


    /**
     * Gets the password value for this DirectDebitCreateACHEFTCustomerCodeV1.
     * 
     * @return password
     */
    public java.lang.String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this DirectDebitCreateACHEFTCustomerCodeV1.
     * 
     * @param password
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }


    /**
     * Gets the customerIPAddress value for this DirectDebitCreateACHEFTCustomerCodeV1.
     * 
     * @return customerIPAddress
     */
    public java.lang.String getCustomerIPAddress() {
        return customerIPAddress;
    }


    /**
     * Sets the customerIPAddress value for this DirectDebitCreateACHEFTCustomerCodeV1.
     * 
     * @param customerIPAddress
     */
    public void setCustomerIPAddress(java.lang.String customerIPAddress) {
        this.customerIPAddress = customerIPAddress;
    }


    /**
     * Gets the customerCode value for this DirectDebitCreateACHEFTCustomerCodeV1.
     * 
     * @return customerCode
     */
    public java.lang.String getCustomerCode() {
        return customerCode;
    }


    /**
     * Sets the customerCode value for this DirectDebitCreateACHEFTCustomerCodeV1.
     * 
     * @param customerCode
     */
    public void setCustomerCode(java.lang.String customerCode) {
        this.customerCode = customerCode;
    }


    /**
     * Gets the ACHEFTReferenceNum value for this DirectDebitCreateACHEFTCustomerCodeV1.
     * 
     * @return ACHEFTReferenceNum
     */
    public java.lang.String getACHEFTReferenceNum() {
        return ACHEFTReferenceNum;
    }


    /**
     * Sets the ACHEFTReferenceNum value for this DirectDebitCreateACHEFTCustomerCodeV1.
     * 
     * @param ACHEFTReferenceNum
     */
    public void setACHEFTReferenceNum(java.lang.String ACHEFTReferenceNum) {
        this.ACHEFTReferenceNum = ACHEFTReferenceNum;
    }


    /**
     * Gets the firstName value for this DirectDebitCreateACHEFTCustomerCodeV1.
     * 
     * @return firstName
     */
    public java.lang.String getFirstName() {
        return firstName;
    }


    /**
     * Sets the firstName value for this DirectDebitCreateACHEFTCustomerCodeV1.
     * 
     * @param firstName
     */
    public void setFirstName(java.lang.String firstName) {
        this.firstName = firstName;
    }


    /**
     * Gets the lastName value for this DirectDebitCreateACHEFTCustomerCodeV1.
     * 
     * @return lastName
     */
    public java.lang.String getLastName() {
        return lastName;
    }


    /**
     * Sets the lastName value for this DirectDebitCreateACHEFTCustomerCodeV1.
     * 
     * @param lastName
     */
    public void setLastName(java.lang.String lastName) {
        this.lastName = lastName;
    }


    /**
     * Gets the companyName value for this DirectDebitCreateACHEFTCustomerCodeV1.
     * 
     * @return companyName
     */
    public java.lang.String getCompanyName() {
        return companyName;
    }


    /**
     * Sets the companyName value for this DirectDebitCreateACHEFTCustomerCodeV1.
     * 
     * @param companyName
     */
    public void setCompanyName(java.lang.String companyName) {
        this.companyName = companyName;
    }


    /**
     * Gets the address value for this DirectDebitCreateACHEFTCustomerCodeV1.
     * 
     * @return address
     */
    public java.lang.String getAddress() {
        return address;
    }


    /**
     * Sets the address value for this DirectDebitCreateACHEFTCustomerCodeV1.
     * 
     * @param address
     */
    public void setAddress(java.lang.String address) {
        this.address = address;
    }


    /**
     * Gets the city value for this DirectDebitCreateACHEFTCustomerCodeV1.
     * 
     * @return city
     */
    public java.lang.String getCity() {
        return city;
    }


    /**
     * Sets the city value for this DirectDebitCreateACHEFTCustomerCodeV1.
     * 
     * @param city
     */
    public void setCity(java.lang.String city) {
        this.city = city;
    }


    /**
     * Gets the state value for this DirectDebitCreateACHEFTCustomerCodeV1.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this DirectDebitCreateACHEFTCustomerCodeV1.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the zipCode value for this DirectDebitCreateACHEFTCustomerCodeV1.
     * 
     * @return zipCode
     */
    public java.lang.String getZipCode() {
        return zipCode;
    }


    /**
     * Sets the zipCode value for this DirectDebitCreateACHEFTCustomerCodeV1.
     * 
     * @param zipCode
     */
    public void setZipCode(java.lang.String zipCode) {
        this.zipCode = zipCode;
    }


    /**
     * Gets the phone value for this DirectDebitCreateACHEFTCustomerCodeV1.
     * 
     * @return phone
     */
    public java.lang.String getPhone() {
        return phone;
    }


    /**
     * Sets the phone value for this DirectDebitCreateACHEFTCustomerCodeV1.
     * 
     * @param phone
     */
    public void setPhone(java.lang.String phone) {
        this.phone = phone;
    }


    /**
     * Gets the fax value for this DirectDebitCreateACHEFTCustomerCodeV1.
     * 
     * @return fax
     */
    public java.lang.String getFax() {
        return fax;
    }


    /**
     * Sets the fax value for this DirectDebitCreateACHEFTCustomerCodeV1.
     * 
     * @param fax
     */
    public void setFax(java.lang.String fax) {
        this.fax = fax;
    }


    /**
     * Gets the alternatePhone value for this DirectDebitCreateACHEFTCustomerCodeV1.
     * 
     * @return alternatePhone
     */
    public java.lang.String getAlternatePhone() {
        return alternatePhone;
    }


    /**
     * Sets the alternatePhone value for this DirectDebitCreateACHEFTCustomerCodeV1.
     * 
     * @param alternatePhone
     */
    public void setAlternatePhone(java.lang.String alternatePhone) {
        this.alternatePhone = alternatePhone;
    }


    /**
     * Gets the email value for this DirectDebitCreateACHEFTCustomerCodeV1.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this DirectDebitCreateACHEFTCustomerCodeV1.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the comment value for this DirectDebitCreateACHEFTCustomerCodeV1.
     * 
     * @return comment
     */
    public java.lang.String getComment() {
        return comment;
    }


    /**
     * Sets the comment value for this DirectDebitCreateACHEFTCustomerCodeV1.
     * 
     * @param comment
     */
    public void setComment(java.lang.String comment) {
        this.comment = comment;
    }


    /**
     * Gets the recurring value for this DirectDebitCreateACHEFTCustomerCodeV1.
     * 
     * @return recurring
     */
    public boolean isRecurring() {
        return recurring;
    }


    /**
     * Sets the recurring value for this DirectDebitCreateACHEFTCustomerCodeV1.
     * 
     * @param recurring
     */
    public void setRecurring(boolean recurring) {
        this.recurring = recurring;
    }


    /**
     * Gets the amount value for this DirectDebitCreateACHEFTCustomerCodeV1.
     * 
     * @return amount
     */
    public java.lang.String getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this DirectDebitCreateACHEFTCustomerCodeV1.
     * 
     * @param amount
     */
    public void setAmount(java.lang.String amount) {
        this.amount = amount;
    }


    /**
     * Gets the beginDate value for this DirectDebitCreateACHEFTCustomerCodeV1.
     * 
     * @return beginDate
     */
    public java.util.Calendar getBeginDate() {
        return beginDate;
    }


    /**
     * Sets the beginDate value for this DirectDebitCreateACHEFTCustomerCodeV1.
     * 
     * @param beginDate
     */
    public void setBeginDate(java.util.Calendar beginDate) {
        this.beginDate = beginDate;
    }


    /**
     * Gets the endDate value for this DirectDebitCreateACHEFTCustomerCodeV1.
     * 
     * @return endDate
     */
    public java.util.Calendar getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this DirectDebitCreateACHEFTCustomerCodeV1.
     * 
     * @param endDate
     */
    public void setEndDate(java.util.Calendar endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the scheduleType value for this DirectDebitCreateACHEFTCustomerCodeV1.
     * 
     * @return scheduleType
     */
    public java.lang.String getScheduleType() {
        return scheduleType;
    }


    /**
     * Sets the scheduleType value for this DirectDebitCreateACHEFTCustomerCodeV1.
     * 
     * @param scheduleType
     */
    public void setScheduleType(java.lang.String scheduleType) {
        this.scheduleType = scheduleType;
    }


    /**
     * Gets the scheduleDate value for this DirectDebitCreateACHEFTCustomerCodeV1.
     * 
     * @return scheduleDate
     */
    public java.lang.String getScheduleDate() {
        return scheduleDate;
    }


    /**
     * Sets the scheduleDate value for this DirectDebitCreateACHEFTCustomerCodeV1.
     * 
     * @param scheduleDate
     */
    public void setScheduleDate(java.lang.String scheduleDate) {
        this.scheduleDate = scheduleDate;
    }


    /**
     * Gets the accountCustomerName value for this DirectDebitCreateACHEFTCustomerCodeV1.
     * 
     * @return accountCustomerName
     */
    public java.lang.String getAccountCustomerName() {
        return accountCustomerName;
    }


    /**
     * Sets the accountCustomerName value for this DirectDebitCreateACHEFTCustomerCodeV1.
     * 
     * @param accountCustomerName
     */
    public void setAccountCustomerName(java.lang.String accountCustomerName) {
        this.accountCustomerName = accountCustomerName;
    }


    /**
     * Gets the accountNum value for this DirectDebitCreateACHEFTCustomerCodeV1.
     * 
     * @return accountNum
     */
    public java.lang.String getAccountNum() {
        return accountNum;
    }


    /**
     * Sets the accountNum value for this DirectDebitCreateACHEFTCustomerCodeV1.
     * 
     * @param accountNum
     */
    public void setAccountNum(java.lang.String accountNum) {
        this.accountNum = accountNum;
    }


    /**
     * Gets the accountType value for this DirectDebitCreateACHEFTCustomerCodeV1.
     * 
     * @return accountType
     */
    public java.lang.String getAccountType() {
        return accountType;
    }


    /**
     * Sets the accountType value for this DirectDebitCreateACHEFTCustomerCodeV1.
     * 
     * @param accountType
     */
    public void setAccountType(java.lang.String accountType) {
        this.accountType = accountType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DirectDebitCreateACHEFTCustomerCodeV1)) return false;
        DirectDebitCreateACHEFTCustomerCodeV1 other = (DirectDebitCreateACHEFTCustomerCodeV1) obj;
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
            ((this.customerCode==null && other.getCustomerCode()==null) || 
             (this.customerCode!=null &&
              this.customerCode.equals(other.getCustomerCode()))) &&
            ((this.ACHEFTReferenceNum==null && other.getACHEFTReferenceNum()==null) || 
             (this.ACHEFTReferenceNum!=null &&
              this.ACHEFTReferenceNum.equals(other.getACHEFTReferenceNum()))) &&
            ((this.firstName==null && other.getFirstName()==null) || 
             (this.firstName!=null &&
              this.firstName.equals(other.getFirstName()))) &&
            ((this.lastName==null && other.getLastName()==null) || 
             (this.lastName!=null &&
              this.lastName.equals(other.getLastName()))) &&
            ((this.companyName==null && other.getCompanyName()==null) || 
             (this.companyName!=null &&
              this.companyName.equals(other.getCompanyName()))) &&
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
            ((this.phone==null && other.getPhone()==null) || 
             (this.phone!=null &&
              this.phone.equals(other.getPhone()))) &&
            ((this.fax==null && other.getFax()==null) || 
             (this.fax!=null &&
              this.fax.equals(other.getFax()))) &&
            ((this.alternatePhone==null && other.getAlternatePhone()==null) || 
             (this.alternatePhone!=null &&
              this.alternatePhone.equals(other.getAlternatePhone()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.comment==null && other.getComment()==null) || 
             (this.comment!=null &&
              this.comment.equals(other.getComment()))) &&
            this.recurring == other.isRecurring() &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.beginDate==null && other.getBeginDate()==null) || 
             (this.beginDate!=null &&
              this.beginDate.equals(other.getBeginDate()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.scheduleType==null && other.getScheduleType()==null) || 
             (this.scheduleType!=null &&
              this.scheduleType.equals(other.getScheduleType()))) &&
            ((this.scheduleDate==null && other.getScheduleDate()==null) || 
             (this.scheduleDate!=null &&
              this.scheduleDate.equals(other.getScheduleDate()))) &&
            ((this.accountCustomerName==null && other.getAccountCustomerName()==null) || 
             (this.accountCustomerName!=null &&
              this.accountCustomerName.equals(other.getAccountCustomerName()))) &&
            ((this.accountNum==null && other.getAccountNum()==null) || 
             (this.accountNum!=null &&
              this.accountNum.equals(other.getAccountNum()))) &&
            ((this.accountType==null && other.getAccountType()==null) || 
             (this.accountType!=null &&
              this.accountType.equals(other.getAccountType())));
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
        if (getCustomerCode() != null) {
            _hashCode += getCustomerCode().hashCode();
        }
        if (getACHEFTReferenceNum() != null) {
            _hashCode += getACHEFTReferenceNum().hashCode();
        }
        if (getFirstName() != null) {
            _hashCode += getFirstName().hashCode();
        }
        if (getLastName() != null) {
            _hashCode += getLastName().hashCode();
        }
        if (getCompanyName() != null) {
            _hashCode += getCompanyName().hashCode();
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
        if (getPhone() != null) {
            _hashCode += getPhone().hashCode();
        }
        if (getFax() != null) {
            _hashCode += getFax().hashCode();
        }
        if (getAlternatePhone() != null) {
            _hashCode += getAlternatePhone().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getComment() != null) {
            _hashCode += getComment().hashCode();
        }
        _hashCode += (isRecurring() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getBeginDate() != null) {
            _hashCode += getBeginDate().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getScheduleType() != null) {
            _hashCode += getScheduleType().hashCode();
        }
        if (getScheduleDate() != null) {
            _hashCode += getScheduleDate().hashCode();
        }
        if (getAccountCustomerName() != null) {
            _hashCode += getAccountCustomerName().hashCode();
        }
        if (getAccountNum() != null) {
            _hashCode += getAccountNum().hashCode();
        }
        if (getAccountType() != null) {
            _hashCode += getAccountType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DirectDebitCreateACHEFTCustomerCodeV1.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">DirectDebitCreateACHEFTCustomerCodeV1"));
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
        elemField.setFieldName("customerCode");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", "customerCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ACHEFTReferenceNum");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", "ACHEFTReferenceNum"));
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
        elemField.setFieldName("companyName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", "companyName"));
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
        elemField.setFieldName("phone");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", "phone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fax");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", "fax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alternatePhone");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", "alternatePhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", "email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comment");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", "comment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recurring");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", "recurring"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("beginDate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", "beginDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", "endDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scheduleType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", "scheduleType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scheduleDate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", "scheduleDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountCustomerName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", "accountCustomerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountNum");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", "accountNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", "accountType"));
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
