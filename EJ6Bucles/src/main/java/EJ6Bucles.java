
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

/**
 *
 * @author pedromiras
 */
public class EJ6Bucles {

    public static void main(String[] args) {
        int numero,suma = 0;
        
        
        
        do{
          
           numero=Integer.parseInt(JOptionPane.showInputDialog("Inserte un numero: "));
           
           suma+=numero;//Suma iterativa
           
           
       }while(numero!=0);
        
        JOptionPane.showMessageDialog(null,"El resultado de todos los digitos introducidos es :"+suma);
    
    }
}
