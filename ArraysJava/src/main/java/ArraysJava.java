/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

/**
 *
 * @author pedromiras
 */
public class ArraysJava {

/*
    Array Unidimensinal:
    Tipo_de_variable[] Nombre_del_array=New Tipo_de_variable[dimension];
    Tipo_de_variable[] Nombre_del_array={X,X,X,...}
    
*/
public static void main(String[] args) {
    
    //Crear un ARRAY
    int[] numeros=new int[5];
   //int[] numeros={21,14,3,8,96};
   //Formas de rellenar un ARRAY 
    numeros[0]=21;
    numeros[1]=14;
    numeros[2]=3;
    numeros[3]=8;
    numeros[4]=96;

    

    for (int i = 0; i < 5; i++) {//Forma de imprimir un ARRAY , se hace siempre con bucles
        
        System.out.println(numeros[i]);
    }
}
}
