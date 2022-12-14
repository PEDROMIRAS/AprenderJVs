

import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
/*
Programa que lea un caracter por teclado 
y compruebe si es una letra mayuscula
*/
/**
 *
 * @author pedromiras
 */
public class EJ3Condicionales {

    public static void main(String[] args) {
       char letra;
       letra =JOptionPane.showInputDialog("Digite una letra:").charAt(0);
        
        if (Character.isUpperCase(letra)) {
            JOptionPane.showMessageDialog(null, "'"+letra+"'"+" es una letra mayuscula");
        }else{
            JOptionPane.showMessageDialog(null, "'"+letra+"'"+" es una letra minuscula");

        }
    }
}
