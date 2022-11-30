
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

/*
EJ2: Pedir dos numero y decir cual de los dos 
es el mayor o si son iguales
*/


/**
 *
 * @author pedromiras
 */
public class EJ2Condicionales {

    public static void main(String[] args) {
        int n1 , n2;
        
        n1=Integer.parseInt(JOptionPane.showInputDialog(null, "Inserte el primer numero"));
        n2=Integer.parseInt(JOptionPane.showInputDialog(null, "Inserte el segundo numero"));
        
        if(n1>n2){
            JOptionPane.showMessageDialog(null, "El numero "+n1+" es mayor que el numero "+n2);
        }else if(n2>n1){
            JOptionPane.showMessageDialog(null, "El numero "+n2+" es mayor que el numero "+n1);   
        }else if(n1==n2){
            JOptionPane.showMessageDialog(null,"El numero "+n1+" es igual al numero "+n2);
        }
        
    }
}
