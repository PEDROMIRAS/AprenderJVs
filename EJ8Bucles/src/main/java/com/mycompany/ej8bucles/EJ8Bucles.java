/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ej8bucles;

import javax.swing.JOptionPane;

/**
 *
 * @author pedromiras
 */
public class EJ8Bucles {

    public static void main(String[] args) {
        
        int numero;
        numero=Integer.parseInt(JOptionPane.showInputDialog("Inserte un numero: "));
        
        for (int i  = 1; i < numero; i++) {
            System.out.println(i);
        }
    }
}
