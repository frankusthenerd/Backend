package com.hogs_on_wheels;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class UserEntity {
  
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private long id;
  private String name;
  private String address;
  private String city;
  private String state;
  private int zip;
  private String phone;

  protected UserEntity() {

  }

  public UserEntity(String name, String address, String city, String state, int zip, String phone) {
    this.name = name;
    this.address = address;
    this.city = city;
    this.state = state;
    this.zip = zip;
    this.phone = phone;
  }

  public String getName() {
    return this.name;
  }

  public String getAddress() {
    return this.address;
  }

}
