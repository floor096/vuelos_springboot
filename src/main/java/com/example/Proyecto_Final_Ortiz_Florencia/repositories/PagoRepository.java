package com.example.Proyecto_Final_Ortiz_Florencia.repositories;

import com.example.Proyecto_Final_Ortiz_Florencia.entities.Pago;
import org.springframework.stereotype.Repository;

@Repository
public interface PagoRepository extends BaseRepository<Pago, Long> {
    // Pago findByNumeroPago(int numeroPago);
    // List<Pago> findByCantidadPagoGreaterThan(double cantidad);
}
