package com.example.Proyecto_Final_Ortiz_Florencia.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import org.hibernate.envers.Audited;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

@Entity
@Table(name = "fecha")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited
public class Fecha extends Base implements Serializable {

    @Temporal(TemporalType.DATE)
    @Column(name = "fecha_vuelo", nullable = false)
    private Date fecha;

    @Override
    public String toString() {
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(fecha);
    }
}