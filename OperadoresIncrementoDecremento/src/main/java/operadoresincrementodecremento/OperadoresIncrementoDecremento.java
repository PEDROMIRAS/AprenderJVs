/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package operadoresincrementodecremento;

/**
 *
 * @author pmira
 */
public class OperadoresIncrementoDecremento {

    public static void main(String[] args) {
        int x=5,y;
        //x+=5;
        //x++; //x+=1; x=x+1; /OPERADOR DE INCREMENTO
        //x--; //OPERADOR DE DECREMENTO
        
        //y=x++; Esto no funciona para incrementar , ya que el '++' esta delante de la X
        
        y=++x; //Aqui primero aumenta la X y luego asigna el valor a Y
        //y=--x; Para decrementar funciona igual
        
        System.out.println(y);    
        System.out.println(x);
    }
}
