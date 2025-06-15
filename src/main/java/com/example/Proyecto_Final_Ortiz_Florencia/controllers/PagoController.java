package com.example.Proyecto_Final_Ortiz_Florencia.controllers;

import com.example.Proyecto_Final_Ortiz_Florencia.entities.Pago;
import com.example.Proyecto_Final_Ortiz_Florencia.services.PagoServiceImpl; // Importa tu PagoServiceImpl
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/pagos")
public class PagoController extends BaseControllerImpl<Pago, PagoServiceImpl>{
    public PagoController(PagoServiceImpl servicio) {
        super(servicio);
    }
}
