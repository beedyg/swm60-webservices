package bton.swm60.ws;

import javax.jws.WebService;

//Service Implementation
@WebService(endpointInterface = "bton.swm60.ws.HelloWorld")
public class HelloWorldImpl implements HelloWorld{

	@Override
	public String getHelloWorldAsString(String name) {
		return "Invoked Web Services returns: " + name;
	}

}
