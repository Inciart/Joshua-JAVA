//18
package Ej_11a21;
import java.util.Scanner;
public class Dieciocho {
public class DatosPersona {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        // CONSTANTE para mayoría de edad
        final int EDAD_MAYOR_DE_EDAD = 18;
        
        // Array para almacenar los datos de la persona
        // Posición 0: nombre, Posición 1: documento, Posición 2: edad
        String[] datosPersona = new String[3];
        
        // Solicitar datos al usuario
        System.out.println("=== REGISTRO DE DATOS PERSONALES ===");
        
        System.out.print("Ingrese el nombre completo: ");
        datosPersona[0] = entrada.nextLine();
        
        System.out.print("Ingrese el número de documento: ");
        datosPersona[1] = entrada.nextLine();
        
        System.out.print("Ingrese la edad: ");
        datosPersona[2] = entrada.nextLine();
        
        // Convertir edad de String a int para comparación
        int edad = Integer.parseInt(datosPersona[2]);
        
        // Mostrar datos almacenados
        System.out.println("\n--- DATOS ALMACENADOS EN EL ARREGLO ---");
        System.out.println("Posición 0 (Nombre): " + datosPersona[0]);
        System.out.println("Posición 1 (Documento): " + datosPersona[1]);
        System.out.println("Posición 2 (Edad): " + datosPersona[2]);
        
        // Verificar mayoría de edad usando condicional if
        System.out.println("\n--- VERIFICACIÓN DE MAYORÍA DE EDAD ---");
        if (edad >= EDAD_MAYOR_DE_EDAD) {
            System.out.println("✓ " + datosPersona[0] + " ES MAYOR DE EDAD");
            System.out.println("Edad: " + edad + " años");
            
            // Calcular años adicionales usando operadores aritméticos
            int anosAdicionales = edad - EDAD_MAYOR_DE_EDAD;
            System.out.println("Años por encima de la mayoría de edad: " + anosAdicionales);
            
        } else {
            System.out.println("✗ " + datosPersona[0] + " ES MENOR DE EDAD");
            System.out.println("Edad: " + edad + " años");
            
            // Calcular años faltantes usando operadores aritméticos
            int anosFaltantes = EDAD_MAYOR_DE_EDAD - edad;
            System.out.println("Años faltantes para ser mayor de edad: " + anosFaltantes);
        }
        
        // Resumen de información
        System.out.println("\n--- RESUMEN COMPLETO ---");
        System.out.println("Nombre: " + datosPersona[0]);
        System.out.println("Documento: " + datosPersona[1]);
        System.out.println("Edad: " + datosPersona[2] + " años");
        System.out.println("Estado: " + (edad >= EDAD_MAYOR_DE_EDAD ? "Mayor de edad" : "Menor de edad"));
        System.out.println("Tamaño del arreglo: " + datosPersona.length + " elementos");
        
        entrada.close();
        }
    }
}
