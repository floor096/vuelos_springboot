package com.example.Proyecto_Final_Ortiz_Florencia.config;

import com.example.Proyecto_Final_Ortiz_Florencia.entities.*;
import com.example.Proyecto_Final_Ortiz_Florencia.repositories.*;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Component
@RequiredArgsConstructor
public class DataInitializer {

    private final CiudadRepository ciudadRepo;
    private final AeropuertoRepository aeropuertoRepo;
    private final AerolineaRepository aerolineaRepo;
    private final AvionRepository avionRepo;
    private final AsientoRepository asientoRepo;
    private final PilotoRepository pilotoRepo;
    private final FechaRepository fechaRepo;
    private final VueloRepository vueloRepo;
    private final TarifaRepository tarifaRepo;
    private final UsuarioRepository usuarioRepo;


    @PostConstruct
    public void init() {
        // 1. Ciudades
        Ciudad c1 = new Ciudad("Rio Negro");
        Ciudad c2 = new Ciudad("Cordoba");
        Ciudad c3 = new Ciudad("Buenos Aires");
        ciudadRepo.saveAll(Arrays.asList(c1, c2, c3));

        // 2. Aeropuertos
        Aeropuerto a1 = new Aeropuerto("El Plumerillo", c1);
        Aeropuerto a2 = new Aeropuerto("Ambrosio Taravella", c2);
        Aeropuerto a3 = new Aeropuerto("Ezeiza", c3);
        aeropuertoRepo.saveAll(Arrays.asList(a1, a2, a3));

        // 3. Aerolíneas
        Aerolinea ar1 = new Aerolinea("Aerolíneas Argentinas");
        Aerolinea ar2 = new Aerolinea("FlyBondi");
        aerolineaRepo.saveAll(Arrays.asList(ar1, ar2));

        // 4. Aviones y Asientos
        Avion av1 = new Avion(131);
        Avion av2 = new Avion(626);

        avionRepo.saveAll(List.of(av1, av2));

        configurarAsientos(av1);
        configurarAsientos(av2);

        asientoRepo.saveAll(av1.getAsientos());
        asientoRepo.saveAll(av2.getAsientos());

//        avionRepo.saveAll(List.of(av1, av2));

        // 5. Fecha
        Fecha fecha1 = new Fecha(new Date());
        fechaRepo.save(fecha1);
        Fecha fecha2 = new Fecha(new Date());
        fechaRepo.save(fecha2);

        // 6. Pilotos
        Piloto p1 = new Piloto(111, "Carlos", "Martinez", 111);
        Piloto p2 = new Piloto(222, "Juan", "Sanchez", 222);
        pilotoRepo.saveAll(List.of(p1, p2));

        // 7. Usuario
        Usuario u1 = new Usuario(333, "usuario1", "usuario@mail.com", 333, "Marta", "Martinez");
        usuarioRepo.save(u1);

        // 8. Vuelos (crear completamente antes de guardar)
        Vuelo v1 = new Vuelo();
        v1.setNumeroVuelo(101);
        v1.setAvion(av1);
        v1.setPiloto(p1);
        v1.setFecha(fecha1);
        v1.setAerolinea(ar1);
        v1.addAeropuerto(a1);

        Vuelo v2 = new Vuelo();
        v2.setNumeroVuelo(102);
        v2.setAvion(av2);
        v2.setPiloto(p2);
        v2.setFecha(fecha2);
        v2.setAerolinea(ar2);
        v2.addAeropuerto(a2);

        vueloRepo.saveAll(List.of(v1, v2));

        // 9. Tarifas (con vuelos ya persistidos)
        Tarifa t1 = new Tarifa(1,5000, 1000, Clase.BUSINESS, v1);
        Tarifa t2 = new Tarifa(2,3500, 800, Clase.ECONOMY, v2);
        tarifaRepo.saveAll(List.of(t1, t2));

        System.out.println("✔ Datos iniciales cargados");
    }


    private void configurarAsientos(Avion avion) {
        for (char fila = 'A'; fila <= 'C'; fila++) {
            for (int col = 1; col <= 4; col++) {
                Asiento a = new Asiento();
                a.setFilaAsiento(col);
                a.setLetraAsiento(fila);
                a.setClaseAsiento(Clase.TURISTA);
                a.setAvion(avion);
                avion.addAsiento(a);
            }
        }
    }
}
