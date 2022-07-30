package com.example.examen.Infraetructure.Repositories;

import com.example.examen.Domain.Entities.SalidaData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalidaDataRepositoryJPA extends JpaRepository<SalidaData, Integer> {
}
