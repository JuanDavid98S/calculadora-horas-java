package com.calculadoraapp.calculadorahorastrabajo.persistence;

import com.calculadoraapp.calculadorahorastrabajo.persistence.crud.ReporteServicioCrudRepository;
import com.calculadoraapp.calculadorahorastrabajo.persistence.entity.ReporteServicio;

import java.util.Optional;

public class ReporteServicioRepository {

    private ReporteServicioCrudRepository reporteServicioCrudRepository;

    public Optional<ReporteServicio> getById(String idTecnico){
        return reporteServicioCrudRepository.findById(idTecnico);
    }
}
