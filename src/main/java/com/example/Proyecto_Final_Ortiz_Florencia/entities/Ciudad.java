package com.example.Proyecto_Final_Ortiz_Florencia.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import org.hibernate.envers.Audited;

import java.io.Serializable;

@Entity
@Table(name = "ciudad")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited
public class Ciudad extends Base implements Serializable {

    @Column(name = "nombre_ciudad", unique = true, nullable = false, length = 100)
    private String nombreCiudad;
}