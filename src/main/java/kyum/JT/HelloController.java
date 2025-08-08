package kyum.JT;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

  private String message ="Hello Kyumin Jenkins CICD Success";

  @GetMapping("/hello")
  public String sayHello(){
    return this.message;
  }
}
