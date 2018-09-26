package com.java.boot.java.boot.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String[] Get() {
        return new String[]{"one", "two"};
    }
}
