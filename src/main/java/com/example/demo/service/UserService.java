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

import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 *
 * @author Daniel
 */
@Service
public class UserService  {
    @Autowired
    private userRepository repo;
    public String mesaje="";
    public Object result ="";
    
//    public Optional<User> getUserByName(String Name){
//        return repo.getUserByName(Name);
//    }
    private boolean existe(int id) {
    	if(repo.existsById(id)) {
    		return true;
    	}else {
    		return false;
    	}
    }
    private Map<String, Object> getDocData(User user) {
		Map<String,Object> docData=new HashMap<>();
		docData.put("id", user.getUserId());
		docData.put("name", user.getName());
		docData.put("comment", user.getComment());
		return docData;
	}
    
    public List<User> getAllUser(){
        return repo.findAll();
    }
    
    public User getUserById(int id) {
    	User usuario=new User();
    	usuario= null;
    	if (existe(id)) {
    		usuario=repo.getById(id);
    	}
    	return usuario;
    }
	public boolean updateUser(User usuario) {
		return false;
	}{
		
	}
	public boolean addUser(User usuario){
		//Map<String, Object> docData = getDocData(usuario);
		
		
		try {
			repo.save(usuario);
			return true;
		} catch (Exception e) {
			return false;
		}
		
		
	}
	public boolean deleteUser(int id){
		return false;
	}
	
}
