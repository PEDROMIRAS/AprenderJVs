
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

/**
 *
 * @author pedromiras
 */
public class EJ1Bucles {

    public static void main(String[] args) {
        
        int numero,cuadrado;
        
        numero=Integer.parseInt(JOptionPane.showInputDialog("Inserte un numero: "));
        
        while(numero>=0){
            
            cuadrado=(int) Math.pow(numero, 2);
            JOptionPane.showMessageDialog(null, "El numero "+numero+"elevado al cuadradro es : "+cuadrado);
            
            numero=Integer.parseInt(JOptionPane.showInputDialog("Inserte otro numero: "));
        }
    }
}
