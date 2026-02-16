/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva1_5_vehiculo;

/**
 *
 * @author irvingvalles
 */
public class vehiculo {
    //ATRIBUTOS
    private String marca; 
    private String modelo; 
    private int year; 
    private String color; 
    private String kilometraje; 
    private double precio; 
    
    //COMPORTAMIENTO
    public String getMarca(){
        return marca;
        
    }
    public void setMarca(String valor){
        marca = valor;
        
    }
    public String getModelo(){
        return modelo;
        
    }
    public void setModelo(String valor){
        modelo = valor;
        
    }
    public int getYear(){
        return year;
        
    }

    public void setYear(int valor){
        year = valor;
        
    }
    public String getColor(){
        return color;
        
    }
    public void setColor(String valor){
        color = valor;
        
    }
    public String getKilometraje(){
        return kilometraje;
        
    }
    public void setKilometraje(String valor){
        kilometraje = valor;
        
    }
    public double getPrecio(){
        return precio;
        
    }
    public void setPrecio(double valor){
        precio = valor;
        
    }
    public void imprimirDatos(){
        System.out.println("--- Datos del Vehiculo: ---");{
    }
        System.out.println("Marca: " + marca);{
    }
        System.out.println("Modelo: " + modelo);{
    }
        System.out.println("Año: " + year);{
    }
        System.out.println("color: " + color);{
    }
        System.out.println("Kilometraje " + kilometraje);{
    }
        System.out.println("Precio " + precio);{
    }
}

    
}
    
    
    


