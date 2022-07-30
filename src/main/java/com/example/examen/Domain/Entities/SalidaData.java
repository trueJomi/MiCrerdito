package com.example.examen.Domain.Entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.sql.Time;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder

public class SalidaData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "America/Lima")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @Temporal(TemporalType.DATE)
    @Column(name = "fecha_salida",nullable = false)
    private Date fechaSalida;

    @JsonFormat(pattern = "HH:mm:ss",timezone = "America/Lima")
    @Column(name = "hora_salida",nullable = false)
    private Time horaSalida;

    @Column(name = "placa_vehivulo",nullable = false,length = 12)
    private String placaVeihiculo;

    @Column(name = "chofer", nullable = false, length = 50)
    private String chofer;
}
