
package Ej_11a21;

import java.util.Scanner;
public class TreceV1 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        String[] unidades = {
            "cero", "uno", "dos", "tres", "cuatro", 
            "cinco", "seis", "siete", "ocho", "nueve"
        };
        
        String[] decenas = {
            "", "", "veinte", "treinta", "cuarenta", 
            "cincuenta", "sesenta", "setenta", "ochenta", "noventa"
        };
        
        String[] especiales = {
            "diez", "once", "doce", "trece", "catorce", 
            "quince", "dieciséis", "diecisiete", "dieciocho", "diecinueve"
        };
        
       
        System.out.print("Ingrese un número (0-99): ");
        int numero = entrada.nextInt();
        
        String numeroEnPalabras;
        
      
        if (numero < 0 || numero > 99) {
            System.out.println("Error: El número debe estar entre 0 y 99");
        } else {
            
            if (numero < 10) {
               
                numeroEnPalabras = unidades[numero];
                
            } else if (numero >= 10 && numero < 20) {
               
                numeroEnPalabras = especiales[numero - 10];
                
            } else {
                
                int decena = numero / 10; 
                int unidad = numero % 10;  
                
                numeroEnPalabras = decenas[decena];
                
                if (unidad != 0) {
                    numeroEnPalabras = numeroEnPalabras + " y " + unidades[unidad];
                }
            }
            
            // Mostrar resultado
            System.out.println("El número " + numero + " en palabras es: " + numeroEnPalabras);
        }
        
        
        }
    }

