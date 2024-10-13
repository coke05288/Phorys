package com.phorys.phorys.photo;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequiredArgsConstructor
@Controller
@RequestMapping("/photo")
public class PhotoController {

    private final PhotoService photoService;

    @GetMapping("/list")
    public String list(Model model){
        List<Photo> photos = photoService.getAllPhotos();
        model.addAttribute("photos", photos);
        return "photo_list";
    }
}
