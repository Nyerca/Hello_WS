package app;

import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.List;

// imports...
@WebService
public interface HelloWorld {
    String hello(@WebParam(name = "text") String text);
    List<Integer> getList(@WebParam(name = "middle") int middle);
}