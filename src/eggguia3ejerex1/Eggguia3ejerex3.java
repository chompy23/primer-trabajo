/*
 Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata
 de una vocal. Caso contrario mostrar un mensaje. Nota: investigar la función 
 equals() de la clase String.

 */
package eggguia3ejerex1;

import java.util.Scanner;

/**
 *
 * @author sergi
 */
public class Eggguia3ejerex3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Ingrese una letra");
        Scanner let = new Scanner(System.in);
        String letra;
        letra = let.nextLine().toLowerCase();
        boolean imp = false;
        for (int i = 1; i <= 5; i++) {
            switch(i){
                case 1:
                    if ((letra.equals("a"))) {
                        imp = true;
                        break;
                    } else {
                        continue;
                    }
                    
                case 2:
                    if ((letra.equals("e"))) {
                        imp = true;
                        break;
                    } else {
                        continue;
                    }
                case 3:
                    if ((letra.equals("i"))) {
                        imp = true;
                        break;
                    } else {
                        continue;
                    }
                case 4:
                    if ((letra.equals("o"))) {
                        imp = true;
                        break;
                    } else {
                        continue;
                    }
                case 5:
                    if ((letra.equals("u"))) {
                        imp = true;
                        break;
                    } else {
                        
                    }
                default :
                    
                    
            }
            
        }
        if (imp == true) {
            System.out.println("Es una vocal : " +letra);
            
        } else {
            System.out.println("No es una vocal : " +letra);
        }
    }    
    
}
