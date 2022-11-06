/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package operadoresej5;

import java.util.Scanner;

/**
 *
 * @author pmira
 */
public class OperadoresEJ5 {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        
        float participacion,parcial1,parcial2,examenFinal,notaTotal;
        System.out.println("Nota participacio: ");
        participacion=entrada.nextFloat();
        System.out.println("Nota primer parcial: ");
        parcial1=entrada.nextFloat();
        System.out.println("Nota segundo parcial: ");
        parcial2=entrada.nextFloat();
        System.out.println("Nota examen final: ");
        examenFinal=entrada.nextFloat();
        
        participacion*=0.1;
        parcial1*=0.25;
        parcial2*=0.25;
        examenFinal*=0.40;
        
        notaTotal=participacion+parcial1+parcial2+examenFinal;
        
     
        
        System.out.println("La nota del alummno es : "+notaTotal);
    }
}
