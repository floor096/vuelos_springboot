package com.example.Proyecto_Final_Ortiz_Florencia.services;

import com.example.Proyecto_Final_Ortiz_Florencia.entities.Aeropuerto;
import com.example.Proyecto_Final_Ortiz_Florencia.repositories.BaseRepository;
import org.springframework.stereotype.Service;

@Service
public class AeropuertoServiceImpl extends BaseServiceImpl<Aeropuerto, Long> implements AeropuertoService {
    public AeropuertoServiceImpl(BaseRepository<Aeropuerto, Long> baseRepository) {
        super(baseRepository);
    }
}
