package com.Avatar.user.crud.controller;

import com.Avatar.user.crud.entity.User;
import com.Avatar.user.crud.repository.UserRepository;
import com.Avatar.user.crud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class UserController {

@Autowired
    private UserService userService;

    //R: L : get method with list of users
    @ResponseBody
    @GetMapping("/users")
    public List<User> getAllUsers() {
        return userService.allUsers();
    }

    //R: get single user by ID
    @GetMapping("/users/{id}")
    public User getUser(@PathVariable String id) {
        return userService.getUser(id);
    }

    //add a user
    @PostMapping("/users")
    public User addUser(@RequestBody User user) {
        userService.addUser(user);
        return user;
    }

    //update a user
    @PutMapping("/users/{id}")
    public void updateUser(@RequestBody User user, @PathVariable String id) {
        userService.updateUser(id, user);
    }

    //delete a user
    @DeleteMapping("/users/{id}")
    public void deleteUser(@PathVariable String id) {
        userService.deleteUser(id);

    }
}

