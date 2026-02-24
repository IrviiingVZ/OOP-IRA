/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva1_10_tv;

/**
 *
 * @author irvingvalles
 */
public class Control {
   public static void main(String[] args) {
        TV tele = new TV();
        tele.consultarEstadoTV();
        tele.prenderApagar();
        tele.consultarEstadoTV();
        tele.prenderApagar();
        tele.consultarEstadoTV();
        tele.prenderApagar();
        tele.cambiarCanal(50);
        tele.consultarEstadoTV();
        
        tele.consultarEstadoTV();
        tele.prenderApagar();
        tele.cambiarVolumen(10);
        tele.consultarEstadoTV();
        
   
 
    
        
    }
   
   
    

    

    
}
