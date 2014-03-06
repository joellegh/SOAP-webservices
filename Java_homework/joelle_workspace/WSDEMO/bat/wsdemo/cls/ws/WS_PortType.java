/**
 * WS_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package wsdemo.cls.ws;

public interface WS_PortType extends java.rmi.Remote {
    public int add(int n1, int n2) throws java.rmi.RemoteException;
    public java.lang.String authenticate(java.lang.String usercode, java.lang.String password) throws java.rmi.RemoteException;
    public java.lang.String sayHello() throws java.rmi.RemoteException;
}
