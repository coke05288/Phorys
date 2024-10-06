package com.phorys.phorys.photo;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequiredArgsConstructor
@Controller
@RequestMapping("/photo")
public class PhotoController {

    @GetMapping("/list")
    @ResponseBody
    public String list(){
        return "<h1>로그인 상태</h1>";
    }
}
