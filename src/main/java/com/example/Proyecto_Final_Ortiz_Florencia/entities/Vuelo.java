package com.example.Proyecto_Final_Ortiz_Florencia.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import org.hibernate.envers.Audited;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@JsonIgnoreProperties({"aeropuertos", "tarifas", "hibernateLazyInitializer", "handler"})
@Entity
@Table(name = "vuelo")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited
public class Vuelo extends Base implements Serializable {

    @Column(name = "numero_vuelo", unique = true, nullable = false)
    private int numeroVuelo;

    @OneToOne
    @JoinColumn(name = "fk_avion", unique = true, nullable = false)
    private Avion avion;

    @OneToMany
    @JoinColumn(name = "fk_vuelo")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "ciudad"})
    private List<Aeropuerto> aeropuertos = new ArrayList<>();

    @OneToOne
    @JoinColumn(name = "fk_piloto", unique = true, nullable = false)
    private Piloto piloto;

    @OneToOne
    @JoinColumn(name = "fk_fecha", unique = true, nullable = false)
    private Fecha fecha;

    @OneToMany(mappedBy = "vuelo", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    @JsonIgnoreProperties({"vuelo", "hibernateLazyInitializer", "handler"})
    private List<Tarifa> tarifas = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "fk_aerolinea", nullable = false)
    private Aerolinea aerolinea;

    public Vuelo(int numeroVuelo, Avion avion, Piloto piloto, Fecha fecha) {
        this.numeroVuelo = numeroVuelo;
        this.avion = avion;
        this.piloto = piloto;
        this.fecha = fecha;
    }

    public void addAeropuerto(Aeropuerto aeropuerto) {
        this.aeropuertos.add(aeropuerto);
    }

    public void removeAeropuerto(Aeropuerto aeropuerto) {
        this.aeropuertos.remove(aeropuerto);
    }

    public void addTarifa(Tarifa tarifa) {
        this.tarifas.add(tarifa);
        tarifa.setVuelo(this);
    }

    public void removeTarifa(Tarifa tarifa) {
        this.tarifas.remove(tarifa);
        tarifa.setVuelo(null);
    }

}