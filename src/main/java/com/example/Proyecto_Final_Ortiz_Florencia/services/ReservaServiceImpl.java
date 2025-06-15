package com.example.Proyecto_Final_Ortiz_Florencia.services;

import com.example.Proyecto_Final_Ortiz_Florencia.entities.Reserva;
import com.example.Proyecto_Final_Ortiz_Florencia.repositories.BaseRepository;
import org.springframework.stereotype.Service;

@Service
public class ReservaServiceImpl extends BaseServiceImpl<Reserva, Long> implements ReservaService {
    public ReservaServiceImpl(BaseRepository<Reserva, Long> baseRepository) {
        super(baseRepository);
    }
}
