package com.curso.spring.core.controllers.service.impl;

import com.curso.spring.core.controllers.service.IAlumnosService;
import com.curso.spring.data.provider.impl.AlumnosProvider;
import com.curso.spring.dto.data.AlumnosDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@AllArgsConstructor
public class AlumnoService implements IAlumnosService {

    private final AlumnosProvider alumnosProvider;

    @Override
    @Transactional
    public Iterable<AlumnosDto> findAll() {
        return (Iterable)alumnosProvider.findAll();
    }

    @Override
    public AlumnosDto findById(Long id) {
        return alumnosProvider.findById(id);
    }

    @Override
    public AlumnosDto save(AlumnosDto dto) {
        return alumnosProvider.save(dto);
    }

    @Override
    public void deleteById(Long id) {
        alumnosProvider.deleteById(id);
    }
}
