package com.example.validationform.dao;


import com.example.validationform.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDataRepo extends JpaRepository<User, Integer> {

}
