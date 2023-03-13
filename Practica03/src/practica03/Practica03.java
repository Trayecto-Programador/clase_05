/**
 * Un restaurante ofrece un descuento del 10% para consumos entre $ 30.00 y $ 50.00;
 * un descuento del 20% para consumos mayores a $ 50.00;
 * para todos los demás casos no se aplica ningún tipo de descuento.
 * Elaborar una aplicación que permita determinar el importe a pagar por el consumidor.
 * El diseño de la interfaz y otras consideraciones se dejan a su criterio.
 */
package practica03;

import javax.swing.JOptionPane;

public class Practica03 {

    public static void main(String[] args) {

        double valorConsumo, porcentajeDescuento1, porcentajeDescuento2, importeAbonar = 0;

        valorConsumo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de su consumo"));
        porcentajeDescuento1 = 0.10;
        porcentajeDescuento2 = 0.20;
        importeAbonar = valorConsumo;

        if (valorConsumo > 30) {

            if (valorConsumo >= 30 && valorConsumo <= 50) {
                importeAbonar = valorConsumo - valorConsumo * porcentajeDescuento1;
            } else {

                importeAbonar = valorConsumo - valorConsumo * porcentajeDescuento2;
            }
            
        }
        System.out.println("Importe Abonar: " + importeAbonar);
    }

}
