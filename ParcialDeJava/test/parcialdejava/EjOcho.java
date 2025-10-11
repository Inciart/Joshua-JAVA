/*
8
 */
package parcialdejava;

import java.util.Scanner;

public class EjOcho {
    
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        final int NUMERO_ESTUDIANTES = 10;
        final double NOTA_MINIMA_APROBACION = 3.0;
        
        // Array para almacenar las notas del parcial
        double[] notasParcial = new double[NUMERO_ESTUDIANTES];
        
        // Variables contadoras
        int estudiantesAprobados = 0;
        int estudiantesReprobados = 0;
        
        System.out.println("=== NOTAS DEL PARCIAL - PROGRAMACION I ===");
        System.out.println("Numero de estudiantes: " + NUMERO_ESTUDIANTES);
        System.out.println("Nota minima para aprobar: " + NOTA_MINIMA_APROBACION);
        System.out.println();
        
        // Solicitar las 10 notas usando bucle for
        System.out.println("Ingrese las notas del parcial:");
        for (int i = 0; i < NUMERO_ESTUDIANTES; i++) {
            System.out.print("Nota del estudiante " + (i + 1) + ": ");
            notasParcial[i] = entrada.nextDouble();
        }
        
        // Recorrer el array y contar aprobados/reprobados usando bucle for
        for (int i = 0; i < NUMERO_ESTUDIANTES; i++) {
            if (notasParcial[i] >= NOTA_MINIMA_APROBACION) {
                estudiantesAprobados++;
            } else {
                estudiantesReprobados++;
            }
        }
        
        // Mostrar todas las notas registradas
        System.out.println();
        System.out.println("=== NOTAS REGISTRADAS ===");
        for (int i = 0; i < NUMERO_ESTUDIANTES; i++) {
            String estado = (notasParcial[i] >= NOTA_MINIMA_APROBACION) ? "APROBADO" : "REPROBADO";
            System.out.printf("Estudiante %2d: %.2f - %s%n", (i + 1), notasParcial[i], estado);
        }
        
        // Mostrar estadisticas del parcial
        System.out.println();
        System.out.println("=== ESTADISTICAS DEL PARCIAL ===");
        System.out.println("Total de estudiantes: " + NUMERO_ESTUDIANTES);
        System.out.println("Estudiantes aprobados: " + estudiantesAprobados);
        System.out.println("Estudiantes reprobados: " + estudiantesReprobados);
        
        // Calcular porcentajes usando operadores aritmeticos
        double porcentajeAprobados = ((double) estudiantesAprobados / NUMERO_ESTUDIANTES) * 100;
        double porcentajeReprobados = ((double) estudiantesReprobados / NUMERO_ESTUDIANTES) * 100;
        
        System.out.println();
        System.out.printf("Porcentaje de aprobacion: %.1f%%%n", porcentajeAprobados);
        System.out.printf("Porcentaje de reprobacion: %.1f%%%n", porcentajeReprobados);
        
        System.out.println();
        
        // Mostrar resultado general usando condicional if
        if (estudiantesAprobados > estudiantesReprobados) {
            System.out.println("=== RESULTADO GENERAL ===");
            System.out.println("✓ LA MAYORIA DE ESTUDIANTES APROBO EL PARCIAL");
            int diferencia = estudiantesAprobados - estudiantesReprobados;
            System.out.println("Diferencia: " + diferencia + " estudiantes mas aprobaron");
        } else if (estudiantesReprobados > estudiantesAprobados) {
            System.out.println("=== RESULTADO GENERAL ===");
            System.out.println("✗ LA MAYORIA DE ESTUDIANTES REPROBO EL PARCIAL");
            int diferencia = estudiantesReprobados - estudiantesAprobados;
            System.out.println("Diferencia: " + diferencia + " estudiantes mas reprobaron");
        } else {
            System.out.println("=== RESULTADO GENERAL ===");
            System.out.println("= EMPATE: MISMO NUMERO DE APROBADOS Y REPROBADOS");
        }
        
        entrada.close();
    }
}
