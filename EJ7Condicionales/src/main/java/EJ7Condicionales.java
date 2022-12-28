
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

/**
 *
 * @author pedromiras
 */
public class EJ7Condicionales {

    public static void main(String[] args) {
        int n1 , n2 , n3;
        n1=Integer.parseInt(JOptionPane.showInputDialog("Digite el primer numero :"));
        
        n2=Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo numero :"));
        
        n3=Integer.parseInt(JOptionPane.showInputDialog("Digite el tercer numero :"));
        
        if ((n1>n2)&&(n2>n3)) 
        {
            JOptionPane.showMessageDialog(null, "El orden es : "+n1+n2+n3);
        }else if ((n2>n1)&&(n1>n3))
        {
            JOptionPane.showMessageDialog(null, "El orden es : "+n2+n1+n3);
        }else if ((n3>n1)&&(n1>n2)) {
            JOptionPane.showMessageDialog(null, "El orden es : "+n3+n1+n2);
        }
        else if ((n1>n3)&&(n3>n2)) {
            JOptionPane.showMessageDialog(null, "El orden es : "+n1+n3+n2);
        }
        else if ((n2>n3)&&(n3>n1)) {
            JOptionPane.showMessageDialog(null, "El orden es : "+n2+n3+n1);
        }
        else if ((n3>n1)&&(n2>n1)) {
            JOptionPane.showMessageDialog(null, "El orden es : "+n3+n2+n1);
        }
    }
}
