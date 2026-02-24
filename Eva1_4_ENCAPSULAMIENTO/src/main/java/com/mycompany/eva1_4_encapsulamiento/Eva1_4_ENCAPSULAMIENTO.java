/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_4_encapsulamiento;

/**
 *
 * @author irvingvalles
 */
public class Eva1_4_ENCAPSULAMIENTO {

    public static void main(String[] args) {
        Persona persona = new Persona ();
        persona.setNombre ("Irving");
        persona.setApellidos ("Valles");
        persona.setEdad(22);
        persona.setGenero();
        
        System.out.println("Nombre: " + persona.getNombre());{
    }
        System.out.println("Apellidos " + persona.getApellidos());{
    }
        System.out.println("edad " + persona.getEdad());{
    }
        System.out.println("genero " + persona.getGenero());{
    }
        persona.imprimirDatos();{
        System.out.println("nombre completo: " + persona.generarNombreCompleto());
    }
        
    }
}
