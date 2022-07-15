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
        this.con = conexion.getConexion();
        inquiData = new InquilinoData(conexion);
        propData = new PropietarioData(conexion);
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

    public Inmueble buscarInmuebleXId(int id) { //Metodo probado en main, funcionando

        Inmueble inmueble = new Inmueble();

        try {

            String sql = "SELECT * FROM inmueble WHERE idInmueble = ?;";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);

            ResultSet resultSet = ps.executeQuery();

            while (resultSet.next()) {
                inmueble.setDireccion(resultSet.getString("direccion"));
                inmueble.setAltura(resultSet.getInt("altura"));
                inmueble.setDisponibilidad((resultSet.getBoolean("disponibilidad")));
                inmueble.setTipoDeInmueble((resultSet.getString("tipoDeInmueble")));
                inmueble.setZona((resultSet.getString("zona")));
                inmueble.setSuperficie((resultSet.getDouble("superficie")));
                inmueble.setPrecioBase((resultSet.getDouble("precioBase")));
                inmueble.setIdInmueble((resultSet.getInt("idInmueble")));
                inmueble.setCantAmbientes(resultSet.getInt("cantAmbientes"));

                Propietario p = propData.obtenerPropietarioPorId(resultSet.getInt("propietarioInmueble"));
                inmueble.setPropietarioInmueble(p);
            }

            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al conseguir la propiedad");
        }

        return inmueble;
    }

    public boolean borrarInmuebleXId(int id) {  //Probado en Main, funciona
        boolean inm = false;
        try {
            String sql = "UPDATE inmueble SET disponibilidad = 0 WHERE idInmueble = ?;";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);

            if (ps.executeUpdate() != 0) {
                inm = true;
            }
            ps.close();

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "No se pudo borrar el inmueble " + ex.getMessage());
        }
        return inm;
    }

    public boolean guardarInmueble(Inmueble inmueble) { //Probado en Main, funciona
        boolean inm = false;
        try {
            String sql = "INSERT INTO inmueble (direccion,altura,disponibilidad,tipoDeInmueble,zona,superficie,precioBase,propietarioInmueble,cantAmbientes) VALUES ( ? , ?, ? , ? , ? , ? , ? , ? , ? );";

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, inmueble.getDireccion());
            ps.setInt(2, inmueble.getAltura());
            ps.setBoolean(3, inmueble.isDisponibilidad());
            ps.setString(4, inmueble.getTipoDeInmueble());
            ps.setString(5, inmueble.getZona());
            ps.setDouble(6, inmueble.getSuperficie());
            ps.setDouble(7, inmueble.getPrecioBase());
            ps.setInt(8, inmueble.getPropietarioInmueble().getId());
            ps.setInt(9, inmueble.getCantAmbientes());

            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                inmueble.setIdInmueble(rs.getInt("idInmueble"));
                inm = true;
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo guardar el inmueble");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "El inmueble ya está registrado " + ex.getMessage());
        }
        return inm;
    }

    public ArrayList<Inmueble> listarInmuebles() {

        ArrayList<Inmueble> inmuebles = new ArrayList<>();
        try {
            String sql = "SELECT * FROM inmueble WHERE disponibilidad = 1;";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            Inmueble inmueble;
            while (rs.next()) {
                inmueble = new Inmueble();
                inmueble.setDireccion(rs.getString("direccion"));
                inmueble.setAltura(rs.getInt("altura"));
                inmueble.setDisponibilidad(rs.getBoolean("disponibilidad"));
                inmueble.setTipoDeInmueble(rs.getString("tipoDeInmueble"));
                inmueble.setCantAmbientes(rs.getInt("cantAmbientes"));
                inmueble.setZona(rs.getString("zona"));
                inmueble.setSuperficie(rs.getDouble("superficie"));
                inmueble.setPrecioBase(rs.getDouble("precioBase"));
                inmueble.setIdInmueble(rs.getInt("idInmueble"));
                Propietario prop = propData.obtenerPropietarioPorId(rs.getInt("propietarioInmueble"));
                inmueble.setPropietarioInmueble(prop);
                inmuebles.add(inmueble);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al listar los Inmuebles ");
        }

        return inmuebles;
    }

    public ArrayList<Inmueble> listarInmueblesXZona(ArrayList<Inmueble> lista) {

        ArrayList<Inmueble> inmueblesZona = new ArrayList<>();
        Inmueble inmueble = new Inmueble();

        String sql = "SELECT * inmueble WHERE zona = ?";

        try {

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, inmueble.getZona());
            
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {

                inmueble.setDireccion(rs.getString("direccion"));
                inmueble.setAltura(rs.getInt("altura"));
                inmueble.setDisponibilidad(rs.getBoolean("disponibilidad"));
                inmueble.setTipoDeInmueble(rs.getString("tipoDeInmueble"));
                inmueble.setCantAmbientes(rs.getInt("cantAmbientes"));
                inmueble.setZona(rs.getString("zona"));
                inmueble.setSuperficie(rs.getDouble("superficie"));
                inmueble.setPrecioBase(rs.getDouble("precioBase"));
                inmueble.setIdInmueble(rs.getInt("idInmueble"));
                Propietario prop = propData.obtenerPropietarioPorId(rs.getInt("propietarioInmueble"));
                inmueble.setPropietarioInmueble(prop);
                inmueblesZona.add(inmueble);
                
            }

        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Error al listar por Zona" + ex);
        }

        return inmueblesZona;
    }
    
    public ArrayList<Inmueble> listarInmueblesXTipo (ArrayList<Inmueble> lista){
        
        ArrayList<Inmueble> inmueblesTipo = new ArrayList<>();
        Inmueble inmueble = new Inmueble();

        String sql = "SELECT * inmueble WHERE tipo = ?";

        try {

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, inmueble.getTipoDeInmueble());
            
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {

                inmueble.setDireccion(rs.getString("direccion"));
                inmueble.setAltura(rs.getInt("altura"));
                inmueble.setDisponibilidad(rs.getBoolean("disponibilidad"));
                inmueble.setTipoDeInmueble(rs.getString("tipoDeInmueble"));
                inmueble.setCantAmbientes(rs.getInt("cantAmbientes"));
                inmueble.setZona(rs.getString("zona"));
                inmueble.setSuperficie(rs.getDouble("superficie"));
                inmueble.setPrecioBase(rs.getDouble("precioBase"));
                inmueble.setIdInmueble(rs.getInt("idInmueble"));
                Propietario prop = propData.obtenerPropietarioPorId(rs.getInt("propietarioInmueble"));
                inmueble.setPropietarioInmueble(prop);
                inmueblesTipo.add(inmueble);
                
            }

        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Error al listar por Tipo" + ex);
        }

        return inmueblesTipo;
        
    }
    
    public ArrayList<Inmueble> listarInmueblesXAmbientes (ArrayList<Inmueble> lista){
        
        ArrayList<Inmueble> inmueblesAmbiente = new ArrayList<>();
        Inmueble inmueble = new Inmueble();

        String sql = "SELECT * inmueble WHERE cantAmbientes = ?";

        try {

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, inmueble.getCantAmbientes());
            
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {

                inmueble.setDireccion(rs.getString("direccion"));
                inmueble.setAltura(rs.getInt("altura"));
                inmueble.setDisponibilidad(rs.getBoolean("disponibilidad"));
                inmueble.setTipoDeInmueble(rs.getString("tipoDeInmueble"));
                inmueble.setCantAmbientes(rs.getInt("cantAmbientes"));
                inmueble.setZona(rs.getString("zona"));
                inmueble.setSuperficie(rs.getDouble("superficie"));
                inmueble.setPrecioBase(rs.getDouble("precioBase"));
                inmueble.setIdInmueble(rs.getInt("idInmueble"));
                Propietario prop = propData.obtenerPropietarioPorId(rs.getInt("propietarioInmueble"));
                inmueble.setPropietarioInmueble(prop);
                inmueblesAmbiente.add(inmueble);
                
            }

        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Error al listar por Ambientes" + ex);
        }

        return inmueblesAmbiente;
        
        
    }
    
    public ArrayList<Inmueble> buscarInmueblesXPropietarioDni(int dniPropietario){
        
        ArrayList<Inmueble> listaInm = new ArrayList<>();
        
        try {
            String sql = "SELECT i.* FROM Inmueble i, Propietario p WHERE p.dni = ? AND p.idPropietario = i.propietarioInmueble;";
            
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, dniPropietario);
            
            ResultSet rs = ps.executeQuery();
            
                while (rs.next()) {
                    
                    Inmueble inmueble = new Inmueble();

                inmueble.setDireccion(rs.getString("direccion"));
                inmueble.setAltura(rs.getInt("altura"));
                inmueble.setDisponibilidad(rs.getBoolean("disponibilidad"));
                inmueble.setTipoDeInmueble(rs.getString("tipoDeInmueble"));
                inmueble.setCantAmbientes(rs.getInt("cantAmbientes"));
                inmueble.setZona(rs.getString("zona"));
                inmueble.setSuperficie(rs.getDouble("superficie"));
                inmueble.setPrecioBase(rs.getDouble("precioBase"));
                inmueble.setIdInmueble(rs.getInt("idInmueble"));
                Propietario prop = propData.obtenerPropietarioPorId(rs.getInt("propietarioInmueble"));
                inmueble.setPropietarioInmueble(prop);
                listaInm.add(inmueble);
                
            }
            
            
        } catch (Exception ex) {
            
            JOptionPane.showMessageDialog(null, "Error al obtener inmuebles");
        }
        
        return listaInm;
        
        
    }
}
