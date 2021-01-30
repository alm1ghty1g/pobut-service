package ua.pobut.storage.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.pobut.storage.domain.User;
import ua.pobut.storage.service.UserService;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;


    @PreAuthorize("#oauth2.hasScope('server')")
    @PostMapping("/save")
    public ResponseEntity<User> save(@RequestBody User user) {
        System.out.println("there");
        return ResponseEntity.ok(userService.save(user));

    }
}
