/**
 * MyServ.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package TestServ;

import javax.jws.WebService;
@WebService(wsdlLocation =
	      "http://localhost:8888/testWS?WSDL")
public interface MyServ extends java.rmi.Remote {
    public java.lang.String sayHello(java.lang.String arg0) throws java.rmi.RemoteException;
}
