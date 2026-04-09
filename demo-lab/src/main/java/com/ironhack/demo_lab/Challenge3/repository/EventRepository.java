package com.ironhack.demo_lab.Challenge3.repository;


import com.ironhack.demo_lab.Challenge3.entity.Event;
import org.hibernate.boot.models.JpaAnnotations;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {
}
