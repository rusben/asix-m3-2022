import java.io.*;
import java.util.*;

public class Calculadora {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        
        int n1, n2, op;
        
        System.out.println("MENU:");
        System.out.println("1.-SUMAR");
        System.out.println("2.-RESTAR");
        System.out.println("3.-MULTIPLICAR");
        System.out.println("4.-DIVIDIR");
        System.out.println("Esculli una opcio:");
        
        n1 = teclado.nextInt();
        n2 = teclado.nextInt();
        op = teclado.nextInt();      
        
        switch(op) {
            case 1: System.out.println(n1+n2);
                break;
            case 2: System.out.println(n1-n2);
                break;
            case 3: System.out.println(n1*n2);
                break;
            case 4: System.out.println(n1/n2);
                break;
            default: 
                break;
        }
/*        
        if (op == 1) {
            System.out.println(n1+n2);
        } else if (op == 2) {
            System.out.println(n1-n2);
        } else if (op == 3) {
            System.out.println(n1*n2);
        } else if (op == 4) {
            System.out.println(n1/n2);
        } else {
            
        }
*/

        
    }
}
