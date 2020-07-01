package me.keithrasweiler.springjenkinsdeploytestapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping({"", "/", "/index", "/index.html"})
    public String index() {
        return "index.html";
    }

    @GetMapping("/stuff")
    public String stuff() {return "stuff.html";}
}
