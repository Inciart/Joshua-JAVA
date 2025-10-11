/*Un docente tiene dos listas de edades, una representa a los hombres y la otra a las mujeres, tienen el mismo tamaño, ahora debes 
hallar el promedio de edades de cada lista y mostrar cual es el mayor. 
*/
package Ej_1a10;

import java.util.Scanner;

public class Diez {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Constante de cantidad de alumnos
        final int NUM_ALUMNOS;

        System.out.print("Ingrese la cantidad de alumnos por género: ");
        NUM_ALUMNOS = entrada.nextInt();

        // Arrays para hombres y mujeres
        int[] hombres = new int[NUM_ALUMNOS];
        int[] mujeres = new int[NUM_ALUMNOS];

        // Ingreso de edades hombres
        System.out.println("\n--- Edades de hombres ---");
        for (int i = 0; i < NUM_ALUMNOS; i++) {
            System.out.print("Edad del hombre " + (i + 1) + ": ");
            hombres[i] = entrada.nextInt();
        }

        // Ingreso de edades mujeres
        System.out.println("\n--- Edades de mujeres ---");
        for (int i = 0; i < NUM_ALUMNOS; i++) {
            System.out.print("Edad de la mujer " + (i + 1) + ": ");
            mujeres[i] = entrada.nextInt();
        }

        // Calcular promedios
        int sumaHombres = 0, sumaMujeres = 0;

        for (int edad : hombres) {
            sumaHombres += edad;
        }

        for (int edad : mujeres) {
            sumaMujeres += edad;
        }

        double promedioHombres = (double) sumaHombres / NUM_ALUMNOS;
        double promedioMujeres = (double) sumaMujeres / NUM_ALUMNOS;

        // Mostrar resultados
        System.out.println("\nPromedio de edades hombres: " + promedioHombres);
        System.out.println("Promedio de edades mujeres: " + promedioMujeres);

        if (promedioHombres > promedioMujeres) {
            System.out.println("✅ El promedio mayor es el de los hombres.");
        } else if (promedioMujeres > promedioHombres) {
            System.out.println("✅ El promedio mayor es el de las mujeres.");
        } else {
            System.out.println("⚖️ Ambos promedios son iguales.");
        }
    }
}
