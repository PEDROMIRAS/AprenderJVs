import javax.swing.JOptionPane;

/**
 *
 * @author pedromiras
 */
public class EJ21Bucles {

    public static void main(String[] args) {
        int numero;
        boolean hay_negativos = false;

        for (int i = 1; i < 10; i++) {
            numero=Integer.parseUnsignedInt(JOptionPane.showInputDialog("Digite un numero"));

            if (numero<0) {
                
                hay_negativos=true;
            }
        }
        if (hay_negativos==true) {
            System.out.println("Hay al menos un negativo en este grupo de numeros");
        } else {
            System.out.println("No hay ningun numero negativo");
        }
    }
}