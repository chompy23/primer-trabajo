/*
 Leer la altura de N personas y determinar el promedio de estaturas que se 
 encuentran por debajo de 1.60 mts. y el promedio de estaturas en general.

 */
package eggguia3ejerex1;

import java.util.Scanner;

/**
 *
 * @author sergi
 */
public class Eggguia3ejerex6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Ingrese número de participantes");
        Scanner cant = new Scanner(System.in);
        int part = cant.nextInt();
        double promedio = 0;
        double prommenor = 0;
        int j = 0;
        double estt = 0;
        double estmen = 0;
        for (int i = 1; i < part; i++) {
            System.out.println("Ingrese una estatura");
            double est = cant.nextDouble();
            estt = estt + est;
             promedio = estt / i;
             if (est < 1.60) {
                 ++j;
                 estmen = estmen + est;
                 prommenor = estmen / j;
            }
        }
        System.out.println("Promedio general de estaturas : "+promedio);
        System.out.println("Promedio de estaturas menores a 1.6 : "+prommenor);
        
    }
    
}
