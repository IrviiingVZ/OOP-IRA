/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva1_7_constructores;

/**
 *
 * @author irvingvalles
 */
public class Persona {
    //ATRIBUTOS

    private String nombre;
    private String apellidos;
    private int edad;
    
    //CONSTRUCTORES
    public Persona(){ //CONSTRUCTOR DEFAULT
        //INICIALIZAR
        nombre = "----";
        apellidos = "----";
        edad = -1;
        
        System.out.println("LLAMADA AL CONSTRUCTOR DEFAULT");
    
    }
     
   //FIRMA
    public Persona(String nombre, String apellido, int edada){
    //INICIALIZAR
    //This ---> operador para accceder al contenido del objeto actual 
    //Permite visualizar todo lo que esete definido en esta clase 
    //SIN IMPORTAR QUE MODIFICADOR TENGA
    
    this.nombre = nombre;
    this.apellidos = apellidos;
    this.edad = edad;
            
        
    }
    
    //METODOS O COMPORTAMIENTOS
    public String getNombre(){
        return nombre;
        
    }
    public void setNombre(String valor){
        nombre = valor;
        
    }
    public String getApellidos(){
        return apellidos;
        
    }
    public void setApelldos(String valor){
        apellidos = valor;
        
    }
    public int getEdad(){
        return edad;
        
    }
    public void setEdad(int valor){
        edad =  valor;
    }
    
    public void imprimirDatos(){
        System.out.println("Nombre");{
    }
        System.out.println("Apellidos");{
    }
        System.out.println("Edad");{
    }
        
    
    }
}
    
