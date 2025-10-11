
package Ej_1a10;
import java.util.Scanner;
public class Uno {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Constante para el valor del día
        final int VALOR_DIA = 35000; // <- valor mágico convertido en constante

        // Pedimos los días trabajados de cada trabajador
        System.out.print("Ingrese los días trabajados por el trabajador 1: ");
        int diasTrabajador1 = entrada.nextInt();

        System.out.print("Ingrese los días trabajados por el trabajador 2: ");
        int diasTrabajador2 = entrada.nextInt();

        // Cálculo de salarios
        int salario1 = diasTrabajador1 * VALOR_DIA;
        int salario2 = diasTrabajador2 * VALOR_DIA;

        // Mostrar resultados
        System.out.println("Salario del trabajador 1: $" + salario1);
        System.out.println("Salario del trabajador 2: $" + salario2);

        // Comparación
        if (salario1 > salario2) {
            System.out.println("El trabajador 1 recibió más salario.");
        } else if (salario2 > salario1) {
            System.out.println("El trabajador 2 recibió más salario.");
        } else {
            System.out.println("Ambos trabajadores recibieron el mismo salario.");
        }
    }
}
