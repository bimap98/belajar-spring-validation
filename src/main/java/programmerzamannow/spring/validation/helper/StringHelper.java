package programmerzamannow.spring.validation.helper;

import org.springframework.stereotype.Component;

@Component
public class StringHelper {

  public boolean isPalindrome(String name){
    String value = new StringBuilder(name).reverse().toString();
    return value.equals(name);
  }

}
