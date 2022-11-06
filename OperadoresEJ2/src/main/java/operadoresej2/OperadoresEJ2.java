/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package operadoresej2;

import java.util.Scanner;

/**
 *
 * @author pmira
 */
public class OperadoresEJ2 {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        
        char nombre;
        double salario, horasTrabajo , salarioSemanal;
        
        
        System.out.println("Introduzca el nombre del empleado: ");
        nombre=entrada.next().charAt(0);
        System.out.println("Introduzca el salario por hora: ");
        salario=entrada.nextFloat();
        System.out.println("Introduzca las horas trabajadas: ");
        horasTrabajo=entrada.nextInt();
        
        salarioSemanal=salario*horasTrabajo;
        
        System.out.println("El salario semanal es : "+salarioSemanal+"€");
       
    }
}
