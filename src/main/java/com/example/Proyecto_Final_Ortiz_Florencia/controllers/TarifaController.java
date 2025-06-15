package com.example.Proyecto_Final_Ortiz_Florencia.controllers;

import com.example.Proyecto_Final_Ortiz_Florencia.entities.Tarifa;
import com.example.Proyecto_Final_Ortiz_Florencia.services.TarifaServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/tarifas")
public class TarifaController extends BaseControllerImpl<Tarifa, TarifaServiceImpl> {

    public TarifaController(TarifaServiceImpl servicio) {
        super(servicio);
    }
}
