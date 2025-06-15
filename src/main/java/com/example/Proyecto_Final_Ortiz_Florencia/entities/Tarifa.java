package com.example.Proyecto_Final_Ortiz_Florencia.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import org.hibernate.envers.Audited;

import java.io.Serializable;

@Entity
@Table(name = "tarifa")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited
public class Tarifa extends Base implements Serializable {

    @Column(name = "numero_tarifa", unique = true, nullable = false)
    private int numeroTarifa;

    @Column(name = "impuesto_tarifa", nullable = false)
    private int impuestoTarifa;

    @Column(name = "precio_tarifa", nullable = false)
    private int precioTarifa;

    @Enumerated(EnumType.STRING) // enum como String en la BD
    @Column(name = "clase_tarifa", nullable = false, length = 50)
    private Clase claseTarifa; // enum Clase

    @ManyToOne // Muchas tarifas a un vuelo
    @JoinColumn(name = "fk_vuelo", nullable = false)
    @JsonIgnore
    private Vuelo vuelo;

//    public Tarifa(int precioTarifa, int impuestoTarifa, Clase claseTarifa, Vuelo vuelo) {
//        this.precioTarifa = precioTarifa;
//        this.impuestoTarifa = impuestoTarifa;
//        this.claseTarifa = claseTarifa;
//        this.vuelo = vuelo;
//    }

}