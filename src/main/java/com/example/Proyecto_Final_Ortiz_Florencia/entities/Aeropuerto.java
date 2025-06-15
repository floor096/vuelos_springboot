package com.example.Proyecto_Final_Ortiz_Florencia.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import org.hibernate.envers.Audited;

import java.io.Serializable;

@Entity
@Table(name = "aeropuerto")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited
public class Aeropuerto extends Base implements Serializable {

    @Column(name = "nombre_aeropuerto", unique = true, nullable = false, length = 100)
    private String nombreAeropuerto;

    @OneToOne
    @JoinColumn(name = "fk_ciudad")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Ciudad ciudad;

    @ManyToOne
    @JoinColumn(name = "fk_vuelo")
    @JsonIgnore
    private Vuelo vuelo;

    public Aeropuerto(String nombreAeropuerto, Ciudad ciudad) {
        this.nombreAeropuerto = nombreAeropuerto;
        this.ciudad = ciudad;
    }
}