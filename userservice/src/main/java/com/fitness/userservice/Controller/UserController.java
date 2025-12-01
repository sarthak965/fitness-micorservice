package com.fitness.userservice.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
// GetMapping is shortcut for @RequestMapping(method = RequestMethod.GET)
@RestController
@RequestMapping("/api")
public class UserController {
//    @GetMapping("/{userId}")
//    public ResponseEntity<UserResponse> getUserProfile() {
//        return "";
//    }
//
//    @GetMapping("/{register}")
//    public ResponseEntity<> register() {
//        return "";
//    }
}
