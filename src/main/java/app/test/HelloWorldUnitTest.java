package app.test;

import app.HelloWorld;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;

// imports...
public class HelloWorldUnitTest {
    public static void main(String[] args) {
        /*
        JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
        factory.setServiceClass(HelloWorld.class);
        factory.setAddress("http://localhost:9000/helloWorld");
*/

        URL wsdlURL = null;
        try {
            wsdlURL = new URL("http://localhost:9000/helloWorld?wsdl");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        QName qn = new QName("http://app/", "HelloWorld");
        Service service = Service.create(wsdlURL, qn);
        HelloWorld client = service.getPort(HelloWorld.class);
        String reply = client.hello("Testing it!");
        System.out.println("Server said: " + reply);
        System.exit(0);
    }
}
