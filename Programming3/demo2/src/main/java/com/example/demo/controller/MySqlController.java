package com.example.demo.controller;

import com.example.demo.dao.UserDataRepo;
import com.example.demo.model.UserData;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MySqlController {
  
  @Autowired
  UserDataRepo repo;
  
  @RequestMapping("/saveDate")
  public String indexPage() {
    return "index";
  }
  
  @RequestMapping("/welcome")
  @ResponseBody
  public String sayHello(UserData userData) {
    repo.save(userData);
    return "Welcome " + userData.getName() + " and you stay at " + userData.getAddress();
  }
}
