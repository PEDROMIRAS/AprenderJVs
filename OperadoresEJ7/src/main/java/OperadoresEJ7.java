
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

/**
 *
 * @author pmira
 */
public class OperadoresEJ7 {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int totalHoras, semanas, dias , horas ;
        
        System.out.println("Introduzca el total de horas: ");
        totalHoras=entrada.nextInt();
        
        semanas=totalHoras/168;
        dias=totalHoras%168/24;
        horas=totalHoras%24;
        
        System.out.println("Semanas: "+semanas);
        System.out.println("Días: "+dias);
        System.out.println("Horas: "+horas);
        
    }
}
