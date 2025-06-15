package com.example.Proyecto_Final_Ortiz_Florencia.repositories;

import com.example.Proyecto_Final_Ortiz_Florencia.entities.Avion;
import org.springframework.stereotype.Repository;

@Repository
public interface AvionRepository extends BaseRepository<Avion, Long> {
    // Avion findByNumeroAvion(int numeroAvion);
    // List<Avion> findByModeloAvionContaining(String modelo);
}
