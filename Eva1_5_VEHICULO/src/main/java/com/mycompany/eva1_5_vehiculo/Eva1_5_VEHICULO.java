/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_5_vehiculo;

/**
 *
 * @author irvingvalles
 */
public class Eva1_5_VEHICULO {

    public static void main(String[] args) {
        /*Vehiculo vehiculo = new Vehiculo();{
    }
        vehiculo.setMarca("Mitsubishi");{
    }
        vehiculo.setModelo("Lancer");{
        
    }
        vehiculo.setYear("2015");{
        
    }
        vehiculo.setcolor("blanco");{
        
    }
        vehiculo.setKilometraje("100000");{
        
    }
        vehiculo.setPrecio("90000");{
        
    }
        vehiculo.ImprimirDatos();
    */
        
        
        vehiculo[] agencia = new vehiculo[10]; //CREAMOS EL ARREGLO PERO NO LOS VEHICULOS
        //10 objetos y 1 arreglo, 11 objetos
        for (int i = 0; i < agencia.length; i++) {
        
            //Creamos el vehiculo para la posicion del arreglo
            agencia[i] = new vehiculo(); 
            agencia[i].setMarca("Lancer");
            agencia[i].setModelo("Lancer");
            agencia[i].setYear(2015);
            agencia[i].setColor("blanco");
            agencia[i].setKilometraje("100000");
            agencia[i].setPrecio(90000);
        }
    }
}
