package com.hogs_on_wheels.Backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
// import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.ArrayList;

@RestController
public class UserController {

  @Autowired
  private UserRepository userRepository;

  @RequestMapping("/user")
  public User user(@RequestParam(value = "name", defaultValue = "", required = true) String name,
                   @RequestParam(value = "address", defaultValue = "", required = true) String address,
                   @RequestParam(value = "city", defaultValue = "", required = true) String city,
                   @RequestParam(value = "state", defaultValue = "", required = true) String state,
                   @RequestParam(value = "zip", defaultValue = "0", required = true) Integer zip,
                   @RequestParam(value = "phone", defaultValue = "", required = true) String phone) {
                     return new User(name, address, city, state, zip, phone);
                   }

  @RequestMapping("/get-user")
  public User getUser(@RequestParam(required = true) String name) {
    UserEntity my_user = this.userRepository.findByName(name);
    if (my_user == null) {
      return new User("", "", "", "", 0, "");
    }
    return new User(my_user.getName(), my_user.getAddress(), my_user.getCity(), my_user.getState(), my_user.getZip(), my_user.getPhone());
  }

  @RequestMapping("/get-user-by-address")
  public List<User> getUserByAddress(@RequestParam(required = true) String address) {
    List<UserEntity> users = this.userRepository.findByAddress(address);
    ArrayList<User> returned_users = new ArrayList<User>();
    for (UserEntity my_user : users) {
      returned_users.add(new User(my_user.getName(), my_user.getAddress(), my_user.getCity(), my_user.getState(), my_user.getZip(), my_user.getPhone()));
    }
    return returned_users;
  }

  @PostMapping("/test")
  public Test test(@RequestBody String body) {
    return new Test(body);
  }

  @PostMapping("/user-store")
  public ResponseEntity<UserData> storeData(@RequestBody UserData data) {
    this.userRepository.save(new UserEntity(data.getName(), data.getAddress(), data.getCity(), data.getState(), data.getZip(), data.getPhone()));
    return ResponseEntity.ok(data);
  }

  @PostMapping("/user-store-final")
  public ResponseEntity<UserDataFinal> storeDataFinal(@RequestBody UserDataFinal data) {
    return ResponseEntity.ok(data);
  }

}

