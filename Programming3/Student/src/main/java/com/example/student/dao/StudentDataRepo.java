package com.example.student.dao;

import com.example.student.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface StudentDataRepo extends JpaRepository<Student, Long> {
  
  @Query("SELECT u FROM Student u WHERE u.name = ?1")
  public Student findByName(String name);
}
