package com.example.fitnes.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="records")
@Data
public class Record {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String program;

    private int amount;

    private int cost;

    private int value;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    public Record() {
    }

    public Record(String program, int amount, int cost,int value, User user) {
        this.program = program;
        this.amount = amount;
        this.cost = cost;
        this.value = value;
        this.user = user;

    }
}
