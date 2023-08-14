package com.incruit.aggregateWeb.db.dto;


import lombok.Data;

@Data
public class QnADTO {
    private long id;
    private String question;
    private String answer;
}
