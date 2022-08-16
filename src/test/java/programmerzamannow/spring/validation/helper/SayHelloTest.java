package programmerzamannow.spring.validation.helper;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.validation.ConstraintViolationException;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SayHelloTest {

  @Autowired
  private SayHello sayHello;

  @Test
  void testSuccess() {
    String message = sayHello.sayHello("Bima");
    Assertions.assertEquals("Hello Bima", message);
  }

  @Test
  void testError() {
    Assertions.assertThrows(ConstraintViolationException.class, () -> {
      sayHello.sayHello("");
    });
  }
}