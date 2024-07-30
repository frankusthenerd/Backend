package com.hogs_on_wheels.Backend;

import com.fasterxml.jackson.annotation.JsonCreator;

public class UserDataFinal {

  private final String name;
  private final String address;
  private final String city;
  private final String state;
  private final int zip;
  private final String phone;

  @JsonCreator
  UserDataFinal(String name, String address, String city, String state, int zip, String phone) {
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
