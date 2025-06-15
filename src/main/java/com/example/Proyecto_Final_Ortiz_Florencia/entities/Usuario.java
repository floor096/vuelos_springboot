package com.example.Proyecto_Final_Ortiz_Florencia.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType; // Para Lazy/Eager loading
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import org.hibernate.envers.Audited;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "usuario")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited
public class Usuario extends Persona implements Serializable {

    @Column(name = "numero_usuario", unique = true, nullable = false)
    private int numeroUsuario;

    @Column(name = "contrasena_usuario", nullable = true, length = 255)
    private String contraseñaUsuario;

    @Column(name = "correo_electronico_usuario", unique = true, nullable = true, length = 150)
    private String correoElectronicoUsuario;

    // Relación OneToMany con Tarjeta --Tarjeta tiene la fk a Usuario.
    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private List<Tarjeta> tarjetas = new ArrayList<>();

    // Relación OneToMany con Consulta-Consulta tiene la fk a Usuario.
    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private List<Consulta> consultas = new ArrayList<>();

    // Relación OneToMany con Reserva- Reserva tiene la fk a Usuario
    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private List<Reserva> reservas = new ArrayList<>();

//    public Usuario(int dniPersona, String nombrePersona, String apellidoPersona, int numeroUsuario) {
//        super(dniPersona, nombrePersona, apellidoPersona);
//        this.numeroUsuario = numeroUsuario;
//    }

    public Usuario(int numeroUsuario, String contraseñaUsuario, String correoElectronicoUsuario, int dniPersona, String nombrePersona, String apellidoPersona) {
        super(dniPersona, nombrePersona, apellidoPersona);
        this.numeroUsuario = numeroUsuario;
        this.contraseñaUsuario = contraseñaUsuario;
        this.correoElectronicoUsuario = correoElectronicoUsuario;
    }

    // Métodos para mantener la bidireccionalidad
    public void addTarjeta(Tarjeta tarjeta) {
        this.tarjetas.add(tarjeta);
        tarjeta.setUsuario(this);
    }

    public void removeTarjeta(Tarjeta tarjeta) {
        this.tarjetas.remove(tarjeta);
        tarjeta.setUsuario(null);
    }

    public void addConsulta(Consulta consulta) {
        this.consultas.add(consulta);
        consulta.setUsuario(this);
    }

    public void removeConsulta(Consulta consulta) {
        this.consultas.remove(consulta);
        consulta.setUsuario(null);
    }

    public void addReserva(Reserva reserva) {
        this.reservas.add(reserva);
        reserva.setUsuario(this);
    }

    public void removeReserva(Reserva reserva) {
        this.reservas.remove(reserva);
        reserva.setUsuario(null);
    }
}