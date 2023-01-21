
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

/**
 *
 * @author pedromiras
 */
public class EJ16Bucles {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int numero;
        
        do {
            System.out.println("Introduce un numero (0-10):");
            numero=entrada.nextInt();
        } while (!(0<=numero && numero<=10));
        System.out.println("\n\nTabale del "+numero);
        
        for (int i = 0; i <= 10; i++) {
            System.out.println(numero+" x " +i+ " = "+numero*i);
        }
        
        
    }
}
