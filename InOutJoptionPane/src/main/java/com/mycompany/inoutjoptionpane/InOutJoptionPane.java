/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.inoutjoptionpane;

import javax.swing.JOptionPane;

/**
 *
 * @author pmira
 */
public class InOutJoptionPane {

    public static void main(String[] args) {
     
        String cadena;
        int entero;
        double decimal;
        char letra;
//------------------------------ASI--SE--INTRODUCE--POR--PANEL--DE--TEXTO--------------------------------- 

        cadena=JOptionPane.showInputDialog("Digite una cadena: ");
        
        entero=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero entero:"));
        //es necesario pasar a string un numero , con la variable 'Integer' y sus opciones .parseInt
        
        decimal=Double.parseDouble(JOptionPane.showInputDialog("Digite un numero decimal:"));
        //es necesario pasar a string un numero , con la variable 'Integer' y sus opciones .parseDouble
        
        letra=JOptionPane.showInputDialog("Digite un caracter: ").charAt(0);
        
 //------------------------------ASI--SE--SACA--POR--PANEL--DE--TEXTO------------------------------------   
 
        JOptionPane.showMessageDialog(null, "La cadena es: "+cadena);
        JOptionPane.showMessageDialog(null, "El numero entero es: "+entero);
        JOptionPane.showMessageDialog(null, "El numero decumal es: "+decimal );
        JOptionPane.showMessageDialog(null,"El caracter es: "+letra);
        
        
    }
}
