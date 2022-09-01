/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.service;

import com.example.demo.repository.userRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.User;
import java.util.List;
/**
 *
 * @author Daniel
 */
@Service
public class UserService {
    @Autowired
    private userRepository repo;
    
//    public Optional<User> getUserByName(String Name){
//        return repo.getUserByName(Name);
//    }
    
    public List<User> getAllUser(){
        return repo.findAll();
    }
}
