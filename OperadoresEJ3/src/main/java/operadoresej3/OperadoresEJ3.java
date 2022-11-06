/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package operadoresej3;

import java.util.Scanner;

/**
 *
 * @author pmira
 */
public class OperadoresEJ3 {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        
        float dineroGuillermo,dineroLuis,dineroJuan,dineroTotal;
        
        System.out.println("Guillermo tiene: ");
        dineroGuillermo=entrada.nextFloat();
        
        dineroLuis=dineroGuillermo/2;
        System.out.println("Luis tiene: "+dineroLuis+"$");
        
        dineroJuan=(dineroGuillermo+dineroLuis)/2;
        System.out.println("Juan tiene : "+dineroJuan+"$");
        
        dineroTotal=dineroGuillermo+dineroLuis+dineroJuan;
        System.out.println("Entre los tres amigos tienen: "+dineroTotal+"$");
        
    }
}
