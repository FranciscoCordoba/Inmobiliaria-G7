package inmobiliaria.Data;

import inmobiliaria.Modelo.Inquilino;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class InquilinoData {

    private Connection conexion = null;

    public InquilinoData(Conexion conexion) {

        this.conexion = conexion.getConexion();

    }

    public boolean agregarInquilino(Inquilino inquilino) { //Probado en Main, funciona

        boolean insert = true;

        String sql = "INSERT INTO inquilino (nombre, apellido, dni, cuit, lugarTrabajo, nombreGarante, dniGarante, activo) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        try {

            PreparedStatement ps = conexion.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, inquilino.getNombre());
            ps.setString(2, inquilino.getApellido());
            ps.setLong(3, inquilino.getDni());
            ps.setLong(4, inquilino.getCuit());
            ps.setString(5, inquilino.getLugarTrabajo());
            ps.setString(6, inquilino.getNombreGarante());
            ps.setLong(7, inquilino.getDniGarante());
            ps.setBoolean(8, inquilino.isActivo());

            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {

                inquilino.setIdInquilino(rs.getInt(1));
            } else {
                insert = false;
            }

        } catch (SQLException ex) {
            insert = false;

            JOptionPane.showMessageDialog(null, "Error al cargar Inquilino");

        }
        return insert;
    }

    public List<Inquilino> obtenerInquilinos() {  //Probado en Main, Funcion

        ArrayList<Inquilino> inquilinos = new ArrayList<>();

        try {

            String sql = "SELECT * FROM inquilino";
            PreparedStatement ps = conexion.prepareStatement(sql);

            ResultSet resultSet = ps.executeQuery();

            Inquilino inquilino;

            while (resultSet.next()) {
                inquilino = new Inquilino();
                inquilino.setIdInquilino(resultSet.getInt("idInquilino"));
                inquilino.setApellido(resultSet.getString("apellido"));
                inquilino.setNombre(resultSet.getString("nombre"));
                inquilino.setDni(resultSet.getLong("dni"));
                inquilino.setCuit(resultSet.getLong("cuit"));
                inquilino.setLugarTrabajo(resultSet.getString("lugarTrabajo"));
                inquilino.setNombreGarante(resultSet.getString("nombreGarante"));
                inquilino.setDniGarante(resultSet.getLong("dniGarante"));
                inquilino.setActivo(resultSet.getBoolean("activo"));

                inquilinos.add(inquilino);
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener inquilinos");
        }

        return inquilinos;

    }

    public Inquilino obtenerInquilinoXId(int id) {  //No funciona, falta el while.----Areglado

        Inquilino inquilino = new Inquilino();

        try {

            String sql = "SELECT * FROM inquilino WHERE idInquilino = ?";

            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, id);

            ResultSet resultSet = ps.executeQuery();

            while (resultSet.next()) {

                inquilino.setIdInquilino(resultSet.getInt("idInquilino"));
                inquilino.setApellido(resultSet.getString("apellido"));
                inquilino.setNombre(resultSet.getString("nombre"));
                inquilino.setDni(resultSet.getLong("dni"));
                inquilino.setCuit(resultSet.getLong("cuit"));
                inquilino.setLugarTrabajo(resultSet.getString("lugarTrabajo"));
                inquilino.setNombreGarante(resultSet.getString("nombreGarante"));
                inquilino.setDniGarante(resultSet.getLong("dniGarante"));
                inquilino.setActivo(resultSet.getBoolean("activo"));

            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener inquilino");
        }

        return inquilino;

    }

    public boolean modificarInquilino(Inquilino inquilino) { //Probado en Main, funciona

        String sql = "UPDATE inquilino SET nombre = ?, apellido = ?, dni = ?, cuit = ?, lugarTrabajo = ?, nombreGarante = ?, dniGarante = ?, activo = ? WHERE idInquilino = ?";
        
        
        boolean modificado = false;
        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setString(1, inquilino.getNombre());
            ps.setString(2, inquilino.getApellido());
            ps.setLong(3, inquilino.getDni());
            ps.setLong(4, inquilino.getCuit());
            ps.setString(5, inquilino.getLugarTrabajo());
            ps.setString(6, inquilino.getNombreGarante());
            ps.setLong(7, inquilino.getDniGarante());
            ps.setBoolean(8, inquilino.isActivo());
            ps.setInt(9, inquilino.getIdInquilino());

            if (ps.executeUpdate() != 0) {
                modificado = true;
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de sintaxis ");
        }
        return modificado;
    }

    public boolean bajaInquilo(int id) { //Probado en Main, funciona
        boolean baja = false;
        try {
            String sql = "UPDATE inquilino SET activo = 0 WHERE idInquilino = ?";
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, id);
            if (ps.executeUpdate() != 0) {
                baja = true;
                JOptionPane.showMessageDialog(null, "Se ha dado de baja el inquilino con exito");
            }
            ps.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al dar de baja el inquilino " + ex);
        }
        return baja;
    }
}
