package com.example.solasido.controller;

import com.example.solasido.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/user")
public class UserController {
    private final UserService userService;

    @GetMapping("")
    public String getUser() {
        return "유저 정보가 반환될 예정";
    }

    @PostMapping("")
    public String postUser() {
        return "유저 정보가 생성될 예정";
    }
}
