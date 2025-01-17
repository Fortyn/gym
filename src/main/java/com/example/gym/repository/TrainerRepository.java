package com.example.gym.repository;

import com.example.gym.model.Trainer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TrainerRepository extends JpaRepository<Trainer, Long> {
    List<Trainer> findBySpecializationId(Long specializationId);
    List<Trainer> findByUserId(Long userId);
}
