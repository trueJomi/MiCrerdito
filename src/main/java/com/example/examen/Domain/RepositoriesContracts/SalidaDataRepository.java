package com.example.examen.Domain.RepositoriesContracts;

import com.example.examen.Domain.Entities.SalidaData;

public interface SalidaDataRepository {
    SalidaData guardar(SalidaData hola);

    SalidaData getData(Integer id);

    void  deleteData(Integer id);
}
