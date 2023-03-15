/**
 * Se ingresa por teclado un número positivo de uno o dos dígitos (1..99)
 * mostrar un mensaje indicando si el número tiene uno o dos dígitos.
 * (Tener en cuenta que condición debe cumplirse para tener dos dígitos, un número entero)
 */
package actividad02;

import javax.swing.JOptionPane;


public class Actividad02 {
    
    public static void main(String[] args) {
        int numero;
        
        numero =Integer.parseInt(JOptionPane.showInputDialog("Ingrese una valor entero comprendidoentre 0 y 99"));
        
        if(numero <0 || numero >99){
            System.out.println("El valor numerico esta fuera del rango requerido");
        } else{
            if(numero >=0 && numero <=9){
                System.out.println("El valor ingresado esta compuesto por un digito");
            }else{
                System.out.println("El valor ingresado esta compuesto por dos digitos");
            }
        }
    }
    
}
