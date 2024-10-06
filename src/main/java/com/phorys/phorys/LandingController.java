package com.phorys.phorys;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

@Controller
public class LandingController {

    @GetMapping("/")
    public String root(HttpServletRequest httpServletRequest, Principal principal){
        if (principal != null){
            return "redirect:/photo/list";
        }else{
            return "redirect:/user/login";
        }
    }
}
