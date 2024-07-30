package com.hogs_on_wheels.Backend;

public class UserData {

  private String name;
  private String address;
  private String city;
  private String state;
  private int zip;
  private String phone;

  public UserData(String name, String address, String city, String state, int zip, String phone) {
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

  public void setName(String name) {
    this.name = name;
  }

  public String getAddress() {
    return this.address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getCity() {
    return this.city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getState() {
    return this.state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public int getZip() {
    return this.zip;
  }

  public void setZip(int zip) {
    this.zip = zip;
  }

  public String getPhone() {
    return this.phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

}
