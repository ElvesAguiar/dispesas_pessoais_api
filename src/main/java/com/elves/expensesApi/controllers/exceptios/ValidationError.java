package com.elves.expensesApi.controllers.exceptios;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class ValidationError extends CustomError {

    private List<FieldMessage> erros = new ArrayList<>();

    public ValidationError(Instant timestamp, Integer status, String error, String path) {
        super(timestamp, status, error, path);
    }

    public List<FieldMessage> getErros() {
        return erros;
    }

    public void addError(String fieldname, String message) {
        erros.removeIf(x -> x.getFieldName().equals(fieldname));
        FieldMessage error = new FieldMessage(fieldname, message);
        erros.add(error);
    }
}