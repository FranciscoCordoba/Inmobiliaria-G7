package inmobiliaria.Modelo;

public class Inquilino {
    
    private int idInquilino;
    private String nombre;
    private String apellido;
    private long dni;
    private long cuit;
    private String lugarTrabajo;
    private String nombreGarante;
    private long dniGarante;
    private boolean activo;
    
    
//Constructor vacio
    public Inquilino() {
    }
//Constructor sin Id
    public Inquilino(String nombre, String apellido, long dni, long cuit, String lugarTrabajo, String nombreGarante , long dniGarante , boolean activo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.cuit = cuit;
        this.lugarTrabajo = lugarTrabajo;
        this.nombreGarante = nombreGarante;
        this.dniGarante = dniGarante;
        this.activo = activo;
    }
//Constructor con Id
    public Inquilino(int idInquilino, String nombre, String apellido, long dni, long cuit, String lugarTrabajo, String nombreGarante, long dniGarante, boolean activo) {
        this.idInquilino = idInquilino;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.cuit = cuit;
        this.lugarTrabajo = lugarTrabajo;
        this.nombreGarante = nombreGarante;
        this.dniGarante = dniGarante;
        this.activo = activo;
    }
//Setters and Getters
    public int getIdInquilino() {
        return idInquilino;
    }

    public void setIdInquilino(int idInquilino) {
        this.idInquilino = idInquilino;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public long getCuit() {
        return cuit;
    }

    public void setCuit(long cuit) {
        this.cuit = cuit;
    }

    public String getLugarTrabajo() {
        return lugarTrabajo;
    }

    public void setLugarTrabajo(String lugarTrabajo) {
        this.lugarTrabajo = lugarTrabajo;
    }

    public String getNombreGarante() {
        return nombreGarante;
    }

    public void setNombreGarante(String nombreGarante) {
        this.nombreGarante = nombreGarante;
    }

    public long getDniGarante() {
        return dniGarante;
    }

    public void setDniGarante(long dniGarante) {
        this.dniGarante = dniGarante;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    
    



    //hashCode y equals de Id
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + this.idInquilino;
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
        final Inquilino other = (Inquilino) obj;
        if (this.idInquilino != other.idInquilino) {
            return false;
        }
        return true;
    }
    
    //toString

    @Override
    public String toString() {
        return "Inquilino{" + "idInquilino=" + idInquilino + ", nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", cuit=" + cuit + ", lugarTrabajo=" + lugarTrabajo + ", nombreGarante=" + nombreGarante + ", dniGarante=" + dniGarante+ '}';
    }
    
    
    
    
    
    
    
    
    
}
