package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import form.RecieveForm;

@Controller
@RequestMapping("recieve")
public class ReceiveController {

    @RequestMapping("")
    public String index() {
        return "info-form";
    }
@RequestMapping("/recieve-info")
    public String recieveInfo(RecieveForm recieveForm,Model model ){
        // System.out.println(recieveForm.getName());
        // System.out.println(recieveForm.getAge());
        model.addAttribute("name",recieveForm.getName());
        model.addAttribute("age",recieveForm.getAge());
         return "finished";


         //Model modelときたらリクエストスコープを使う。model.addAttributeはリクエストスコープにname,ageを追加する

    }
}
