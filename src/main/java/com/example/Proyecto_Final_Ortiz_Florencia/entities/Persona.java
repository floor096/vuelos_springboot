package com.example.Proyecto_Final_Ortiz_Florencia.entities;

import jakarta.persistence.Column; // Importar para mapear columnas
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance; // Para la estrategia de herencia
import jakarta.persistence.InheritanceType; // Para los tipos de estrategia
import jakarta.persistence.Table; // Para el nombre de la tabla
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import org.hibernate.envers.Audited;

import java.io.Serializable;

@Entity
@Table(name = "persona")
@Inheritance(strategy = InheritanceType.JOINED)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited
public class Persona implements Serializable {

    @Id // dniPersona es el ID
    @Column(name = "dni_persona", unique = true, nullable = false) // Mapeo de columna con restricciones
    private int dniPersona; // Cambiado a private para encapsulación

    @Column(name = "nombre_persona", length = 100, nullable = false)
    private String nombrePersona;

    @Column(name = "apellido_persona", length = 100, nullable = false)
    private String apellidoPersona;
}