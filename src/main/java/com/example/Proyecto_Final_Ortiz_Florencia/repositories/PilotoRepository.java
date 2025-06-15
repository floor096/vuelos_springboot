package com.example.Proyecto_Final_Ortiz_Florencia.repositories;

import com.example.Proyecto_Final_Ortiz_Florencia.entities.Piloto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PilotoRepository extends JpaRepository<Piloto, Integer> {
    // Piloto findByNumeroLicencia(String numeroLicencia);
    // List<Piloto> findByNombreContaining(String nombre); // Hereda campos de Persona
    // List<Piloto> findByHorasDeVueloGreaterThan(int horas); // Asumiendo que Piloto tiene este campo

}
