
package javalessons;
import java.util.Scanner;
/*
7. You need to calculate the real price of a product, 
    you have the base price and the IVA value.
*/
public class excercise7 {
    public static void main(String[] args) {
        
        final double iva = 0.81;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese valor del producto a descontar IVA: ");
        double precio = sc.nextDouble();
                
        double totalSinIva = precio * iva;
        
        System.out.println("totalSinIva = " + totalSinIva);
        sc.close();
    }
}
