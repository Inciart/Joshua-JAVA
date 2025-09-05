/*
 2. You have a score of 70% and a score of 30%,
    now you must verify if you won, lost or you
    must recover the subject
 */
package controlstructures;
import java.util.Scanner;

public class EjercicioDos {
    public static void main(String[] args) {
        final double setentaPorciento = 0.7;
        final double treintaPorciento= 0.3;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese nota del 70% del 0 a 5:  ");
        int setenta = sc.nextInt();
        
        System.out.println("Ingrese nota del 30% del 0 a 5:  ");
        int treinta = sc.nextInt();
        double totalNota;
        
        
        if (setenta < 0 || setenta > 5){
            System.out.println("Nota fuera del rango (0 - 5)");
        }else if (treinta < 0 || treinta > 5) {
            System.out.println("Nota fuera del rango (0 - 5)");
        }else{
            totalNota = (setenta * setentaPorciento) + (treinta * treintaPorciento);
            System.out.println("Nota total de su asignatura: " + totalNota);
            if (totalNota >= 3.0){
                System.out.println("¡Aprovado! Bien hecho");
            }else{
                System.out.println("No aprovo la asignatura :( ");
            }
        }
    }
    
}
