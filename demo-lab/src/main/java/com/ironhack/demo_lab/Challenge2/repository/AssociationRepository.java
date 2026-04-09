package com.ironhack.demo_lab.Challenge2.repository;


import com.ironhack.demo_lab.Challenge2.Association;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestHeader;

@Repository
public interface AssociationRepository extends JpaRepository<Association, Long> {
}
