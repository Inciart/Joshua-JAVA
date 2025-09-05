/*
 9. An architect needs to find the area of a triangular lot, 
consult the formula with your colleagues or on the internet.
 */
package javalessons;
import java.util.Scanner;

public class excercise9 {
     public static void main(String[] args) {
        
       Scanner scanner = new Scanner(System.in);
        
       System.out.print("ingrese base: " );
       double base = scanner.nextInt();
       
       System.out.print("ingrese altura:  " );
       double altura = scanner.nextDouble();
       
       double total = (base * altura)/2;
       System.out.println("total: " + total );
    }
    
}
