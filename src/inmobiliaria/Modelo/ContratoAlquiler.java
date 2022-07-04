package inmobiliaria.Modelo;

import java.time.LocalDate;

public class ContratoAlquiler {
    
    private int idContrato;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private boolean activo;
    private double monto;
    private Inquilino inquilinoContrato;
    private Propietario propietarioContrato;
    private PropiedadInmueble propiedadContrato;

    public ContratoAlquiler() {
    }

    public ContratoAlquiler(int idContrato, LocalDate fechaInicio, LocalDate fechaFin, boolean activo, double monto, Inquilino inquilinoContrato, Propietario propietarioContrato, PropiedadInmueble propiedadContrato) {
	this.idContrato = idContrato;
	this.fechaInicio = fechaInicio;
	this.fechaFin = fechaFin;
	this.activo = activo;
	this.monto = monto;
	this.inquilinoContrato = inquilinoContrato;
	this.propietarioContrato = propietarioContrato;
	this.propiedadContrato = propiedadContrato;
    }

    public ContratoAlquiler(LocalDate fechaInicio, LocalDate fechaFin, boolean activo, double monto, Inquilino inquilinoContrato, Propietario propietarioContrato, PropiedadInmueble propiedadContrato) {
	this.fechaInicio = fechaInicio;
	this.fechaFin = fechaFin;
	this.activo = activo;
	this.monto = monto;
	this.inquilinoContrato = inquilinoContrato;
	this.propietarioContrato = propietarioContrato;
	this.propiedadContrato = propiedadContrato;
    }

    public int getIdContrato() {
	return idContrato;
    }

    public LocalDate getFechaInicio() {
	return fechaInicio;
    }

    public LocalDate getFechaFin() {
	return fechaFin;
    }

    public boolean isActivo() {
	return activo;
    }

    public double getMonto() {
	return monto;
    }

    public Inquilino getInquilinoContrato() {
	return inquilinoContrato;
    }

    public Propietario getPropietarioContrato() {
	return propietarioContrato;
    }

    public PropiedadInmueble getPropiedadContrato() {
	return propiedadContrato;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
	this.fechaInicio = fechaInicio;
    }

    public void setFechaFin(LocalDate fechaFin) {
	this.fechaFin = fechaFin;
    }

    public void setActivo(boolean activo) {
	this.activo = activo;
    }

    public void setMonto(double monto) {
	this.monto = monto;
    }

    public void setPropietarioContrato(Propietario propietarioContrato) {
	this.propietarioContrato = propietarioContrato;
    }

    public void setPropiedadContrato(PropiedadInmueble propiedadContrato) {
	this.propiedadContrato = propiedadContrato;
    }
              
}
