package com.curso.spring.data.provider.impl;

import com.curso.spring.data.dao.IAlumnosDao;
import com.curso.spring.data.entities.AlumnosModel;
import com.curso.spring.data.provider.IAlumnosProvider;
import com.curso.spring.data.provider.mapper.IMapper;
import com.curso.spring.dto.data.AlumnosDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@AllArgsConstructor
@Transactional
public class AlumnosProvider implements IAlumnosProvider {

    private final IAlumnosDao alumnosDao;
    private final IMapper<AlumnosModel, AlumnosDto> alumnosMapper;

    @Override
    public AlumnosDto findByName(String name) {
        return alumnosDao.findByName(name)
                .map(alumnosMapper::mapToDto)
                .orElseThrow(() -> new RuntimeException("Error al sacar los datos! "));
    }
    
    @Override
    public AlumnosDto findById(Long id) {
        return alumnosDao.findById(id)
                .map(alumnosMapper::mapToDto)
                .orElseThrow(() -> new RuntimeException("Error al sacar los datos! "));
    }
}
