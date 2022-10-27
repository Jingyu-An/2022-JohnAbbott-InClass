package com.example.demo.dao;


import com.example.demo.model.UserData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDataRepo extends JpaRepository<UserData, Integer> {

}
