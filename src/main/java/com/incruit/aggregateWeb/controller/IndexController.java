package com.incruit.aggregateWeb.controller;

import com.incruit.aggregateWeb.db.dto.QnADTO;
import com.incruit.aggregateWeb.service.QnAservice;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class IndexController {
    private final QnAservice qnaService;

    @GetMapping("/QnA")
    public String index(Model model, QnADTO qnaDTO){
        return qnaService.showQnAList(model,qnaDTO);
    }
}
