package com.example.Proyecto_Final_Ortiz_Florencia.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import org.hibernate.envers.Audited;

@Entity
@Table(name = "piloto")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited
public class Piloto extends Persona {

    @Column(name = "numero_piloto", unique = true, nullable = false)
    private int numeroPiloto;

    public Piloto(int dniPersona, String nombrePersona, String apellidoPersona, int numeroPiloto) {
        super(dniPersona, nombrePersona, apellidoPersona);
        this.numeroPiloto = numeroPiloto;
    }
}