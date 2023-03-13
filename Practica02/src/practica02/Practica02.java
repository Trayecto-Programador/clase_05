/**
 * Realice un algoritmo para determinar cuánto se debe pagar por equis cantidad de lápices
 * considerando que si son 1000 o más el costo es de 85¢;
 * de lo contrario, el precio es de 90¢.
 */
package practica02;

import javax.swing.JOptionPane;

public class Practica02 {

    public static void main(String[] args) {
        
        int totalLapices, cantidadMayorista;
        double total, precioMayorista, precioMinorista;

        totalLapices = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de lapices"));
        cantidadMayorista = 1000;
        precioMayorista = 0.85;
        precioMinorista = 0.90;
        total = 0;

        if (totalLapices >= cantidadMayorista) {
            total = totalLapices * precioMayorista;

        } else {
            total = totalLapices * precioMinorista;
        }
       
        //Prueba
        //Prueba 1: Cantidad de Lapiz = 1000 <--- $ 850--->
        //Prueba 2: Cantidad de Lapiz = 100 <--- $ 90--->
        System.out.println("El valor abonar es de: $ "+ total);
    }

}
