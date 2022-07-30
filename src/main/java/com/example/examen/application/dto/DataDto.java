package com.example.examen.application.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.sql.Time;
import java.util.Date;

@Setter
@Builder
@Getter
public class DataDto {
    private Integer id;
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "America/Lima")
    private Date fechaSalida;
    @JsonFormat(pattern = "HH:mm:ss",timezone = "America/Lima")
    private Time horaSalida;
    private String placaVeihiculo;
    private String chofer;
}
