package com.example.Proyecto_Final_Ortiz_Florencia.repositories;

import com.example.Proyecto_Final_Ortiz_Florencia.entities.Ciudad;
import org.springframework.stereotype.Repository;

@Repository
public interface CiudadRepository extends BaseRepository<Ciudad, Long> {
    // List<Ciudad> findByNombreContaining(String nombre);
    // Ciudad findByCodigoPostal(String codigoPostal);
}
