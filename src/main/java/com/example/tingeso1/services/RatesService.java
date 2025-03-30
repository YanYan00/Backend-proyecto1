package com.example.tingeso1.services;

import com.example.tingeso1.entities.RatesEntity;
import com.example.tingeso1.repository.RatesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class RatesService {
    @Autowired
    RatesRepository ratesRepository;
    public ArrayList<RatesEntity> getRates() { return (ArrayList<RatesEntity>) ratesRepository.findAll(); }
}