package com.yjo.demo.models;

import javax.persistence.*;

@Entity
public class Position {
    @Id
    private Long id;
    private String start_date;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "portfolioId")
    private Portfolio portfolio;

}
