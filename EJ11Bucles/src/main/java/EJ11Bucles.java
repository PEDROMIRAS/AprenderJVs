/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

/**
 *
 * @author pedromiras
 */
public class EJ11Bucles {

    public static void main(String[] args) {
        long producto=1;
        
        for (int i = 1; i < 20; i+=2) {
            producto*=i;
            
        }
        System.out.println("El producto de los 10 primeros impares es : "+producto);
    }
}
