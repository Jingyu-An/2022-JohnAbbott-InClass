package com.example.student.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.Date;

@Entity
@Table(name = "userDatabase")
public class Student {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  
  @NotBlank
  @Size(min = 5, max = 15)
  private String name;
  
  @NotBlank
  @Size(min = 8, max = 20)
  private String password;

  @NotBlank
  private String rePassword;
  
  private String savePassword;
  
  @Min(value = 10000000, message = "Phone number must be exactly 8 characters long")
  @Max(value = 99999999, message = "Phone number must be exactly 8 characters long ")
  private long phone;
  
  @NotBlank
  @Email(message = "Please enter a valid email address")
  private String email;
  
  @NotBlank(message = "At least one must be chosen")
  private String gender;
  
  @DateTimeFormat(pattern = "yyyy-MM-dd")
  private Date birthDate;
  
  @NotBlank
  @Size(max = 20)
  private String address;
  
  @Size(max = 20)
  private String addressAdd;

  @NotBlank(message = "At least one must be chosen")
  private String blood;
  
  @NotBlank(message = "At least one must be chosen")
  private String department;
  
  @NotBlank(message = "At least one must be selected")
  private String course;
  
  public long getId() {
    return id;
  }
  
  public void setId(long id) {
    this.id = id;
  }
  
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  public String getPassword() {
    return password;
  }
  
  public void setPassword(String password) {
    this.password = password;
  }
  
  public String getRePassword() {
    return rePassword;
  }
  
  public void setRePassword(String rePassword) {
    this.rePassword = rePassword;
  }
  
  public String getSavePassword() {
    return savePassword;
  }
  
  public void setSavePassword(String savePassword) {
    this.savePassword = savePassword;
  }
  
  public long getPhone() {
    return phone;
  }
  
  public void setPhone(long phone) {
    this.phone = phone;
  }
  
  public String getEmail() {
    return email;
  }
  
  public void setEmail(String email) {
    this.email = email;
  }
  
  public String getGender() {
    return gender;
  }
  
  public void setGender(String gender) {
    this.gender = gender;
  }
  
  public Date getBirthDate() {
    return birthDate;
  }
  
  public void setBirthDate(Date birthDate) {
    this.birthDate = birthDate;
  }
  
  public String getAddress() {
    return address;
  }
  
  public void setAddress(String address) {
    this.address = address;
  }
  
  public String getAddressAdd() {
    return addressAdd;
  }
  
  public void setAddressAdd(String addressAdd) {
    this.addressAdd = addressAdd;
  }
  
  public String getBlood() {
    return blood;
  }
  
  public void setBlood(String blood) {
    this.blood = blood;
  }
  
  public String getDepartment() {
    return department;
  }
  
  public void setDepartment(String department) {
    this.department = department;
  }
  
  public String getCourse() {
    return course;
  }
  
  public void setCourse(String course) {
    this.course = course;
  }
}
