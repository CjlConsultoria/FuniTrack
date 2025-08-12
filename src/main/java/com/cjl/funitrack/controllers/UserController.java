package com.cjl.funitrack.controllers;

import com.cjl.funitrack.dtos.request.RequestUserDTO;
import com.cjl.funitrack.dtos.response.ResponseUserDTO;
import com.cjl.funitrack.entities.User;
import com.cjl.funitrack.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
        private UserService userService;

    @PostMapping
    public User registrarUser(@RequestBody RequestUserDTO user) {
        return userService.salvarUser(user);
    }

    @GetMapping
    public List<ResponseUserDTO> listarUser() {
        return userService.listarUser();
    }
}
