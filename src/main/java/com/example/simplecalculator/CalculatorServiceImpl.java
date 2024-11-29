package com.example.simplecalculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    public int calculatePlus(int num1, int num2) {
        return num1  + num2;
    }

    @Override
    public int calculateMinus(int num1, int num2) {
        return num1 - num2;
    }

    @Override
    public int calculateMultiply(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public int calculateDivide(int num1, int num2) {
        return num1/num2;
    }
}
