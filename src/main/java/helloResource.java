import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class helloResource {
    @GetMapping (path = "/api/hello")
    public String hello(){
        return "Hello world from the server";
    }
}


