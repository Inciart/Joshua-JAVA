
package Ej_1a10;
import java.util.Scanner;

public class Dos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Constantes (para evitar valores mágicos)
        final int NUM_PACIENTES = 3;

        // Arrays para pesos, estaturas e IMC
        double[] pesos = new double[NUM_PACIENTES];
        double[] estaturas = new double[NUM_PACIENTES];
        double[] imc = new double[NUM_PACIENTES];

        // Pedir datos de los pacientes
        for (int i = 0; i < NUM_PACIENTES; i++) {
            System.out.print("Ingrese el peso del paciente " + (i+1) + " (kg): ");
            pesos[i] = entrada.nextDouble();

            System.out.print("Ingrese la estatura del paciente " + (i+1) + " (m): ");
            estaturas[i] = entrada.nextDouble();

            // Cálculo del IMC
            imc[i] = pesos[i] / (estaturas[i] * estaturas[i]);
        }

        // Mostrar todos los IMC
        System.out.println("\nResultados de IMC:");
        int paciente = 1;
        for (double valor : imc) {
            System.out.println("Paciente " + paciente + ": " + valor);
            paciente++;
        }

        // Encontrar el menor IMC
        double menorIMC = imc[0];
        int pacienteMenor = 1;

        for (int i = 1; i < NUM_PACIENTES; i++) {
            if (imc[i] < menorIMC) {
                menorIMC = imc[i];
                pacienteMenor = i + 1;
            }
        }

        System.out.println("\nEl paciente con menor IMC es el paciente " + pacienteMenor +
                           " con un IMC de " + menorIMC);
        }
    }

