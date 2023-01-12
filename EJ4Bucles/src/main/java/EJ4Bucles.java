
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

/**
 *
 * @author pedromiras
 */
public class EJ4Bucles {

    public static void main(String[] args) {
        
        int numero,contador = 0;
        
        numero=Integer.parseInt(JOptionPane.showInputDialog("Inserte un numero: "));
        
       while (numero>0){
           contador++;
           
           numero=Integer.parseInt(JOptionPane.showInputDialog("Inserte otro numero: "));
       }
        JOptionPane.showMessageDialog(null,"Se han introducido "+contador+" numeros.");
    }
}
