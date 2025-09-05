package javalessons;
import java.util.Scanner;
/*
5. You need to calculate the final score of a student, 
    you already have the three scores that represent 70% and
    the final exam score that represents 30
*/
public class excercise5 {
     public static void main(String[] args) {
          
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("ingrese nota 1: " );
       double notaUno = scanner.nextInt();
       
       System.out.println("ingrese nota 2:  " );
       double notaDos = scanner.nextDouble();
       
       System.out.println("ingrese nota 3:  " );
       double notaTres = scanner.nextDouble();
       
       System.out.println("ingrese nota de examen final:  " );
       double examenFinal = scanner.nextDouble();
       
       double setentaPorciento = ((notaUno + notaDos + notaTres)/3)*0.7;
       double treintaPorciento = examenFinal * 0.3;
       double notaTotal =  setentaPorciento + treintaPorciento;
        System.out.println("dias trabajados: " + notaTotal );

     }
}
