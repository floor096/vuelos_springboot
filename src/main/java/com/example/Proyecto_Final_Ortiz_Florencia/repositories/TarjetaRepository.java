package com.example.Proyecto_Final_Ortiz_Florencia.repositories;

import com.example.Proyecto_Final_Ortiz_Florencia.entities.Tarjeta;
import org.springframework.stereotype.Repository;

@Repository
public interface TarjetaRepository extends BaseRepository<Tarjeta, Long> {
    // Tarjeta findByNumeroTarjeta(int numeroTarjeta);
    // List<Tarjeta> findByTipoTarjeta(TipoTarjeta tipoTarjeta); // Asumiendo que TipoTarjeta es el enum
    // List<Tarjeta> findByUsuarioDniPersona(int dni); // Si Usuario tiene dniPersona como ID
}
