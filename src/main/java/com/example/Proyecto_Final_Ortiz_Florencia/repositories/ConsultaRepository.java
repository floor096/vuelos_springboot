package com.example.Proyecto_Final_Ortiz_Florencia.repositories;

import com.example.Proyecto_Final_Ortiz_Florencia.entities.Consulta;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsultaRepository extends BaseRepository<Consulta, Long>  {
    // List<Consulta> findByUsuarioDniPersona(int dni); // Suponiendo que Usuario tiene dniPersona
    // List<Consulta> findByFechaConsultaBetween(LocalDate startDate, LocalDate endDate);
}
