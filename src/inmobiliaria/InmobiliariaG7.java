package inmobiliaria;

import inmobiliaria.Data.Conexion;
import inmobiliaria.Data.InquilinoData;
import inmobiliaria.Data.PropiedadData;
import inmobiliaria.Modelo.Inquilino;

public class InmobiliariaG7 {

    public static void main(String[] args) {
        
         Conexion con = new Conexion();
        
        
        Inquilino inquilino = new Inquilino("Roberto", "Orozco", 14657483, 214648323,"Contador", "Gustavo", 8965325, true);
        
        InquilinoData iD = new InquilinoData(con);
        
        if (iD.agregarInquilino(inquilino)) {
            System.out.println("Inquilino agregado correctamente");
        }

        
        
        
       
        
    }
    
}
