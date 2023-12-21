package com.elves.expensesApi.controllers;
import com.elves.expensesApi.dto.TransactionDto;
import com.elves.expensesApi.models.Transaction;
import com.elves.expensesApi.services.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/transactions")
public class TransactionController {

    @Autowired
    private TransactionService service;

    @GetMapping
    public List<TransactionDto> findAll(){
        return service.findAll();
    }
    @PostMapping
    public TransactionDto insert(@RequestBody TransactionDto dto){
        return service.insert(dto);
    }
}
