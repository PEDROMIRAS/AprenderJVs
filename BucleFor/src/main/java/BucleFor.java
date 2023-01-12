/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
import java.util.Scanner;

/*
        Bucle For    se inicializa y si cumple las condiciones , se ejecutan las instrucciones con las variaciones correspondientes

    for(inicializacion; condicion; aumento o decremeneto)
    {

      instrucciones;

    }
*/
/**
 *
 * @author pedromiras
 */
public class BucleFor {

    public static void main(String[] args) {
        
        for (int i = 0; i <= 10; i++) { //de mayor a menor 
            System.out.println(i);
        }
        
        for (int j = 10; j >= 0; j--) { // de menor a mayor
            System.out.println(j);
        }
        
        Scanner entrada = new Scanner(System.in);
        int contador;
        
        System.out.println("Indique la cantidad de numeros: ");
        contador=entrada.nextInt();
        
        for (int i = 0; i <= contador; i++) {  // (int i = 2; i <= contador; i+=2) ej: números pares
            System.out.println(i);
        }
        
    }
}
