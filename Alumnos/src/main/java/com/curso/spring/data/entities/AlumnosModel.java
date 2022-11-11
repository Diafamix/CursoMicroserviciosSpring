package com.curso.spring.data.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table
@AllArgsConstructor
@Builder
@NoArgsConstructor
@Data
public class AlumnosModel implements Serializable {

    @Id
    long id;
    private String name;
    private String lastName;
    private String email;
    private Date createAt;

    public void prePersist() {
        this.createAt = new Date();
    }
}
