package com.example.tingeso1.controllers;

import com.example.tingeso1.entities.DiscountsEntity;
import com.example.tingeso1.services.DiscountsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/discounts")
@CrossOrigin("*")

public class DiscountsController {
    @Autowired
    DiscountsService discountsService;
    @GetMapping("/")
    public ResponseEntity<List<DiscountsEntity>> listDiscounts() {
        List<DiscountsEntity> discounts = discountsService.getDiscounts();
        return ResponseEntity.ok(discounts);
    }
}
