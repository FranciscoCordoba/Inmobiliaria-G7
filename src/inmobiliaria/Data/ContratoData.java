package inmobiliaria.Data;

import inmobiliaria.Modelo.Contrato;
import inmobiliaria.Modelo.Inmueble;
import inmobiliaria.Modelo.Inquilino;
import inmobiliaria.Modelo.Propietario;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ContratoData {

    private Contrato contrato;
    private PropietarioData propietario;
    private InquilinoData inquilino;
    private PropiedadData propiedad;
    private Connection con = null;

    public ContratoData(Conexion conexion) {

        this.con = conexion.getConexion();
        this.propietario = new PropietarioData(conexion);
        this.inquilino = new InquilinoData(conexion);
        this.propiedad = new PropiedadData(conexion);
	
    }

    public boolean guardarContrato(Contrato contrato) {

        boolean guardar = true;

        try {

            String sql = "INSERT INTO contrato(fechaInicio, fechaFin, activo, monto, inquilinoContrato, propietarioContrato, propiedadContrato) VALUES (?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setDate(1, Date.valueOf(contrato.getFechaInicio()));
            ps.setDate(2, Date.valueOf(contrato.getFechaFin()));
            ps.setBoolean(3, contrato.isActivo());
            ps.setDouble(4, contrato.getMonto());
            ps.setInt(5, contrato.getInquilinoContrato().getIdInquilino());
            ps.setInt(6, contrato.getPropietarioContrato().getId());
            ps.setInt(7, contrato.getPropiedadContrato().getIdInmueble());

            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                contrato.setIdContrato(rs.getInt(1));	
            } else {

                JOptionPane.showMessageDialog(null, "Error al intentar agregar contrato");
                guardar = false;

            }

        } catch (SQLException ex) {

            guardar = false;
	    JOptionPane.showMessageDialog(null, "Error al cargar Contrato");
        }

        return guardar;
    }

    public boolean renovarContrato(Contrato contrato) {

        boolean renovar = false;

        try {
            String sql = "UPDATE contrato SET fechaInicio = ?, fechaFin = ?, monto = ? WHERE idContrato = ?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setDate(1, Date.valueOf(contrato.getFechaInicio()));
            ps.setDate(2, Date.valueOf(contrato.getFechaFin()));
            ps.setDouble(3, contrato.getMonto());
	    ps.setInt(4, contrato.getIdContrato());
	    
            if (ps.executeUpdate() != 0) {
                renovar = true;
            }

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "Error al renovar contrato" + e);
        }
        return renovar;

    }

    public ArrayList<Inmueble> inmueblesDisponibles() {

        ArrayList<Inmueble> inmuebles = new ArrayList<>();

        String sql = "SELECT * FROM inmueble WHERE disponibilidad = 1 AND idInmueble NOT IN (SELECT idInmueble FROM contrato)";

        try {

            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            Inmueble inmueble;

            while (rs.next()) {

                inmueble = new Inmueble();

                inmueble.setIdInmueble(rs.getInt("idInmueble"));
                inmueble.setDireccion(rs.getString("direccion"));
                inmueble.setAltura(rs.getInt("altura"));
                inmueble.setZona(rs.getString("zona"));
                inmueble.setTipoDeInmueble(rs.getString("tipoDeInmueble"));
                inmueble.setSuperficie(rs.getDouble("superficie"));
                inmueble.setPrecioBase(rs.getInt("precioBase"));
                inmueble.setCantAmbientes(rs.getInt("cantAmbientes"));
                inmueble.setPropietarioInmueble(propietario.obtenerPropietarioPorId(rs.getInt("propietarioContrato")));

                inmuebles.add(inmueble);

            }

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "Error al mostrar Inmuebles");
        }

        return inmuebles;

    }

    public List mostrarContratos() {
        ArrayList<Contrato> contratos = new ArrayList<>();

        String sql = "SELECT * FROM contrato ";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Contrato contrato = new Contrato();
                contrato.setIdContrato(rs.getInt("idContrato"));
                contrato.setFechaInicio(rs.getDate("fechaInicio").toLocalDate());
                contrato.setFechaFin(rs.getDate("fechaFin").toLocalDate());
                contrato.setActivo(rs.getBoolean("activo"));
                contrato.setMonto(rs.getDouble("monto"));
                contrato.setInquilinoContrato(inquilino.obtenerInquilinoXId(rs.getInt("inquilinoContrato")));
                contrato.setPropiedadContrato(propiedad.buscarInmuebleXId(rs.getInt("propiedadContrato")));
                contrato.setPropietarioContrato(propietario.obtenerPropietarioPorId(rs.getInt("propietarioContrato")));
                contratos.add(contrato);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar la lista de contratos");
        }

        return contratos;

    }

    public ArrayList mostrarContratosVigentes() {
        ArrayList<Contrato> contratos = new ArrayList<>();

        String sql = "SELECT * FROM contrato WHERE activo = 1 ";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Contrato contrato = new Contrato();
                contrato.setIdContrato(rs.getInt("idContrato"));
                contrato.setInquilinoContrato(inquilino.obtenerInquilinoXId(rs.getInt("inquilinoContrato")));
                contrato.setPropiedadContrato(propiedad.buscarInmuebleXId(rs.getInt("propiedadContrato")));
                contrato.setPropietarioContrato(propietario.obtenerPropietarioPorId(rs.getInt("propietarioContrato")));
                contrato.setFechaInicio(rs.getDate("fechaInicio").toLocalDate());
                contrato.setFechaFin(rs.getDate("fechaFin").toLocalDate());
                contrato.setActivo(rs.getBoolean("activo"));
                contrato.setMonto(rs.getDouble("monto"));
                contratos.add(contrato);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar la lista de contratos vigentes");
        }

        return contratos;

    }

    public ArrayList mostrarVencidos() {
        ArrayList<Contrato> contratos = new ArrayList<>();

        String sql = "SELECT * FROM contrato WHERE activo = 0 ";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Contrato contrato = new Contrato();
                contrato.setIdContrato(rs.getInt("idContrato"));
                contrato.setInquilinoContrato(inquilino.obtenerInquilinoXId(rs.getInt("inquilinoContrato")));
                contrato.setPropiedadContrato(propiedad.buscarInmuebleXId(rs.getInt("propiedadContrato")));
                contrato.setPropietarioContrato(propietario.obtenerPropietarioPorId(rs.getInt("propietarioContrato")));
                contrato.setFechaInicio(rs.getDate("fechaInicio").toLocalDate());
                contrato.setFechaFin(rs.getDate("fechaFin").toLocalDate());
                contrato.setActivo(rs.getBoolean("activo"));
                contrato.setMonto(rs.getDouble("monto"));
                contratos.add(contrato);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar la lista de contratos vencidos");
        }

        return contratos;

    }

    public boolean rescindirContrato(Contrato contrato) {

        boolean resContrato = false;
        String sql = "UPDATE contrato SET activo = 0 WHERE idContrato = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            propiedad.habilitarInmuebleXId(contrato.getPropiedadContrato().getIdInmueble());
            ps.setInt(1, contrato.getIdContrato());
            if (ps.executeUpdate() != 0) {
                resContrato = true;
                JOptionPane.showMessageDialog(null, "Se ha rescindido el contrato con exito");
            }
            ps.close();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al rescindir el contrato " + ex);
        }
        return resContrato;
    }

    public void actualizarContratos() {

        String sql = "UPDATE contrato SET activo = 0 WHERE fechaFin > NOW()";

        try {

            PreparedStatement ps = con.prepareStatement(sql);

            ps.executeUpdate();

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Error al actualizar contratos " + ex);

        }

    }

    public ArrayList<Contrato> contratosXInquilino(int idInquilino) {

        ArrayList<Contrato> contratosInqui = new ArrayList<>();

        try {
            String sql = "SELECT * FROM contrato WHERE inquilinoContrato = ? AND activo = 1";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, idInquilino);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Contrato contrato = new Contrato();
                contrato.setIdContrato(rs.getInt("idContrato"));
                contrato.setInquilinoContrato(inquilino.obtenerInquilinoXId(rs.getInt("inquilinoContrato")));
                contrato.setPropiedadContrato(propiedad.buscarInmuebleXId(rs.getInt("propiedadContrato")));
                contrato.setFechaInicio(rs.getDate("fechaInicio").toLocalDate());
                contrato.setFechaFin(rs.getDate("fechaFin").toLocalDate());
                contrato.setActivo(rs.getBoolean("activo"));
                contrato.setMonto(rs.getDouble("monto"));
                contrato.setPropietarioContrato(propietario.obtenerPropietarioPorId(rs.getInt("propietarioContrato")));
                contratosInqui.add(contrato);

            }

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Error al obtener contratos por inquilino" + ex);
        }

        return contratosInqui;
    }

    public ArrayList<Contrato> contratosXPropietario(int idPropietario) {

        ArrayList<Contrato> contratosPropi = new ArrayList<>();

        try {
            String sql = "SELECT * FROM contrato WHERE propietarioContrato = ? AND activo = 1";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, idPropietario);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Contrato contrato = new Contrato();
                contrato.setIdContrato(rs.getInt("idContrato"));
                contrato.setInquilinoContrato(inquilino.obtenerInquilinoXId(rs.getInt("inquilinoContrato")));
                contrato.setPropiedadContrato(propiedad.buscarInmuebleXId(rs.getInt("propiedadContrato")));
                contrato.setFechaInicio(rs.getDate("fechaInicio").toLocalDate());
                contrato.setFechaFin(rs.getDate("fechaFin").toLocalDate());
                contrato.setActivo(rs.getBoolean("activo"));
                contrato.setMonto(rs.getDouble("monto"));
                contrato.setPropietarioContrato(propietario.obtenerPropietarioPorId(rs.getInt("propietarioContrato")));
                contratosPropi.add(contrato);

            }

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Error al obtener contratos por Propietario" + ex);
        }

        return contratosPropi;
    }
    
    public Contrato obtenerContratoXInmuebleId(int id){
        Contrato contrato=null;
        try{
            String sql="SELECT * FROM contrato WHERE propiedadContrato=? ";
            PreparedStatement ps= con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs= ps.executeQuery();
            while(rs.next()){
                contrato=new Contrato();
                contrato.setIdContrato(rs.getInt("idContrato"));
                contrato.setFechaInicio(rs.getDate("fechaInicio").toLocalDate());
                contrato.setFechaFin(rs.getDate("fechaFin").toLocalDate());
                contrato.setActivo(rs.getBoolean("activo"));
                contrato.setMonto(rs.getDouble("monto"));
                contrato.setInquilinoContrato(inquilino.obtenerInquilinoXId(rs.getInt("inquilinoContrato")));
                contrato.setPropietarioContrato(propietario.obtenerPropietarioPorId(rs.getInt("propietarioContrato")));
                contrato.setPropiedadContrato(propiedad.buscarInmuebleXId(rs.getInt("propiedadContrato")));
            }
            ps.close();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,"Error al obtener contrato "+ ex);
        }
        return contrato;
    }
    
    public Contrato obtenercontratoXId (int id){

        Contrato contrato=null;
        try{
            String sql="SELECT * FROM contrato WHERE idContrato=? ";
            PreparedStatement ps= con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs= ps.executeQuery();
            while(rs.next()){
                contrato=new Contrato();
                contrato.setIdContrato(rs.getInt("idContrato"));
                contrato.setFechaInicio(rs.getDate("fechaInicio").toLocalDate());
                contrato.setFechaFin(rs.getDate("fechaFin").toLocalDate());
                contrato.setActivo(rs.getBoolean("activo"));
                contrato.setMonto(rs.getDouble("monto"));
                contrato.setInquilinoContrato(inquilino.obtenerInquilinoXId(rs.getInt("inquilinoContrato")));
                contrato.setPropietarioContrato(propietario.obtenerPropietarioPorId(rs.getInt("propietarioContrato")));
                contrato.setPropiedadContrato(propiedad.buscarInmuebleXId(rs.getInt("propiedadContrato")));
            }
            ps.close();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,"Error al obtener contrato "+ ex);
        }
        return contrato;

    }
    
    public ArrayList<Contrato> contratosXInmueble (int id){
        
        ArrayList<Contrato> lista = new ArrayList<>();
        
        try {
            String sql = "SELECT * FROM contrato WHERE propiedadContrato = ?";
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) { 
                
                contrato=new Contrato();
                contrato.setIdContrato(rs.getInt("idContrato"));
                contrato.setFechaInicio(rs.getDate("fechaInicio").toLocalDate());
                contrato.setFechaFin(rs.getDate("fechaFin").toLocalDate());
                contrato.setActivo(rs.getBoolean("activo"));
                contrato.setMonto(rs.getDouble("monto"));
                contrato.setInquilinoContrato(inquilino.obtenerInquilinoXId(rs.getInt("inquilinoContrato")));
                contrato.setPropietarioContrato(propietario.obtenerPropietarioPorId(rs.getInt("propietarioContrato")));
                contrato.setPropiedadContrato(propiedad.buscarInmuebleXId(rs.getInt("propiedadContrato")));
                
            }
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Error al conseguir contratos" + ex);
        }
        
        return lista;
        
    }
    
}
