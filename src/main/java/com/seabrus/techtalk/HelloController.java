package com.seabrus.techtalk;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

  @RequestMapping("/")
  public String index() {
    return "Greetings from Spring Boot!";
  }

  @GetMapping("/cenas")
  public String cenas() {
    return "Greetings meu carocho!";
  }

  @PostMapping("/")
  public String post() {
    return "Greetings from Spring Post!";
  }

}