/*
Un profesor quiere saber la edad promedio de su clase de 7 alumnos,
los cuales se encuentran en un arreglo, si el resultado es 
mayor a 18 años positivo para salir de practicas.
 */
package parcialdejava;
import java.util.Scanner;
public class EjCuatro {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        final int NUMERO_ALUMNOS = 7;
        final double EDAD_MINIMA_PRACTICAS = 18.0;
        
       
        int[] edadesAlumnos = new int[NUMERO_ALUMNOS];
        int sumaEdades = 0;
        double promedioEdades;
        
        System.out.println("=== CALCULO DE PROMEDIO DE EDADES ===");
        System.out.println("Clase de " + NUMERO_ALUMNOS + " alumnos");
        System.out.println("Edad minima promedio para practicas: " + EDAD_MINIMA_PRACTICAS + " años");
        System.out.println();
        
        
        System.out.println("Ingrese las edades de los alumnos:");
        for (int i = 0; i < NUMERO_ALUMNOS; i++) {
            System.out.print("Edad del alumno " + (i + 1) + ": ");
            edadesAlumnos[i] = entrada.nextInt();
        }
        
        
        for (int i = 0; i < NUMERO_ALUMNOS; i++) {
            sumaEdades += edadesAlumnos[i];
        }
        
        
        promedioEdades =  sumaEdades / NUMERO_ALUMNOS;
        
        // Mostrar las edades ingresadas
        System.out.println();
        System.out.println("=== EDADES REGISTRADAS ===");
        for (int i = 0; i < NUMERO_ALUMNOS; i++) {
            System.out.println("Alumno " + (i + 1) + ": " + edadesAlumnos[i] + " años");
        }
        
        System.out.println();
        System.out.println("=== RESULTADOS ===");
        System.out.println("Suma total de edades: " + sumaEdades + " años");
        System.out.printf("Promedio de edad: %.2f años%n", promedioEdades);
        
        System.out.println();
        
        // Determinar si pueden salir de practicas usando condicional if
        if (promedioEdades > EDAD_MINIMA_PRACTICAS) {
            double excedente = promedioEdades - EDAD_MINIMA_PRACTICAS;
            System.out.println("=== RESULTADO PARA PRACTICAS ===");
            System.out.println("✓ POSITIVO PARA SALIR DE PRACTICAS");
            System.out.printf("El promedio supera la edad minima por %.2f años%n", excedente);
        } else {
            double faltante = EDAD_MINIMA_PRACTICAS - promedioEdades;
            System.out.println("=== RESULTADO PARA PRACTICAS ===");
            System.out.println("✗ NO CUMPLE PARA SALIR DE PRACTICAS");
            System.out.printf("El promedio esta %.2f años por debajo del minimo%n", faltante);
        }
        
        entrada.close();

    }
}
