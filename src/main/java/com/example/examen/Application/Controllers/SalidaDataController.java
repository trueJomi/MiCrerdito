package com.example.examen.Application.Controllers;

import com.example.examen.Application.utils.WrapperResponse;
import com.example.examen.Domain.Entities.SalidaData;
import com.example.examen.Domain.Services.SalidaDataService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping()
public class SalidaDataController {

    private final SalidaDataService salidaDataService;

    public SalidaDataController(SalidaDataService salidaDataService) {
        this.salidaDataService = salidaDataService;
    }

    @PostMapping
    public ResponseEntity<WrapperResponse<SalidaData>> crearHola(@RequestBody SalidaData hola ){
        SalidaData result = salidaDataService.guardar(hola);
        return new WrapperResponse<SalidaData>(true,"success",result)
                .createResponse(HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<WrapperResponse<SalidaData>> getHola(@PathVariable("id") Integer id){
        SalidaData result = salidaDataService.getData(id);
        return new WrapperResponse<SalidaData>(true,"success",result)
                .createResponse(HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<WrapperResponse<Void>> deleteHola(@PathVariable("id") Integer id){
        salidaDataService.deleteData(id);
        return new WrapperResponse<Void>(true,"success",null)
                .createResponse(HttpStatus.OK);
    }

}
