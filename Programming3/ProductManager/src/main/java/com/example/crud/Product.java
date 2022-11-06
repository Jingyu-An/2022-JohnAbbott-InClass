package com.example.crud;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Product {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private String name;
  private String brand;
  private String madein;
  private double price;
  
  //purchased date
  @DateTimeFormat(pattern = "yyyy-MM-dd")
  private Date purchasedDate;
  //product model
  private String productModel;
  //product serial number
  private String serialNumber;
  
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
  
  public String getBrand() {
    return brand;
  }
  
  public void setBrand(String brand) {
    this.brand = brand;
  }
  
  public String getMadein() {
    return madein;
  }
  
  public void setMadein(String madein) {
    this.madein = madein;
  }
  
  public double getPrice() {
    return price;
  }
  
  public void setPrice(double price) {
    this.price = price;
  }
  
  public Date getPurchasedDate() {
    return purchasedDate;
  }
  
  public void setPurchasedDate(Date purchasedDate) {
    this.purchasedDate = purchasedDate;
  }
  
  public String getProductModel() {
    return productModel;
  }
  
  public void setProductModel(String productModel) {
    this.productModel = productModel;
  }
  
  public String getSerialNumber() {
    return serialNumber;
  }
  
  public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
  }
}
