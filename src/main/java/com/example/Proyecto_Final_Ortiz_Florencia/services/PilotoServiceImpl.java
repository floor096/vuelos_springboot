package com.example.Proyecto_Final_Ortiz_Florencia.services;

import com.example.Proyecto_Final_Ortiz_Florencia.entities.Piloto;
import com.example.Proyecto_Final_Ortiz_Florencia.repositories.PilotoRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PilotoServiceImpl implements PilotoService{
    @Autowired
    private PilotoRepository pilotoRepository;

    @Override
    @Transactional
    public List<Piloto> findAll() throws Exception {
        try {
            return pilotoRepository.findAll();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Page<Piloto> findAll(Pageable pageable) throws Exception {
        try {
            return pilotoRepository.findAll(pageable);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Piloto findById(Integer id) throws Exception {
        try {
            Optional<Piloto> entityOptional = pilotoRepository.findById(id);
            return entityOptional.orElse(null);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Piloto save(Piloto entity) throws Exception {
        try {
            return pilotoRepository.save(entity);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Piloto update(Integer id, Piloto entity) throws Exception {
        try {
            Optional<Piloto> entityOptional = pilotoRepository.findById(id);
            if (entityOptional.isEmpty()) {
                throw new Exception("Piloto no encontrado con ID: " + id);
            }
            return pilotoRepository.save(entity);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public boolean delete(Integer id) throws Exception {
        try {
            if (pilotoRepository.existsById(id)) {
                pilotoRepository.deleteById(id);
                return true;
            } else {
                throw new Exception("Piloto no encontrado con ID: " + id);
            }
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

}
