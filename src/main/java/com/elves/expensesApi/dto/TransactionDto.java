package com.elves.expensesApi.dto;

import com.elves.expensesApi.models.Transaction;

import java.util.Date;

public class TransactionDto {
    private String id;
    private String title;
    private Double value;
    private Date date;

    public TransactionDto() {
    }

    public TransactionDto(String id, String title, Double transactionValue, Date trasactionDate) {
        this.id = id;
        this.title = title;
        this.value = transactionValue;
        this.date = trasactionDate;
    }

    public TransactionDto(Transaction entity) {
        id = entity.getId().toString();
        title = entity.getTitle();
        value = entity.getValue();
        date = entity.getDate();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getValue() {
        return value;
    }

    public Date getDate() {
        return date;
    }
}
