package com.calculadoraapp.calculadorahorastrabajo.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "reporte_servicio")
public class ReporteServicio {

    @Column(name = "idtecnico")
    private String idTecnico;

    @Column(name = "idservicio")
    private String idServicio;

    @Column(name = "fecha_inicio")
    private LocalDateTime fechaInicio;

    @Column(name = "fecha_fin")
    private LocalDateTime fechaFin;

    public ReporteServicio() {
    }

    public ReporteServicio(String idTecnico, String idServicio, LocalDateTime fechaInicio, LocalDateTime fechaFin) {
        this.idTecnico = idTecnico;
        this.idServicio = idServicio;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public String getIdTecnico() {
        return idTecnico;
    }

    public void setIdTecnico(String idTecnico) {
        this.idTecnico = idTecnico;
    }

    public String getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(String idServicio) {
        this.idServicio = idServicio;
    }

    public LocalDateTime getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDateTime fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDateTime getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDateTime fechaFin) {
        this.fechaFin = fechaFin;
    }
}
