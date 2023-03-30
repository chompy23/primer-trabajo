/*
 Una obra social tiene tres clases de socios:
 Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en 
 todos los tipos de tratamientos.
 Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para
 los mismos tratamientos que los socios del tipo A.
 Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre 
 dichos tratamientos.
 Solicite una letra (carácter) que representa la clase de un socio, y luego 
 un valor real que represente el costo del tratamiento (previo al descuento) y
 determine el importe en efectivo a pagar por dicho socio.

 */
package eggguia3ejerex1;

import java.util.Scanner;

/**
 *
 * @author sergi
 */
public class Eggguia3ejerex5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Ingrese tipo de socio y costo del tratamiento");
        Scanner cod = new Scanner(System.in);
        String socio = cod.next().toUpperCase();
        int costo = cod.nextInt();
        double val;
        if (socio.equals("A")) {
            val = costo * 0.5;
            System.out.println("Para el socio tipo 'A' el costo es :" +val);
            
        } else if (socio.equals("B")) {
            val = costo * 0.65;
            System.out.println("Para el socio tipo 'B' el costo es :" +val);
        }
        if (socio.equals("C")) {
            System.out.println("Para el socio tipo 'C' el costo es :" +costo);
            
        }
    }
    
}
