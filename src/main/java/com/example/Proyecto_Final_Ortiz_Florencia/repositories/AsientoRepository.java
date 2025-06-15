package com.example.Proyecto_Final_Ortiz_Florencia.repositories;

import com.example.Proyecto_Final_Ortiz_Florencia.entities.Asiento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface AsientoRepository extends JpaRepository<Asiento, Integer> {
    // List<Asiento> findByIdClaseAsiento(Clase clase); // Si Clase es un enum dentro de AsientoId
    // List<Asiento> findByIdFilaAsiento(int fila);
    // List<Asiento> findByAvionId(Long avionId); // Si Avion extiende Base
    // List<Asiento> findByAvionIdAndIdClaseAsiento(Long avionId, Clase clase);
    List<Asiento> findByAvionId(Long avionId);
}
