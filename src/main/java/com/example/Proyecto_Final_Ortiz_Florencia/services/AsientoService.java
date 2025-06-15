package com.example.Proyecto_Final_Ortiz_Florencia.services;

import com.example.Proyecto_Final_Ortiz_Florencia.entities.Asiento;
import com.example.Proyecto_Final_Ortiz_Florencia.entities.Vuelo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface AsientoService {
    public List<Asiento> findAll() throws Exception;
    public Page<Asiento> findAll(Pageable pageable) throws Exception;
    public Asiento findById(Integer  id) throws Exception;
    public Asiento save(Asiento entity) throws Exception;
    public Asiento update(Integer  id, Asiento entity) throws Exception;
    public boolean delete(Integer  id) throws Exception;
    public List<Asiento> findAllByVuelo(Long vueloId) throws Exception;
    // public List<Asiento> findByClaseAsiento(Asiento.Clase claseAsiento) throws Exception;
    // public List<Asiento> findByAvionId(Long avionId) throws Exception;
//    public Optional<Asiento> findById(Long id);
}
