
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

/**
 *
 * @author pedromiras
 */
public class EJ5Condicionales {

   public static void main(String[] args) {
        float  horas,salario;
        horas=Float.parseFloat(JOptionPane.showInputDialog("Indique el numero de horas trabajadas durante la semana: "));
        if (horas<=40) {
            JOptionPane.showMessageDialog(null, "Se le pagara la tarifa estandar");
            salario=horas*16;
            JOptionPane.showMessageDialog(null, "Su sueldo semanal sera de : "+salario);
        }else if(horas>40){
            JOptionPane.showMessageDialog(null, "Se le pagara la tarifa de horas extra ");
            salario=(40*16)+((horas-40)*20);
            JOptionPane.showMessageDialog(null, "Su sueldo semanal sera de : "+salario);
        }
    }
}
