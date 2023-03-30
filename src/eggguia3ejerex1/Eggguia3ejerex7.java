/*
 Realice un programa que calcule y visualice el valor máximo, el valor mínimo 
 y el promedio de n números (n>0). El valor de n se solicitará al principio del
 programa y los números serán introducidos por el usuario. Realice dos versiones
 del programa, una usando el bucle “while” y otra con el bucle “do - while”.

 */
package eggguia3ejerex1;

import java.util.Scanner;

/**
 *
 * @author sergi
 */
public class Eggguia3ejerex7 {

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
        
        while (cantnum != 0) {
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
        }
        double promedio = suma / prom;
        System.out.println("El promedio es : "+promedio);
        System.out.println("El numero de maximo valor es :"+max);
        System.out.println("El número de mínimo valor es :"+min);
        
   
    }
    
}
