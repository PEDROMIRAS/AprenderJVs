/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.entradadedatosjvs;

import java.util.Scanner;

/**
 *
 * @author pmira
 */
public class EntradaDeDatosJVs {

    public static void main(String[] args) {
        
        Scanner entrada=new Scanner(System.in);
//----------------------------Asi--se--introducen--numeros----------------------
        int numero;
        //float numero;
        //double numero;
        
        System.out.println("Digite un numero: ");
        numero=entrada.nextInt();
        //numero=entrada.nextFloat();
        //numero=entrada.nextDouble();
        
        
        System.out.println("El numero es :"+numero);
        
//-----------------------Asi--se--introducen--cadenas---------------------------
         
         String cadena;
         System.out.println("Digite una cadena: ");
          
         //cadena=entrada.next(); <---------Solo guarda la cadena hasta el primer espacio
         cadena=entrada.nextLine();//<----------Imprime la cadena entera
         
         System.out.println("La cadena es: "+cadena);
        
//--------------------Asi--se--introducen--caracteres---------------------------        
         char letra;
         
         System.out.println("Digite una letra: ");
         letra=entrada.next().charAt(0); 
         //charAt guarda un unico caracter , en funcion del numero de caracteres que le indiques
         
         System.out.println("La cadena es: "+letra);
         
    }
}
