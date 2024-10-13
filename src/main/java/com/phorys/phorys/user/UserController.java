package com.phorys.phorys.user;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequiredArgsConstructor
@Controller
@RequestMapping("/user")
public class UserController {

    @GetMapping("/login")
    public String login(){
        return "login_form";
    }

    @GetMapping("/signup")
    public String signup(){
        return "signup_form";
    }

}
