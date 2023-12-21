package com.elves.expensesApi.services;

import com.elves.expensesApi.models.Transaction;
import com.elves.expensesApi.repositories.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {
    @Autowired
    private TransactionRepository repository;
    public List<Transaction> findAll (){
        return repository.findAll();
    }
}
