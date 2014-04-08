/**
 * ReportLinkSoapStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.iatspayments.www.NetGate;

public class ReportLinkSoapStub extends org.apache.axis.client.Stub implements com.iatspayments.www.NetGate.ReportLinkSoap {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[20];
        _initOperationDesc1();
        _initOperationDesc2();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetCCJournalCSV");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", "GetCCJournalCSV_x0020_V1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">GetCCJournalCSV_x0020_V1"), com.iatspayments.www.NetGate.GetCCJournalCSV_x0020_V1.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">GetCCJournalCSV_x0020_V1Response"));
        oper.setReturnClass(com.iatspayments.www.NetGate.GetCCJournalCSV_x0020_V1Response.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", "GetCCJournalCSV_x0020_V1Response"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetCreditCardJournalCSV");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", "GetCreditCardJournalCSVV1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">GetCreditCardJournalCSVV1"), com.iatspayments.www.NetGate.GetCreditCardJournalCSVV1.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">GetCreditCardJournalCSVV1Response"));
        oper.setReturnClass(com.iatspayments.www.NetGate.GetCreditCardJournalCSVV1Response.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", "GetCreditCardJournalCSVV1Response"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetCreditCardJournal");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", "GetCreditCardJournalV1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">GetCreditCardJournalV1"), com.iatspayments.www.NetGate.GetCreditCardJournalV1.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">GetCreditCardJournalV1Response"));
        oper.setReturnClass(com.iatspayments.www.NetGate.GetCreditCardJournalV1Response.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", "GetCreditCardJournalV1Response"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetCreditCardRejectCSV");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", "GetCreditCardRejectCSVV1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">GetCreditCardRejectCSVV1"), com.iatspayments.www.NetGate.GetCreditCardRejectCSVV1.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">GetCreditCardRejectCSVV1Response"));
        oper.setReturnClass(com.iatspayments.www.NetGate.GetCreditCardRejectCSVV1Response.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", "GetCreditCardRejectCSVV1Response"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetCreditCardReject");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", "GetCreditCardRejectV1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">GetCreditCardRejectV1"), com.iatspayments.www.NetGate.GetCreditCardRejectV1.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">GetCreditCardRejectV1Response"));
        oper.setReturnClass(com.iatspayments.www.NetGate.GetCreditCardRejectV1Response.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", "GetCreditCardRejectV1Response"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetACHJournalCSV");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", "GetACHJournalCSV_x0020_V1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">GetACHJournalCSV_x0020_V1"), com.iatspayments.www.NetGate.GetACHJournalCSV_x0020_V1.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">GetACHJournalCSV_x0020_V1Response"));
        oper.setReturnClass(com.iatspayments.www.NetGate.GetACHJournalCSV_x0020_V1Response.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", "GetACHJournalCSV_x0020_V1Response"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetACHEFTJournalCSV");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", "GetACHEFTJournalCSVV1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">GetACHEFTJournalCSVV1"), com.iatspayments.www.NetGate.GetACHEFTJournalCSVV1.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">GetACHEFTJournalCSVV1Response"));
        oper.setReturnClass(com.iatspayments.www.NetGate.GetACHEFTJournalCSVV1Response.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", "GetACHEFTJournalCSVV1Response"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetACHEFTJournal");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", "GetACHEFTJournalV1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">GetACHEFTJournalV1"), com.iatspayments.www.NetGate.GetACHEFTJournalV1.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">GetACHEFTJournalV1Response"));
        oper.setReturnClass(com.iatspayments.www.NetGate.GetACHEFTJournalV1Response.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", "GetACHEFTJournalV1Response"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetACHEFTRejectCSV");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", "GetACHEFTRejectCSVV1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">GetACHEFTRejectCSVV1"), com.iatspayments.www.NetGate.GetACHEFTRejectCSVV1.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">GetACHEFTRejectCSVV1Response"));
        oper.setReturnClass(com.iatspayments.www.NetGate.GetACHEFTRejectCSVV1Response.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", "GetACHEFTRejectCSVV1Response"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetACHEFTReject");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", "GetACHEFTRejectV1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">GetACHEFTRejectV1"), com.iatspayments.www.NetGate.GetACHEFTRejectV1.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">GetACHEFTRejectV1Response"));
        oper.setReturnClass(com.iatspayments.www.NetGate.GetACHEFTRejectV1Response.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", "GetACHEFTRejectV1Response"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetACHEFTReturnCSV");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", "GetACHEFTReturnCSVV1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">GetACHEFTReturnCSVV1"), com.iatspayments.www.NetGate.GetACHEFTReturnCSVV1.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">GetACHEFTReturnCSVV1Response"));
        oper.setReturnClass(com.iatspayments.www.NetGate.GetACHEFTReturnCSVV1Response.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", "GetACHEFTReturnCSVV1Response"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetACHEFTReturn");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", "GetACHEFTReturnV1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">GetACHEFTReturnV1"), com.iatspayments.www.NetGate.GetACHEFTReturnV1.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">GetACHEFTReturnV1Response"));
        oper.setReturnClass(com.iatspayments.www.NetGate.GetACHEFTReturnV1Response.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", "GetACHEFTReturnV1Response"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetCCPaymentBoxJournalCSV");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", "GetCCPaymentBoxJournalCSV_x0020_V1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">GetCCPaymentBoxJournalCSV_x0020_V1"), com.iatspayments.www.NetGate.GetCCPaymentBoxJournalCSV_x0020_V1.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">GetCCPaymentBoxJournalCSV_x0020_V1Response"));
        oper.setReturnClass(com.iatspayments.www.NetGate.GetCCPaymentBoxJournalCSV_x0020_V1Response.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", "GetCCPaymentBoxJournalCSV_x0020_V1Response"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetCreditCardPaymentBoxJournalCSV");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", "GetCreditCardPaymentBoxJournalCSVV1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">GetCreditCardPaymentBoxJournalCSVV1"), com.iatspayments.www.NetGate.GetCreditCardPaymentBoxJournalCSVV1.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">GetCreditCardPaymentBoxJournalCSVV1Response"));
        oper.setReturnClass(com.iatspayments.www.NetGate.GetCreditCardPaymentBoxJournalCSVV1Response.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", "GetCreditCardPaymentBoxJournalCSVV1Response"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetCreditCardPaymentBoxRejectCSV");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", "GetCreditCardPaymentBoxRejectCSVV1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">GetCreditCardPaymentBoxRejectCSVV1"), com.iatspayments.www.NetGate.GetCreditCardPaymentBoxRejectCSVV1.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">GetCreditCardPaymentBoxRejectCSVV1Response"));
        oper.setReturnClass(com.iatspayments.www.NetGate.GetCreditCardPaymentBoxRejectCSVV1Response.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", "GetCreditCardPaymentBoxRejectCSVV1Response"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetACHEFTPaymentBoxJournalCSV");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", "GetACHEFTPaymentBoxJournalCSV_x0020_V1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">GetACHEFTPaymentBoxJournalCSV_x0020_V1"), com.iatspayments.www.NetGate.GetACHEFTPaymentBoxJournalCSV_x0020_V1.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">GetACHEFTPaymentBoxJournalCSV_x0020_V1Response"));
        oper.setReturnClass(com.iatspayments.www.NetGate.GetACHEFTPaymentBoxJournalCSV_x0020_V1Response.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", "GetACHEFTPaymentBoxJournalCSV_x0020_V1Response"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetACHEFTPaymentBoxJournalCSV");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", "GetACHEFTPaymentBoxJournalCSVV1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">GetACHEFTPaymentBoxJournalCSVV1"), com.iatspayments.www.NetGate.GetACHEFTPaymentBoxJournalCSVV1.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">GetACHEFTPaymentBoxJournalCSVV1Response"));
        oper.setReturnClass(com.iatspayments.www.NetGate.GetACHEFTPaymentBoxJournalCSVV1Response.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", "GetACHEFTPaymentBoxJournalCSVV1Response"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetACHEFTPaymentBoxRejectCSV");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", "GetACHEFTPaymentBoxRejectCSVV1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">GetACHEFTPaymentBoxRejectCSVV1"), com.iatspayments.www.NetGate.GetACHEFTPaymentBoxRejectCSVV1.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">GetACHEFTPaymentBoxRejectCSVV1Response"));
        oper.setReturnClass(com.iatspayments.www.NetGate.GetACHEFTPaymentBoxRejectCSVV1Response.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", "GetACHEFTPaymentBoxRejectCSVV1Response"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetCreditCardBankReconciliationReportCSV");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", "GetCreditCardBankReconciliationReportCSVV1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">GetCreditCardBankReconciliationReportCSVV1"), com.iatspayments.www.NetGate.GetCreditCardBankReconciliationReportCSVV1.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">GetCreditCardBankReconciliationReportCSVV1Response"));
        oper.setReturnClass(com.iatspayments.www.NetGate.GetCreditCardBankReconciliationReportCSVV1Response.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", "GetCreditCardBankReconciliationReportCSVV1Response"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetACHEFTBankReconciliationReportCSV");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", "GetACHEFTBankReconciliationReportCSVV1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">GetACHEFTBankReconciliationReportCSVV1"), com.iatspayments.www.NetGate.GetACHEFTBankReconciliationReportCSVV1.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">GetACHEFTBankReconciliationReportCSVV1Response"));
        oper.setReturnClass(com.iatspayments.www.NetGate.GetACHEFTBankReconciliationReportCSVV1Response.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", "GetACHEFTBankReconciliationReportCSVV1Response"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[19] = oper;

    }

    public ReportLinkSoapStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public ReportLinkSoapStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public ReportLinkSoapStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">>GetACHEFTBankReconciliationReportCSVV1Response>GetACHEFTBankReconciliationReportCSVV1Result");
            cachedSerQNames.add(qName);
            cls = com.iatspayments.www.NetGate.GetACHEFTBankReconciliationReportCSVV1ResponseGetACHEFTBankReconciliationReportCSVV1Result.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">>GetACHEFTJournalCSVV1Response>GetACHEFTJournalCSVV1Result");
            cachedSerQNames.add(qName);
            cls = com.iatspayments.www.NetGate.GetACHEFTJournalCSVV1ResponseGetACHEFTJournalCSVV1Result.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">>GetACHEFTJournalV1Response>GetACHEFTJournalV1Result");
            cachedSerQNames.add(qName);
            cls = com.iatspayments.www.NetGate.GetACHEFTJournalV1ResponseGetACHEFTJournalV1Result.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">>GetACHEFTPaymentBoxJournalCSVV1Response>GetACHEFTPaymentBoxJournalCSVV1Result");
            cachedSerQNames.add(qName);
            cls = com.iatspayments.www.NetGate.GetACHEFTPaymentBoxJournalCSVV1ResponseGetACHEFTPaymentBoxJournalCSVV1Result.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">>GetACHEFTPaymentBoxRejectCSVV1Response>GetACHEFTPaymentBoxRejectCSVV1Result");
            cachedSerQNames.add(qName);
            cls = com.iatspayments.www.NetGate.GetACHEFTPaymentBoxRejectCSVV1ResponseGetACHEFTPaymentBoxRejectCSVV1Result.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">>GetACHEFTRejectCSVV1Response>GetACHEFTRejectCSVV1Result");
            cachedSerQNames.add(qName);
            cls = com.iatspayments.www.NetGate.GetACHEFTRejectCSVV1ResponseGetACHEFTRejectCSVV1Result.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">>GetACHEFTRejectV1Response>GetACHEFTRejectV1Result");
            cachedSerQNames.add(qName);
            cls = com.iatspayments.www.NetGate.GetACHEFTRejectV1ResponseGetACHEFTRejectV1Result.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">>GetACHEFTReturnCSVV1Response>GetACHEFTReturnCSVV1Result");
            cachedSerQNames.add(qName);
            cls = com.iatspayments.www.NetGate.GetACHEFTReturnCSVV1ResponseGetACHEFTReturnCSVV1Result.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">>GetACHEFTReturnV1Response>GetACHEFTReturnV1Result");
            cachedSerQNames.add(qName);
            cls = com.iatspayments.www.NetGate.GetACHEFTReturnV1ResponseGetACHEFTReturnV1Result.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">>GetCreditCardBankReconciliationReportCSVV1Response>GetCreditCardBankReconciliationReportCSVV1Result");
            cachedSerQNames.add(qName);
            cls = com.iatspayments.www.NetGate.GetCreditCardBankReconciliationReportCSVV1ResponseGetCreditCardBankReconciliationReportCSVV1Result.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">>GetCreditCardJournalCSVV1Response>GetCreditCardJournalCSVV1Result");
            cachedSerQNames.add(qName);
            cls = com.iatspayments.www.NetGate.GetCreditCardJournalCSVV1ResponseGetCreditCardJournalCSVV1Result.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">>GetCreditCardJournalV1Response>GetCreditCardJournalV1Result");
            cachedSerQNames.add(qName);
            cls = com.iatspayments.www.NetGate.GetCreditCardJournalV1ResponseGetCreditCardJournalV1Result.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">>GetCreditCardPaymentBoxJournalCSVV1Response>GetCreditCardPaymentBoxJournalCSVV1Result");
            cachedSerQNames.add(qName);
            cls = com.iatspayments.www.NetGate.GetCreditCardPaymentBoxJournalCSVV1ResponseGetCreditCardPaymentBoxJournalCSVV1Result.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">>GetCreditCardPaymentBoxRejectCSVV1Response>GetCreditCardPaymentBoxRejectCSVV1Result");
            cachedSerQNames.add(qName);
            cls = com.iatspayments.www.NetGate.GetCreditCardPaymentBoxRejectCSVV1ResponseGetCreditCardPaymentBoxRejectCSVV1Result.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">>GetCreditCardRejectCSVV1Response>GetCreditCardRejectCSVV1Result");
            cachedSerQNames.add(qName);
            cls = com.iatspayments.www.NetGate.GetCreditCardRejectCSVV1ResponseGetCreditCardRejectCSVV1Result.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">>GetCreditCardRejectV1Response>GetCreditCardRejectV1Result");
            cachedSerQNames.add(qName);
            cls = com.iatspayments.www.NetGate.GetCreditCardRejectV1ResponseGetCreditCardRejectV1Result.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">GetACHEFTBankReconciliationReportCSVV1");
            cachedSerQNames.add(qName);
            cls = com.iatspayments.www.NetGate.GetACHEFTBankReconciliationReportCSVV1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">GetACHEFTBankReconciliationReportCSVV1Response");
            cachedSerQNames.add(qName);
            cls = com.iatspayments.www.NetGate.GetACHEFTBankReconciliationReportCSVV1Response.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">GetACHEFTJournalCSVV1");
            cachedSerQNames.add(qName);
            cls = com.iatspayments.www.NetGate.GetACHEFTJournalCSVV1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">GetACHEFTJournalCSVV1Response");
            cachedSerQNames.add(qName);
            cls = com.iatspayments.www.NetGate.GetACHEFTJournalCSVV1Response.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">GetACHEFTJournalV1");
            cachedSerQNames.add(qName);
            cls = com.iatspayments.www.NetGate.GetACHEFTJournalV1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">GetACHEFTJournalV1Response");
            cachedSerQNames.add(qName);
            cls = com.iatspayments.www.NetGate.GetACHEFTJournalV1Response.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">GetACHEFTPaymentBoxJournalCSV_x0020_V1");
            cachedSerQNames.add(qName);
            cls = com.iatspayments.www.NetGate.GetACHEFTPaymentBoxJournalCSV_x0020_V1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">GetACHEFTPaymentBoxJournalCSV_x0020_V1Response");
            cachedSerQNames.add(qName);
            cls = com.iatspayments.www.NetGate.GetACHEFTPaymentBoxJournalCSV_x0020_V1Response.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">GetACHEFTPaymentBoxJournalCSVV1");
            cachedSerQNames.add(qName);
            cls = com.iatspayments.www.NetGate.GetACHEFTPaymentBoxJournalCSVV1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">GetACHEFTPaymentBoxJournalCSVV1Response");
            cachedSerQNames.add(qName);
            cls = com.iatspayments.www.NetGate.GetACHEFTPaymentBoxJournalCSVV1Response.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">GetACHEFTPaymentBoxRejectCSVV1");
            cachedSerQNames.add(qName);
            cls = com.iatspayments.www.NetGate.GetACHEFTPaymentBoxRejectCSVV1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">GetACHEFTPaymentBoxRejectCSVV1Response");
            cachedSerQNames.add(qName);
            cls = com.iatspayments.www.NetGate.GetACHEFTPaymentBoxRejectCSVV1Response.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">GetACHEFTRejectCSVV1");
            cachedSerQNames.add(qName);
            cls = com.iatspayments.www.NetGate.GetACHEFTRejectCSVV1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">GetACHEFTRejectCSVV1Response");
            cachedSerQNames.add(qName);
            cls = com.iatspayments.www.NetGate.GetACHEFTRejectCSVV1Response.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">GetACHEFTRejectV1");
            cachedSerQNames.add(qName);
            cls = com.iatspayments.www.NetGate.GetACHEFTRejectV1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">GetACHEFTRejectV1Response");
            cachedSerQNames.add(qName);
            cls = com.iatspayments.www.NetGate.GetACHEFTRejectV1Response.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">GetACHEFTReturnCSVV1");
            cachedSerQNames.add(qName);
            cls = com.iatspayments.www.NetGate.GetACHEFTReturnCSVV1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">GetACHEFTReturnCSVV1Response");
            cachedSerQNames.add(qName);
            cls = com.iatspayments.www.NetGate.GetACHEFTReturnCSVV1Response.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">GetACHEFTReturnV1");
            cachedSerQNames.add(qName);
            cls = com.iatspayments.www.NetGate.GetACHEFTReturnV1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">GetACHEFTReturnV1Response");
            cachedSerQNames.add(qName);
            cls = com.iatspayments.www.NetGate.GetACHEFTReturnV1Response.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">GetACHJournalCSV_x0020_V1");
            cachedSerQNames.add(qName);
            cls = com.iatspayments.www.NetGate.GetACHJournalCSV_x0020_V1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">GetACHJournalCSV_x0020_V1Response");
            cachedSerQNames.add(qName);
            cls = com.iatspayments.www.NetGate.GetACHJournalCSV_x0020_V1Response.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">GetCCJournalCSV_x0020_V1");
            cachedSerQNames.add(qName);
            cls = com.iatspayments.www.NetGate.GetCCJournalCSV_x0020_V1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">GetCCJournalCSV_x0020_V1Response");
            cachedSerQNames.add(qName);
            cls = com.iatspayments.www.NetGate.GetCCJournalCSV_x0020_V1Response.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">GetCCPaymentBoxJournalCSV_x0020_V1");
            cachedSerQNames.add(qName);
            cls = com.iatspayments.www.NetGate.GetCCPaymentBoxJournalCSV_x0020_V1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">GetCCPaymentBoxJournalCSV_x0020_V1Response");
            cachedSerQNames.add(qName);
            cls = com.iatspayments.www.NetGate.GetCCPaymentBoxJournalCSV_x0020_V1Response.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">GetCreditCardBankReconciliationReportCSVV1");
            cachedSerQNames.add(qName);
            cls = com.iatspayments.www.NetGate.GetCreditCardBankReconciliationReportCSVV1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">GetCreditCardBankReconciliationReportCSVV1Response");
            cachedSerQNames.add(qName);
            cls = com.iatspayments.www.NetGate.GetCreditCardBankReconciliationReportCSVV1Response.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">GetCreditCardJournalCSVV1");
            cachedSerQNames.add(qName);
            cls = com.iatspayments.www.NetGate.GetCreditCardJournalCSVV1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">GetCreditCardJournalCSVV1Response");
            cachedSerQNames.add(qName);
            cls = com.iatspayments.www.NetGate.GetCreditCardJournalCSVV1Response.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">GetCreditCardJournalV1");
            cachedSerQNames.add(qName);
            cls = com.iatspayments.www.NetGate.GetCreditCardJournalV1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">GetCreditCardJournalV1Response");
            cachedSerQNames.add(qName);
            cls = com.iatspayments.www.NetGate.GetCreditCardJournalV1Response.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">GetCreditCardPaymentBoxJournalCSVV1");
            cachedSerQNames.add(qName);
            cls = com.iatspayments.www.NetGate.GetCreditCardPaymentBoxJournalCSVV1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">GetCreditCardPaymentBoxJournalCSVV1Response");
            cachedSerQNames.add(qName);
            cls = com.iatspayments.www.NetGate.GetCreditCardPaymentBoxJournalCSVV1Response.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">GetCreditCardPaymentBoxRejectCSVV1");
            cachedSerQNames.add(qName);
            cls = com.iatspayments.www.NetGate.GetCreditCardPaymentBoxRejectCSVV1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">GetCreditCardPaymentBoxRejectCSVV1Response");
            cachedSerQNames.add(qName);
            cls = com.iatspayments.www.NetGate.GetCreditCardPaymentBoxRejectCSVV1Response.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">GetCreditCardRejectCSVV1");
            cachedSerQNames.add(qName);
            cls = com.iatspayments.www.NetGate.GetCreditCardRejectCSVV1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">GetCreditCardRejectCSVV1Response");
            cachedSerQNames.add(qName);
            cls = com.iatspayments.www.NetGate.GetCreditCardRejectCSVV1Response.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">GetCreditCardRejectV1");
            cachedSerQNames.add(qName);
            cls = com.iatspayments.www.NetGate.GetCreditCardRejectV1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">GetCreditCardRejectV1Response");
            cachedSerQNames.add(qName);
            cls = com.iatspayments.www.NetGate.GetCreditCardRejectV1Response.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public com.iatspayments.www.NetGate.GetCCJournalCSV_x0020_V1Response getCCJournalCSV(com.iatspayments.www.NetGate.GetCCJournalCSV_x0020_V1 parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://www.iatspayments.com/NetGate/GetCCJournalCSV V1");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetCCJournalCSV"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.iatspayments.www.NetGate.GetCCJournalCSV_x0020_V1Response) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.iatspayments.www.NetGate.GetCCJournalCSV_x0020_V1Response) org.apache.axis.utils.JavaUtils.convert(_resp, com.iatspayments.www.NetGate.GetCCJournalCSV_x0020_V1Response.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.iatspayments.www.NetGate.GetCreditCardJournalCSVV1Response getCreditCardJournalCSV(com.iatspayments.www.NetGate.GetCreditCardJournalCSVV1 parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://www.iatspayments.com/NetGate/GetCreditCardJournalCSVV1");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetCreditCardJournalCSV"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.iatspayments.www.NetGate.GetCreditCardJournalCSVV1Response) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.iatspayments.www.NetGate.GetCreditCardJournalCSVV1Response) org.apache.axis.utils.JavaUtils.convert(_resp, com.iatspayments.www.NetGate.GetCreditCardJournalCSVV1Response.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.iatspayments.www.NetGate.GetCreditCardJournalV1Response getCreditCardJournal(com.iatspayments.www.NetGate.GetCreditCardJournalV1 parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://www.iatspayments.com/NetGate/GetCreditCardJournalV1");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetCreditCardJournal"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.iatspayments.www.NetGate.GetCreditCardJournalV1Response) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.iatspayments.www.NetGate.GetCreditCardJournalV1Response) org.apache.axis.utils.JavaUtils.convert(_resp, com.iatspayments.www.NetGate.GetCreditCardJournalV1Response.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.iatspayments.www.NetGate.GetCreditCardRejectCSVV1Response getCreditCardRejectCSV(com.iatspayments.www.NetGate.GetCreditCardRejectCSVV1 parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://www.iatspayments.com/NetGate/GetCreditCardRejectCSVV1");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetCreditCardRejectCSV"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.iatspayments.www.NetGate.GetCreditCardRejectCSVV1Response) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.iatspayments.www.NetGate.GetCreditCardRejectCSVV1Response) org.apache.axis.utils.JavaUtils.convert(_resp, com.iatspayments.www.NetGate.GetCreditCardRejectCSVV1Response.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.iatspayments.www.NetGate.GetCreditCardRejectV1Response getCreditCardReject(com.iatspayments.www.NetGate.GetCreditCardRejectV1 parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://www.iatspayments.com/NetGate/GetCreditCardRejectV1");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetCreditCardReject"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.iatspayments.www.NetGate.GetCreditCardRejectV1Response) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.iatspayments.www.NetGate.GetCreditCardRejectV1Response) org.apache.axis.utils.JavaUtils.convert(_resp, com.iatspayments.www.NetGate.GetCreditCardRejectV1Response.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.iatspayments.www.NetGate.GetACHJournalCSV_x0020_V1Response getACHJournalCSV(com.iatspayments.www.NetGate.GetACHJournalCSV_x0020_V1 parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://www.iatspayments.com/NetGate/GetACHJournalCSV V1");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetACHJournalCSV"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.iatspayments.www.NetGate.GetACHJournalCSV_x0020_V1Response) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.iatspayments.www.NetGate.GetACHJournalCSV_x0020_V1Response) org.apache.axis.utils.JavaUtils.convert(_resp, com.iatspayments.www.NetGate.GetACHJournalCSV_x0020_V1Response.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.iatspayments.www.NetGate.GetACHEFTJournalCSVV1Response getACHEFTJournalCSV(com.iatspayments.www.NetGate.GetACHEFTJournalCSVV1 parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://www.iatspayments.com/NetGate/GetACHEFTJournalCSVV1");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetACHEFTJournalCSV"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.iatspayments.www.NetGate.GetACHEFTJournalCSVV1Response) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.iatspayments.www.NetGate.GetACHEFTJournalCSVV1Response) org.apache.axis.utils.JavaUtils.convert(_resp, com.iatspayments.www.NetGate.GetACHEFTJournalCSVV1Response.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.iatspayments.www.NetGate.GetACHEFTJournalV1Response getACHEFTJournal(com.iatspayments.www.NetGate.GetACHEFTJournalV1 parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://www.iatspayments.com/NetGate/GetACHEFTJournalV1");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetACHEFTJournal"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.iatspayments.www.NetGate.GetACHEFTJournalV1Response) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.iatspayments.www.NetGate.GetACHEFTJournalV1Response) org.apache.axis.utils.JavaUtils.convert(_resp, com.iatspayments.www.NetGate.GetACHEFTJournalV1Response.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.iatspayments.www.NetGate.GetACHEFTRejectCSVV1Response getACHEFTRejectCSV(com.iatspayments.www.NetGate.GetACHEFTRejectCSVV1 parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://www.iatspayments.com/NetGate/GetACHEFTRejectCSVV1");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetACHEFTRejectCSV"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.iatspayments.www.NetGate.GetACHEFTRejectCSVV1Response) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.iatspayments.www.NetGate.GetACHEFTRejectCSVV1Response) org.apache.axis.utils.JavaUtils.convert(_resp, com.iatspayments.www.NetGate.GetACHEFTRejectCSVV1Response.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.iatspayments.www.NetGate.GetACHEFTRejectV1Response getACHEFTReject(com.iatspayments.www.NetGate.GetACHEFTRejectV1 parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://www.iatspayments.com/NetGate/GetACHEFTRejectV1");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetACHEFTReject"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.iatspayments.www.NetGate.GetACHEFTRejectV1Response) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.iatspayments.www.NetGate.GetACHEFTRejectV1Response) org.apache.axis.utils.JavaUtils.convert(_resp, com.iatspayments.www.NetGate.GetACHEFTRejectV1Response.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.iatspayments.www.NetGate.GetACHEFTReturnCSVV1Response getACHEFTReturnCSV(com.iatspayments.www.NetGate.GetACHEFTReturnCSVV1 parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://www.iatspayments.com/NetGate/GetACHEFTReturnCSVV1");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetACHEFTReturnCSV"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.iatspayments.www.NetGate.GetACHEFTReturnCSVV1Response) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.iatspayments.www.NetGate.GetACHEFTReturnCSVV1Response) org.apache.axis.utils.JavaUtils.convert(_resp, com.iatspayments.www.NetGate.GetACHEFTReturnCSVV1Response.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.iatspayments.www.NetGate.GetACHEFTReturnV1Response getACHEFTReturn(com.iatspayments.www.NetGate.GetACHEFTReturnV1 parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://www.iatspayments.com/NetGate/GetACHEFTReturnV1");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetACHEFTReturn"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.iatspayments.www.NetGate.GetACHEFTReturnV1Response) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.iatspayments.www.NetGate.GetACHEFTReturnV1Response) org.apache.axis.utils.JavaUtils.convert(_resp, com.iatspayments.www.NetGate.GetACHEFTReturnV1Response.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.iatspayments.www.NetGate.GetCCPaymentBoxJournalCSV_x0020_V1Response getCCPaymentBoxJournalCSV(com.iatspayments.www.NetGate.GetCCPaymentBoxJournalCSV_x0020_V1 parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://www.iatspayments.com/NetGate/GetCCPaymentBoxJournalCSV V1");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetCCPaymentBoxJournalCSV"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.iatspayments.www.NetGate.GetCCPaymentBoxJournalCSV_x0020_V1Response) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.iatspayments.www.NetGate.GetCCPaymentBoxJournalCSV_x0020_V1Response) org.apache.axis.utils.JavaUtils.convert(_resp, com.iatspayments.www.NetGate.GetCCPaymentBoxJournalCSV_x0020_V1Response.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.iatspayments.www.NetGate.GetCreditCardPaymentBoxJournalCSVV1Response getCreditCardPaymentBoxJournalCSV(com.iatspayments.www.NetGate.GetCreditCardPaymentBoxJournalCSVV1 parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://www.iatspayments.com/NetGate/GetCreditCardPaymentBoxJournalCSVV1");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetCreditCardPaymentBoxJournalCSV"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.iatspayments.www.NetGate.GetCreditCardPaymentBoxJournalCSVV1Response) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.iatspayments.www.NetGate.GetCreditCardPaymentBoxJournalCSVV1Response) org.apache.axis.utils.JavaUtils.convert(_resp, com.iatspayments.www.NetGate.GetCreditCardPaymentBoxJournalCSVV1Response.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.iatspayments.www.NetGate.GetCreditCardPaymentBoxRejectCSVV1Response getCreditCardPaymentBoxRejectCSV(com.iatspayments.www.NetGate.GetCreditCardPaymentBoxRejectCSVV1 parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://www.iatspayments.com/NetGate/GetCreditCardPaymentBoxRejectCSVV1");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetCreditCardPaymentBoxRejectCSV"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.iatspayments.www.NetGate.GetCreditCardPaymentBoxRejectCSVV1Response) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.iatspayments.www.NetGate.GetCreditCardPaymentBoxRejectCSVV1Response) org.apache.axis.utils.JavaUtils.convert(_resp, com.iatspayments.www.NetGate.GetCreditCardPaymentBoxRejectCSVV1Response.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.iatspayments.www.NetGate.GetACHEFTPaymentBoxJournalCSV_x0020_V1Response getACHEFTPaymentBoxJournalCSV(com.iatspayments.www.NetGate.GetACHEFTPaymentBoxJournalCSV_x0020_V1 parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://www.iatspayments.com/NetGate/GetACHEFTPaymentBoxJournalCSV V1");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetACHEFTPaymentBoxJournalCSV"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.iatspayments.www.NetGate.GetACHEFTPaymentBoxJournalCSV_x0020_V1Response) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.iatspayments.www.NetGate.GetACHEFTPaymentBoxJournalCSV_x0020_V1Response) org.apache.axis.utils.JavaUtils.convert(_resp, com.iatspayments.www.NetGate.GetACHEFTPaymentBoxJournalCSV_x0020_V1Response.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.iatspayments.www.NetGate.GetACHEFTPaymentBoxJournalCSVV1Response getACHEFTPaymentBoxJournalCSV(com.iatspayments.www.NetGate.GetACHEFTPaymentBoxJournalCSVV1 parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://www.iatspayments.com/NetGate/GetACHEFTPaymentBoxJournalCSVV1");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetACHEFTPaymentBoxJournalCSV"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.iatspayments.www.NetGate.GetACHEFTPaymentBoxJournalCSVV1Response) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.iatspayments.www.NetGate.GetACHEFTPaymentBoxJournalCSVV1Response) org.apache.axis.utils.JavaUtils.convert(_resp, com.iatspayments.www.NetGate.GetACHEFTPaymentBoxJournalCSVV1Response.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.iatspayments.www.NetGate.GetACHEFTPaymentBoxRejectCSVV1Response getACHEFTPaymentBoxRejectCSV(com.iatspayments.www.NetGate.GetACHEFTPaymentBoxRejectCSVV1 parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://www.iatspayments.com/NetGate/GetACHEFTPaymentBoxRejectCSVV1");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetACHEFTPaymentBoxRejectCSV"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.iatspayments.www.NetGate.GetACHEFTPaymentBoxRejectCSVV1Response) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.iatspayments.www.NetGate.GetACHEFTPaymentBoxRejectCSVV1Response) org.apache.axis.utils.JavaUtils.convert(_resp, com.iatspayments.www.NetGate.GetACHEFTPaymentBoxRejectCSVV1Response.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.iatspayments.www.NetGate.GetCreditCardBankReconciliationReportCSVV1Response getCreditCardBankReconciliationReportCSV(com.iatspayments.www.NetGate.GetCreditCardBankReconciliationReportCSVV1 parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://www.iatspayments.com/NetGate/GetCreditCardBankReconciliationReportCSVV1");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetCreditCardBankReconciliationReportCSV"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.iatspayments.www.NetGate.GetCreditCardBankReconciliationReportCSVV1Response) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.iatspayments.www.NetGate.GetCreditCardBankReconciliationReportCSVV1Response) org.apache.axis.utils.JavaUtils.convert(_resp, com.iatspayments.www.NetGate.GetCreditCardBankReconciliationReportCSVV1Response.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.iatspayments.www.NetGate.GetACHEFTBankReconciliationReportCSVV1Response getACHEFTBankReconciliationReportCSV(com.iatspayments.www.NetGate.GetACHEFTBankReconciliationReportCSVV1 parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://www.iatspayments.com/NetGate/GetACHEFTBankReconciliationReportCSVV1");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetACHEFTBankReconciliationReportCSV"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.iatspayments.www.NetGate.GetACHEFTBankReconciliationReportCSVV1Response) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.iatspayments.www.NetGate.GetACHEFTBankReconciliationReportCSVV1Response) org.apache.axis.utils.JavaUtils.convert(_resp, com.iatspayments.www.NetGate.GetACHEFTBankReconciliationReportCSVV1Response.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
