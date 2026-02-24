/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_8_productos;

/**
 *
 * @author irvingvalles
 */
public class Eva1_8_Productos {

    public static void main(String[] args) {
        // TODO code application logic here
        Productos producto = new Productos("Tomates", "Heinz", "Kg", 25, 100);
        producto.imprimirDatos();
        double monto = producto.calcularMonto();
        System.out.println("Monto: " + monto);
    }
    
}

    
    
    
    

