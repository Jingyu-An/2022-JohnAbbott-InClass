package com.example.validationform.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.*;

@Entity
public class User {
  
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;
  
  @NotBlank
  @Email(message = "Please enter a valid email address")
  private String email;
  
  @NotBlank
  @Size(min = 10, max = 20)
  private String password;
  
  @NotBlank
  private String rePassword;
  
  @NotBlank
  @Size(min = 5, max = 15)
  private String firstName;
  
  @NotBlank
  @Size(min = 5, max = 15)
  private String lastName;
  
  @NotBlank
  @Size(min = 10, max = 10, message = "Phone number is a long of 10 digits")
  private String phone;
  
  @NotBlank
  @Size(max = 30)
  private String address;
  
  @Size(max = 30)
  private String addressAdd;
  
  @Size(max = 30)
  private String town;
  
  @NotBlank
  @Size(max = 30)
  private String region;
  
  @NotBlank
  @Size(max = 30)
  private String postcode;
  
  @NotBlank
  @Size(max = 30)
  private String country;
  
  public int getId() {
    return id;
  }
  
  public String getEmail() {
    return email;
  }
  
  public String getPassword() {
    return password;
  }
  
  public String getRePassword() {
    return rePassword;
  }
  
  public String getFirstName() {
    return firstName;
  }
  
  public String getLastName() {
    return lastName;
  }
  
  public String getPhone() {
    return phone;
  }
  
  public String getAddress() {
    return address;
  }
  
  public String getAddressAdd() {
    return addressAdd;
  }
  
  public String getTown() {
    return town;
  }
  
  public String getRegion() {
    return region;
  }
  
  public String getPostcode() {
    return postcode;
  }
  
  public String getCountry() {
    return country;
  }
  
  public void setId(int id) {
    this.id = id;
  }
  
  public void setEmail(String email) {
    this.email = email;
  }
  
  public void setPassword(String password) {
    this.password = password;
  }
  
  public void setRePassword(String rePassword) {
    this.rePassword = rePassword;
  }
  
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }
  
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }
  
  public void setPhone(String phone) {
    this.phone = phone;
  }
  
  public void setAddress(String address) {
    this.address = address;
  }
  
  public void setAddressAdd(String addressAdd) {
    this.addressAdd = addressAdd;
  }
  
  public void setTown(String town) {
    this.town = town;
  }
  
  public void setRegion(String region) {
    this.region = region;
  }
  
  public void setPostcode(String postcode) {
    this.postcode = postcode;
  }
  
  public void setCountry(String country) {
    this.country = country;
  }
  
  @Override
  public String toString() {
    return "User{" +
        "id=" + id +
        ", email='" + email + '\'' +
        ", password='" + password + '\'' +
        ", passwordChecker='" + rePassword + '\'' +
        ", firstName='" + firstName + '\'' +
        ", lastName='" + lastName + '\'' +
        ", phone='" + phone + '\'' +
        ", address='" + address + '\'' +
        ", addressAdd='" + addressAdd + '\'' +
        ", town='" + town + '\'' +
        ", region='" + region + '\'' +
        ", postcode='" + postcode + '\'' +
        ", country='" + country + '\'' +
        '}';
  }
}
