/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva1_4_encapsulamiento;

/**
 *
 * @author irvingvalles
 */
public class Persona {
    //ATRIBUTOS
    private String nombre;
    private String apellidos;
    private int edad;
    private char genero;
    //Constructores
    //Comportamiento (metodos) //Inetermediario --> interfaz
    //get y set (lectura, escritura)
    public String getNombre(){
        return nombre;
    } 
    public void setNombre(String valor){
        nombre = valor;
        
    }
    public String getApellidos(){
        return apellidos;
        
    }
    public void setApellidos(String valor){
        apellidos = valor;
        
    }
    public int getEdad(){
        return edad;
        
    }
    public void setEdad(int valor){
        edad = valor; 
        
    }
    public char getGenero (){
        return genero;
        
    }
    public void setGenero(char valor){
        genero = valor;
    
    }
    public void imprimirDatos(){
        System.out.println("Nombre " + nombre);
        System.out.println("Apellidos " + nombre);
        System.out.println("Edad: " + nombre);
        System.out.println("Genero: " + nombre);
        
    }
    public String generarNombreCompleto(){
    return nombre + " " + apellidos;
    
    }
    
}
