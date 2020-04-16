package com.miracle.studycache.controller;

import com.miracle.studycache.domain.User;
import com.miracle.studycache.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Miracle
 * @date 2020/4/16 0:45
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/all")
    public List<User> getAllUser(){
        return userService.getAllUser();
    }

    @GetMapping("/data")
    public User getUser(@RequestParam String username){
        return userService.getUser(username);
    }

    @PutMapping("/update")
    public User updateUser(@RequestBody User user){
        return userService.updateUser(user);
    }

    @PostMapping("/save")
    public User saveUser(@RequestBody User user){
        return userService.saveUser(user);
    }

    @DeleteMapping("/delete")
    public void deleteUser(@RequestParam String username){
        userService.deleteUser(username);
    }

    @DeleteMapping("/clearCache")
    public void clearCache(){
        userService.clearCache();
    }

}
