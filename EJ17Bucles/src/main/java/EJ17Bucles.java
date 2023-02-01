import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
/*
 * Ejercicio 17: Una empresa que se dedica a la venta de desinfectantes necesita un programa para gestionar
 *  las facturas. En cada factura figura: el código del artículo, la cantidad vendida en litros y el
 *  precio por litro. Se pide de 5 facturas introducidas: Facturación total, cantidad en litros vendidos del
 *  artículo 1 y cuantas facturas se emitieron de más de $600.
 */
/**
 *
 * @author pedromiras
 */
public class EJ17Bucles {

    /**
     * @param args
     */
    public static void main(String[] args) {
         int codigo , litros,litrosArticulo=0,conteoMayor600=0;
         float precioLitros, importeFactura,facturacionTotal=0;
          
    for(int i=1;i<=5;i++)
    {
     codigo=Integer.parseInt(JOptionPane.showInputDialog("Articulo Nº"+i+"\nDigite el codigo :"));
     litros=Integer.parseInt(JOptionPane.showInputDialog("Articulo Nº"+i+"\nDigite la cantidad vendida en litros :"));
     precioLitros=Float.parseFloat(JOptionPane.showInputDialog("Articulo Nº"+i+"\nDigite el precio por litro :"));

     importeFactura=(float)litros *precioLitros;
     facturacionTotal+=importeFactura;

     if (codigo==1) {
      litrosArticulo+=litros;
     }
     if (importeFactura>600) {
        conteoMayor600++;
     }
    }

    System.out.println("Resumen de ventas");
    System.out.println("Facturacion Total: "+facturacionTotal);
    System.out.println("Cantidad de litros del articulo 1: "+litrosArticulo);
    System.out.println("Facturas mayores a 600€ :"+conteoMayor600);


    }
}
