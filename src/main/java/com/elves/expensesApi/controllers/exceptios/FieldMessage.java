package com.elves.expensesApi.controllers.exceptios;

public class FieldMessage {
    private String fieldName;
    private String message;

    public FieldMessage(String name, String message) {
        this.fieldName = name;
        this.message = message;
    }

    public String getFieldName() {
        return fieldName;
    }

    public String getMessage() {
        return message;
    }
}