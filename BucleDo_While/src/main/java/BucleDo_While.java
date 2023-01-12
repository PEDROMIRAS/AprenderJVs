/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
import java.util.Scanner;

/*
        Bucle  Do While                  (se ejecutan las intrucciones al menos 1 vez , luego se comprueba la condicion)

    do{

      instrucciones;

    }while(condicion);

*/
/**
 *
 * @author pedromiras
 */
public class BucleDo_While {

    public static void main(String[] args) {
        
        int i=1; //Si cambiamos el numero por 11 , se ejecuta todo
        
        do {
            System.out.println(i);
            i++;
            
        } while (i<=10);// pero corta aqui ya que 11 es mayor que 10
        
        int j=10;
        
        do {
            System.out.println(j);
            j--;
            
        } while (j>=1);
        
        Scanner entrada = new Scanner(System.in);
        int x=1,contador;
        
        System.out.println("Indique la cantidad de numeros: ");
        contador=entrada.nextInt();
        
        do {
            System.out.println(x);
            x++;
            
        } while (x<=contador);
        
    }
}
