/*
 Realice un programa para que el usuario adivine el resultado de una 
 multiplicación entre dos números generados aleatoriamente entre 0 y 10. 
 El programa debe indicar al usuario si su respuesta es o no correcta. 
 En caso que la respuesta sea incorrecta se debe permitir al usuario ingresar
 su respuesta nuevamente. Para realizar este ejercicio investigue como utilizar
 la función Math.random() de Java.

 */
package eggguia3ejerex1;

import java.util.Scanner;

/**
 *
 * @author sergi
 */
public class egggui3ejerex10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        
        int prod;
        int valor = 0;
        int num1;
        num1 = (int) (Math.random()* 10);
        int num2;
        num2 =  (int) (Math.random()* 10);
        prod = num1 * num2;
        System.out.println("valor producto"+prod);
        while (valor != prod){
            System.out.println("Ingrese un nuevo valor");
            Scanner val = new Scanner(System.in);
            valor = val.nextInt();
        }   
               
                   
               
        
        
  
    
}
}