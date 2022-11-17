package com.curso.spring.data.dao;

import com.curso.spring.data.entities.AlumnosModel;
import com.curso.spring.dto.data.AlumnosDto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IAlumnosDao extends JpaRepository<AlumnosModel, Long> {

    Optional<AlumnosModel> findByName(String name);

    Optional<AlumnosModel> findById(Long id);

    Optional<AlumnosModel> save(AlumnosDto dto);

    void deleteById(Long id);
}
