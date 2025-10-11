package javalessons;


import java.util.Scanner;

/*6. Develop a currency conversion system,
        when entering an amount of dollars I get 
        its value in Colombian pesos.
    */

public class excercise6 {
    public static void main(String[] args) {
        final double pesos = 4017.25;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese cantidad de dolares por convertir: ");
        double dollar = sc.nextDouble();
        
        double total = dollar * pesos;
        System.out.println("cambio total a pesos = " +  total + " $COP");
        sc.close();
    }
}
