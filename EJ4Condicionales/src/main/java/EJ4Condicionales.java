
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

/**
 *
 * @author pedromiras
 */
public class EJ4Condicionales {

    public static void main(String[] args) {
        float compra, descuento;
        compra=Float.parseFloat(JOptionPane.showInputDialog("Indique el costo de su compra: "));
        if (compra>=300) {
            JOptionPane.showMessageDialog(null, "Se le aplicara un descuento del 20%");
            descuento=compra*0.20f;
            compra-=descuento;
            JOptionPane.showMessageDialog(null, "Su compra le costara "+compra);
        }else{
            JOptionPane.showMessageDialog(null, "Su compra le costara "+compra);
        }
    }
}
