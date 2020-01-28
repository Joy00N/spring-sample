package com.yjo.demo.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Portfolio {
    @Id
    private Long id;
    private String portfolio_name;
    private int portfolio_code;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "portfolio")
    private List<Position> positionList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPortfolio_name() {
        return portfolio_name;
    }

    public void setPortfolio_name(String portfolio_name) {
        this.portfolio_name = portfolio_name;
    }

    public int getPortfolio_code() {
        return portfolio_code;
    }

    public void setPortfolio_code(int portfolio_code) {
        this.portfolio_code = portfolio_code;
    }

    public List<Position> getPositionList() {
        return positionList;
    }

    public void setPositionList(List<Position> positionList) {
        this.positionList = positionList;
    }
}

