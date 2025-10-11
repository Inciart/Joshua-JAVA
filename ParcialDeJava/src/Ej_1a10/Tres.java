
package Ej_1a10;

import java.util.Scanner;

public class Tres {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Constante del área mínima para habilitar venta
        final int AREA_MINIMA = 100;

        char continuar; // variable de control para el do-while

        do {
            // Pedir datos del lote
            System.out.print("Ingrese la base del lote (m): ");
            double base = entrada.nextDouble();

            System.out.print("Ingrese la altura del lote (m): ");
            double altura = entrada.nextDouble();

            // Calcular área
            double area = base * altura;

            // Mostrar resultados
            System.out.println("El área del lote es: " + area + " m²");

            if (area > AREA_MINIMA) {
                System.out.println("✅ El lote está habilitado para la venta.");
            } else {
                System.out.println("❌ El lote NO está habilitado para la venta.");
            }

            // Preguntar si quiere evaluar otro lote
            System.out.print("\n¿Desea calcular el área de otro lote? (s/n): ");
            continuar = entrada.next().charAt(0);

        } while (continuar == 's' || continuar == 'S');

        System.out.println("Programa finalizado.");
    }
}
