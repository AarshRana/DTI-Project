/**
 * MyServService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package TestServ;

public interface MyServService extends javax.xml.rpc.Service {
    public java.lang.String getMyServPortAddress();

    public TestServ.MyServ getMyServPort() throws javax.xml.rpc.ServiceException;

    public TestServ.MyServ getMyServPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
