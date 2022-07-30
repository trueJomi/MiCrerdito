package com.example.examen.application.control;

import com.example.examen.application.converters.DataConverter;
import com.example.examen.application.dto.DataDto;
import com.example.examen.application.utils.WrapperResponse;
import com.example.examen.Domain.Entities.SalidaData;
import com.example.examen.Domain.Services.SalidaDataService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping()
public class SalidaDataController {

    private final SalidaDataService salidaDataService;
    private final DataConverter dataConverter;

    public SalidaDataController(SalidaDataService salidaDataService, DataConverter dataConverter) {
        this.salidaDataService = salidaDataService;
        this.dataConverter = dataConverter;
    }

    @PostMapping
    public ResponseEntity<WrapperResponse<DataDto>> crearHola(@RequestBody DataDto data ){
        SalidaData dataTemp= dataConverter.fromDTO(data);
        SalidaData resultTemp = salidaDataService.guardar(dataTemp);
        DataDto result =dataConverter.fromEntity(resultTemp);
        return new WrapperResponse<DataDto>(true,"success",result)
                .createResponse(HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<WrapperResponse<DataDto>> getHola(@PathVariable("id") Integer id){
        SalidaData resultTemp = salidaDataService.getData(id);
        DataDto result= dataConverter.fromEntity(resultTemp);
        return new WrapperResponse<DataDto>(true,"success",result)
                .createResponse(HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<WrapperResponse<Void>> deleteHola(@PathVariable("id") Integer id){
        salidaDataService.deleteData(id);
        return new WrapperResponse<Void>(true,"success",null)
                .createResponse(HttpStatus.OK);
    }

}
