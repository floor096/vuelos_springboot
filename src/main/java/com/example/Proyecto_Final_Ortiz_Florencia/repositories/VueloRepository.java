package com.example.Proyecto_Final_Ortiz_Florencia.repositories;

import com.example.Proyecto_Final_Ortiz_Florencia.entities.Vuelo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Repository
public interface VueloRepository  extends BaseRepository<Vuelo, Long> {
//    List<Vuelo> findByAeropuertos_Ciudad_IdAndAerolinea_IdAndFecha_Fecha(
//        Long ciudadId,
//        Long aerolineaId,
//        LocalDate fecha
//    );
    List<Vuelo> findByAerolinea_Id(Long aerolineaId);
//    List<Vuelo> findAllByCiudadAndAerolineaAndFecha(
//            Long ciudadId, Long aerolineaId, LocalDate fecha
//    );

}
