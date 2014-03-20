package wsdemo.cls.ws;

import java.rmi.Remote;

public class WS implements Remote {

	public String authenticate(String usercode, String password) {
		return "client called this webservice with usercode=" + usercode
				+ " and password=" + password + ".\n\nHello " + usercode + "!";
	}
	
	public int add(int n1, int n2)
	{
		return n1 + n2;
	}
	
	public String sayHello()
	{
		return "Hello";
	}
}
