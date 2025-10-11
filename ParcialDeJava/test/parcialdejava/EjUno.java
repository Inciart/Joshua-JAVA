/*
 Necesitas calcular el salario a pagar a dos trabajadores,
tienes el numero de días trabajados de cada empleado y el
valor del día es el mismo para los dos. Ademas debes mostrar
a cual trabajador se le pago mas. Nota: no necesitas datos personales.
 */
package parcialdejava;

import java.util.Scanner;

public class EjUno {
    public static void main(String[] args) {
        final double VALOR_DIA = 45000;
        Scanner sc = new Scanner(System.in);
        
        
        int diasTrabajador1, diasTrabajador2;
        double salarioTrabajador1, salarioTrabajador2;
        
        
        System.out.println("Valor por dia: $" + VALOR_DIA);
        
        System.out.print("Ingrese los dias trabajados del Trabajador 1: ");
        diasTrabajador1 = sc.nextInt();
        
        System.out.print("Ingrese los dias trabajados del Trabajador 2: ");
        diasTrabajador2 = sc.nextInt();      
        
        salarioTrabajador1 = diasTrabajador1 * VALOR_DIA;
        salarioTrabajador2 = diasTrabajador2 * VALOR_DIA;
        
        System.out.println();
        
        System.out.println("Trabajador 1:");
        System.out.println("  Dias trabajados: " + diasTrabajador1);
        System.out.println("  Salario a pagar: $" + salarioTrabajador1);
        
        System.out.println();
        System.out.println("Trabajador 2:");
        System.out.println("  Dias trabajados: " + diasTrabajador2);
        System.out.println("  Salario a pagar: $" + salarioTrabajador2);
        
        
        double diferencia;
        
        if (salarioTrabajador1 > salarioTrabajador2) {
            diferencia = salarioTrabajador1 - salarioTrabajador2;
            System.out.println("El Trabajador 1 recibe mayor pago");
            System.out.println("Diferencia: $" + diferencia);
        } else if (salarioTrabajador2 > salarioTrabajador1) {
            diferencia = salarioTrabajador2 - salarioTrabajador1;
            System.out.println("El Trabajador 2 recibe mayor pago");
            System.out.println("Diferencia: $" + diferencia);
        } else {
            System.out.println("Ambos trabajadores reciben el mismo salario");
        }
    }
}
