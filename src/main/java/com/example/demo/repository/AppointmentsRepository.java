package com.example.demo.repository;

import com.example.demo.model.dto.entity.Appoinment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentsRepository extends JpaRepository<Appoinment,Long> {
}
