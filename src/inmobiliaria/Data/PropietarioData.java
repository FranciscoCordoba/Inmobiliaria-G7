package inmobiliaria.Data;

import inmobiliaria.Modelo.Propietario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class PropietarioData {
    //A
    private Connection con=null;

    //C
    public PropietarioData(Conexion conexion) {
        con=conexion.getConexion();
    }
    
    //M

    /**
     *
     * @param propietario
     * @return boolean
     */
    
    public boolean altaPropietario(Propietario propietario){ 
        boolean agregado=false;
        try{
            String sql="INSERT INTO propietario(nombre, apellido, dni, domicilio, telefono)"
                    + " VALUES (?,?,?,?,?)";
            PreparedStatement ps= con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setString(1,propietario.getNombre());
            ps.setString(2,propietario.getApellido());
            ps.setLong(3,propietario.getDni());
            ps.setString(4,propietario.getDomicilio());
            ps.setLong(5,propietario.getTelefono());

            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if(rs.next()){
                propietario.setIdPropietario(rs.getInt(1));
                agregado = true;
                JOptionPane.showMessageDialog(null,"Propietario agregado con exito" );
            }
            ps.close();
        }catch(Exception ex){
                JOptionPane.showMessageDialog(null,"Error al agregar propietario"+ex);
        }
        
        return agregado;
    }
    
    public List<Propietario> listarPropietarios(){
        ArrayList<Propietario> propietarios = new ArrayList();
        
        try{
            String sql="SELECT * FROM propietario ";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            Propietario propietario;
            while(rs.next()){
                propietario = new Propietario();
                propietario.setIdPropietario(rs.getInt("idPropietario"));
                propietario.setNombre(rs.getString("nombre"));
                propietario.setApellido(rs.getString("apellido"));
                propietario.setDni(rs.getLong("dni"));
                propietario.setDomicilio(rs.getString("domicilio"));
                propietario.setTelefono(rs.getLong("telefono"));
                propietarios.add(propietario);
            }
            ps.close();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Error al listar propietarios");
        }
        return propietarios;
    }
    
    public Propietario obtenerPropietarioPorId(int id){
        Propietario propietario= null;
        try{
            String sql="SELECT * FROM propietario WHERE idPropietario";
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                propietario=new Propietario();
                
                propietario.setIdPropietario(rs.getInt("idPropietario"));
                propietario.setNombre(rs.getString("nombre"));
                propietario.setApellido(rs.getString("apellido"));
                propietario.setDni(rs.getLong("dni"));
                propietario.setDomicilio(rs.getString("domicilio"));
                propietario.setTelefono(rs.getLong("telefono"));
            }
            ps.close();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Error al obtener propietario"+ex);
        }
        return propietario;
    }
    
    public Propietario obtenerPropietarioPorDni(long dni){
        Propietario propietario=null;
        try{
            String sql="SELECT * FROM propietario WHERE dni=?";
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setLong(1, dni);
            ResultSet rs= ps.executeQuery();
            while(rs.next()){
                propietario=new Propietario();
                propietario.setIdPropietario(rs.getInt("idPropietario"));
                propietario.setNombre(rs.getString("nombre"));
                propietario.setApellido(rs.getString("apellido"));
                propietario.setDni(rs.getLong("dni"));
                propietario.setDomicilio(rs.getString("domicilio"));
                propietario.setTelefono(rs.getLong("telefono"));
            }
            ps.close();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,"Error al obtener propietario"+ex);
        }
        return propietario;
    }
    
    public boolean actualizarPropietario(Propietario propietario){
        boolean actua=false;
        try{
            String sql="UPDATE propietario SET nombre=?, apellido=?,dni=?,domicilio=?,"
                    + "telefono=? WHERE idPropietario=?";
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1, propietario.getApellido());
            ps.setString(2, propietario.getNombre());
            ps.setLong(3, propietario.getDni());
            ps.setString(4, propietario.getDomicilio());
            ps.setLong(5, propietario.getTelefono());
            ps.setInt(6, propietario.getId());
            int rs=ps.executeUpdate();
            if(rs!=0){
                actua=true;
                JOptionPane.showMessageDialog(null, "El propietario fue actualizado con exito");
            }
           ps.close();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,"Error al actualizar el propietario"+ ex);
        }
        return actua;
    }
    
    public boolean bajaPropietario(int id){
        boolean baja=false;
        try{
            String sql="DELETE propietario WHERE idPropietario=?";
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, id);
            if(ps.executeUpdate()!=0){
                baja=true;
                JOptionPane.showMessageDialog(null, "Se ha dado de baja el propietario con exito");
            }
            ps.close();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,"Error al dar de baja el propietario "+ ex);
        }
        return baja;
    }
}