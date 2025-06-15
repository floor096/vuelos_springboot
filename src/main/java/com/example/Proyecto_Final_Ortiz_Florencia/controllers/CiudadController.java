package com.example.Proyecto_Final_Ortiz_Florencia.controllers;


import com.example.Proyecto_Final_Ortiz_Florencia.entities.Ciudad;
import com.example.Proyecto_Final_Ortiz_Florencia.services.CiudadServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/ciudades")
public class CiudadController  extends BaseControllerImpl<Ciudad, CiudadServiceImpl>{
    public CiudadController(CiudadServiceImpl ciudadService) {
        super(ciudadService);
    }
}
