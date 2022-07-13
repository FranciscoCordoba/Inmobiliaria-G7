package inmobiliaria.Data;

import inmobiliaria.Modelo.Inmueble;
import inmobiliaria.Modelo.Inquilino;
import inmobiliaria.Modelo.Propietario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class PropiedadData {

    Connection con = null;
    InquilinoData inquiData;
    PropietarioData propData;

    public PropiedadData(Conexion conexion) {
        con = conexion.getConexion();
    }

    public ArrayList<Inmueble> buscarInmueblesDeXPropietario(int idPropietario) {

        ArrayList<Inmueble> propiedades = new ArrayList<>();

        try {

            String sql = "SELECT * FROM inmueble WHERE propietarioInmueble = ?;";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idPropietario);

            ResultSet resultSet = ps.executeQuery();

            Inmueble inmueble;

            while (resultSet.next()) {
                inmueble = new Inmueble();

                inmueble.setDireccion(resultSet.getString("direccion"));
                inmueble.setAltura(resultSet.getInt("altura"));
                inmueble.setDisponibilidad((resultSet.getBoolean("disponibilidad")));
                inmueble.setTipoDeInmueble((resultSet.getString("tipoDeInmueble")));
                inmueble.setZona((resultSet.getString("zona")));
                inmueble.setSuperficie((resultSet.getDouble("superficie")));
                inmueble.setPrecioBase((resultSet.getDouble("precioBase")));
                inmueble.setIdInmueble((resultSet.getInt("idInmueble")));
                inmueble.setCantAmbientes(resultSet.getInt("cantAmbientes"));

                Inquilino i = inquiData.obtenerInquilinoXId(resultSet.getInt("idInquilino"));
                inmueble.setOcupante(i);

                Propietario p = propData.obtenerPropietarioPorId(idPropietario);
                inmueble.setPropietarioInmueble(p);

                propiedades.add(inmueble);
            }
            
            ps.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al conseguir las propiedades");
        }

        return propiedades;
    }

    public ArrayList<Inmueble> buscarInmueblesDeXInquilino(int idInquilino) {

        ArrayList<Inmueble> propiedades = new ArrayList<>();

        try {

            String sql = "SELECT * FROM inmueble WHERE ocupante = ?;";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idInquilino);

            ResultSet resultSet = ps.executeQuery();

            Inmueble inmueble;

            while (resultSet.next()) {
                inmueble = new Inmueble();

                inmueble.setDireccion(resultSet.getString("direccion"));
                inmueble.setAltura(resultSet.getInt("altura"));
                inmueble.setDisponibilidad((resultSet.getBoolean("disponibilidad")));
                inmueble.setTipoDeInmueble((resultSet.getString("tipoDeInmueble")));
                inmueble.setZona((resultSet.getString("zona")));
                inmueble.setSuperficie((resultSet.getDouble("superficie")));
                inmueble.setPrecioBase((resultSet.getDouble("precioBase")));
                inmueble.setIdInmueble((resultSet.getInt("idInmueble")));
                inmueble.setCantAmbientes(resultSet.getInt("cantAmbientes"));

                Inquilino i = inquiData.obtenerInquilinoXId(idInquilino);
                inmueble.setOcupante(i);

                Propietario p = propData.obtenerPropietarioPorId(resultSet.getInt("propietarioInmueble"));
                inmueble.setPropietarioInmueble(p);

                propiedades.add(inmueble);
            }
            
            ps.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al conseguir las propiedades");
        }

        return propiedades;
    }

    public Inmueble buscarInmuebleXId(int id) {

        
        Inmueble inmueble = new Inmueble();
        
        try {

            String sql = "SELECT * FROM inmueble WHERE idInmueble = ?;";

            PreparedStatement ps = con.prepareCall(sql);
            ps.setInt(1, id);

            ResultSet resultSet = ps.executeQuery();
            
            inmueble.setDireccion(resultSet.getString("direccion"));
            inmueble.setAltura(resultSet.getInt("altura"));
            inmueble.setDisponibilidad((resultSet.getBoolean("disponibilidad")));
            inmueble.setTipoDeInmueble((resultSet.getString("tipoDeInmueble")));
            inmueble.setZona((resultSet.getString("zona")));
            inmueble.setSuperficie((resultSet.getDouble("superficie")));
            inmueble.setPrecioBase((resultSet.getDouble("precioBase")));
            inmueble.setIdInmueble((resultSet.getInt("idInmueble")));
            inmueble.setCantAmbientes(resultSet.getInt("cantAmbientes"));

            Inquilino i = inquiData.obtenerInquilinoXId(resultSet.getInt("idInquilino"));
            inmueble.setOcupante(i);

            Propietario p = propData.obtenerPropietarioPorId(resultSet.getInt("propietarioInmueble"));
            inmueble.setPropietarioInmueble(p);
            
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al conseguir la propiedad");
        }

        return inmueble;
    }
    
    public boolean borrarInmuebleXId(int id){
        boolean inm= false;
        try {
            String sql = "DELETE FROM inscripcion WHERE idInmueble = ?;";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1,id);
           
             if (ps.executeUpdate() != 0) {
		inm = true;
	    }
            ps.close();

        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "No se pudo borrar la inscripcion " + ex.getMessage());
        }
        return inm;
    }
    
    public boolean guardarInmueble(Inmueble inmueble){
        boolean inm=false;
        try {
            String sql = "INSERT INTO inmueble (direccion,altura,disponibilidad,tipoDeInmueble,zona,superficie,precioBase,ocupante,propietarioInmueble, cantAmbientes) VALUES ( ? , ?, ? , ? , ? , ? , ? , ? , ? , ? );";

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, inmueble.getDireccion());
            ps.setInt(2, inmueble.getAltura());
            ps.setBoolean(3, inmueble.isDisponibilidad());
            ps.setString(4, inmueble.getTipoDeInmueble());
            ps.setString(5, inmueble.getZona());
            ps.setDouble(6, inmueble.getSuperficie());
            ps.setDouble(7, inmueble.getPrecioBase());
            ps.setInt(8, inmueble.getOcupante().getIdInquilino());
            ps.setInt(9, inmueble.getPropietarioInmueble().getId());
            ps.setInt(10, inmueble.getCantAmbientes());

            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                inmueble.setIdInmueble(rs.getInt("idInmueble"));
                inm=true;
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo guardar el inmueble");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "El inmueble ya está registrado " + ex.getMessage());
        }
        return inm;
    }
    
    //Se necesita modificar algo?
    //Se tiene que hacer DELETE de la propiedad o modificar un campo?
    //Se tiene que cambiar un cambio, es decir, falta metodo de borrado logico
}
