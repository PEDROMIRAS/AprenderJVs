
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

/**
 *
 * @author pedromiras
 */
public class EJ13Condicionales {

    public static void main(String[] args) {
        final int saldo_inicial=1000;
        int opcion,dinero,saldo_total;
        
        opcion=Integer.parseInt(JOptionPane.showInputDialog("Bienvenido a su cajero automatico\n"+
                "1.Ingresar dinero a la cuenta\n"+
                "2.Retirar dinero de la cuenta\n"+
                "3.Salir\n"));
        switch(opcion){
            case 1:
                dinero=Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto dinero quieres ingresar : "));
                saldo_total=saldo_inicial+dinero;
                JOptionPane.showMessageDialog(null, "Con esta operacion su saldo es de : "+saldo_total);
                break;
            
            case 2:
                dinero=Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto dinero quieres sacar : "));
                
                if (dinero<=saldo_inicial) {
                    
                saldo_total=saldo_inicial-dinero;
                JOptionPane.showMessageDialog(null, "Con esta operacion su saldo es de : "+saldo_total); 
                
                }else
                    JOptionPane.showMessageDialog(null, "Lo sentimos , pero no dispone de tanto dinero");
        
                break;
                
            case 3:
                System.exit(0);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Se equivoco de opcion");
                break;
                
        }
    }
}
