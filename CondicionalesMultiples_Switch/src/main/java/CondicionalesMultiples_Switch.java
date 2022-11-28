
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
/*La sentencia Switch:

switch(dato){

case 1:Instrucciones1;
break;

case 2:Instrucciones2;
break;

case n:Instrucciones n;
breack;

default:CasoContrario;
break;

}
*/
/**
 *
 * @author pedromiras
 */
public class CondicionalesMultiples_Switch {

    public static void main(String[] args) {
        int dato;
        dato=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero entero entre 1-5"));
        switch(dato){
            case 1:JOptionPane.showMessageDialog(null,"Es el numero 1");
            break;
            case 2:JOptionPane.showMessageDialog(null,"Es el numero 2");
            break;
            case 3:JOptionPane.showMessageDialog(null,"Es el numero 3");
            break;
            case 4:JOptionPane.showMessageDialog(null,"Es el numero 4");
            break;
            case 5:JOptionPane.showMessageDialog(null,"Es el numero 5");
            break;
            default:JOptionPane.showMessageDialog(null,"El numero no esta en el rango pedido");
            
        }
        
    }
}
