package com.example.examen.Domain.Services;

import com.example.examen.Domain.Entities.SalidaData;
import com.example.examen.Domain.RepositoriesContracts.SalidaDataRepository;
import org.springframework.stereotype.Service;

@Service
public class SalidaDataService {

    private final SalidaDataRepository salidaDataRepository;

    public SalidaDataService(SalidaDataRepository salidaDataRepository) {
        this.salidaDataRepository = salidaDataRepository;
    }

    public SalidaData guardar(SalidaData hola){
        return salidaDataRepository.guardar(hola);
    }

    public SalidaData getData(Integer id){
        return salidaDataRepository.getData(id);
    }

    public void deleteData(Integer id){
        salidaDataRepository.deleteData(id);
    }

}
