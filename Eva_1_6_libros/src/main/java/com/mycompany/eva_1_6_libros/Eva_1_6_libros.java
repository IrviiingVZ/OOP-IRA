/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva_1_6_libros;

/**
 *
 * @author irvingvalles
 */
public class Eva_1_6_libros {
public static void main(String[] args) {
        // TODO code application logic here
         Libros[] Libreria = new Libros[3];
        for (int i = 0; i < Libreria.length; i++){
            Libreria[i] = new Libros(); 
            Libreria[i].setAutor("Gabriel García Márquez");
            Libreria[i].setLibro("Cien años de soledad");
            Libreria[i].setYear(1967);
            Libreria[i].setCiudad("Buenos Aires");
            Libreria[i].setEditorial("Editorial Sudamericana");
            Libreria[i].setPaginas(471);
            Libreria[i].ImprimirDatos();
        }
    }
    
}




     
    