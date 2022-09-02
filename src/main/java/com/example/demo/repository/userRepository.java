/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.repository;
import com.example.demo.entity.User;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 *
 * @author Daniel
 */
public interface userRepository extends JpaRepository<User, Integer> {
//    @Autowired
//    private userCrudRepository repo;
//    
//    public Optional<User> getUserByName(String Name){
//        return repo.findByName(Name);
//    }
//    
//    public List<User> getAllUsers(){
//        return (List<User>) repo.findAll();
//    }
	
/*	public List<User> getUsers();
	public User getUserById(int id);
	public boolean updateUser(User usuario);
	public boolean addUser(User usuario);
	public boolean deleteUser(int id);*/
	
	
}
