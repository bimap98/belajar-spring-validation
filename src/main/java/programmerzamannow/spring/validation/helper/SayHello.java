package programmerzamannow.spring.validation.helper;

import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotBlank;

@Component
public class SayHello implements ISayHello {

  public String sayHello(String name) {
    return "Hello " + name;
  }

}
