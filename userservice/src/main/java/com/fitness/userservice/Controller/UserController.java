package com.fitness.userservice.Controller;

import com.fitness.userservice.dto.RegisterRequest;
import com.fitness.userservice.dto.UserResponse;
import com.fitness.userservice.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

// GetMapping is shortcut for @RequestMapping(method = RequestMethod.GET)
@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserService userService;
    /*@Autowired tells Spring: “Give me the object of this class automatically.”*/
    // spring sees autowired then find the class annonated with service and create it's object(bean)
    // service creates the object and then autowired injects that object whereever needed, this way
    // i don't have to create the object the manually 
    @GetMapping("/{userId}")
    // pathvariable is used to read the value from url that changes, like leetcode contests numbers
    public ResponseEntity<UserResponse> getUserProfile(@PathVariable String userId) {
        return ResponseEntity.ok(userService.getUserProfile(userId));
    }

    // valid annotations tells the spring that before running the controller method, first check if the incoming
    // data follows the validation rules that we defined in the model class
    // validation rules like notnull,size,min,email, etc
    @PostMapping("/{register}")
    public ResponseEntity<UserResponse> register(@Valid @RequestBody RegisterRequest request) {
        return ResponseEntity.ok(userService.register(request));
    }
}
