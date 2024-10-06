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
    @ResponseBody
    public String login(){
        return "<h1>로그아웃 상태</h1>";    }

}
