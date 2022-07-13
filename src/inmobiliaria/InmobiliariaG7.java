package inmobiliaria;

import inmobiliaria.Data.Conexion;
import inmobiliaria.Data.InquilinoData;
import inmobiliaria.Data.PropiedadData;
import inmobiliaria.Modelo.Inquilino;
import java.util.ArrayList;

public class InmobiliariaG7 {

    public static void main(String[] args) {
        
         Conexion con = new Conexion();
         
         InquilinoData iD = new InquilinoData(con);
        
        
        /*Inquilino inquilino = new Inquilino("Roberto", "Orozco", 14657483, 214648323,"Contador", "Gustavo", 8965325, true);
        
        if (iD.agregarInquilino(inquilino)) {
            System.out.println("Inquilino agregado correctamente");
        }*/
/*--------------------------------------------------------------------------------------------------------------------------*/
        /*
        System.out.println(iD.obtenerInquilinos()); */
        
/*---------------------------------------------------------------------------------------------------------------------------*/

        /*
        System.out.println(iD.obtenerInquilinoXId(2)); */
        
/*---------------------------------------------------------------------------------------------------------------------------*/

       /* Inquilino inquilinoModificado = new Inquilino (4,"Roberto", "Orozco", 14657483, 214648323, "Ventas", "Ricardo", 8965325, true);
        
        iD.modificarInquilino(inquilinoModificado);
        
        System.out.println(iD.obtenerInquilinoXId(4)); */
        
/*---------------------------------------------------------------------------------------------------------------------------------*/

        /* iD.bajaInquilo(1);
        System.out.println(iD.obtenerInquilinoXId(1)); */
        
/*-----------------------------------------------------------------------------------------------------------------------------------*/        
        
    
        
        
        

        
        
        
       
        
    }
    
}
