package com.example.Proyecto_Final_Ortiz_Florencia.controllers;

import com.example.Proyecto_Final_Ortiz_Florencia.entities.Persona;
import com.example.Proyecto_Final_Ortiz_Florencia.services.PersonaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/personas")
public class PersonaController {

    @Autowired
    private PersonaServiceImpl servicio;

    @GetMapping("")
    public ResponseEntity<?> getAll() {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(servicio.findAll());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error, por favor intente más tarde: " + e.getMessage() + "\"}");
        }
    }

    @GetMapping("/paged")
    public ResponseEntity<?> getAll(Pageable pageable) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(servicio.findAll(pageable));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error, por favor intente más tarde: " + e.getMessage() + "\"}");
        }
    }

    @GetMapping("/{dniPersona}")
    public ResponseEntity<?> getOne(@PathVariable Integer dniPersona) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(servicio.findById(dniPersona));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error, por favor intente más tarde: " + e.getMessage() + "\"}");
        }
    }

    @PostMapping("")
    public ResponseEntity<?> save(@RequestBody Persona entity) {
        try {
            return ResponseEntity.status(HttpStatus.CREATED).body(servicio.save(entity));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Error, por favor intente más tarde: " + e.getMessage() + "\"}");
        }
    }

    @PutMapping("/{dniPersona}")
    public ResponseEntity<?> update(@PathVariable Integer dniPersona, @RequestBody Persona entity) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(servicio.update(dniPersona, entity));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Error, por favor intente más tarde: " + e.getMessage() + "\"}");
        }
    }

    @DeleteMapping("/{dniPersona}")
    public ResponseEntity<?> delete(@PathVariable Integer dniPersona) {
        try {
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body(servicio.delete(dniPersona));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Error, por favor intente más tarde: " + e.getMessage() + "\"}");
        }
    }
}