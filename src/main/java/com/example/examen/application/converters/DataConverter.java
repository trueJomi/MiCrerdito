package com.example.examen.application.converters;

import com.example.examen.Domain.Entities.SalidaData;
import com.example.examen.application.dto.DataDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
public class DataConverter extends AbstractConverter<SalidaData, DataDto> {
    @Override
    public DataDto fromEntity(SalidaData entity) {
        if(entity==null) return  null;
        return DataDto.builder()
                .id(entity.getId())
                .placaVeihiculo(entity.getPlacaVeihiculo())
                .chofer(entity.getChofer())
                .fechaSalida(entity.getFechaSalida())
                .horaSalida(entity.getHoraSalida())
                .build();
    }

    @Override
    public SalidaData fromDTO(DataDto dto) {
        if(dto==null) return  null;
        return SalidaData.builder()
                .id(dto.getId())
                .placaVeihiculo(dto.getPlacaVeihiculo())
                .chofer(dto.getChofer())
                .fechaSalida(dto.getFechaSalida())
                .horaSalida(dto.getHoraSalida())
                .build();
    }
}
