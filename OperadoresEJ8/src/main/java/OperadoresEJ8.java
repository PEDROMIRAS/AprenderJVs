
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

/**
 *
 * @author pmira
 */
public class OperadoresEJ8 {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        double a , b , c , raiz1,raiz2;
        
        System.out.println("Introduzca el valor de la variable 'a' :");
        a=entrada.nextDouble();
        System.out.println("Introduzca el valor de la variable 'b' :");
        b=entrada.nextDouble();
        System.out.println("Introduzca el valor de la variable 'c' :");
        c=entrada.nextDouble();
        
        raiz1=(-b+Math.sqrt(Math.pow(b, 2)-(4*a*c)))/(2*a);
        raiz2=(-b-Math.sqrt(Math.pow(b, 2)-(4*a*c)))/(2*a);
        
        
        System.out.println("La solucion '+' a la raiz es : "+raiz1);
        System.out.println("La solucion '-' a la raiz es : "+raiz2);
    }
}
