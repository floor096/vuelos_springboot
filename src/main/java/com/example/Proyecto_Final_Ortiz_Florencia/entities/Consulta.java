package com.example.Proyecto_Final_Ortiz_Florencia.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import org.hibernate.envers.Audited;

import java.io.Serializable;

@Entity
@Table(name = "consulta")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited
public class Consulta extends Base implements Serializable {

    @Column(name = "numero_consulta", unique = true, nullable = false) // numeroConsulta campo regular único
    private int numeroConsulta;

    @OneToOne // Relación uno a uno
    @JoinColumn(name = "fk_vuelo", nullable = false) // fk en la tabla 'consulta'
    private Vuelo vuelo;

    @ManyToOne //consulta hecha por un solo usuario, un usuario - muchas consultas
    @JoinColumn(name = "fk_usuario", nullable = false) // fk en la tabla 'consulta'
    private Usuario usuario;
}