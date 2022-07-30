package com.example.examen.Infraetructure.Imp;

import com.example.examen.Application.exception.ResourceNotFoundException;
import com.example.examen.Domain.Entities.SalidaData;
import com.example.examen.Domain.RepositoriesContracts.SalidaDataRepository;
import com.example.examen.Infraetructure.Repositories.SalidaDataRepositoryJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SalidaDataRpositoryImp implements SalidaDataRepository {

    @Autowired
    SalidaDataRepositoryJPA db;


    @Override
    public SalidaData guardar(SalidaData hola) {
        return db.save(hola);
    }

    @Override
    public SalidaData getData(Integer id) {
        return db.findById(id).orElseThrow(
                        ()-> new ResourceNotFoundException("no existe: "+id));
    }

    @Override
    public void deleteData(Integer id) {
        db.deleteById(id);
    }
}
