package com.example.Proyecto_Final_Ortiz_Florencia.repositories;

import com.example.Proyecto_Final_Ortiz_Florencia.entities.Aeropuerto;
import org.springframework.stereotype.Repository;

@Repository
public interface AeropuertoRepository extends BaseRepository<Aeropuerto, Long> {
    // List<Aeropuerto> findByNombreContaining(String nombre);
    // List<Aeropuerto> findByCodigoIata(String codigoIata);
    // Page<Aeropuerto> findByCiudadNombreContaining(String nombreCiudad, Pageable pageable);
}
