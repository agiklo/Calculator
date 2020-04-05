package com.agiklo.calculator.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Calculator {

    private String operation;
    private int firstArg;
    private int secondArg;

    public Calculator(String operation) {
        this.operation = operation;
    }

    public Calculator(int firstArg, int secondArg) {
        this.firstArg = firstArg;
        this.secondArg = secondArg;
    }
}
