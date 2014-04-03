package bton.swm60.endpoint;

import javax.xml.ws.Endpoint;
import bton.swm60.ws.HelloWorldImpl;

//Endpoint publisher
public class HelloWorldPublisher{

	public static void main(String[] args){ 
		Endpoint.publish("http://localhost:9999/ws/hello", new HelloWorldImpl());
	}
}
