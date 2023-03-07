package com.example.training.controller;

import com.example.training.service.Calculatorservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculator")
public class Calculatorcontroller {
    @Autowired
   private Calculatorservice calculatorservice;
    @GetMapping("/add/{first}/{second}")
    public ResponseEntity<Object> add(@PathVariable("first") double a, @PathVariable("second") double b){
        if(a==0||b==0){
            return new ResponseEntity<>("Invalid input",HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(calculatorservice.add(a, b), HttpStatus.OK);
    }

    @GetMapping("/add")
    public ResponseEntity<Object> addRequestParams(@RequestParam("first") double a, @RequestParam("second") double b){
        if(a==0||b==0){
            return new ResponseEntity<>("Invalid input",HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(calculatorservice.add(a, b), HttpStatus.OK);
    }

    @GetMapping("/sub/{first}/{second}")
    public ResponseEntity<Object> sub(@PathVariable("first") double a, @PathVariable("second") double b){
        if(a==0||b==0){
            return new ResponseEntity<>("Invalid input",HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(calculatorservice.sub(a, b), HttpStatus.OK);
    }

    @GetMapping("/sub")
    public ResponseEntity<Object> subRequestParams(@RequestParam("first") double a, @RequestParam("second") double b){
        if(a==0||b==0){
            return new ResponseEntity<>("Invalid input",HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(calculatorservice.sub(a, b), HttpStatus.OK);
    }

    @GetMapping("/multiply/{first}/{second}")
    public ResponseEntity<Object> multiply(@PathVariable("first") double a, @PathVariable("second") double b){
        if(a==0||b==0){
            return new ResponseEntity<>("Invalid input",HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(calculatorservice.multiply(a, b), HttpStatus.OK);
    }

    @GetMapping("/multiply")
    public ResponseEntity<Object> multiplyRequestParams(@RequestParam("first") double a, @RequestParam("second") double b){
        if(a==0||b==0){
            return new ResponseEntity<>("Invalid input",HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(calculatorservice.multiply(a, b), HttpStatus.OK);
    }

    @GetMapping("/divide/{first}/{second}")
    public ResponseEntity<Object> divide(@PathVariable("first") double a, @PathVariable("second") double b){
        if(a==0||b==0){
            return new ResponseEntity<>("Invalid input",HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(calculatorservice.divide(a, b), HttpStatus.OK);
    }

    @GetMapping("/divide")
    public ResponseEntity<Object> divideRequestParams(@RequestParam("first") double a, @RequestParam("second") double b){
        if(a==0||b==0){
            return new ResponseEntity<>("Invalid input",HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(calculatorservice.divide(a, b), HttpStatus.OK);
    }




}
