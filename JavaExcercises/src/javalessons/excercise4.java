/*
 4. A teacher wants to know the average age of his class of 7 students.
 */
package javalessons;
import java.util.Scanner;


public class excercise4 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese edad del estudiante 1: ");
        int estudiante1 = sc.nextInt();
        
        System.out.print("Ingrese edad del estudiante 2: ");
        int estudiante2 = sc.nextInt();
        
        System.out.print("Ingrese edad del estudiante 3: ");
        int estudiante3 = sc.nextInt();
        
        System.out.print("Ingrese edad del estudiante 4: ");
        int estudiante4 = sc.nextInt();
        
        System.out.print("Ingrese edad del estudiante 5: ");
        int estudiante5 = sc.nextInt();
        
        System.out.print("Ingrese edad del estudiante 6: ");
        int estudiante6 = sc.nextInt();
        
        System.out.print("Ingrese edad del estudiante 7: ");
        int estudiante7 = sc.nextInt();
        
        double promedioEdad = (estudiante1 + estudiante2 + estudiante3 + estudiante4 + estudiante5 + estudiante6 + estudiante7)/7;
        
        System.out.println("promedioEdad = " + promedioEdad);
    }
}
