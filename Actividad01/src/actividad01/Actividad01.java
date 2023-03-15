/**
 * Almacenes “El harapiento distinguido” tiene una promoción: a todos los trajes
 * que tienen un precio superior a $2500.00 se les aplicará un descuento de 15 %,
 * a todos los demás se les aplicará sólo 8 %. 
 * Realice un algoritmo para determinar el precio final que debe pagar una persona
 * por comprar un traje y de cuánto es el descuento que obtendrá.
 */
package actividad01;

import javax.swing.JOptionPane;


public class Actividad01 {

    
    public static void main(String[] args) {
        int precio;
        double descuento1, descuento2, precioFinal, valorDescuento;
        
        precio =Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio del traje"));
        descuento1 = 0.15;
        descuento2 =0.08;
        
        if(precio > 2500){
            valorDescuento = precio * descuento1;
            precioFinal = precio - valorDescuento;
        } else{
            valorDescuento = precio * descuento2;
            precioFinal = precio - valorDescuento;
        }
        
        System.out.println("<---NO valido como Factura--->");
        System.out.println("Importe: \t  " + precio);
        System.out.println("Descuento: \t  " + valorDescuento);
        System.out.println("Total: \t \t " +  precioFinal);
        
        
        
           }
    
}
