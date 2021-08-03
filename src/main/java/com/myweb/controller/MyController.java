package com.myweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

    @GetMapping("hello")
    public String hello(Model model) {
        model.addAttribute("data", "data: hello!!");
        return "hello";
    }

    @GetMapping("/board")
    public String callBoard(Model model) {
        model.addAttribute("data", "board");
        return "board";
    }

}
