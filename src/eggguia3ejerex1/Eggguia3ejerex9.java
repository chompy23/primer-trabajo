/*
 Simular la división usando solamente restas. Dados dos números enteros mayores
 que uno, realizar un algoritmo que calcule el cociente y el residuo usando 
 sólo restas. Método: Restar el dividendo del divisor hasta obtener un resultado
 menor que el divisor, este resultado es el residuo, y el número de restas 
 realizadas es el cociente.

Por ejemplo: 50 / 13:
50 – 13 = 37     una resta realizada
37 – 13 = 24     dos restas realizadas
24 – 13 = 11     tres restas realizadas
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
¿Aún no lo entendiste? Recomendamos googlear división con restas sucesivas.

 */
package eggguia3ejerex1;

import java.util.Scanner;

/**
 *
 * @author sergi
 */
public class Eggguia3ejerex9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Ingrese el dividendo y divisor ");
        Scanner val = new Scanner(System.in);
        int div = val.nextInt();
        int divi = val.nextInt();
        while ((divi == 0)||(divi < 0)){
            System.out.println("Ingrese u nuevo divisor");
            divi = val.nextInt();
        }  
        int resta;
        int cont = 1;
        int aux = div - divi;
        while (aux > divi ){   
            aux = aux - divi;
            ++cont;
        }
        
        System.out.println("Cociente : "+cont+"resto :"+aux);
                
        
        
    }
}
    