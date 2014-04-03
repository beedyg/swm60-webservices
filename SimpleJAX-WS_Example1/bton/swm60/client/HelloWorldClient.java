package bton.swm60.client;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import bton.swm60.ws.HelloWorld;

public class HelloWorldClient{

	public static void main(String[] args) throws Exception {
		URL url = new URL("http://localhost:9999/ws/hello?wsdl");

		//1st argument service URI, 2nd argument is service name
		QName qname = new QName("http://ws.swm60.bton/", "HelloWorldImplService");
		Service service = Service.create(url, qname);
		HelloWorld hello = service.getPort(HelloWorld.class);
		System.out.println(hello.getHelloWorldAsString("First Web Service"));
	}
}
