package com.curso.spring.data.provider;

import com.curso.spring.dto.data.AlumnosDto;

import java.util.Optional;

public interface IAlumnosProvider {

    AlumnosDto findByName(String name);
    AlumnosDto findById(Long id);
}

