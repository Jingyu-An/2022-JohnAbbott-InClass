package com.example.student.service;

import com.example.student.dao.StudentDataRepo;
import com.example.student.model.Student;
import com.example.student.model.StudentDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class StudentService implements UserDetailsService {
  
  @Autowired
  StudentDataRepo repo;
  
  public List<Student> listAll() {
    return repo.findAll();
  }
  
  public void save(Student student) {
    repo.save(student);
  }
  
  public Student get(long id) {
    return repo.findById(id).get();
  }
  
  public void delete(long id) {
    repo.deleteById(id);
  }
  
  
  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    
    Student student = repo.findByName(username);
  
    if (student == null) {
      throw new UsernameNotFoundException("Student not found");
    }
  
    return new StudentDetail(student);
  }
}
