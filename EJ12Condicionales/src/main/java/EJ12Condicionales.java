
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

/**
 *
 * @author pedromiras
 */
public class EJ12Condicionales {

    public static void main(String[] args) {
        int nota;
        
        nota = Integer.parseInt(JOptionPane.showInputDialog("Introduce la nota obtenida: "));
       switch(nota){
           case 0:
           case 1:
           case 2:
               JOptionPane.showMessageDialog(null, "Insuficiente");
               break;
           case 3:
           case 4:
               JOptionPane.showMessageDialog(null, "Suficiente");
               break;
           case 5:
           case 6:
               JOptionPane.showMessageDialog(null, "Bien");
               break;
           case 7:
           case 8:
               JOptionPane.showMessageDialog(null, "Notable");
               break;
           case 9:                                
           case 10:   
               JOptionPane.showMessageDialog(null, "Sobreasaliente");
               break;
           default:
               JOptionPane.showMessageDialog(null,"Error");
                               
       }
    }
}
