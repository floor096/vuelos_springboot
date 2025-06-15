package com.example.Proyecto_Final_Ortiz_Florencia.controllers;

import com.example.Proyecto_Final_Ortiz_Florencia.entities.Aerolinea;
import com.example.Proyecto_Final_Ortiz_Florencia.services.AerolineaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/aerolineas")
public class AerolineaController extends BaseControllerImpl<Aerolinea, AerolineaServiceImpl> {

    public AerolineaController(AerolineaServiceImpl servicio) {
        super(servicio);
    }

    @Autowired
    private AerolineaServiceImpl aerolineaService;

//    @GetMapping
//    public ResponseEntity<List<Aerolinea>> getAllAerolineas() {
//        try {
//            List<Aerolinea> aerolineas = aerolineaService.findAll();
//            return ResponseEntity.ok(aerolineas);
//        } catch (Exception e) {
//            return ResponseEntity.internalServerError().build();
//        }
//    }

    @Override
    @GetMapping
    public ResponseEntity<?> getAll() {
        try {
            List<Aerolinea> aerolineas = servicio.findAll();
            return ResponseEntity.ok(aerolineas);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body("{\"error\": \"Error al obtener las aerolíneas: " + e.getMessage() + "\"}");
        }
    }
}
