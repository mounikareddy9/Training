package com.example.training.service;

import org.springframework.stereotype.Service;

@Service
public class Calculatorservice {

    public double add(double a, double b){
        return a+b;
    }
    
    public double sub(double a, double b){
        return a-b;
    }
    
    public double multiply(double a, double b){
        return a*b;
    }
    
    public double divide(double a,double b){
        return a/b;
    }
    



}
