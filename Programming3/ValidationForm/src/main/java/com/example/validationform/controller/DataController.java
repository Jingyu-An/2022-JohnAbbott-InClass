package com.example.validationform.controller;

import com.example.validationform.dao.UserDataRepo;
import com.example.validationform.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
public class DataController {
  
  @Autowired
  UserDataRepo repo;
  
  @RequestMapping("/")
  public String home(Model model) {
    
    System.out.println("Starting register");
    
    User user = new User();
    model.addAttribute("user", user);
    
    return "register_form";
  }
  
  @PostMapping("/register")
  public String submitForm(@Valid @ModelAttribute("user") User user, BindingResult bindingResult) {
    
    if (bindingResult.hasErrors()) {
      return "register_form";
    }
    
    if (!user.getPassword().equals(user.getRePassword())) {
      bindingResult.rejectValue("rePassword", "required", "Enter the same password!!");
      return "register_form";
    }
    
    repo.save(user);
    return "register_success";
  }
}
