package com.example.tingeso1.controllers;

import com.example.tingeso1.entities.RatesEntity;
import com.example.tingeso1.services.RatesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/rates")
@CrossOrigin("*")

public class RatesController {
    @Autowired
    RatesService ratesService;
    @GetMapping("/")
    public ResponseEntity<List<RatesEntity>> listRates(){
        List<RatesEntity> rates = ratesService.getRates();
        return ResponseEntity.ok(rates);
    }
}