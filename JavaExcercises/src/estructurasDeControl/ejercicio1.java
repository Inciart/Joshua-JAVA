
package estructurasDeControl;
import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese calificacion del estudiante ");
        double grade = scanner.nextDouble();
        
        
        if (grade < 0 || grade > 5) {
            System.out.println("Error: la calificacion es del 1 al 5");
            scanner.close();
            return;
        }
        
        
        if (grade >= 3.0) {
            System.out.println("Felicidades, ganaste el quiz");
        } else {
            System.out.println("perdiste el quiz");
        }
        
        scanner.close();
    }
}
    

