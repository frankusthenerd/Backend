package com.hogs_on_wheels.Backend;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class UserEntity {
  
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO) // Automatically generate ID.
  private Long id;
  private String name;
  private String address;
  private String city;
  private String state;
  private int zip;
  private String phone;

  protected UserEntity() { // This must be declared but not used.

  }

  public UserEntity(String name, String address, String city, String state, int zip, String phone) {
    this.name = name;
    this.address = address;
    this.city = city;
    this.state = state;
    this.zip = zip;
    this.phone = phone;
  }

  public Long getId() {
    return this.id;
  }

  public String getName() {
    return this.name;
  }

  public String getAddress() {
    return this.address;
  }

  public String getCity() {
    return this.city;
  }

  public String getState() {
    return this.state;
  }

  public int getZip() {
    return this.zip;
  }

  public String getPhone() {
    return this.phone;
  }

}
