package com.app.repo;
import com.app.model.Doctor;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface DoctorusersRepository extends JpaRepository<Doctor, Long> {

}
