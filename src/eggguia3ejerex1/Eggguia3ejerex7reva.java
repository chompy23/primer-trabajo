/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eggguia3ejerex1;

import java.util.Scanner;

/**
 *
 * @author sergi
 */
public class Eggguia3ejerex7reva {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Ingrese la cantidad de numeros");
        Scanner cant = new Scanner(System.in);
        int cantnum = cant.nextInt();
        int suma = 0;
        int max = 0;
        int min = 110000;
        int prom = cantnum;
        do {
            System.out.println("Ingrese numeros");
            int numero = cant.nextInt();
            --cantnum;
            if (numero > 0) {
                suma = suma + numero;
            }else{
                --prom;
                continue;
            }
            if (numero > max) {
                max = numero;
            }
            if (numero < min) {
                min = numero;
            }
                        
            
        } while (cantnum != 0);
        
        double promedio = suma / prom;
        System.out.println("El promedio es : "+promedio);
        System.out.println("El numero de maximo valor es :"+max);
        System.out.println("El número de mínimo valor es :"+min);
        
    }
    
}
