/*
  Dado un tiempo en minutos, calcular su equivalente en días y horas. 
 Por ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su 
 equivalente: 1 día, 2 horas.
*/
package eggguia3ejerex1;

import java.util.Scanner;

/**
 *
 * @author sergi
 */
public class Eggguia3ejerex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(" Ingrese el tiempo ");
        Scanner tie = new Scanner(System.in);
        int tiempo = tie.nextInt();
        int dia;
        int hora;
        hora = tiempo / 60;
        dia = hora / 24;
        int horas = hora - (dia * 24);
        int min = tiempo - ((dia *24) + horas)* 60;
        System.out.println("El tiempo de :"+tiempo+" minutos ");
        System.out.println("Equivale a ");
        System.out.println(+dia+ " Dias "+horas+ " Horas "+min+ " Minutos");
        
    }
    
}
