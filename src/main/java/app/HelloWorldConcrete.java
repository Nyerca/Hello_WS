package app;

import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

// imports...
@WebService(
        endpointInterface = "app.HelloWorld",
        serviceName = "HelloWorld"
)
public class HelloWorldConcrete implements HelloWorld {

    public String hello(@WebParam(name = "text") String text) {
        System.out.println("Receiving text... "+text);
        return "HELLO: "+text;
    }

    public List<Integer> getList(@WebParam(name = "middle") int middle) {
        List<Integer> list = new LinkedList<Integer>();
        Random r = new Random();
        list.add(r.nextInt());
        list.add(middle);
        list.add(r.nextInt());
        return list;
    }
}