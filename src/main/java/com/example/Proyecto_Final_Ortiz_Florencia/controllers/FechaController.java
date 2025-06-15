package com.example.Proyecto_Final_Ortiz_Florencia.controllers;

import com.example.Proyecto_Final_Ortiz_Florencia.entities.Fecha;
import com.example.Proyecto_Final_Ortiz_Florencia.services.FechaServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/fechas")
public class FechaController extends BaseControllerImpl<Fecha, FechaServiceImpl> {
    public FechaController(FechaServiceImpl servicio) {
        super(servicio);
    }
}
