package app;

import javax.xml.ws.Endpoint;

// imports...
public class HelloWorldPublisher {
    public static void main(String[] args) {
        System.out.println("Starting Server");
        HelloWorld service = new HelloWorldConcrete();
        String address = "http://localhost:9000/helloWorld";
        Endpoint.publish(address, service);
    }
}

/*
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;
public class HelloWorldPublisher {
    public static void main(String[] args) {
        System.out.println("Starting Server");
        HelloWorld service = new HelloWorldConcrete();
        JaxWsServerFactoryBean factory = new JaxWsServerFactoryBean();
        factory.setServiceClass(HelloWorld.class);
        factory.setAddress("http://localhost:9000/helloWorld");
        factory.setServiceBean(service);
        factory.create();
    }
}
 */