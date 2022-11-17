package com.curso.spring.core.controllers.service;

import com.curso.spring.data.entities.AlumnosModel;
import com.curso.spring.dto.data.AlumnosDto;

public interface IAlumnosService {

    Iterable<AlumnosDto> findAll();

    AlumnosDto findById(Long id);

    AlumnosDto save(AlumnosDto dto);

    void deleteById(Long id);

}
