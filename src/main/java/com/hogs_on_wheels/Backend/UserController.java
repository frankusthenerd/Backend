package com.hogs_on_wheels.Backend;

import org.apache.tomcat.util.json.JSONParser;
// import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

  @PostMapping("/user")
  public User user(@RequestParam(value = "name", defaultValue = "", required = true) String name,
                   @RequestParam(value = "address", defaultValue = "", required = true) String address,
                   @RequestParam(value = "city", defaultValue = "", required = true) String city,
                   @RequestParam(value = "state", defaultValue = "", required = true) String state,
                   @RequestParam(value = "zip", defaultValue = "0", required = true) Integer zip,
                   @RequestParam(value = "phone", defaultValue = "", required = true) String phone) {
                     return new User(name, address, city, state, zip, phone);
                   }

  @PostMapping("/test")
  public Test test(@RequestBody String body) {;
    return new Test(body);
  }

}

