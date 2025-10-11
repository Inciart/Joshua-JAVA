/*

 */
package parcialdejava;

import java.util.Scanner;

public class EjCinco {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        final double PORCENTAJE_PARCIALES = 0.70;
    final double PORCENTAJE_EXAMEN_FINAL = 0.30;
    final double NOTA_MINIMA_APROBACION = 3.0;
    final int NUMERO_PARCIALES = 3;
        
        // Variables para las notas
        double nota1, nota2, nota3, examenFinal;
        double promedioParciales, notaFinal;
        
        System.out.println("=== CALCULO DE NOTA FINAL ===");
        System.out.println("Sistema de calificacion:");
        System.out.println("- Promedio de " + NUMERO_PARCIALES + " notas parciales: " + (PORCENTAJE_PARCIALES * 100) + "%");
        System.out.println("- Examen final: " + (PORCENTAJE_EXAMEN_FINAL * 100) + "%");
        System.out.println("- Nota minima para aprobar: " + NOTA_MINIMA_APROBACION);
        System.out.println();
        
        // Solicitar las tres notas parciales
        System.out.println("Ingrese las notas parciales:");
        System.out.print("Nota parcial 1: ");
        nota1 = entrada.nextDouble();
        
        System.out.print("Nota parcial 2: ");
        nota2 = entrada.nextDouble();
        
        System.out.print("Nota parcial 3: ");
        nota3 = entrada.nextDouble();
        
        // Solicitar la nota del examen final
        System.out.print("Nota del examen final: ");
        examenFinal = entrada.nextDouble();
        
        // Calcular el promedio de las notas parciales usando operadores aritmeticos
        promedioParciales = (nota1 + nota2 + nota3) / NUMERO_PARCIALES;
        
        // Calcular la nota final aplicando los porcentajes
        notaFinal = (promedioParciales * PORCENTAJE_PARCIALES) + (examenFinal * PORCENTAJE_EXAMEN_FINAL);
        
        // Mostrar el detalle de los calculos
        System.out.println();
        System.out.println("=== DETALLE DE CALIFICACIONES ===");
        System.out.printf("Nota parcial 1: %.2f%n", nota1);
        System.out.printf("Nota parcial 2: %.2f%n", nota2);
        System.out.printf("Nota parcial 3: %.2f%n", nota3);
        System.out.printf("Promedio parciales: %.2f%n", promedioParciales);
        System.out.println();
        System.out.printf("Examen final: %.2f%n", examenFinal);
        System.out.println();
        
        // Mostrar el calculo ponderado
        System.out.println("=== CALCULO PONDERADO ===");
        System.out.printf("Parciales (%.0f%%): %.2f x %.2f = %.2f%n", 
                         PORCENTAJE_PARCIALES * 100, promedioParciales, PORCENTAJE_PARCIALES, 
                         promedioParciales * PORCENTAJE_PARCIALES);
        System.out.printf("Examen final (%.0f%%): %.2f x %.2f = %.2f%n", 
                         PORCENTAJE_EXAMEN_FINAL * 100, examenFinal, PORCENTAJE_EXAMEN_FINAL, 
                         examenFinal * PORCENTAJE_EXAMEN_FINAL);
        
        System.out.printf("NOTA FINAL: %.2f%n", notaFinal);
        
        System.out.println();
        
        // Determinar si el estudiante gano la materia usando condicional if
        if (notaFinal >= NOTA_MINIMA_APROBACION) {
            double excedente = notaFinal - NOTA_MINIMA_APROBACION;
            System.out.println("=== RESULTADO FINAL ===");
            System.out.println("🎉 ¡FELICITACIONES! EL ESTUDIANTE GANO LA MATERIA");
            System.out.printf("Nota final: %.2f (%.2f puntos sobre el minimo)%n", notaFinal, excedente);
        } else {
            double faltante = NOTA_MINIMA_APROBACION - notaFinal;
            System.out.println("=== RESULTADO FINAL ===");
            System.out.println("❌ EL ESTUDIANTE NO GANO LA MATERIA");
            System.out.printf("Nota final: %.2f (%.2f puntos por debajo del minimo)%n", notaFinal, faltante);
        }
        
        entrada.close();
    }
}
