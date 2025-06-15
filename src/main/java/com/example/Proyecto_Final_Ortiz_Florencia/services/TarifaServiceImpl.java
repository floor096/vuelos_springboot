package com.example.Proyecto_Final_Ortiz_Florencia.services;

import com.example.Proyecto_Final_Ortiz_Florencia.entities.Clase;
import com.example.Proyecto_Final_Ortiz_Florencia.entities.Tarifa;
import com.example.Proyecto_Final_Ortiz_Florencia.repositories.BaseRepository;
import com.example.Proyecto_Final_Ortiz_Florencia.repositories.TarifaRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TarifaServiceImpl extends BaseServiceImpl<Tarifa, Long> implements TarifaService {
    public TarifaServiceImpl(BaseRepository<Tarifa, Long> baseRepository) {
        super(baseRepository);
    }

}

//@Service
//public class TarifaServiceImpl extends BaseServiceImpl<Tarifa, Long> implements TarifaService {
//
//    private final TarifaRepository tarifaRepository; // Declara tu repositorio específico
//
//    // Modifica el constructor para inyectar TarifaRepository
//    public TarifaServiceImpl(BaseRepository<Tarifa, Long> baseRepository, TarifaRepository tarifaRepository) {
//        super(baseRepository);
//        this.tarifaRepository = tarifaRepository; // Asigna el repositorio específico
//    }
//
//    /**
//     * Busca una tarifa por el número de vuelo asociado y la clase del asiento.
//     * @param numeroVuelo El número del vuelo.
//     * @param clase La clase del asiento (ej. ECONOMICA, PRIMERA_CLASE).
//     * @return La Tarifa encontrada, o null si no existe.
//     */
//    public Tarifa obtenerTarifaVueloClase(Integer numeroVuelo, Clase clase) {
//        // Asumiendo que Tarifa tiene una relación con Vuelo y puedes acceder al numeroVuelo
//        // y que tiene un campo 'clase'
//        Optional<Tarifa> tarifa = tarifaRepository.findByVueloNumeroVueloAndClase(numeroVuelo, clase);
//        return tarifa.orElse(null); // Retorna la tarifa o null si no se encuentra
//    }
//}