/*
 Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor 
diferente a cada una. A continuación, realizar las instrucciones necesarias 
para que: B tome el valor de C, C tome el valor de A, A tome el valor de D y D 
tome el valor de B. Mostrar los valores iniciales y los valores finales de cada 
variable. Utilizar sólo una variable auxiliar.
*/
package eggguia3ejerex1;

import java.util.Scanner;

/**
 *
 * @author sergi
 */
public class Eggguia3ejerex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Ingrse datos A,B,C,D");
        Scanner dat = new Scanner(System.in);
        int A = dat.nextInt();
        int B = dat.nextInt();
        int C = dat.nextInt();
        int D = dat.nextInt();
        System.out.println(" A: "+A+" B: "+B+" C: "+C+" D: "+D );
        int aux;
        aux = B;
        B = C;
        C = A;
        A = D;
        D = aux;
        System.out.println(" C: "+C+" D: "+D+" B: "+B+" A: "+A);
        
        
    }
    
}
