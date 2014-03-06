/**
 * WSService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package wsdemo.cls.ws;

public interface WSService extends javax.xml.rpc.Service {
    public java.lang.String getWSAddress();

    public wsdemo.cls.ws.WS_PortType getWS() throws javax.xml.rpc.ServiceException;

    public wsdemo.cls.ws.WS_PortType getWS(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
