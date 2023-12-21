package com.elves.expensesApi.controllers;

import com.elves.expensesApi.dto.TransactionDto;
import com.elves.expensesApi.services.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/transactions")
public class TransactionController {

    @Autowired
    private TransactionService service;

    @GetMapping
    public ResponseEntity<List<TransactionDto>> findAll(){
        return ResponseEntity.ok().body(service.findAll());
    }
    @PostMapping
    public ResponseEntity<TransactionDto> insert(@RequestBody TransactionDto dto){
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().build().toUri();
        return ResponseEntity.created(uri).body(service.insert(dto));
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete (@PathVariable Long id){
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
