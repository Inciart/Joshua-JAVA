/*
 10. We have a bag of circular chocolate coins, 
    the diameter of each coin is 16 millimeters. 
    What is the sum of the  areas of the coins?
    A=pi*r^2
 */
package javalessons;
import java.util.Scanner;

public class excercise10 {
     public static void main(String[] args) {
         
       final double diametro = 16;
       final double pi = Math.PI;
             
       Scanner scanner = new Scanner(System.in);
        
       System.out.print("ingrese cantidad de monedas " );
       double monedas = scanner.nextInt();
       
       double radio = Math.pow((diametro/2),2);
      
       double total = monedas * (pi * radio);
        
       System.out.println("total: " + total );
    }
    
}
