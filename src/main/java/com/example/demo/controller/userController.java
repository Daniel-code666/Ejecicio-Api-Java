/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.controller;

import com.example.demo.service.UserService;
import com.example.demo.entity.User;
import java.util.List;
import java.util.concurrent.ExecutionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

/**
 *
 * @author Daniel
 */
@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
@RequestMapping("/api/Client/")

public class userController {
    @Autowired
    private UserService userServ;

    @GetMapping("/all")
    public List<User> getUsers(){
        return userServ.getAllUser();
    }
    @GetMapping(value="/user/{id}")
    public User getUserById(@PathVariable(value="id")int id) {
    	return userServ.getUserById(id);
    } 
    @PostMapping(value = "/add")
	public boolean add(@RequestBody User user) throws ExecutionException  {
		return userServ.addUser(user);
	}
	
}
    	
    
    
