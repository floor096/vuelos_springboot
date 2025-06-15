package com.example.Proyecto_Final_Ortiz_Florencia.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import org.hibernate.envers.Audited;

import java.io.Serializable;

@Entity
@Table(name = "reserva")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited
public class Reserva extends Base implements Serializable {

    @Column(name = "numero_reserva", unique = true, nullable = false)
    private int numeroReserva; // numeroReserva como campo regular único

    @OneToOne
    @JoinColumn(name = "fk_pago", unique = true, nullable = false) // fk_pago en la tabla 'reserva'
    private Pago pago;

    @OneToOne
    @JoinColumn(name = "fk_vuelo_reservado", nullable = false) // fk_vuelo_reservado en la tabla 'reserva'
    private Vuelo vueloReservado;

    @ManyToOne //reserva hecha por un solo usuario, un usuario -muchas reservas
    @JoinColumn(name = "fk_usuario", nullable = false) // fk en la tabla 'reserva'
    private Usuario usuario;

}