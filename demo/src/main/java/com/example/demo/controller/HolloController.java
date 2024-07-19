package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class HolloController {

    @RequestMapping("/index")
    public String index() {
        return "redirect:/hello/index2";
        // return "hello-world";
    }

    @RequestMapping("/index2")
    public String index2() {
        return "hello-world";
    }
}
