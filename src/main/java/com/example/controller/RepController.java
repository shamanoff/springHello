package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class RepController {

    @RequestMapping("/index")
//    @ResponseBody
    public String replay(@RequestParam
        (value = "name",defaultValue = "World")String name, Model model) {
        model.addAttribute("name", name);
        return "index";
    }
}
