/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package variablesjvs;

/**
 *
 * @author pmira
 */
public class VariablesJVs {

    public static void main(String[] args) {
        //VARIABLE--->Espacio de memoria donde se almacena un caracter
 
 //-------------------------------ENTEROS----------------------------------------------------------       
       byte entero0=12;//-128 a 127
        //entero=12;
        short entero1=12780;//-32,768 a 32,767
        int entero2=124970497;//-2,147,483,648 a 2,147,483,647
        long entero3=1234523567; //-9,223,372,036,852,775,808 a 9,223,372,036,852,775,807
        
        System.out.println("Numero entero: "+entero0);
        System.out.println("Numero entero: "+entero1);
        System.out.println("Numero entero: "+entero2);
        System.out.println("Numero entero: "+entero3);
 //-------------------------------DECIMALES--------------------------------------------------------      
        float decimal0=64.2f; //!OJO¡ para el FLOAT necesitamos poner una "f" detras del numero
        
        double decimal1=3.255;
        
        System.out.println("Numero decimal: "+decimal0);
      
        System.out.println("Numero decimal: "+decimal1);
 
 //----------------------------------CARACTERES----------------------------------------------------       
     
        char caracter='a';
        
        System.out.println("Caracter: "+caracter);
 //----------------------------------------------BOOLEAN-------------------------------------------
       
        boolean decision0=true;
        boolean decision1=false;
        
        System.out.println("La decision es : "+decision0);
        System.out.println("La decision es : "+decision1);
    }
}
