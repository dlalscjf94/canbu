package com.apache.canbu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class homecontroller {

    @RequestMapping(method = RequestMethod.GET, path = "/home")
    public String home() {

        System.out.println("hompageasd");
        return "home";
    }
}
