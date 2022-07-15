package inmobiliaria;

import inmobiliaria.Data.Conexion;
import inmobiliaria.Data.InquilinoData;
import inmobiliaria.Data.PropiedadData;
import inmobiliaria.Data.PropietarioData;
import inmobiliaria.Modelo.Inmueble;
import inmobiliaria.Modelo.Inquilino;
import inmobiliaria.Modelo.Propietario;
import java.util.ArrayList;

public class InmobiliariaG7 {

    public static void main(String[] args) {
        
         Conexion con = new Conexion();
         
         InquilinoData iD = new InquilinoData(con);
         
/*------------------------------Revision de Metodos InquilinoData------------------------------------------------------------*/         
/*---------------------------------------------------------------------------------------------------------------------------*/         
        
        
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

        //PropietarioData pD = new PropietarioData(con);

/*------------------------------Revision de Metodos PropietarioData------------------------------------------------------------------*/
/*-----------------------------------------------------------------------------------------------------------------------------------*/

        /* Propietario propietario = new Propietario("Juan", "Soto", 45654432, "San Juan 543", 254768908, true);
        pD.altaPropietario(propietario);
        System.out.println(propietario); */
        
/*------------------------------------------------------------------------------------------------------------------------------------*/   

       /* System.out.println(pD.listarPropietarios()); */
       
/*-------------------------------------------------------------------------------------------------------------------------------------*/

      /* System.out.println(pD.obtenerPropietarioPorId(2)); */
      
/*-----------------------------------------------------------------------------------------------------------------------------------*/

      /*  System.out.println(pD.obtenerPropietarioPorDni(45654432)); */
      
/*----------------------------------------------------------------------------------------------------------------------------------*/

      /*  Propietario propietarioModificado = new Propietario(1, "Nicolas", "Toledo", 36584795, "Tucuman 54", 236569685, true);
        pD.actualizarPropietario(propietarioModificado);  */
        
/*-----------------------------------------------------------------------------------------------------------------------------------*/

      /*  pD.bajaPropietario(1); */
      
/*-------------------------------------------------------------------------------------------------------------------------------------*/

        PropiedadData InmData = new PropiedadData(con);
        
/*-----------------------------------------Revision de Metodos PropiedadData-------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------------------------------------------*/

      /*  Inmueble inmueble = new Inmueble("Tucuman", 54, true, "Casa", 3, "Norte", 45.4 , 54000, propietario);
        InmData.guardarInmueble(inmueble);  */
/*-------------------------------------------------------------------------------------------------------------------------------------------*/

       //System.out.println(InmData.buscarInmueblesDeXPropietario(3)); 
      
/*--------------------------------------------------------------------------------------------------------------------------------------------------*/

      /*  InmData.borrarInmuebleXId(1);  */
      
/*-------------------------------------------------------------------------------------------------------------------------------------------------*/

      /*  System.out.println(InmData.listarInmuebles());   */
       
        
    }
    
}
