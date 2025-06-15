package com.example.Proyecto_Final_Ortiz_Florencia.repositories;

import com.example.Proyecto_Final_Ortiz_Florencia.entities.Fecha;
import org.springframework.stereotype.Repository;

@Repository
public interface FechaRepository  extends BaseRepository<Fecha, Long>{
    // List<Fecha> findByDiaAndMesAndAnio(int dia, int mes, int anio);
    // List<Fecha> findByFechaCompletaBetween(LocalDate startDate, LocalDate endDate);
}
