package com.hogs_on_wheels.Backend;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserEntity, Long> {

  UserEntity findById(long id);
  UserEntity findByName(String name);
  List<UserEntity> findByAddress(String address);
  List<UserEntity> findByCity(String city);
  List<UserEntity> findByState(String state);
  List<UserEntity> findByZip(int zip);
  UserEntity findByPhone(String phone);
  
}