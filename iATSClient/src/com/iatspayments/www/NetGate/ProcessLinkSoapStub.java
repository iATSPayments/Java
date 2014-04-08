/**
 * ProcessLinkSoapStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.iatspayments.www.NetGate;

public class ProcessLinkSoapStub extends org.apache.axis.client.Stub implements com.iatspayments.www.NetGate.ProcessLinkSoap {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[12];
        _initOperationDesc1();
        _initOperationDesc2();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CreateCustomerCodeAndProcessCreditCard");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", "CreateCustomerCodeAndProcessCreditCardV1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">CreateCustomerCodeAndProcessCreditCardV1"), com.iatspayments.www.NetGate.CreateCustomerCodeAndProcessCreditCardV1.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">CreateCustomerCodeAndProcessCreditCardV1Response"));
        oper.setReturnClass(com.iatspayments.www.NetGate.CreateCustomerCodeAndProcessCreditCardV1Response.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", "CreateCustomerCodeAndProcessCreditCardV1Response"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ProcessCreditCardWithCustomerCode");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", "ProcessCreditCardWithCustomerCodeV1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">ProcessCreditCardWithCustomerCodeV1"), com.iatspayments.www.NetGate.ProcessCreditCardWithCustomerCodeV1.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">ProcessCreditCardWithCustomerCodeV1Response"));
        oper.setReturnClass(com.iatspayments.www.NetGate.ProcessCreditCardWithCustomerCodeV1Response.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", "ProcessCreditCardWithCustomerCodeV1Response"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ProcessCreditCard");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", "ProcessCreditCardV1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">ProcessCreditCardV1"), com.iatspayments.www.NetGate.ProcessCreditCardV1.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">ProcessCreditCardV1Response"));
        oper.setReturnClass(com.iatspayments.www.NetGate.ProcessCreditCardV1Response.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", "ProcessCreditCardV1Response"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CreateCustomerCodeAndProcessACHEFT");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", "CreateCustomerCodeAndProcessACHEFTV1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">CreateCustomerCodeAndProcessACHEFTV1"), com.iatspayments.www.NetGate.CreateCustomerCodeAndProcessACHEFTV1.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">CreateCustomerCodeAndProcessACHEFTV1Response"));
        oper.setReturnClass(com.iatspayments.www.NetGate.CreateCustomerCodeAndProcessACHEFTV1Response.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", "CreateCustomerCodeAndProcessACHEFTV1Response"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ProcessACHEFTWithCustomerCode");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", "ProcessACHEFTWithCustomerCodeV1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">ProcessACHEFTWithCustomerCodeV1"), com.iatspayments.www.NetGate.ProcessACHEFTWithCustomerCodeV1.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">ProcessACHEFTWithCustomerCodeV1Response"));
        oper.setReturnClass(com.iatspayments.www.NetGate.ProcessACHEFTWithCustomerCodeV1Response.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", "ProcessACHEFTWithCustomerCodeV1Response"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ProcessACHEFT");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", "ProcessACHEFTV1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">ProcessACHEFTV1"), com.iatspayments.www.NetGate.ProcessACHEFTV1.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">ProcessACHEFTV1Response"));
        oper.setReturnClass(com.iatspayments.www.NetGate.ProcessACHEFTV1Response.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", "ProcessACHEFTV1Response"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ProcessCreditCardRefundWithTransactionId");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", "ProcessCreditCardRefundWithTransactionIdV1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">ProcessCreditCardRefundWithTransactionIdV1"), com.iatspayments.www.NetGate.ProcessCreditCardRefundWithTransactionIdV1.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">ProcessCreditCardRefundWithTransactionIdV1Response"));
        oper.setReturnClass(com.iatspayments.www.NetGate.ProcessCreditCardRefundWithTransactionIdV1Response.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", "ProcessCreditCardRefundWithTransactionIdV1Response"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ProcessACHEFTRefundWithTransactionId");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", "ProcessACHEFTRefundWithTransactionIdV1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">ProcessACHEFTRefundWithTransactionIdV1"), com.iatspayments.www.NetGate.ProcessACHEFTRefundWithTransactionIdV1.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">ProcessACHEFTRefundWithTransactionIdV1Response"));
        oper.setReturnClass(com.iatspayments.www.NetGate.ProcessACHEFTRefundWithTransactionIdV1Response.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", "ProcessACHEFTRefundWithTransactionIdV1Response"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ProcessCreditCardBatch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", "ProcessCreditCardBatchV1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">ProcessCreditCardBatchV1"), com.iatspayments.www.NetGate.ProcessCreditCardBatchV1.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">ProcessCreditCardBatchV1Response"));
        oper.setReturnClass(com.iatspayments.www.NetGate.ProcessCreditCardBatchV1Response.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", "ProcessCreditCardBatchV1Response"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ProcessACHEFTChargeBatch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", "ProcessACHEFTChargeBatchV1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">ProcessACHEFTChargeBatchV1"), com.iatspayments.www.NetGate.ProcessACHEFTChargeBatchV1.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">ProcessACHEFTChargeBatchV1Response"));
        oper.setReturnClass(com.iatspayments.www.NetGate.ProcessACHEFTChargeBatchV1Response.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", "ProcessACHEFTChargeBatchV1Response"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ProcessACHEFTRefundBatch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", "ProcessACHEFTRefundBatchV1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">ProcessACHEFTRefundBatchV1"), com.iatspayments.www.NetGate.ProcessACHEFTRefundBatchV1.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">ProcessACHEFTRefundBatchV1Response"));
        oper.setReturnClass(com.iatspayments.www.NetGate.ProcessACHEFTRefundBatchV1Response.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", "ProcessACHEFTRefundBatchV1Response"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetBatchProcessResultFile");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", "GetBatchProcessResultFileV1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">GetBatchProcessResultFileV1"), com.iatspayments.www.NetGate.GetBatchProcessResultFileV1.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">GetBatchProcessResultFileV1Response"));
        oper.setReturnClass(com.iatspayments.www.NetGate.GetBatchProcessResultFileV1Response.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", "GetBatchProcessResultFileV1Response"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[11] = oper;

    }

    public ProcessLinkSoapStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public ProcessLinkSoapStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public ProcessLinkSoapStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
            qName = new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">>CreateCustomerCodeAndProcessACHEFTV1Response>CreateCustomerCodeAndProcessACHEFTV1Result");
            cachedSerQNames.add(qName);
            cls = com.iatspayments.www.NetGate.CreateCustomerCodeAndProcessACHEFTV1ResponseCreateCustomerCodeAndProcessACHEFTV1Result.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">>CreateCustomerCodeAndProcessCreditCardV1Response>CreateCustomerCodeAndProcessCreditCardV1Result");
            cachedSerQNames.add(qName);
            cls = com.iatspayments.www.NetGate.CreateCustomerCodeAndProcessCreditCardV1ResponseCreateCustomerCodeAndProcessCreditCardV1Result.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">>GetBatchProcessResultFileV1Response>GetBatchProcessResultFileV1Result");
            cachedSerQNames.add(qName);
            cls = com.iatspayments.www.NetGate.GetBatchProcessResultFileV1ResponseGetBatchProcessResultFileV1Result.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">>ProcessACHEFTChargeBatchV1Response>ProcessACHEFTChargeBatchV1Result");
            cachedSerQNames.add(qName);
            cls = com.iatspayments.www.NetGate.ProcessACHEFTChargeBatchV1ResponseProcessACHEFTChargeBatchV1Result.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">>ProcessACHEFTRefundBatchV1Response>ProcessACHEFTRefundBatchV1Result");
            cachedSerQNames.add(qName);
            cls = com.iatspayments.www.NetGate.ProcessACHEFTRefundBatchV1ResponseProcessACHEFTRefundBatchV1Result.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">>ProcessACHEFTRefundWithTransactionIdV1Response>ProcessACHEFTRefundWithTransactionIdV1Result");
            cachedSerQNames.add(qName);
            cls = com.iatspayments.www.NetGate.ProcessACHEFTRefundWithTransactionIdV1ResponseProcessACHEFTRefundWithTransactionIdV1Result.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">>ProcessACHEFTV1Response>ProcessACHEFTV1Result");
            cachedSerQNames.add(qName);
            cls = com.iatspayments.www.NetGate.ProcessACHEFTV1ResponseProcessACHEFTV1Result.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">>ProcessACHEFTWithCustomerCodeV1Response>ProcessACHEFTWithCustomerCodeV1Result");
            cachedSerQNames.add(qName);
            cls = com.iatspayments.www.NetGate.ProcessACHEFTWithCustomerCodeV1ResponseProcessACHEFTWithCustomerCodeV1Result.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">>ProcessCreditCardBatchV1Response>ProcessCreditCardBatchV1Result");
            cachedSerQNames.add(qName);
            cls = com.iatspayments.www.NetGate.ProcessCreditCardBatchV1ResponseProcessCreditCardBatchV1Result.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">>ProcessCreditCardRefundWithTransactionIdV1Response>ProcessCreditCardRefundWithTransactionIdV1Result");
            cachedSerQNames.add(qName);
            cls = com.iatspayments.www.NetGate.ProcessCreditCardRefundWithTransactionIdV1ResponseProcessCreditCardRefundWithTransactionIdV1Result.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">>ProcessCreditCardV1Response>ProcessCreditCardV1Result");
            cachedSerQNames.add(qName);
            cls = com.iatspayments.www.NetGate.ProcessCreditCardV1ResponseProcessCreditCardV1Result.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">>ProcessCreditCardWithCustomerCodeV1Response>ProcessCreditCardWithCustomerCodeV1Result");
            cachedSerQNames.add(qName);
            cls = com.iatspayments.www.NetGate.ProcessCreditCardWithCustomerCodeV1ResponseProcessCreditCardWithCustomerCodeV1Result.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">CreateCustomerCodeAndProcessACHEFTV1");
            cachedSerQNames.add(qName);
            cls = com.iatspayments.www.NetGate.CreateCustomerCodeAndProcessACHEFTV1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">CreateCustomerCodeAndProcessACHEFTV1Response");
            cachedSerQNames.add(qName);
            cls = com.iatspayments.www.NetGate.CreateCustomerCodeAndProcessACHEFTV1Response.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">CreateCustomerCodeAndProcessCreditCardV1");
            cachedSerQNames.add(qName);
            cls = com.iatspayments.www.NetGate.CreateCustomerCodeAndProcessCreditCardV1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">CreateCustomerCodeAndProcessCreditCardV1Response");
            cachedSerQNames.add(qName);
            cls = com.iatspayments.www.NetGate.CreateCustomerCodeAndProcessCreditCardV1Response.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">GetBatchProcessResultFileV1");
            cachedSerQNames.add(qName);
            cls = com.iatspayments.www.NetGate.GetBatchProcessResultFileV1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">GetBatchProcessResultFileV1Response");
            cachedSerQNames.add(qName);
            cls = com.iatspayments.www.NetGate.GetBatchProcessResultFileV1Response.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">ProcessACHEFTChargeBatchV1");
            cachedSerQNames.add(qName);
            cls = com.iatspayments.www.NetGate.ProcessACHEFTChargeBatchV1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">ProcessACHEFTChargeBatchV1Response");
            cachedSerQNames.add(qName);
            cls = com.iatspayments.www.NetGate.ProcessACHEFTChargeBatchV1Response.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">ProcessACHEFTRefundBatchV1");
            cachedSerQNames.add(qName);
            cls = com.iatspayments.www.NetGate.ProcessACHEFTRefundBatchV1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">ProcessACHEFTRefundBatchV1Response");
            cachedSerQNames.add(qName);
            cls = com.iatspayments.www.NetGate.ProcessACHEFTRefundBatchV1Response.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">ProcessACHEFTRefundWithTransactionIdV1");
            cachedSerQNames.add(qName);
            cls = com.iatspayments.www.NetGate.ProcessACHEFTRefundWithTransactionIdV1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">ProcessACHEFTRefundWithTransactionIdV1Response");
            cachedSerQNames.add(qName);
            cls = com.iatspayments.www.NetGate.ProcessACHEFTRefundWithTransactionIdV1Response.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">ProcessACHEFTV1");
            cachedSerQNames.add(qName);
            cls = com.iatspayments.www.NetGate.ProcessACHEFTV1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">ProcessACHEFTV1Response");
            cachedSerQNames.add(qName);
            cls = com.iatspayments.www.NetGate.ProcessACHEFTV1Response.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">ProcessACHEFTWithCustomerCodeV1");
            cachedSerQNames.add(qName);
            cls = com.iatspayments.www.NetGate.ProcessACHEFTWithCustomerCodeV1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">ProcessACHEFTWithCustomerCodeV1Response");
            cachedSerQNames.add(qName);
            cls = com.iatspayments.www.NetGate.ProcessACHEFTWithCustomerCodeV1Response.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">ProcessCreditCardBatchV1");
            cachedSerQNames.add(qName);
            cls = com.iatspayments.www.NetGate.ProcessCreditCardBatchV1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">ProcessCreditCardBatchV1Response");
            cachedSerQNames.add(qName);
            cls = com.iatspayments.www.NetGate.ProcessCreditCardBatchV1Response.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">ProcessCreditCardRefundWithTransactionIdV1");
            cachedSerQNames.add(qName);
            cls = com.iatspayments.www.NetGate.ProcessCreditCardRefundWithTransactionIdV1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">ProcessCreditCardRefundWithTransactionIdV1Response");
            cachedSerQNames.add(qName);
            cls = com.iatspayments.www.NetGate.ProcessCreditCardRefundWithTransactionIdV1Response.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">ProcessCreditCardV1");
            cachedSerQNames.add(qName);
            cls = com.iatspayments.www.NetGate.ProcessCreditCardV1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">ProcessCreditCardV1Response");
            cachedSerQNames.add(qName);
            cls = com.iatspayments.www.NetGate.ProcessCreditCardV1Response.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">ProcessCreditCardWithCustomerCodeV1");
            cachedSerQNames.add(qName);
            cls = com.iatspayments.www.NetGate.ProcessCreditCardWithCustomerCodeV1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.iatspayments.com/NetGate/", ">ProcessCreditCardWithCustomerCodeV1Response");
            cachedSerQNames.add(qName);
            cls = com.iatspayments.www.NetGate.ProcessCreditCardWithCustomerCodeV1Response.class;
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

    public com.iatspayments.www.NetGate.CreateCustomerCodeAndProcessCreditCardV1Response createCustomerCodeAndProcessCreditCard(com.iatspayments.www.NetGate.CreateCustomerCodeAndProcessCreditCardV1 parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://www.iatspayments.com/NetGate/CreateCustomerCodeAndProcessCreditCardV1");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CreateCustomerCodeAndProcessCreditCard"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.iatspayments.www.NetGate.CreateCustomerCodeAndProcessCreditCardV1Response) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.iatspayments.www.NetGate.CreateCustomerCodeAndProcessCreditCardV1Response) org.apache.axis.utils.JavaUtils.convert(_resp, com.iatspayments.www.NetGate.CreateCustomerCodeAndProcessCreditCardV1Response.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.iatspayments.www.NetGate.ProcessCreditCardWithCustomerCodeV1Response processCreditCardWithCustomerCode(com.iatspayments.www.NetGate.ProcessCreditCardWithCustomerCodeV1 parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://www.iatspayments.com/NetGate/ProcessCreditCardWithCustomerCodeV1");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ProcessCreditCardWithCustomerCode"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.iatspayments.www.NetGate.ProcessCreditCardWithCustomerCodeV1Response) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.iatspayments.www.NetGate.ProcessCreditCardWithCustomerCodeV1Response) org.apache.axis.utils.JavaUtils.convert(_resp, com.iatspayments.www.NetGate.ProcessCreditCardWithCustomerCodeV1Response.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.iatspayments.www.NetGate.ProcessCreditCardV1Response processCreditCard(com.iatspayments.www.NetGate.ProcessCreditCardV1 parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://www.iatspayments.com/NetGate/ProcessCreditCardV1");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ProcessCreditCard"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.iatspayments.www.NetGate.ProcessCreditCardV1Response) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.iatspayments.www.NetGate.ProcessCreditCardV1Response) org.apache.axis.utils.JavaUtils.convert(_resp, com.iatspayments.www.NetGate.ProcessCreditCardV1Response.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.iatspayments.www.NetGate.CreateCustomerCodeAndProcessACHEFTV1Response createCustomerCodeAndProcessACHEFT(com.iatspayments.www.NetGate.CreateCustomerCodeAndProcessACHEFTV1 parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://www.iatspayments.com/NetGate/CreateCustomerCodeAndProcessACHEFTV1");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CreateCustomerCodeAndProcessACHEFT"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.iatspayments.www.NetGate.CreateCustomerCodeAndProcessACHEFTV1Response) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.iatspayments.www.NetGate.CreateCustomerCodeAndProcessACHEFTV1Response) org.apache.axis.utils.JavaUtils.convert(_resp, com.iatspayments.www.NetGate.CreateCustomerCodeAndProcessACHEFTV1Response.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.iatspayments.www.NetGate.ProcessACHEFTWithCustomerCodeV1Response processACHEFTWithCustomerCode(com.iatspayments.www.NetGate.ProcessACHEFTWithCustomerCodeV1 parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://www.iatspayments.com/NetGate/ProcessACHEFTWithCustomerCodeV1");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ProcessACHEFTWithCustomerCode"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.iatspayments.www.NetGate.ProcessACHEFTWithCustomerCodeV1Response) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.iatspayments.www.NetGate.ProcessACHEFTWithCustomerCodeV1Response) org.apache.axis.utils.JavaUtils.convert(_resp, com.iatspayments.www.NetGate.ProcessACHEFTWithCustomerCodeV1Response.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.iatspayments.www.NetGate.ProcessACHEFTV1Response processACHEFT(com.iatspayments.www.NetGate.ProcessACHEFTV1 parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://www.iatspayments.com/NetGate/ProcessACHEFTV1");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ProcessACHEFT"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.iatspayments.www.NetGate.ProcessACHEFTV1Response) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.iatspayments.www.NetGate.ProcessACHEFTV1Response) org.apache.axis.utils.JavaUtils.convert(_resp, com.iatspayments.www.NetGate.ProcessACHEFTV1Response.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.iatspayments.www.NetGate.ProcessCreditCardRefundWithTransactionIdV1Response processCreditCardRefundWithTransactionId(com.iatspayments.www.NetGate.ProcessCreditCardRefundWithTransactionIdV1 parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://www.iatspayments.com/NetGate/ProcessCreditCardRefundWithTransactionIdV1");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ProcessCreditCardRefundWithTransactionId"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.iatspayments.www.NetGate.ProcessCreditCardRefundWithTransactionIdV1Response) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.iatspayments.www.NetGate.ProcessCreditCardRefundWithTransactionIdV1Response) org.apache.axis.utils.JavaUtils.convert(_resp, com.iatspayments.www.NetGate.ProcessCreditCardRefundWithTransactionIdV1Response.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.iatspayments.www.NetGate.ProcessACHEFTRefundWithTransactionIdV1Response processACHEFTRefundWithTransactionId(com.iatspayments.www.NetGate.ProcessACHEFTRefundWithTransactionIdV1 parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://www.iatspayments.com/NetGate/ProcessACHEFTRefundWithTransactionIdV1");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ProcessACHEFTRefundWithTransactionId"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.iatspayments.www.NetGate.ProcessACHEFTRefundWithTransactionIdV1Response) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.iatspayments.www.NetGate.ProcessACHEFTRefundWithTransactionIdV1Response) org.apache.axis.utils.JavaUtils.convert(_resp, com.iatspayments.www.NetGate.ProcessACHEFTRefundWithTransactionIdV1Response.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.iatspayments.www.NetGate.ProcessCreditCardBatchV1Response processCreditCardBatch(com.iatspayments.www.NetGate.ProcessCreditCardBatchV1 parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://www.iatspayments.com/NetGate/ProcessCreditCardBatchV1");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ProcessCreditCardBatch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.iatspayments.www.NetGate.ProcessCreditCardBatchV1Response) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.iatspayments.www.NetGate.ProcessCreditCardBatchV1Response) org.apache.axis.utils.JavaUtils.convert(_resp, com.iatspayments.www.NetGate.ProcessCreditCardBatchV1Response.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.iatspayments.www.NetGate.ProcessACHEFTChargeBatchV1Response processACHEFTChargeBatch(com.iatspayments.www.NetGate.ProcessACHEFTChargeBatchV1 parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://www.iatspayments.com/NetGate/ProcessACHEFTChargeBatchV1");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ProcessACHEFTChargeBatch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.iatspayments.www.NetGate.ProcessACHEFTChargeBatchV1Response) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.iatspayments.www.NetGate.ProcessACHEFTChargeBatchV1Response) org.apache.axis.utils.JavaUtils.convert(_resp, com.iatspayments.www.NetGate.ProcessACHEFTChargeBatchV1Response.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.iatspayments.www.NetGate.ProcessACHEFTRefundBatchV1Response processACHEFTRefundBatch(com.iatspayments.www.NetGate.ProcessACHEFTRefundBatchV1 parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://www.iatspayments.com/NetGate/ProcessACHEFTRefundBatchV1");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ProcessACHEFTRefundBatch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.iatspayments.www.NetGate.ProcessACHEFTRefundBatchV1Response) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.iatspayments.www.NetGate.ProcessACHEFTRefundBatchV1Response) org.apache.axis.utils.JavaUtils.convert(_resp, com.iatspayments.www.NetGate.ProcessACHEFTRefundBatchV1Response.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.iatspayments.www.NetGate.GetBatchProcessResultFileV1Response getBatchProcessResultFile(com.iatspayments.www.NetGate.GetBatchProcessResultFileV1 parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://www.iatspayments.com/NetGate/GetBatchProcessResultFileV1");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetBatchProcessResultFile"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.iatspayments.www.NetGate.GetBatchProcessResultFileV1Response) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.iatspayments.www.NetGate.GetBatchProcessResultFileV1Response) org.apache.axis.utils.JavaUtils.convert(_resp, com.iatspayments.www.NetGate.GetBatchProcessResultFileV1Response.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
