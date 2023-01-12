
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

/**
 *
 * @author pedromiras
 */
public class EJ3Bucles {

    public static void main(String[] args) {
        int numero;
        numero=Integer.parseInt(JOptionPane.showInputDialog("Inserte un numero: "));
        
        while(numero!=0){
            if (numero%2==0) {
                
                JOptionPane.showMessageDialog(null,"El numero "+numero+" es par");
            }else{
                JOptionPane.showMessageDialog(null,"El numero "+numero+" es impar");

            }
         numero=Integer.parseInt(JOptionPane.showInputDialog("Inserte otro numero: "));

        }
    }
}
