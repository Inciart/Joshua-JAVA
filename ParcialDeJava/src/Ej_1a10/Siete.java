
package Ej_1a10;
import java.util.Scanner;
public class Siete {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Constantes
        final double IVA = 0.19;
        final int NUM_PRODUCTOS;

        // Preguntar cuántos productos hay en la lista
        System.out.print("Ingrese la cantidad de productos: ");
        NUM_PRODUCTOS = entrada.nextInt();

        // Array de precios base
        double[] preciosBase = new double[NUM_PRODUCTOS];

        // Ingreso de precios
        for (int i = 0; i < NUM_PRODUCTOS; i++) {
            System.out.print("Ingrese el precio base del producto " + (i + 1) + ": ");
            preciosBase[i] = entrada.nextDouble();
        }

        // Mostrar precios con IVA
        System.out.println("\nLista de precios con IVA incluido:");
        int contador = 1;
        for (double precio : preciosBase) {
            double precioConIVA = precio + (precio * IVA);
            System.out.println("Producto " + contador + ": $" + precioConIVA);
            contador++;
        }
    }
}

