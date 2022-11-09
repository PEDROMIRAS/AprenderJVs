/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package pcpmiras.operadoresej6;

import java.util.Scanner;
 
/**
 *
 * @author pmira
 */
public class OperadoresEJ6 {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        
        double a , b,  cuadrado ;
        
        System.out.println("Introduzca el valor del parametro 'a' : ");
        a=entrada.nextDouble();
        System.out.println("Introduzca el valor del parametro 'b' : ");
        b=entrada.nextDouble();
        
        
        cuadrado=Math.pow(a,2)+Math.pow(b,2)+(2*a*b);
        
        System.out.println("El cuadrado de la suma de los parametros 'a' y 'b' es :"+cuadrado);
        
        
    }
}
