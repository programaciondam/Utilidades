/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utilidades;

import java.util.Scanner;

/**
 *
 * @author dam
 */
public class Alfanumericos {
     public String pedirString(String mensaje) {
        String dato;
        Scanner entrada = new Scanner(System.in);
        System.out.println(mensaje);
        dato = entrada.next();
        return dato;
    }
}
