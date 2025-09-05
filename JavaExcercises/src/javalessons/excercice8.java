
package javalessons;
import java.util.Scanner;

/**
 8. You must show the multiplication table of 7 by console,
 * you must show information like 7*1=7, the same for the 
 * other numbers.
 */
public class excercice8 {
    public static void main(String[] args) {
        
    
    final int seven = 7;
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Ingrese valor a multiplicar de la tabla del 7: ");
    int number = sc.nextInt();
    
    int tabla = number * seven;
        System.out.println(seven + "*" + number + " = " + tabla);
    }
}
