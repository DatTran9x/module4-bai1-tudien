package com.example.tudiendongian.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
    @GetMapping("/home")
    public String show() {
        return "home";
    }

    @PostMapping("/home")
    public ModelAndView result(String english) {
        ModelAndView mav = new ModelAndView("result");
        switch (english) {
            case "hello":
                mav.addObject("result", "Chao em");
                return mav;
            case "peace":
                mav.addObject("result","Anh ban a.");
                return mav;
            case "bye":
                mav.addObject("result","Cut!");
                return mav;
            default:
                mav.addObject("result","Chiu!");
                return mav;
        }
    }
}
