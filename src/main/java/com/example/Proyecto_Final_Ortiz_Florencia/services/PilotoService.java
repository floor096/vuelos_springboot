package com.example.Proyecto_Final_Ortiz_Florencia.services;

import com.example.Proyecto_Final_Ortiz_Florencia.entities.Piloto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface PilotoService {
    public List<Piloto> findAll() throws Exception;
    public Page<Piloto> findAll(Pageable pageable) throws Exception;
    public Piloto findById(Integer id) throws Exception;
    public Piloto save(Piloto entity) throws Exception;
    public Piloto update(Integer id, Piloto entity) throws Exception;
    public boolean delete(Integer id) throws Exception;
}
