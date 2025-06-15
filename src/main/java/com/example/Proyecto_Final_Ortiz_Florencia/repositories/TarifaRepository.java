package com.example.Proyecto_Final_Ortiz_Florencia.repositories;

import com.example.Proyecto_Final_Ortiz_Florencia.entities.Clase;
import com.example.Proyecto_Final_Ortiz_Florencia.entities.Tarifa;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TarifaRepository extends BaseRepository<Tarifa, Long>{
    // List<Tarifa> findByClase(Clase clase); // Asumiendo que 'Clase' es el tipo de tu enum Clase
    // List<Tarifa> findByPrecioBetween(double minPrecio, double maxPrecio);
    // List<Tarifa> findByVueloId(Long vueloId); // Si el Vuelo está asociado por su ID
    // List<Tarifa> findByVueloNumeroVuelo(int numeroVuelo); // Si el Vuelo está asociado por su numeroVuelo
//    Optional<Tarifa> findByVueloNumeroVueloAndClase(Integer numeroVuelo, Clase clase);
}
