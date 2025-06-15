package com.example.Proyecto_Final_Ortiz_Florencia.services;

import com.example.Proyecto_Final_Ortiz_Florencia.entities.Vuelo;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public interface VueloService extends BaseService<Vuelo, Long>{
//    List<Vuelo> findAllByCiudadAndAerolineaAndFecha(Long ciudadId, Long aerolineaId, LocalDate fecha);
    List<Vuelo> findAllByAerolinea(Long aerolineaId);
}
