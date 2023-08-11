package com.incruit.aggregateWeb.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {
    @GetMapping
    @ResponseBody
    public String index(HttpServletRequest request){
        return "Hello index";
    }

}
