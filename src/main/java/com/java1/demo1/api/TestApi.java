package com.java1.demo1.api;

import java.lang.reflect.Method;

import com.java1.demo1.model.UserModel;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/Security")
public class TestApi {
    @PostMapping("/Verification")
    public boolean name() {
        return true;
    }
    @PostMapping("/Take")
    public UserModel TakeData(@RequestBody UserModel login) {
        return login;
    }
}
