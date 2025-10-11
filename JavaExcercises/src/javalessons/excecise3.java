/*
   3. An architect needs to find the area of a rectangular lot, 
   check the formula with your classmates or on the internet.
 */
package javalessons;
import java.util.Scanner;

public class excecise3 {
     public static void main(String[] args) {
        
       Scanner scanner = new Scanner(System.in);
        
       System.out.print("ingrese base: " );
       double base = scanner.nextInt();
       
       System.out.print("ingrese altura:  " );
       double altura = scanner.nextDouble();
       
       double total = base * altura;
       System.out.println("total: " + total );
       scanner.close();
    }
    
}
