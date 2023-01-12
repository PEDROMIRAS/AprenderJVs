
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

/**
 *
 * @author pedromiras
 */
public class EJ5Bucles_JUEGO {

    public static void main(String[] args) {
     int numero,aleatorio,contador=0;
     
     aleatorio=(int)(Math.random()*100);//generar numero aleatorio 0-100
     
        do {
         numero=Integer.parseInt(JOptionPane.showInputDialog("Inserte un numero: "));
         
            if (aleatorio>numero) {
                JOptionPane.showMessageDialog(null,"Digite un numero mayor");
            }
            else{
               JOptionPane.showMessageDialog(null,"Digite un numero menor"); 
            }
            contador++;
            
        } while (numero!=aleatorio);
        
            JOptionPane.showMessageDialog(null, "\nEnhorabuena , has acertado el numero aleatorio: "+aleatorio+" en: "+contador+" intentos\n");
    }
}
