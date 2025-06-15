package com.example.Proyecto_Final_Ortiz_Florencia.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType; // Para las relaciones
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.*;

import org.hibernate.envers.Audited;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties({"asientos", "hibernateLazyInitializer", "handler"})
@Entity
@Table(name = "avion")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Audited
public class Avion extends Base implements Especificacion, Serializable {

    @Column(name = "numero_avion", unique = true, nullable = false)
    private int numeroAvion;

    // Relación OneToMany con Asiento
    @OneToMany(mappedBy = "avion", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    @JsonIgnore
    private List<Asiento> asientos = new ArrayList<>();

    public Avion(int numeroAvion) {
        this.numeroAvion = numeroAvion;
    }

    // Métodos de conveniencia para gestionar la relación bidireccional
    public void addAsiento(Asiento asiento) {
        asientos.add(asiento);
        asiento.setAvion(this);
    }

    public void removeAsiento(Asiento asiento) {
        asientos.remove(asiento);
        asiento.setAvion(null);
    }

    // Métodos de la interfaz Especificacion
    @Override
    public String tipoTurbina() {
        return "Estandar";
    }

    @Override
    public String tipoAvion() {
        return "Avion comercial";
    }
}