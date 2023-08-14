package com.incruit.aggregateWeb.service;

import com.incruit.aggregateWeb.db.dto.QnADTO;
import com.incruit.aggregateWeb.db.mapper.QnAMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.List;

@Service
@RequiredArgsConstructor
public class QnAservice {

    private final QnAMapper qnaMapper;

    public String showQnAList(Model model, QnADTO qnaDTO){
        List<QnADTO> list =qnaMapper.findQnAList(qnaDTO);
        model.addAttribute("list",list);

        return "/content/index";
    }

}
