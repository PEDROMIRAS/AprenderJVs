/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package operadoresaritmeticos;

import java.util.Scanner;

/**
 *
 * @author pmira
 */
public class OperadoresAritmeticos {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        float numero1,numero2,suma ,resta,mult,div,resto;
                
        
        System.out.println("Digite dos numeros: ");
        numero1=entrada.nextFloat();
        numero2=entrada.nextFloat();
        
        suma = numero1+numero2;//Asi se suma
        resta = numero1-numero2;//Asi se resta
        mult = numero1*numero2;//Asi se multiplica
        div = numero1/numero2;//Asi se divide
        resto= numero1%numero2;//Asi se obtiene el resto
        
        
        
        System.out.println("La suma es : "+suma);
        System.out.println("La resta es : "+resta);
        System.out.println("La multiplicacion es : "+mult);
        System.out.println("La division es : "+div);
        System.out.println("El resto es : "+resto);
        
    }
}
