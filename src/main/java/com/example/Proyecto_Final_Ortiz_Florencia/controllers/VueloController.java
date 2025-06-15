package com.example.Proyecto_Final_Ortiz_Florencia.controllers;

import com.example.Proyecto_Final_Ortiz_Florencia.entities.Asiento;
import com.example.Proyecto_Final_Ortiz_Florencia.entities.Vuelo;
import com.example.Proyecto_Final_Ortiz_Florencia.services.VueloServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/vuelos")
public class VueloController extends BaseControllerImpl<Vuelo, VueloServiceImpl> {

    public VueloController(VueloServiceImpl servicio) {
        super(servicio);
    }

    @Autowired
    private VueloServiceImpl vueloService;

//    @GetMapping
//    public ResponseEntity<List<Vuelo>> getAllVuelos() {
//        try {
//            List<Vuelo> vuelos = vueloService.findAll();
//            return ResponseEntity.ok(vuelos);
//        } catch (Exception e) {
//            return ResponseEntity.internalServerError().build();
//        }
//    }

//    @GetMapping("/filtrar") // Nuevo endpoint para filtrar vuelos
//    public ResponseEntity<List<Vuelo>> getFilteredVuelos(
//            @RequestParam(required = false) Long ciudadId,
//            @RequestParam(required = false) Long aerolineaId,
//            @RequestParam(required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate fecha) {
//        try {
//            List<Vuelo> vuelos = vueloService.findAllByCiudadAndAerolineaAndFecha(ciudadId, aerolineaId, fecha);
//            return ResponseEntity.ok(vuelos);
//        } catch (Exception e) {
//            return ResponseEntity.internalServerError().build();
//        }
//    }

    @GetMapping("/{id}/asientos")
    public ResponseEntity<List<Asiento>> getAsientosByVuelo(@PathVariable Long id) {
        try {
            List<Asiento> asientos = vueloService.findAsientosByVueloId(id);
            return ResponseEntity.ok(asientos);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().build();
        }
    }

    @GetMapping("/por-aerolinea/{id}")
    public ResponseEntity<List<Vuelo>> getVuelosPorAerolinea(@PathVariable Long id) {
        try {
            return ResponseEntity.ok(vueloService.findAllByAerolinea(id));
        } catch (Exception e) {
            e.printStackTrace(); 
            return ResponseEntity.status(500).body(null);
        }
    }
}
