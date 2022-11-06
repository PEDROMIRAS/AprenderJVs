
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

/**
 *
 * @author pmira
 */
public class OperadoresEJ4 {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        final int mensual=1000;
        int  nCarrosVendidos,mensualTotal;
        float precioCarro, porcentaje;
        
        System.out.println("Cuantos carros ha vendido el empleado: ");
        nCarrosVendidos=entrada.nextInt();
        
        nCarrosVendidos*=150;
        System.out.println("Cuanto vale cada carro: ");
        precioCarro=entrada.nextFloat();
        
        //porcentaje=precioCarro*0.05f;
        porcentaje=(precioCarro*5)/100;
        
        mensualTotal=(int) (mensual+nCarrosVendidos+porcentaje);
        
        System.out.println("El salario mensual del vendedor es :"+mensualTotal);
        
    }
}
