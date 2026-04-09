package com.ironhack.demo_lab.Challenge3.repository;


import com.ironhack.demo_lab.Challenge3.entity.Guest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuestRepository extends JpaRepository<Guest, Long> {
}
