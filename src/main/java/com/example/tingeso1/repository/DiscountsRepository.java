package com.example.tingeso1.repository;

import com.example.tingeso1.entities.DiscountsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiscountsRepository extends JpaRepository<DiscountsEntity, Long> {

}
