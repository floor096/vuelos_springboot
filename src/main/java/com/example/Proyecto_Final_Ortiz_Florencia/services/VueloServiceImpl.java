package com.example.Proyecto_Final_Ortiz_Florencia.services;

import com.example.Proyecto_Final_Ortiz_Florencia.entities.Asiento;
import com.example.Proyecto_Final_Ortiz_Florencia.entities.Vuelo;
import com.example.Proyecto_Final_Ortiz_Florencia.repositories.BaseRepository;
import com.example.Proyecto_Final_Ortiz_Florencia.repositories.VueloRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Service
public class VueloServiceImpl extends BaseServiceImpl<Vuelo, Long> implements VueloService {
    private final VueloRepository vueloRepository;

    public VueloServiceImpl(BaseRepository<Vuelo, Long> baseRepository) {
        super(baseRepository);
        this.vueloRepository = (VueloRepository) baseRepository;
    }


    @Transactional(readOnly = true)
    public List<Asiento> findAsientosByVueloId(Long vueloId) {
        Vuelo vuelo = vueloRepository.findById(vueloId).orElseThrow();
//        return vuelo.getAvion().getAsientos();
        List<Asiento> asientos = vuelo.getAvion().getAsientos();
        asientos.size(); // fuerza la carga
        return asientos;
    }

    @Override
    @Transactional(readOnly = true)
    public List<Vuelo> findAllByAerolinea(Long aerolineaId) {
//        return vueloRepository.findByAerolinea_Id(aerolineaId);
        List<Vuelo> vuelos = vueloRepository.findByAerolinea_Id(aerolineaId);

        for (Vuelo v : vuelos) {
            v.getAvion().getNumeroAvion(); // fuerza la carga de Avion
            v.getPiloto().getNombrePersona(); // fuerza la carga de Piloto
            v.getFecha().getFecha(); // fuerza la carga de Fecha
        }


        return vuelos;
    }
}