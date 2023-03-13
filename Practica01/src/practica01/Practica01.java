/**
 * 	Realizar un programa que lea por teclado dos números, 
 * si el primero es mayor al segundo informar su suma y diferencia,
 * en caso contrario informar el producto y la división del primero respecto al segundo.
 */
package practica01;

import javax.swing.JOptionPane;


public class Practica01 {

    
    public static void main(String[] args) {
       Double valor1, valor2;
       
        valor1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer valor"));
        valor2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo  valor"));
        
              
        
        if (valor1 > valor2) {
            System.out.println("La suma de " + valor1 + " + " + valor2 + " el resultado es: " + (valor1 + valor2));
            System.out.println("La resta de " + valor1 + " * " + valor2 + " el resultado es: " + (valor1 - valor2));
            
        } else {
            System.out.println("La multiplicacion de " + valor1 + " x " + valor2 + " el resultado es: " + (valor1 * valor2));
            System.out.println("La division de " + valor1 + " / " + valor2 + " el resultado es: " + (valor1 / valor2));
        }
    }
    
}
