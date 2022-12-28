import javax.swing.JOptionPane;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

/**
 *
 * @author pedromiras
 */
public class EJ6Condicionales {

    public static void main(String[] args) {
        int n1 , n2;
        n1=Integer.parseInt(JOptionPane.showInputDialog("Digite el primer numero :"));
        
        n2=Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo numero :"));
        
        if((n1%2==0)&&(n2%2==0)) 
        {
            JOptionPane.showMessageDialog(null, "Ambos numeros son pares");
        }
        else if ((n1%2!=0)&&(n2%2!=0)) {
            
        
           JOptionPane.showMessageDialog(null, "Ambos numeros son impares"); 
        }
        else
            JOptionPane.showMessageDialog(null, "Uno de los dos no es par");
    }
}
