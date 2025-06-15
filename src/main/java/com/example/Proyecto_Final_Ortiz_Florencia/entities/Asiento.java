package com.example.Proyecto_Final_Ortiz_Florencia.entities;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import org.hibernate.envers.Audited;

import java.io.Serializable;

@Entity
@Table(name = "asiento")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited
public class Asiento implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "fila_asiento", nullable = false)
    private int filaAsiento;

    @Column(name = "letra_asiento", nullable = false)
    private char letraAsiento;

    @Enumerated(EnumType.STRING)
    @Column(name = "clase_asiento", nullable = false)
    private Clase claseAsiento;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "id_avion", nullable = false)
    private Avion avion;

}