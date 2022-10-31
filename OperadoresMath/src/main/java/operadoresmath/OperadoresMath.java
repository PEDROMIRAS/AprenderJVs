/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package operadoresmath;

/**
 *
 * @author pmira
 */
public class OperadoresMath {

    public static void main(String[] args) {
       //Clase MATH
       //Sacar la raiz cuadrada de un numero
       
       double raiz=Math.sqrt(9);//Tiene que ser una variable de tipo 'double' , si no da error
       //int raiz=(int)Math.sqrt(16); Tambien se puede convertir la variable antes de Math
       
       //Elevar un numero a cierta potencia
       
       double base=5,exponente=2;
       double resultado=Math.pow(base,exponente);//Se usa 'double' tambien
       //Tambien se puede transformar de enteros a double si es lo que se desea
       
       //Redondear un numero 
       double numero=4.56;
       long redondeo=Math.round(numero);
       
       float numero1=6.765f;
       int redondeo1=Math.round(numero1);
     
       //Valores aleatorios
       double numero2=Math.random();
       
    //-----------------------------------------------------------------------------------------------   
        System.out.println(raiz);
        System.out.println(resultado);
        System.out.println(redondeo);
        System.out.println(redondeo1);
        System.out.println(numero2);
    }
}
