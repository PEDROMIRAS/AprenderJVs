
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

/**
 *
 * @author pedromiras
 */
public class EJ12Bucles {

    public static void main(String[] args) {
        int numero;
        long factorial=1;
        
        numero=Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero : "));
        
        for (int i = 1; i <=numero; i++) {
            factorial*=i;
        }
        System.out.println("El factorial de "+numero+" es : "+factorial);
    }
}
