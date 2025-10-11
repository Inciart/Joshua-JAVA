


/*
Programa que pida números, y al poner cero, deje de pedir, y que los sume.
*/
import java.util.ArrayList;
import java.util.Scanner;
public class Ejercicio1 {
    ArrayList<Double> listaNumeros;
    public static void main(String[] args) {
        Ejercicio1 miLista = new Ejercicio1();
        miLista.listaNumeros = new ArrayList();
        miLista.ingresoNumeros();
    }
    
    public void ingresoNumeros(){
        double numero; 
        double counter=0;
        Scanner sc = new Scanner(System.in);
         
        do {
            System.out.println("Ingrese digito para almacenar en lista, y 0 para cerrar y arrojar suma");
            numero = sc.nextInt();
            listaNumeros.add(numero);
            
        }while(numero != 0);
        for (double i : listaNumeros){
            counter = counter + i;
            }
        System.out.println("Suma total: " + counter + ". El array: " + listaNumeros );
    }
}
