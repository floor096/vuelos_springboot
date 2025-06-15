package com.example.Proyecto_Final_Ortiz_Florencia.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import org.hibernate.envers.Audited;

import java.io.Serializable;

@Entity
@Table(name = "pago")
@Inheritance(strategy = InheritanceType.JOINED)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited
public class Pago extends Base implements Serializable {

    @Column(name = "numero_pago", unique = true, nullable = false)
    private int numeroPago;

    @Column(name = "cantidad_pago", nullable = false)
    private double cantidadPago;
}