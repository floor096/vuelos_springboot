package com.example.Proyecto_Final_Ortiz_Florencia.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import org.hibernate.envers.Audited;

@Entity
@Table(name = "tarjeta")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited
public class Tarjeta extends Pago {

    @Column(name = "numero_tarjeta", nullable = false)
    private int numeroTarjeta;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo_tarjeta", nullable = false, length = 50)
    private TipoTarjeta tipoTarjeta;

    @ManyToOne // tarjeta pertenece a un solo usuario, pero un usuario puede tener muchas tarjetas
    @JoinColumn(name = "fk_usuario", nullable = false) // fk en la tabla 'tarjeta'
    private Usuario usuario;
}