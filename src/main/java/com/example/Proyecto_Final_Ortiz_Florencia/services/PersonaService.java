package com.example.Proyecto_Final_Ortiz_Florencia.services;

import com.example.Proyecto_Final_Ortiz_Florencia.entities.Persona;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface PersonaService {
    public List<Persona> findAll() throws Exception;
    public Page<Persona> findAll(Pageable pageable) throws Exception;
    public Persona findById(Integer id) throws Exception;
    public Persona save(Persona entity) throws Exception;
    public Persona update(Integer id, Persona entity) throws Exception;
    public boolean delete(Integer id) throws Exception;

    // Métodos de búsqueda específicos para Persona
//    public List<Persona> search(String filtro) throws Exception;
//    public Page<Persona> search(String filtro, Pageable pageable) throws Exception;
}