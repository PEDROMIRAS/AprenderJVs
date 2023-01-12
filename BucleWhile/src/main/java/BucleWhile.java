
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
/*
        Bucle While     mientras pase la condicion , se ejecutan las instrucciones

     while(condicion){

      instrucciones;

    }
*/
/**
 *
 * @author pedromiras
 */
public class BucleWhile {

    public static void main(String[] args) {
        
        //Forma de menor a mayor
        int i=1;
        while(i<=10){     
            System.out.println(i++);// 1 2 ....10
        }
        //Forma de mayor a menor
        int j=10; 
        while(j>=1){    
            System.out.println(j--);// 10 9 ....1
        }
        
        //Solicitar al usuario cuantos numeros quiere , e imprimirlos
        Scanner entrada = new Scanner(System.in);
        int x=1, contador;
        System.out.println("Indique cuantos numeros desea en panatalla"); 
        contador=entrada.nextInt();
        
        while(x<=contador){
            System.out.println(x);
            x++;
            //x+=2; Si queremos que aumente de 2 en 2
              
        }
    }
}
