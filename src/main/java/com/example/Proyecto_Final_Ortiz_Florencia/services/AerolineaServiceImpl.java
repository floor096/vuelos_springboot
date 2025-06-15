package com.example.Proyecto_Final_Ortiz_Florencia.services;

import com.example.Proyecto_Final_Ortiz_Florencia.entities.Aerolinea;
import com.example.Proyecto_Final_Ortiz_Florencia.repositories.AerolineaRepository;
import com.example.Proyecto_Final_Ortiz_Florencia.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AerolineaServiceImpl extends BaseServiceImpl<Aerolinea, Long> implements AerolineaService {

    private AerolineaRepository aerolineaRepository;

    public AerolineaServiceImpl(BaseRepository<Aerolinea, Long> baseRepository) {
        super(baseRepository);
        this.aerolineaRepository = (AerolineaRepository) baseRepository;
    }

}
