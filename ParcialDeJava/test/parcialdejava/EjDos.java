
/*
Un médico necesita encontrar el IMC de los pacientes (IMC = Peso/(Estatura*Estatura)).
Debes atender a tres pacientes y mostrar por consola al paciente con 
el menor de los IMC. Nota: no necesitas datos personales.
*/
package parcialdejava;

import java.util.Scanner;

public class EjDos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        // Variables para almacenar datos de los tres pacientes
        double pesoPaciente1, pesoPaciente2, pesoPaciente3;
        double estaturaPaciente1, estaturaPaciente2, estaturaPaciente3;
        double imcPaciente1, imcPaciente2, imcPaciente3;
        
        System.out.println("=== CALCULO DE IMC PARA PACIENTES ===");
        System.out.println("Formula: IMC = Peso / (Estatura * Estatura)");
        System.out.println();
        
        // Solicitar datos del primer paciente
        System.out.println("--- PACIENTE 1 ---");
        System.out.print("Ingrese el peso (kg): ");
        pesoPaciente1 = entrada.nextDouble();
        System.out.print("Ingrese la estatura (metros): ");
        estaturaPaciente1 = entrada.nextDouble();
        
        // Solicitar datos del segundo paciente
        System.out.println();
        System.out.println("--- PACIENTE 2 ---");
        System.out.print("Ingrese el peso (kg): ");
        pesoPaciente2 = entrada.nextDouble();
        System.out.print("Ingrese la estatura (metros): ");
        estaturaPaciente2 = entrada.nextDouble();
        
        // Solicitar datos del tercer paciente
        System.out.println();
        System.out.println("--- PACIENTE 3 ---");
        System.out.print("Ingrese el peso (kg): ");
        pesoPaciente3 = entrada.nextDouble();
        System.out.print("Ingrese la estatura (metros): ");
        estaturaPaciente3 = entrada.nextDouble();
        
        // Calcular IMC usando operadores aritmeticos
        imcPaciente1 = pesoPaciente1 / (estaturaPaciente1 * estaturaPaciente1);
        imcPaciente2 = pesoPaciente2 / (estaturaPaciente2 * estaturaPaciente2);
        imcPaciente3 = pesoPaciente3 / (estaturaPaciente3 * estaturaPaciente3);
        
        // Mostrar resultados de cada paciente
        System.out.println();
        System.out.println("=== RESULTADOS DE IMC ===");
        System.out.printf("Paciente 1: IMC = %.2f%n", imcPaciente1);
        System.out.printf("Paciente 2: IMC = %.2f%n", imcPaciente2);
        System.out.printf("Paciente 3: IMC = %.2f%n", imcPaciente3);
        
        System.out.println();
        
        // Determinar el paciente con menor IMC usando estructuras condicionales if
        if (imcPaciente1 <= imcPaciente2 && imcPaciente1 <= imcPaciente3) {
            System.out.println("=== PACIENTE CON MENOR IMC ===");
            System.out.println("Paciente 1 tiene el menor IMC");
            System.out.printf("IMC: %.2f%n", imcPaciente1);
            System.out.printf("Peso: %.1f kg%n", pesoPaciente1);
            System.out.printf("Estatura: %.2f m%n", estaturaPaciente1);
        } else if (imcPaciente2 <= imcPaciente1 && imcPaciente2 <= imcPaciente3) {
            System.out.println("=== PACIENTE CON MENOR IMC ===");
            System.out.println("Paciente 2 tiene el menor IMC");
            System.out.printf("IMC: %.2f%n", imcPaciente2);
            System.out.printf("Peso: %.1f kg%n", pesoPaciente2);
            System.out.printf("Estatura: %.2f m%n", estaturaPaciente2);
        } else {
            System.out.println("=== PACIENTE CON MENOR IMC ===");
            System.out.println("Paciente 3 tiene el menor IMC");
            System.out.printf("IMC: %.2f%n", imcPaciente3);
            System.out.printf("Peso: %.1f kg%n", pesoPaciente3);
            System.out.printf("Estatura: %.2f m%n", estaturaPaciente3);
        }
        
        entrada.close();
    }
}