
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

//Hacer un programa que lea un numero entero y que muestre si el nunero es multiplo de 10

/**
 *
 * @author pedromiras
 */
public class EJ1Condicionales {

    public static void main(String[] args) {
        int numero;
        
        numero=Integer.parseInt(JOptionPane.showInputDialog(null,"Introduce un numero entero :"));
        
        if(numero%10==0){
            JOptionPane.showMessageDialog(null, "El numero "+numero+" es multiplo de 10");
            
        }else if(numero%10!=0){
            JOptionPane.showMessageDialog(null, "El numero "+numero+" no es multiplo de 10");
        }
        
    }
}
