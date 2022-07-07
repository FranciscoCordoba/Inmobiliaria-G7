package inmobiliaria.Modelo;

public class Inmueble {
    
    private String direccion;
    private int altura;
    private boolean disponibilidad;
    private String tipoDeInmueble;
    private String zona;
    private double superficie;
    private double precioBase;
    private int idInmueble;
    private Inquilino ocupante;
    private Propietario propietarioInmueble;

    public Inmueble() {
    }

    public Inmueble(String direccion, int altura, boolean disponibilidad, String tipoDeInmueble, String zona, double superficie, double precioBase, Inquilino ocupante, Propietario propietarioInmueble) {
        this.direccion = direccion;
        this.altura = altura;
        this.disponibilidad = disponibilidad;
        this.tipoDeInmueble = tipoDeInmueble;
        this.zona = zona;
        this.superficie = superficie;
        this.precioBase = precioBase;
        this.ocupante = ocupante;
        this.propietarioInmueble = propietarioInmueble;
    }

    public Inmueble(String direccion, int altura, boolean disponibilidad, String tipoDeInmueble, String zona, double superficie, double precioBase, int idInmueble, Inquilino ocupante, Propietario propietarioInmueble) {
        this.direccion = direccion;
        this.altura = altura;
        this.disponibilidad = disponibilidad;
        this.tipoDeInmueble = tipoDeInmueble;
        this.zona = zona;
        this.superficie = superficie;
        this.precioBase = precioBase;
        this.idInmueble = idInmueble;
        this.ocupante = ocupante;
        this.propietarioInmueble = propietarioInmueble;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public String getTipoDeInmueble() {
        return tipoDeInmueble;
    }

    public void setTipoDeInmueble(String tipoDeInmueble) {
        this.tipoDeInmueble = tipoDeInmueble;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public int getIdInmueble() {
        return idInmueble;
    }

    public void setIdInmueble(int idInmueble) {
        this.idInmueble = idInmueble;
    }

    public Inquilino getOcupante() {
        return ocupante;
    }

    public void setOcupante(Inquilino ocupante) {
        this.ocupante = ocupante;
    }

    public Propietario getPropietarioInmueble() {
        return propietarioInmueble;
    }

    public void setPropietarioInmueble(Propietario propietarioInmueble) {
        this.propietarioInmueble = propietarioInmueble;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + this.idInmueble;
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
        final Inmueble other = (Inmueble) obj;
        if (this.idInmueble != other.idInmueble) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Inmueble{" + "direccion=" + direccion + ", altura=" + altura + ", disponibilidad=" + disponibilidad + ", tipoDeInmueble=" + tipoDeInmueble + ", zona=" + zona + ", superficie=" + superficie + ", precioBase=" + precioBase + ", idInmueble=" + idInmueble + ", ocupante=" + ocupante + ", propietarioInmueble=" + propietarioInmueble + '}';
    }
    
    
    
    
    
}
