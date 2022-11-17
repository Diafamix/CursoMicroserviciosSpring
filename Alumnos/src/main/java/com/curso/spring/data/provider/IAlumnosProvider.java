package com.curso.spring.data.provider;

import com.curso.spring.dto.data.AlumnosDto;

import java.util.List;
import java.util.Optional;

public interface IAlumnosProvider {

    AlumnosDto findByName(String name);
    AlumnosDto findById(Long id);
    List<AlumnosDto> findAll();
    AlumnosDto save (AlumnosDto dto);
    void deleteById(Long id);
}

