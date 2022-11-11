package com.curso.spring.dto.data;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Builder
@Data
public class AlumnosDto {

    private Long id;
    private String name;
    private String lastName;
    private String email;
    private Date createAt;

}
