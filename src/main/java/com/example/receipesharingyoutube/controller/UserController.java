package com.example.receipesharingyoutube.controller;

import com.example.receipesharingyoutube.model.User;
import com.example.receipesharingyoutube.repository.UserRepository;
import com.example.receipesharingyoutube.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/api/users/profile")
    public User findUserByJwt(@RequestHeader("Authorization") String jwt) throws Exception {
        User user= userService.findUserByJwt(jwt);
        return user;
    }

//    @Autowired
//    private UserRepository userRepository;

//    @PostMapping("/users")
//    public User createUser(@RequestBody User user) throws Exception{
//
//        User isExist = userRepository.findAllByEmail(user.getEmail());
//        if(isExist!=null){
//            throw new Exception("User is exist with this email "+user.getEmail());
//        }
//
//
//        User savedUser = userRepository.save(user);
//        return savedUser;
//
//    }
//    @DeleteMapping("/users/{userId}")
//    public String deleteUser(@PathVariable Long userId) throws Exception{
//
//       userRepository.deleteById(userId);
//       return "user deleted successfully";
//    }
//    @GetMapping("/users")
//    public List<User> deleteUser() throws Exception{
//
//        List<User> users = userRepository.findAll();
//        return users;
//    }
//    public User findbyEmail(String email) throws Exception{
//        User user = userRepository.findAllByEmail(email);
//        if(user==null){
//            throw new Exception("User not found with email "+email);
//        }
//        return user;
//    }
}
