/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_1clases;

/**
 *
 * @author irvingvalles
 */
public class EVA1_1CLASES {

    public static void main(String[] args) {
        
        //CREAR OBJETOS: --> INSTANCIAR 
        //DECLARACION = INSTANCIACION
        //CLASAE identificador = new CLASE(argumentos) ; 
        //new --> crea el bojeto en la memoria RAM 
        persona perso1 = new persona();
        System.out.println(perso1); //REFERENCIA (DIRECCION DE MEMORIA)
        perso1.nombre = "juan";
        perso1.apellidos = "Perez Jolote";
        perso1.Edad = 30;
        perso1.imprimir();
    }
}
//PERSONA  --> plantilla de codigo: NO EXISTE 
//TIPOS DE DATOS ABSTRACTOS 
class persona {
    //DATOS (ESTADO) , (variables) --> ATRIBUROS
    String nombre;
    String apellidos;
    int Edad;
    //COMPORTAMIENTO --> METODOS 
    void imprimir (){
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellidos: " + apellidos);
        System.out.println("Edad " + Edad);
    
    }
}

