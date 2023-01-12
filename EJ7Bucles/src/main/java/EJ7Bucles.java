
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

/**
 *
 * @author pedromiras
 */
public class EJ7Bucles {

    public static void main(String[] args) {
        int numero,elementos = 0, suma=0;
        float media;
        
        numero=Integer.parseInt(JOptionPane.showInputDialog("Inserte un numero: "));
        
       while (numero>=0){
           
           suma+=numero;
           elementos++;
           
           numero=Integer.parseInt(JOptionPane.showInputDialog("Inserte otro numero: "));
       }
        if (elementos==0) {
            System.out.println("Error! No se puede calcular la media");
            
        }else
        {
            media=(float)suma/elementos;
            System.out.println("La media es : "+media);
            
        }
        
    }
}
