
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

/**
 *
 * @author pedromiras
 */
public class EJ11Condicionales {

    public static void main(String[] args) {
        int x , y , sum , rest , mult, div ;
        char operacion;
        
        x =Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer digito a operar:"));
         y =Integer.parseInt(JOptionPane.showInputDialog("Introduce el segundo digito a operar:"));
        
         operacion=JOptionPane.showInputDialog("Digite la operacion a realizar : ").charAt(0);
         switch(operacion){
             case 'S':
             case 's':
                 sum=x+y;
                 JOptionPane.showMessageDialog(null, "La el resultado de la suma de los dos digitos es: "+sum);
                 break;
             case 'R':
             case 'r':
                 rest=x-y;
                 JOptionPane.showMessageDialog(null, "La  el resultado de la resta de los dos digitos es: "+rest);
                 break;
             case 'P':
             case 'p':   
             case 'M':
             case 'm':
                 mult=x*y;  
                 JOptionPane.showMessageDialog(null, "La  el resultado de la multiplicacion de los dos digitos es: "+mult);
                 break;
             case 'D':
             case 'd':
                 div=x/y;
                 JOptionPane.showMessageDialog(null, "La el resultado de la division de los dos digitos es: "+div);
                 break;
                 
         }
            
                        

        
         
         
        
        
    }
}
