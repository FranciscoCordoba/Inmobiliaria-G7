package inmobiliaria.Modelo;

public class Propietario {
    //A
    private int idPropietario;
    private String nombre;
    private String apellido;
    private long dni;
    private String domicilio;
    private long telefono;
    private boolean activo;
    
    //C
    public Propietario() {
    }

    public Propietario(String nombre, String apellido, long dni, String domicilio, long telefono, boolean activo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.activo = activo;
    }

    public Propietario(int idPropietario, String nombre, String apellido, long dni, String domicilio, long telefono, boolean activo) {
        this.idPropietario = idPropietario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.activo = activo;
    }
    
    //M

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    
    
    public void setIdPropietario(int idPropietario) {
        this.idPropietario = idPropietario;
    }

    public int getId() {
        return idPropietario;
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

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }



    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + this.idPropietario;
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
        final Propietario other = (Propietario) obj;
        if (this.idPropietario != other.idPropietario) {
            return false;
        }
        return true;
    }
    
    

    @Override
    public String toString() {
        return "Propietario{" + "id=" + idPropietario + ", nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", domicilio=" + domicilio + ", telefono=" + telefono + '}';
    }
    
}
