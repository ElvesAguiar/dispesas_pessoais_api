package com.elves.expensesApi.services;

import com.elves.expensesApi.dto.TransactionDto;
import com.elves.expensesApi.services.exceptions.ResourceNotFoundException;
import com.elves.expensesApi.models.Transaction;
import com.elves.expensesApi.repositories.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {
    @Autowired
    private TransactionRepository repository;
    public List<TransactionDto> findAll (){
        return repository.findAll().stream().map(tr -> new TransactionDto(tr)).toList();
    }

    public TransactionDto insert(TransactionDto dto){
        Transaction tr = new Transaction();

        tr.setTitle(dto.getTitle());
        tr.setValue(dto.getValue());
        tr.setDate(dto.getDate());

        dto=new TransactionDto(repository.save(tr));

        return dto;
    }

    public void delete(Long id){
        Transaction tr = repository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Recurso não encontrado!"));

        repository.deleteById(tr.getId());
    }
}
