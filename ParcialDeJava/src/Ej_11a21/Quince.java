/*
 
*/

package Ej_11a21;

import java.util.Scanner;
public class Quince {
public class EstacionDelAno {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        // CONSTANTES para las estaciones
        final String VERANO = "Verano";
        final String OTONO = "Otoño";
        final String INVIERNO = "Invierno";
        final String PRIMAVERA = "Primavera";
        final String ERROR_MENSAJE = "Error de escritura - Mes no encontrado";
        
        // Solicitar mes al usuario
        System.out.print("Ingrese el nombre del mes: ");
        String mes = entrada.nextLine().toLowerCase(); // Convertir a minúsculas para comparación
        
        String estacion = "";
        
        // Switch para determinar la estación según el mes
        switch (mes) {
            // Verano (Hemisferio Norte)
            case "junio":
            case "julio":
            case "agosto":
                estacion = VERANO;
                break;
                
            // Otoño
            case "septiembre":
            case "octubre":
            case "noviembre":
                estacion = OTONO;
                break;
                
            // Invierno
            case "diciembre":
            case "enero":
            case "febrero":
                estacion = INVIERNO;
                break;
                
            // Primavera
            case "marzo":
            case "abril":
            case "mayo":
                estacion = PRIMAVERA;
                break;
                
            // Default para errores de escritura
            default:
                estacion = ERROR_MENSAJE;
                break;
        }
        
        // Mostrar resultado
        System.out.println("\n--- RESULTADO ---");
        if (estacion.equals(ERROR_MENSAJE)) {
            System.out.println(estacion);
            System.out.println("Los meses válidos son:");
            System.out.println("enero, febrero, marzo, abril, mayo, junio,");
            System.out.println("julio, agosto, septiembre, octubre, noviembre, diciembre");
        } else {
            System.out.println("El mes " + mes.toUpperCase() + " corresponde a: " + estacion);
            
            // Información adicional sobre la estación
            switch (estacion) {
                case "Verano":
                    System.out.println("Características: Temperaturas altas, días largos");
                    break;
                case "Otoño":
                    System.out.println("Características: Temperaturas moderadas, hojas caen");
                    break;
                case "Invierno":
                    System.out.println("Características: Temperaturas bajas, días cortos");
                    break;
                case "Primavera":
                    System.out.println("Características: Temperaturas moderadas, florecimiento");
                    break;
            }
        }
        
        entrada.close();
        }
    }
}
