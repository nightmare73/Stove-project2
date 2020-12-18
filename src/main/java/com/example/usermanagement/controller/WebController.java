package com.example.usermanagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @GetMapping("/")
    public String login() {
        return "login";
    }

    @GetMapping("/signup")
    public String signup() {
        return "signup";
    }

    @GetMapping("/accounts")
    public String showAccounts() {
        return "accounts";
    }

    @GetMapping("/mypage")
    public String showAccount() {
        return "myPage";
    }
}
