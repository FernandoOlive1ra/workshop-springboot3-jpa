package com.fernandooliveira.course.resources;

import com.fernandooliveira.course.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll (){

        User u = new User(1L,"fernando","fernando@gmail.com","985869271","123456");
        return ResponseEntity.ok().body(u);
    }
}
