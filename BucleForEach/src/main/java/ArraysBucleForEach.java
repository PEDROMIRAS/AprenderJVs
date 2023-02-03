
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

/**
 *
 * @author pedromiras
 */
public class ArraysBucleForEach {

    public static void main(String[] args) {
       
        String[] nombre={"Pedro","Jose David","Maria","Carmen","Cristina","Hortensia"};

       /*for (int i = 0; i < nombre.length; i++) {

            System.out.println(nombre[i]);
        }
        */

        for (String i : nombre) {
        //Bucle FOR_EACH  se indica el tipo de variable , se pone un nombre al iterador , dos puntos y el nombre del array
            System.out.println("Nombre: " + i);
        }
    }
}
