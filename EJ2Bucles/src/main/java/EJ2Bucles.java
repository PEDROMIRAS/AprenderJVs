
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

/**
 *
 * @author pedromiras
 */
public class EJ2Bucles {

    public static void main(String[] args) {
        int numero;
        
        numero=Integer.parseInt(JOptionPane.showInputDialog("Inserte un numero: "));
        
        while(numero!=0)//minetras sea diferente a 0
        {
            if (numero>0) {
                JOptionPane.showMessageDialog(null,"El numero "+numero+" es positivo.");
            }else {
                JOptionPane.showMessageDialog(null,"El numero "+numero+" es negativo");
            }
         numero=Integer.parseInt(JOptionPane.showInputDialog("Inserte otro numero: "));

        }

    }
}
