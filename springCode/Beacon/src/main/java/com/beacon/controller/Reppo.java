package com.beacon.controller;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Reppo extends JpaRepository<Demo,Long> {
     
 
}