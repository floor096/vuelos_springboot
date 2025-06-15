package com.example.Proyecto_Final_Ortiz_Florencia.services;

import com.example.Proyecto_Final_Ortiz_Florencia.entities.Consulta;
import com.example.Proyecto_Final_Ortiz_Florencia.repositories.BaseRepository;
import org.springframework.stereotype.Service;

@Service
public class ConsultaServiceImpl extends BaseServiceImpl<Consulta, Long> implements ConsultaService {
    public ConsultaServiceImpl(BaseRepository<Consulta, Long> baseRepository) {
        super(baseRepository);
    }
}
