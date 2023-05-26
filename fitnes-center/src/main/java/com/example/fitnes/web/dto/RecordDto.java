package com.example.fitnes.web.dto;

import lombok.Data;

@Data
public class RecordDto {

    private String program;
    private int amount;
    private int cost;
    private int value;

    public RecordDto() {
    }

    public RecordDto(String program,int cost,int value, int amount) {
        super();
        this.program = program;
        this.amount = amount;
        this.cost = cost;
        this.value = value;
    }
}
