package com.example.userregistration;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.Date;

@Entity
@Table(name = "userDatabase")
public class User {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  
  @NotBlank
  @Size(min = 3, max = 50, message = "Size must be between 3 and 50")
  @Column(nullable = false, length = 60)
  private String fullName;
  
  @NotBlank(message = "Must not be blank")
  @Email
  @Column(nullable = false, unique = true, length = 100)
  private String email;
  
  @NotBlank(message = "Must not be blank")
  @Column(nullable = false, length = 64)
  private String password;
  
  @DateTimeFormat(pattern = "yyyy-MM-dd")
  @Column(nullable = false, length = 20)
  private Date birthday;
  
  @Min(value = 10000000, message = "Must be exactly 8 characters long")
  @Max(value = 99999999, message = "Must be exactly 8 characters long")
  private long cellphone;
  
  @NotBlank
  @Column(nullable = false, length =20)
  private String profession;
  
  @Min(value = 20000, message = "ust be within the range from 20K to 200K")
  @Max(value = 200000, message = "Must be within the range from 20K to 200K")
  @Column(nullable = false, length =20)
  private long income;
  
  public long getId() {
    return id;
  }
  
  public void setId(long id) {
    this.id = id;
  }
  
  public String getFullName() {
    return fullName;
  }
  
  public void setFullName(String fullName) {
    this.fullName = fullName;
  }
  
  public String getEmail() {
    return email;
  }
  
  public void setEmail(String email) {
    this.email = email;
  }
  
  public String getPassword() {
    return password;
  }
  
  public void setPassword(String password) {
    this.password = password;
  }
  
  public Date getBirthday() {
    return birthday;
  }
  
  public void setBirthday(Date birthday) {
    this.birthday = birthday;
  }
  
  public long getCellphone() {
    return cellphone;
  }
  
  public void setCellphone(long cellphone) {
    this.cellphone = cellphone;
  }
  
  public String getProfession() {
    return profession;
  }
  
  public void setProfession(String profession) {
    this.profession = profession;
  }
  
  public long getIncome() {
    return income;
  }
  
  public void setIncome(long income) {
    this.income = income;
  }
}
