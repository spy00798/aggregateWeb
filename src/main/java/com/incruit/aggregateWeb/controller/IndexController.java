package com.incruit.aggregateWeb.controller;

import com.incruit.aggregateWeb.db.dto.QAdto;
import com.incruit.aggregateWeb.service.QAservice;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class IndexController {

    private final QAservice qAservice;

    @GetMapping("/")
    public String index(Model model, QAdto qAdto){
        return qAservice.getQAList(model,qAdto);
    }

}
