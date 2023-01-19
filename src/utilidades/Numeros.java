/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utilidades;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author dam
 */
public class Numeros {

    public Numeros() {
    }

    public static float pedirNumeroReal(String mensaje) {
        float dato;
        Scanner entrada = new Scanner(System.in);
        System.out.println(mensaje);
        dato = entrada.nextFloat();
        return dato;
    }
    public static float pedirNumeroReal(String mensaje,
            float linferior,float lsuperior) {
        float dato = 0;
        Scanner entrada = new Scanner(System.in);
        boolean mal = true;
        while (mal) {
            try {
                System.out.println(mensaje);
                dato = entrada.nextFloat();
                if (dato < linferior || dato > lsuperior) {
                    System.out.println
        ("dato incorrecto ( valor entre " + linferior
                            + " y " + lsuperior);
                } else {
                    mal = false;
                }
            } catch (InputMismatchException ex) {
                System.out.println("No es un numero");
                entrada.nextLine();
            }
        }

        return dato;
    }
    
    public static float pedirNumeroReal(String mensaje, float linferior) {
         float dato = 0;
        Scanner entrada = new Scanner(System.in);
        boolean mal = true;
        while (mal) {
            try {
                System.out.println(mensaje);
                dato = entrada.nextFloat();
                if (dato < linferior ) {
                    System.out.println
        ("dato incorrecto ( valor entre " + linferior
                           );
                } else {
                    mal = false;
                }
            } catch (InputMismatchException ex) {
                System.out.println("No es un numero");
                entrada.nextLine();
            }
        }

        return dato;
    }

    public static int pedirNumeroEntero(String mensaje,
            int linferior, int lsuperior) {
        int dato = 0;
        Scanner entrada = new Scanner(System.in);
        boolean mal = true;
        while (mal) {
            try {
                System.out.println(mensaje);
                dato = entrada.nextInt();
                if (dato < linferior || dato > lsuperior) {
                    System.out.println
        ("dato incorrecto ( valor entre " + linferior
                            + " y " + lsuperior);
                } else {
                    mal = false;
                }
            } catch (InputMismatchException ex) {
                System.out.println("No es un numero");
                entrada.nextLine();
            }
        }

        return dato;
    }
    

    public  static int pedirNumeroEntero(String mensaje) {
        int dato;
        Scanner entrada = new Scanner(System.in);
        System.out.println(mensaje);
        dato = entrada.nextInt();

        return dato;
    }

    public static int pedirNumeroEntero(String mensaje, int linferior) {
        int dato;
        Scanner entrada = new Scanner(System.in);
        System.out.println(mensaje);
        dato = entrada.nextInt();
        while (dato < linferior) {
            System.out.println("Error");
            System.out.println(mensaje);
            dato = entrada.nextInt();
        }
        return dato;
    }
}
