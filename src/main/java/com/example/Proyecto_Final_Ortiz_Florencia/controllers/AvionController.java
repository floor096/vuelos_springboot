package com.example.Proyecto_Final_Ortiz_Florencia.controllers;

import com.example.Proyecto_Final_Ortiz_Florencia.entities.Avion;
import com.example.Proyecto_Final_Ortiz_Florencia.services.AvionServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/aviones")
public class AvionController extends BaseControllerImpl<Avion, AvionServiceImpl> {

    public AvionController(AvionServiceImpl servicio) {
        super(servicio);
    }
}
