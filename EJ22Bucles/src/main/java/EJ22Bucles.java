import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

/**
 *
 * @author pedromiras
 */
public class EJ22Bucles {

    public static void main(String[] args) {
        float nota;

        boolean suspenso=false;

        for (int i = 1; i < 5; i++) {
            
            nota=Float.parseFloat(JOptionPane.showInputDialog("Inserte la nota del alumno"));

            if (nota<5) {
                suspenso=true;
            }
        }
        if (suspenso==true) 
        {
            System.out.println("\nAlguien ha suspendido.");

        } else {
            System.out.println("\nNadie ha suspendido.");
        }
    }
}
