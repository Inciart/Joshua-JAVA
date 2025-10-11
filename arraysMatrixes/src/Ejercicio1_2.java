/*
Programa que pida tres números y que los sume.
 */


import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1_2 {
    public static void main(String[] args) {
        int[] array = new int[3];
        Scanner sc = new Scanner(System.in);
        int contador=0;
        int numero;
        int suma;
        System.out.println("numero: ");
        
        do{
            numero = sc.nextInt();
            array[contador] = numero;
            contador++;
        }while(contador <3);
        suma = array[0] + array[1] + array[2];
        System.out.println("Suma da igual a: " + suma);
        System.out.println("La lista es: " + Arrays.toString(array));
    }
}
