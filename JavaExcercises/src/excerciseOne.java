
import java.util.Scanner;

public class excerciseOne {
    public static void main(String[] args) {
    /*1. You need to calculate the salary to be paid to a worker,
        you have the number of days worked and the value of the day.
    */
    

    Scanner sc = new Scanner(System.in);
    System.out.print("Ingrese sueldo por dia: ");
    double pago = sc.nextDouble();
    
    System.out.print("Dias trabajados: ");
    double diasTrabajados = sc.nextDouble();
    
    Double total = diasTrabajados * pago;
    
        System.out.println("sueldo total = " + total + " COP");
    
    }
}
