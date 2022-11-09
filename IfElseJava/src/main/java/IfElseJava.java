
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

/**
 *
 * @author pmira
 */

/*
La sentencia if

if(condicion)
{
    instruccion1;
}
else
{
    instruccion2;
}

*/
import javax.swing.JOptionPane;


public class IfElseJava {

    public static void main(String[] args) {
       int numero,dato=5;
       
        numero=Integer.parseInt(JOptionPane.showInputDialog("Digite un valor para numero:"));
        
        if (numero!=dato)//(numero==dato)(numero>=dato)(numero<=dato)<---Dfferentes opciones de condiciones
        {
            JOptionPane.showMessageDialog(null, "El numero no es 5");
            
        }
        else{
            JOptionPane.showMessageDialog(null, "El numero es  5");
        }
    }
}
