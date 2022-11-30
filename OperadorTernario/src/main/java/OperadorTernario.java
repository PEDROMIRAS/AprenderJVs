
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

/* El operador ternario '?'
valor=(Condicion) ? valor1 : valor2 
*/

/**
 *
 * @author pedromiras
 */
public class OperadorTernario {

    public static void main(String[] args) {
        int numero;
        String mensaje;// Esto se podria borrar
        
        numero=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        
        mensaje=(numero%2==0) ? "Es par" : "Es impar";
        
        JOptionPane.showMessageDialog(null, mensaje);
        //JOptionPane.showMessageDialog(null, mensaje=(numero%2==0) ? "Es par" : "Es impar";); Borrar el String 
        
    }
}
