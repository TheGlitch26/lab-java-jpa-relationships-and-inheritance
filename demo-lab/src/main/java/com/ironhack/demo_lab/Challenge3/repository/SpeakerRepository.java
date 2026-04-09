package com.ironhack.demo_lab.Challenge3.repository;


import com.ironhack.demo_lab.Challenge3.entity.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpeakerRepository extends JpaRepository<Speaker, Long> {
}
