package com.curso.spring.data.provider.mapper.impl;

import com.curso.spring.data.entities.AlumnosModel;
import com.curso.spring.data.provider.mapper.IMapper;
import com.curso.spring.dto.data.AlumnosDto;
import org.springframework.stereotype.Component;

@Component
public class AlumnosMapper implements IMapper<AlumnosModel, AlumnosDto> {

    @Override
    public AlumnosDto mapToDto(AlumnosModel alumnosModel) {
        return AlumnosDto.builder()
                .id(alumnosModel.getId())
                .name(alumnosModel.getName())
                .lastName(alumnosModel.getLastName())
                .email(alumnosModel.getEmail())
                .createAt(alumnosModel.getCreateAt())
                .build();
    }

    @Override
    public AlumnosModel mapToEntity(AlumnosDto alumnosDto) {
        return AlumnosModel.builder()
                .id(alumnosDto.getId())
                .name(alumnosDto.getName())
                .lastName(alumnosDto.getLastName())
                .email(alumnosDto.getEmail())
                .createAt(alumnosDto.getCreateAt())
                .build();
    }
}
