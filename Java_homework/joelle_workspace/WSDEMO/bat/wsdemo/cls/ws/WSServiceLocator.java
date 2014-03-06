/**
 * WSServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package wsdemo.cls.ws;

public class WSServiceLocator extends org.apache.axis.client.Service implements wsdemo.cls.ws.WSService {

    public WSServiceLocator() {
    }


    public WSServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public WSServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for WS
    private java.lang.String WS_address = "http://localhost:8080/WSDEMO/services/WS";

    public java.lang.String getWSAddress() {
        return WS_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String WSWSDDServiceName = "WS";

    public java.lang.String getWSWSDDServiceName() {
        return WSWSDDServiceName;
    }

    public void setWSWSDDServiceName(java.lang.String name) {
        WSWSDDServiceName = name;
    }

    public wsdemo.cls.ws.WS_PortType getWS() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(WS_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getWS(endpoint);
    }

    public wsdemo.cls.ws.WS_PortType getWS(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            wsdemo.cls.ws.WSSoapBindingStub _stub = new wsdemo.cls.ws.WSSoapBindingStub(portAddress, this);
            _stub.setPortName(getWSWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setWSEndpointAddress(java.lang.String address) {
        WS_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (wsdemo.cls.ws.WS_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                wsdemo.cls.ws.WSSoapBindingStub _stub = new wsdemo.cls.ws.WSSoapBindingStub(new java.net.URL(WS_address), this);
                _stub.setPortName(getWSWSDDServiceName());
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
        if ("WS".equals(inputPortName)) {
            return getWS();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:WS", "WSService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:WS", "WS"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("WS".equals(portName)) {
            setWSEndpointAddress(address);
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
