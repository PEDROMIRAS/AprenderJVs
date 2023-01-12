
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

/**
 *
 * @author pedromiras
 */
public class EJ10Bucles {

    public static void main(String[] args) {
        
        int numero,suma=0;
        
        for (int i = 1; i <=10; i++) {
             numero=Integer.parseInt(JOptionPane.showInputDialog("Inserte un numero: "));
           suma+=numero;
        }
        
        System.out.println("La suma total de los numeros es :"+suma);
    }
}
