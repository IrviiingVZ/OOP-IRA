/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva_2_modificadores_acceso;

/**
 *
 * @author irvingvalles
 */
public class EVA_2_MODIFICADORES_ACCESO {

    public static void main(String[] args) {
        Persona persona = new Persona();
        //persona. //no se pueden ver los atributos (Son privados) 
    }
    
}

class Persona{ 
private String nombre;
private String apellido;
private int edad;
}