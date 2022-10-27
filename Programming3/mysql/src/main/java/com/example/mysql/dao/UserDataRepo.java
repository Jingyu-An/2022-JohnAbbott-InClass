package com.example.mysql.dao;


import com.example.mysql.model.UserData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDataRepo extends JpaRepository<UserData, Integer> {

}
