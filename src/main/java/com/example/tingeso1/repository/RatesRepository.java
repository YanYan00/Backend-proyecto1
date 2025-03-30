package com.example.tingeso1.repository;

import com.example.tingeso1.entities.RatesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RatesRepository extends JpaRepository<RatesEntity, Long> {
}