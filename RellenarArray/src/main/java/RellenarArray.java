import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

/**
 *
 * @author pedromiras
 */
public class RellenarArray {

    public static void main(String[] args) {

        Scanner entrada =new Scanner(System.in);
        int nElementos;

        nElementos=Integer.parseInt(JOptionPane.showInputDialog("Inserte el numero de elementos que tendra el ARRAY"));

        char[] letras=new char[nElementos];

        System.out.println("Digite los elementos del array: ");

        for (int i = 0; i < nElementos; i++) {
            System.out.println((i+1)+". Digite un caracter: ");
            letras[i]=entrada.next().charAt(0);
        }

        System.out.println("\nLos caracteres del array son : ");
        for (int i = 0; i < nElementos; i++) {
            System.out.print(letras[i]+"\n");

        }
    }
}
