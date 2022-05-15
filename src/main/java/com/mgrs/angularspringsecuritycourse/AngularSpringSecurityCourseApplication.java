package com.mgrs.angularspringsecuritycourse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@SpringBootApplication
@Controller
public class AngularSpringSecurityCourseApplication {

  public static void main(String[] args) {
    SpringApplication.run(AngularSpringSecurityCourseApplication.class, args);
  }

  @RequestMapping("/resource")
  public Map<String, Object> home() {
    Map<String, Object> model =
      new HashMap<String, Object>();
    model.put("id", UUID.randomUUID().toString());
    model.put("content", "Hello World");
    return model;
  }

}
