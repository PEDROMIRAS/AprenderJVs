import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

/**
 *
 * @author pedromiras
 */
public class EJ20Bucles {

    /**
     * @param args
     */
    public static void main(String[] args) {
        int n;
        float sueldo,sueldoMax=0;


        n=Integer.parseInt(JOptionPane.showInputDialog("Introducir un numero de sueldos: "));

     for (int i = 1; i <= n; i++) {
        sueldo=Float.parseFloat(JOptionPane.showInputDialog("Sueldo Nº"+i+" : "));
       sueldoMax+=sueldo;
      }
      System.out.println("La suma de todos los sueldos es : "+sueldoMax);

    }
}
