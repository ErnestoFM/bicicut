package com.sprinboot_bici.springbicicut.controllers;

import com.sprinboot_bici.springbicicut.models.UserModel;
import com.sprinboot_bici.springbicicut.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;
    @GetMapping

    public ArrayList<UserModel> getUsers() {
        return this.userService.getUsers();
    }

    @PostMapping
    public UserModel saveUser(@RequestBody UserModel user) {
        return this.userService.saveUser(user);
    }

    @GetMapping(path = "/{id}")
    public Optional<UserModel> getUserbyId(@PathVariable Long id) {
        return this.userService.getById(id);


    }

    @PutMapping(path = "/{id}")
    public UserModel updateUserById(@RequestBody UserModel request, long id) {
        return this.userService.updatebyId(request, id);
    }

    @DeleteMapping(path = "/{id}")
    public String deleteUserById(@PathVariable("id") long id) {
        boolean ok = this.userService.deleteUser(id);
        if (ok) {
            return "User with id " + id +" deleted!";
        }else {
            return "User with id " + id + " could not be deleted!";
        }
    }
}
