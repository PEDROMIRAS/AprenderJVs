
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

/**
 *
 * @author pedromiras
 */
public class EJ10Condicionales {

    public static void main(String[] args) {
       int dia , mes , anio;
       dia=Integer.parseInt(JOptionPane.showInputDialog("Indique el dia: "));
        mes=Integer.parseInt(JOptionPane.showInputDialog("Indique el mes: "));
         anio=Integer.parseInt(JOptionPane.showInputDialog("Indique el año: "));
         
         if (anio==0) {
            JOptionPane.showMessageDialog(null, "Fecha incorrecta");
        }else if ((mes==2)&&(dia>=1&&dia<=28)) {
            JOptionPane.showMessageDialog(null, "Fecha correcta");
            
        }else if ((mes==4||mes==6||mes==9||mes==11)&&(dia>=1&&dia<=30)) {
            JOptionPane.showMessageDialog(null, "Fecha correcta");
        }
         else if ((mes==1||mes==3||mes==5||mes==7||mes==8||mes==10||mes==12)&&(dia>=1&&dia<=30)) {
            JOptionPane.showMessageDialog(null, "Fecha correcta");
        }else
             JOptionPane.showMessageDialog(null, "Fecha incorrecta");
    }
}
