package com.example.Proyecto_Final_Ortiz_Florencia.controllers;

import com.example.Proyecto_Final_Ortiz_Florencia.entities.Tarjeta;
import com.example.Proyecto_Final_Ortiz_Florencia.services.TarjetaServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/tarjetas")
public class TarjetaController extends BaseControllerImpl<Tarjeta, TarjetaServiceImpl> {

    public TarjetaController(TarjetaServiceImpl servicio) {
        super(servicio);
    }
}
