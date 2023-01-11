
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

/**
 *
 * @author pedromiras
 */
public class EJ14Condicionales {

    public static void main(String[] args) {
        int opcion , peso, peso_final;
        peso=Integer.parseInt(JOptionPane.showInputDialog("Indica el peso en KG :"));
        opcion=Integer.parseInt(JOptionPane.showInputDialog("Balanza cambia peso\n"+
                "1.Pasar a hg.\n"+
                "2.Pasar a dag.\n"+
                "3.Pasar a g.\n"+
                "4.Pasar a dg.\n"+
                "5.Pasar a cg.\n"+
                "6.Pasar a mg.\n"+
                "7.Salir."));
        switch(opcion){
            case 1:
                
                peso*=10;
                JOptionPane.showMessageDialog(null, "El peso en hg es : "+peso);
                break;
            case 2:
                peso*=100;
                JOptionPane.showMessageDialog(null, "El peso en dag es : "+peso);
                break;
            case 3:
                peso*=1000;
                JOptionPane.showMessageDialog(null, "El peso en g es : "+peso);
                break;
            case 4:
                peso*=10000;
                JOptionPane.showMessageDialog(null, "El peso en dg es : "+peso);
                break;
            case 5:
                peso*=100000;
                JOptionPane.showMessageDialog(null, "El peso en cg es : "+peso);
                break;
            case 6:
                peso*=1000000;
                JOptionPane.showMessageDialog(null, "El peso en mg es : "+peso);
                break;
            case 7:
                
                System.exit(0);
                break;
        }
    }
}
