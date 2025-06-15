package com.example.Proyecto_Final_Ortiz_Florencia.controllers;

import com.example.Proyecto_Final_Ortiz_Florencia.entities.Consulta;
import com.example.Proyecto_Final_Ortiz_Florencia.services.ConsultaServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/consultas")
public class ConsultaController extends BaseControllerImpl<Consulta, ConsultaServiceImpl> {

    public ConsultaController(ConsultaServiceImpl servicio) {
        super(servicio);
    }
}
