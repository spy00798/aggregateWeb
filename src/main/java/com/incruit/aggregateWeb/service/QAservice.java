package com.incruit.aggregateWeb.service;

import com.incruit.aggregateWeb.db.dto.QAdto;
import com.incruit.aggregateWeb.db.mapper.QAmapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.List;

@Service
@RequiredArgsConstructor
public class QAservice {

    private final QAmapper qAmapper;

    public String getQAList(Model model,QAdto qAdto){

        List<QAdto> list =qAmapper.findQAList(qAdto);

        list.forEach( i -> System.out.println(
                String.format("%s",i.getQuestion()))
        );

        model.addAttribute("list",list);
        //model.addAttribute("test","test123");
        //<h1 th:text="${test}">Name</h1>
        return "/content/index";
    }

}
