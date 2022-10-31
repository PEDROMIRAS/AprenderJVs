/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package operadoresej1;

import java.util.Scanner;

/**
 *
 * @author pmira
 */
public class OperadoresEj1 {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        float nota1,nota2,nota3,suma;
        
        System.out.println("Digite 3 calificaciones: ");
        
        //Guardamos las 3 notas
        nota1=entrada.nextFloat();
        nota2=entrada.nextFloat();
        nota3=entrada.nextFloat();
        
        suma=nota1+nota2+nota3;//Sumamos las 3 notas
        
        System.out.println("\nLa sumas : "+suma);
        
              
    }
}
