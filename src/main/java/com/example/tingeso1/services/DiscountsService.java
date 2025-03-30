package com.example.tingeso1.services;

import com.example.tingeso1.entities.DiscountsEntity;
import com.example.tingeso1.repository.DiscountsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class DiscountsService {
    @Autowired
    DiscountsRepository discountsRepository;
    public ArrayList<DiscountsEntity> getDiscounts() { return (ArrayList<DiscountsEntity>) discountsRepository.findAll(); }
}
