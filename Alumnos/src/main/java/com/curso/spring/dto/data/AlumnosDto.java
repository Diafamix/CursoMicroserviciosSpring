package com.curso.spring.dto.data;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AlumnosDto {

    private Long id;
    private String name;
    private String lastName;
    private String email;
    private Date createAt;

}
