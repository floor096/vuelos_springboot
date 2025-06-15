package com.example.Proyecto_Final_Ortiz_Florencia.repositories;

import com.example.Proyecto_Final_Ortiz_Florencia.entities.Aerolinea;
import org.springframework.stereotype.Repository;

@Repository
public interface AerolineaRepository extends BaseRepository<Aerolinea, Long> {
    // List<Aerolinea> findByNombreContaining(String nombre);
    // Page<Aerolinea> findByNombreContaining(String nombre, Pageable pageable);
}
