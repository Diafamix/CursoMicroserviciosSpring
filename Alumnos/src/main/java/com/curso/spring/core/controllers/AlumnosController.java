package com.curso.spring.core.controllers;

import com.curso.spring.core.controllers.service.impl.AlumnoService;
import com.curso.spring.dto.data.AlumnosDto;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@AllArgsConstructor
public class AlumnosController {

    private final AlumnoService alumnoService;

    @GetMapping("/listar")
    public ResponseEntity<?> listar() {
        return ResponseEntity.ok().body(alumnoService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> ver(@PathVariable Long id) {
        Optional<AlumnosDto> alumno = Optional.ofNullable(alumnoService.findById(id));

        if(alumno.isEmpty()) {
            ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(alumno.get());
    }

    @PostMapping
    public ResponseEntity<?> crear(@RequestBody AlumnosDto alumno) {
        AlumnosDto alumnoDb = alumnoService.save(alumno);

        return ResponseEntity.status(HttpStatus.CREATED).body(alumnoDb);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> editar(@RequestBody AlumnosDto alumno, @PathVariable Long id) {
        Optional<AlumnosDto> alumnoEncontrado = Optional.ofNullable(alumnoService.findById(id));

        if(alumnoEncontrado.isEmpty()) {
            ResponseEntity.notFound().build();
        }

        AlumnosDto alumnoDb = alumnoEncontrado.get();

        alumnoDb.setName(alumno.getName());
        alumnoDb.setLastName(alumno.getLastName());
        alumnoDb.setEmail(alumno.getEmail());

        return ResponseEntity.status(HttpStatus.CREATED).body(alumnoService.save(alumnoDb));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminar(@PathVariable Long id) {
        alumnoService.deleteById(id);
        return  ResponseEntity.noContent().build();
    }

}
