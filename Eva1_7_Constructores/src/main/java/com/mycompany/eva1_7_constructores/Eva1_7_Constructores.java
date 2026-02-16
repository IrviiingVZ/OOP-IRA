/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_7_constructores;

/**
 *
 * @author irvingvalles
 */
public class Eva1_7_Constructores {

    public static void main(String[] args) {
        //LLAMADA AL CONSTRUCTOR DE LA CLASE
        //CONSTRUCTOR DEFAUL
        Persona perso = new Persona();
        perso.imprimirDatos();
        
        Persona perso2 = new Persona ("Juan" , "Perez Jolote" , 30);
        perso2.imprimirDatos();
        
    }
    
}
