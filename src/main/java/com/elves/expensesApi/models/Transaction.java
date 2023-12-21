package com.elves.expensesApi.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "tb_transaction")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private Double transactionValue;
    private Date trasactionDate;

    public Transaction(){

    }

    public Transaction(Long id, String title, Double value, Date date) {
        this.id = id;
        this.title = title;
        this.transactionValue = value;
        this.trasactionDate = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getValue() {
        return transactionValue;
    }

    public void setValue(Double value) {
        this.transactionValue = value;
    }

    public Date getDate() {
        return trasactionDate;
    }

    public void setDate(Date date) {
        this.trasactionDate = date;
    }
}
