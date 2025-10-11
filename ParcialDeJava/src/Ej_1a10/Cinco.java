
package Ej_1a10;

import java.util.Scanner;

public class Cinco {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Constantes para los porcentajes
        final double PORC_NOTAS = 0.70;
        final double PORC_EXAMEN = 0.30;

        // Ingreso de notas parciales
        System.out.print("Ingrese la primera nota: ");
        double nota1 = entrada.nextDouble();

        System.out.print("Ingrese la segunda nota: ");
        double nota2 = entrada.nextDouble();

        System.out.print("Ingrese la tercera nota: ");
        double nota3 = entrada.nextDouble();

        // Ingreso de nota examen final
        System.out.print("Ingrese la nota del examen final: ");
        double examenFinal = entrada.nextDouble();

        // Promedio de las 3 primeras notas
        double promedioParciales = (nota1 + nota2 + nota3) / 3;

        // Cálculo de nota final
        double notaFinal = (promedioParciales * PORC_NOTAS) + (examenFinal * PORC_EXAMEN);

        // Mostrar resultados
        System.out.println("\nNota final del estudiante: " + notaFinal);

        if (notaFinal >= 3.0) {
            System.out.println("✅ El estudiante GANÓ la materia.");
        } else {
            System.out.println("❌ El estudiante NO ganó la materia.");
        }
    }
}
