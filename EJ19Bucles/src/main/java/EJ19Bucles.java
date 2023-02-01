import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
/*
 * Ejercicio 19: Dadas 6 notas, escribir la cantidad de alumnos aprobados, condicionados (=4) y suspensos.
 */
/**
 *
 * @author pedromiras
 */
public class EJ19Bucles {

    public static void main(String[] args) {
        float nota;
        int aprobados=0,condicionados=0,suspensos=0;

        for (int i = 1; i < 6; i++) {
            do {
                nota=Float.parseFloat(JOptionPane.showInputDialog("Digite la nota del alumno entre 0-10: "));
            } while (nota<0||nota>10);

            if (nota==4) 
            {
                condicionados++;

            }else if(nota>=5){

                 aprobados++;

            }else{

               suspensos++;
            }
        }
        System.out.println("Aprobados: "+aprobados);
        System.out.println("Suspensos: "+suspensos);
        System.out.println("Condicionados: "+condicionados);
    }
}
