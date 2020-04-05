package com.agiklo.calculator.service;

import com.agiklo.calculator.model.Calculator;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public Calculator clear(Calculator calculator){
        calculator.setFirstArg(0);
        calculator.setSecondArg(0);
        return calculator;
    }

    public int add(Calculator calculator){
        return calculator.getFirstArg() + calculator.getSecondArg();
    }

    public int subtract(Calculator calculator){
        return calculator.getFirstArg() - calculator.getSecondArg();
    }

    public int multiply(Calculator calculator){
        return calculator.getFirstArg() * calculator.getSecondArg();
    }

    public double divide(Calculator calculator){
        if(calculator.getFirstArg() == 0 || calculator.getSecondArg() == 0){
            return 0;
        }
        return (double) calculator.getFirstArg() / calculator.getSecondArg();
    }
}
