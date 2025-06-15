package com.example.Proyecto_Final_Ortiz_Florencia.services;

import com.example.Proyecto_Final_Ortiz_Florencia.entities.Persona;
import com.example.Proyecto_Final_Ortiz_Florencia.repositories.PersonaRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service // Indica a Spring que esta clase es un componente de servicio
public class PersonaServiceImpl implements PersonaService { // ¡No extiende BaseServiceImpl!

    // Inyectamos el PersonaRepository específico usando @Autowired como en el demo
    @Autowired
    private PersonaRepository personaRepository;

    // Métodos CRUD (reimplementados directamente)
    @Override
    @Transactional
    public List<Persona> findAll() throws Exception {
        try {
            return personaRepository.findAll();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Page<Persona> findAll(Pageable pageable) throws Exception {
        try {
            return personaRepository.findAll(pageable);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Persona findById(Integer id) throws Exception { // ID es Integer
        try {
            Optional<Persona> entityOptional = personaRepository.findById(id);
            return entityOptional.orElse(null); // O lanzar excepción si no se encuentra
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Persona save(Persona entity) throws Exception {
        try {
            return personaRepository.save(entity);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Persona update(Integer id, Persona entity) throws Exception { // ID es Integer
        try {
            Optional<Persona> entityOptional = personaRepository.findById(id);
            if (entityOptional.isEmpty()) {
                throw new Exception("Persona no encontrada con ID: " + id);
            }
            // Asumimos que 'entity' ya contiene el ID correcto y save() lo actualizará.
            return personaRepository.save(entity);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public boolean delete(Integer id) throws Exception { // ID es Integer
        try {
            if (personaRepository.existsById(id)) {
                personaRepository.deleteById(id);
                return true;
            } else {
                throw new Exception("Persona no encontrada con ID: " + id);
            }
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

//    @Override
//    @Transactional
//    public List<Persona> search(String filtro) throws Exception {
//        try {
//            return personaRepository.searchNativo(filtro);
//        } catch (Exception e) {
//            throw new Exception(e.getMessage());
//        }
//    }
//
//    @Override
//    @Transactional
//    public Page<Persona> search(String filtro, Pageable pageable) throws Exception {
//        try {
//            return personaRepository.searchNativo(filtro, pageable);
//        } catch (Exception e) {
//            throw new Exception(e.getMessage());
//        }
//    }
}