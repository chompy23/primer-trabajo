/*
 Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se 
 muestre su equivalente en romano.

 */
package eggguia3ejerex1;

import java.util.Scanner;

/**
 *
 * @author sergi
 */
public class Eggguia3ejerex4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Ingrese un número del 1 al 10 ");
        Scanner cad = new Scanner(System.in);
        int numero = cad.nextInt();
        String romano = "";
        if (numero > 0 && numero < 4) {
            
            for (int j = 0; j< numero; j++) {
                romano = romano.concat(" I") ;
            }
        }
        if (numero == 4) {
            romano = " IV ";
        }
        if (numero == 9) {
            romano = " IX ";
        }
        if (numero == 10) {
            romano = " X ";
        }
        if (numero == 5) {
            romano = " V ";
        }
        if (numero > 5 && numero < 9) {
            romano = " V";            
            for (int j = 0; j< numero - 5 ; j++) {
                romano = romano.concat(" I") ;
            }
        }
        System.out.println(" El numero : "+numero+" Es en romano : "+romano);
    }
}  
