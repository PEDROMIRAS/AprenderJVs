
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

/**
 *
 * @author pedromiras
 */
public class EJ18Bucles {

    /**
     * @param args
     */
    public static void main(String[] args) {
         int codigo , litros,litrosArticulo1=0,conteoMayor600=0;
         float  facturacionTotal=0,facturaPrecio1=0,facturaPrecio2=0,facturaPrecio3=0;
         float precioArticulo1=(float) 0.6,precioArticulo2=3,precioArticulo3=(float) 1.25;
         int opc=0;
          
    for(int i=1;i<=3;i++)
    {
     codigo=Integer.parseInt(JOptionPane.showInputDialog("Articulo Nº"+i+"\nDigite el codigo :"));
     litros=Integer.parseInt(JOptionPane.showInputDialog("Articulo Nº"+i+"\nDigite la cantidad vendida en litros :"));
     opc=Integer.parseInt(JOptionPane.showInputDialog("Articulo Nº"+i+"\nSeleccione el precio 1,2 o 3: "));

     switch (opc) {
        case 1:
        facturaPrecio1=(float)precioArticulo1*litros;
        case 2:
        facturaPrecio2=(float)precioArticulo2*litros;
        case 3:
        facturaPrecio3=(float)precioArticulo3*litros;
        default:
            break;
     }

     facturacionTotal=facturaPrecio1+facturaPrecio2+facturaPrecio3;
      
     if (codigo==1) {
      litrosArticulo1+=litros;
     }
     if (facturaPrecio1>600||facturaPrecio2>600||facturaPrecio3>600) {
        conteoMayor600++;
     }
    }

    System.out.println("Resumen de ventas");
    System.out.println("Facturacion Total: "+facturacionTotal);
    System.out.println("Cantidad de litros del articulo 1: "+litrosArticulo1);
    System.out.println("Facturas mayores a 600€ :"+conteoMayor600);


    }
}
