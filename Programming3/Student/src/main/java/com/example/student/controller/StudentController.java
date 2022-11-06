package com.example.student.controller;


import com.example.student.model.Student;
import com.example.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.Arrays;
import java.util.List;


@Controller
public class StudentController {
  
  @Autowired
  private StudentService service;
  
  public void init(Model model, Student student) {
    
    model.addAttribute("student", student);
    
    List<String> genderList = Arrays.asList("Male", "Female", "Other");
    model.addAttribute("genderList", genderList);
    
    List<String> bloodList = Arrays.asList("A+", "B+", "O+", "AB+", "A-", "B-", "O-", "AB-");
    model.addAttribute("bloodList", bloodList);
    
    List<String> departmentList = Arrays.asList("CSE", "EEE", "BBA");
    model.addAttribute("departmentList", departmentList);
    
    List<String> courseList = Arrays.asList("C", "C++", "Java", "AI", "Machine learning", "Robotics");
    model.addAttribute("courseList", courseList);
  }
  
  @RequestMapping("/")
  public String home() {
    return "home";
  }
  
  @RequestMapping("/register")
  public String submitForm(Model model) {
    
    Student student = new Student();
    init(model, student);
    
    return "signup";
  }
  
  
  @RequestMapping(value = "/save", method = RequestMethod.POST)
  public String saveProduct(@Valid @ModelAttribute("student") Student student, BindingResult bindingResult, Model model) {
    
    if (bindingResult.hasErrors()) {
      init(model, student);
      return "signup";
    }
    
    if (!student.getPassword().equals(student.getRePassword())) {
      bindingResult.rejectValue("rePassword", "required", "Enter the same password!!");
      init(model, student);
      return "signup";
    }
  
    BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
    String encodedPassword = passwordEncoder.encode(student.getPassword());
    student.setSavePassword(encodedPassword);
    student.setPassword("--------");
    student.setRePassword("--------");
    
    service.save(student);
    
    return "redirect:/login";
  }
  
  @RequestMapping("/login")
  public String signin() {
    return "signin";
  }
  
  @RequestMapping("/welcome")
  public String welcome(Model model) {
    
    List<Student> studentsList = service.listAll();
    model.addAttribute("studentsList", studentsList);
    
    return "welcome";
  }
  
  @RequestMapping("/edit/{id}")
  public ModelAndView showEditPage(@PathVariable(name = "id") long id, Model model) {
    ModelAndView mav = new ModelAndView("edit");
    Student student = service.get(id);
    mav.addObject("student", student);
    
    init(model, student);
    
    return mav;
  }
  
  @RequestMapping("/delete/{id}")
  public String deleteStudent(@PathVariable(name = "id") long id) {
    service.delete(id);
    return "redirect:/";
  }
}
