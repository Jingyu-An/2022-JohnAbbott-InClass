package com.example.userregistration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.Arrays;
import java.util.List;

@Controller
public class UserController {
  
  @Autowired
  private UserRepository userRepo;
  
  @RequestMapping("/")
  public String home(){
    return "home";
  }
  
  @GetMapping("/register")
  public String showForm(Model model){
    
    User user = new User();
    model.addAttribute("user", user);
    
    List<String> professionList = Arrays.asList("Developers", "Teacher", "Engineer", "Programmer");
    model.addAttribute("professionList", professionList);
    
    return "register";
  }
  
  @PostMapping("/register")
  public String submitForm(@Valid @ModelAttribute("user") User user, BindingResult bindingResult, Model model){
  
  
    System.out.println("register--1");
    if(bindingResult.hasErrors()) {
      List<String>  professionList = Arrays.asList("Developers", "Designers","Programmers","Architecture");
      model.addAttribute("professionList",professionList);
      System.out.println("register--2");
      return "register";
    }
  
    System.out.println("register--3");
    BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
    String encodedPassword = passwordEncoder.encode(user.getPassword());
    user.setPassword(encodedPassword);
  
    System.out.println("register--4");
    userRepo.save(user);
  
    System.out.println("register--5");
    return "register_success";
  }
  
  @GetMapping("/welcome")
  public String welcome() {
    return "welcome";
  }
}
