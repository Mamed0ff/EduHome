package com.example.eduhome.repostiories;

import com.example.eduhome.models.Service;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ServiceRepo extends JpaRepository<Service, Long> {
}
