package com.example.controller;

import com.example.model.Greeting;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class GreetingController {

 /*   @RequestMapping(value="/greeting", method= RequestMethod.GET)
    public String greetingForm(Model model) {
        model.addAttribute("greeting", new Greeting());
        return "greeting";
    }

    @RequestMapping(value="/greeting", method=RequestMethod.POST)
    public String greetingSubmit(@ModelAttribute Greeting greeting, Model model) {
        model.addAttribute("greeting", greeting);
        return "greeting";
    }*/

    @GetMapping("/greeting")
    public String greetingForm(Model model) {
        model.addAttribute("greetingForm", new Greeting());
        model.addAttribute("greeting", new Greeting());
        return "greeting";
    }

    @PostMapping("/greeting")
    public String greetingSubmit(@ModelAttribute("greetingForm") Greeting greeting, Model model) {
        model.addAttribute("greetingForm", new Greeting());
        model.addAttribute("greeting", greeting);
        return "greeting";
    }

 /*   @RequestMapping("/greeting")
    public String greeting(@RequestParam
        (value = "name",defaultValue = "World")String name, Model model){
        model.addAttribute("name", name);
        return "greeting";
    }*/
}
