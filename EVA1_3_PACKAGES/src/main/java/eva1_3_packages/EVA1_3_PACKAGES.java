/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package eva1_3_packages;

import Otro_paquete.Persona;

/**
 *
 * @author irvingvalles
 */
public class EVA1_3_PACKAGES {

    public static void main(String[] args) {
        Persona persona = new Persona();
        //persona. //los atributos son default, no son accesibles
        Automovil auto = new Automovil();
        //auto.marca //atributos son default, son accesibles (mismo paquete)
    }
}
