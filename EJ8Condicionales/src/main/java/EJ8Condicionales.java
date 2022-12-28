/*
EJ 8
Pedir un numero entre el 0 y el 99999 , y que diga cuantas cifras tiene 
*/
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

/**
 *
 * @author pedromiras
 */
public class EJ8Condicionales {

    public static void main(String[] args) {
        int numero;
        numero=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero :"));
        
        if (numero<10) 
        {
            JOptionPane.showMessageDialog(null, "El numero "+numero+" tiene 1 cifra");
        }
        else if ((numero>=10)&&(numero<100))
        {
             JOptionPane.showMessageDialog(null, "El numero "+numero+" tiene 2 cifra");
        }
        else if ((numero>=100)&&(numero<1000)) 
        {
             JOptionPane.showMessageDialog(null, "El numero "+numero+" tiene 3 cifra");
        }
        else if ((numero>=1000)&&(numero<10000)) 
        {
             JOptionPane.showMessageDialog(null, "El numero "+numero+" tiene 4 cifra");
        }
        else if ((numero>10000)&&(numero<100000))
        {
             JOptionPane.showMessageDialog(null, "El numero "+numero+" tiene 5 cifra");
        }
        else if (numero>=100000) 
        {
             JOptionPane.showMessageDialog(null, "El numero "+numero+" supera el valor maximo");
        }
    }
}
