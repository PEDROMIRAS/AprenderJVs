
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

/**
 *
 * @author pedromiras
 */
public class EJ15Bucles {

    public static void main(String[] args) {
     int edad , sumaEdad=0,conteoMayor18=0,conteoMayor175=0;
     float altura,sumaAltura=0,mediaEdad,mediaAltura;
     
        for (int i = 1; i <= 5; i++) {
            edad=Integer.parseInt(JOptionPane.showInputDialog("Alumno"+i+"\nDigite su edad :"));
                altura=Float.parseFloat(JOptionPane.showInputDialog("Alumno"+i+"\nDigite su altura :"));
                
                sumaEdad+=edad;
                sumaAltura+=altura;
            if (edad>18) {
                conteoMayor18++;
               
            }
            if (altura>1.75) {
                conteoMayor175++;
                
            }

        }
        mediaEdad=(float)sumaEdad/5;
        mediaAltura=(float)sumaAltura/5;
        
        System.out.println("La edad media: "+mediaEdad);
        System.out.println("La altura media: "+mediaAltura);
        System.out.println("Cantidad de alumnos mayores a 18 años: "+conteoMayor18);
        System.out.println("Cantidad de alumnos que miden mas de 175cm :"+conteoMayor175);
        
     
    }
}
