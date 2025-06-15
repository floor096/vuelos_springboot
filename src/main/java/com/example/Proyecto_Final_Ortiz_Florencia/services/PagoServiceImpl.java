package com.example.Proyecto_Final_Ortiz_Florencia.services;

import com.example.Proyecto_Final_Ortiz_Florencia.entities.Pago;
import com.example.Proyecto_Final_Ortiz_Florencia.repositories.BaseRepository;
import org.springframework.stereotype.Service;

@Service
public class PagoServiceImpl extends BaseServiceImpl<Pago, Long> implements PagoService {
    public PagoServiceImpl(BaseRepository<Pago, Long> baseRepository) {
        super(baseRepository);
    }
}
