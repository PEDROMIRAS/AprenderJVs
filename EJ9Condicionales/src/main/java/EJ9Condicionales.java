
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

/**
 *
 * @author pedromiras
 */
public class EJ9Condicionales {

    public static void main(String[] args) {
        int dia , mes , anio ;
        dia=Integer.parseInt(JOptionPane.showInputDialog("Digite el dia :"));
        
        mes=Integer.parseInt(JOptionPane.showInputDialog("Digite el mes :"));
        
        anio=Integer.parseInt(JOptionPane.showInputDialog("Digite el anio :"));
        
        if (dia<=30) 
        {
            if (mes<=12) 
            {
                JOptionPane.showMessageDialog(null, "La fecha indicada es "+dia+"/"+mes+"/"+anio);
            }
            else
                JOptionPane.showMessageDialog(null, "La fecha indicada es erronea");
        }
        else
            JOptionPane.showMessageDialog(null, "La fecha indicada es erronea");
        
    }
}
