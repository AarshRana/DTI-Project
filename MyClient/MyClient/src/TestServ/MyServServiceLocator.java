/**
 * MyServServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package TestServ;

public class MyServServiceLocator extends org.apache.axis.client.Service implements TestServ.MyServService {

    public MyServServiceLocator() {
    }


    public MyServServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public MyServServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for MyServPort
    private java.lang.String MyServPort_address = "http://localhost:8888/testWS";

    public java.lang.String getMyServPortAddress() {
        return MyServPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String MyServPortWSDDServiceName = "MyServPort";

    public java.lang.String getMyServPortWSDDServiceName() {
        return MyServPortWSDDServiceName;
    }

    public void setMyServPortWSDDServiceName(java.lang.String name) {
        MyServPortWSDDServiceName = name;
    }

    public TestServ.MyServ getMyServPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(MyServPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getMyServPort(endpoint);
    }

    public TestServ.MyServ getMyServPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            TestServ.MyServPortBindingStub _stub = new TestServ.MyServPortBindingStub(portAddress, this);
            _stub.setPortName(getMyServPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setMyServPortEndpointAddress(java.lang.String address) {
        MyServPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (TestServ.MyServ.class.isAssignableFrom(serviceEndpointInterface)) {
                TestServ.MyServPortBindingStub _stub = new TestServ.MyServPortBindingStub(new java.net.URL(MyServPort_address), this);
                _stub.setPortName(getMyServPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("MyServPort".equals(inputPortName)) {
            return getMyServPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://TestServ/", "MyServService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://TestServ/", "MyServPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("MyServPort".equals(portName)) {
            setMyServPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
