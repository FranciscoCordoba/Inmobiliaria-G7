package inmobiliaria.Modelo;

import java.time.LocalDate;

public class Contrato {
    
    private int idContrato;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private boolean activo;
    private double monto;
    private Inquilino inquilinoContrato;
    private Propietario propietarioContrato;
    private Inmueble propiedadContrato;

    public Contrato() {
    }

    public Contrato(int idContrato, LocalDate fechaInicio, LocalDate fechaFin, boolean activo, double monto, Inquilino inquilinoContrato,Propietario propietarioContrato, Inmueble propiedadContrato) {
	this.idContrato = idContrato;
	this.fechaInicio = fechaInicio;
	this.fechaFin = fechaFin;
	this.activo = activo;
	this.monto = monto;
	this.inquilinoContrato = inquilinoContrato;
        this.propietarioContrato= propietarioContrato;
	this.propiedadContrato = propiedadContrato;
    }

    public Contrato(LocalDate fechaInicio, LocalDate fechaFin, boolean activo, double monto, Inquilino inquilinoContrato, Propietario propietarioContrato, Inmueble propiedadContrato) {
	this.fechaInicio = fechaInicio;
	this.fechaFin = fechaFin;
	this.activo = activo;
	this.monto = monto;
	this.inquilinoContrato = inquilinoContrato;
	this.propietarioContrato = propietarioContrato;
	this.propiedadContrato = propiedadContrato;
    }

    public void setInquilinoContrato(Inquilino inquilinoContrato) {
        this.inquilinoContrato = inquilinoContrato;
    }

    public Propietario getPropietarioContrato() {
        return propietarioContrato;
    }

    public void setPropietarioContrato(Propietario propietarioContrato) {
        this.propietarioContrato = propietarioContrato;
    }
    
    

    public int getIdContrato() {
	return idContrato;
    }

    public void setIdContrato(int idContrato) {
        this.idContrato = idContrato;
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


    public Inmueble getPropiedadContrato() {
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

    public void setPropiedadContrato(Inmueble propiedadContrato) {
	this.propiedadContrato = propiedadContrato;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + this.idContrato;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Contrato other = (Contrato) obj;
        if (this.idContrato != other.idContrato) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Contrato{" + "idContrato=" + idContrato + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", activo=" + activo + ", monto=" + monto + ", inquilinoContrato=" + inquilinoContrato + ", propietarioContrato=" + propietarioContrato + ", propiedadContrato=" + propiedadContrato + '}';
    }

   
    
    
              
}
