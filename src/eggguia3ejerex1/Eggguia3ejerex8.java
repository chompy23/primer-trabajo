/*
 Escriba un programa que lea números enteros. Si el número es múltiplo de cinco
 debe detener la lectura y mostrar la cantidad de números leídos, la cantidad 
 de números pares y la cantidad de números impares. Al igual que en el ejercicio
 anterior los números negativos no deben sumarse. Nota: recordar el uso de la
 sentencia break.

 */
package eggguia3ejerex1;

import java.util.Scanner;

/**
 *
 * @author sergi
 */
public class Eggguia3ejerex8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Ingrese un numero");
        Scanner num = new Scanner(System.in);
        int numero = 1;
        int par = 0;
        int impar = 0;
        int total = 0;
        
            while(numero % 5 != 0){
            numero = num.nextInt();
             if (numero % 2 == 0) {
                ++par;
                
            } else if(numero > 0) {  
                ++impar;
            
            }
            total = par + impar;
           }
        
        System.out.println("Numeros ingresados : " +total);
        System.out.println("Cantidad de numeros pares :"+par);
        System.out.println("Cantidad de numeros impares :"+impar);
}
}
