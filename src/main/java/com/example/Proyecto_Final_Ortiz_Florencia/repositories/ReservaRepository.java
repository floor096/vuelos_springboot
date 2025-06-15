package com.example.Proyecto_Final_Ortiz_Florencia.repositories;

import com.example.Proyecto_Final_Ortiz_Florencia.entities.Reserva;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservaRepository  extends BaseRepository<Reserva, Long>{
    // List<Reserva> findByUsuarioDniPersona(int dni); // Si Usuario tiene dniPersona como ID
    // List<Reserva> findByVueloNumeroVuelo(int numeroVuelo); // Si Vuelo tiene numeroVuelo
    // List<Reserva> findByEstadoReserva(EstadoReserva estado); // Asumiendo un enum EstadoReserva
}
