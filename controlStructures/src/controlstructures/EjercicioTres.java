/*
 3. Given a score from a student,
    know the national scale according
    to the following table
 */
package controlstructures;

import java.util.Scanner;

public class EjercicioTres {
    public static void main(String[] args) {
        
        
        final String insuficiente = "Insuficiente";
        final String aceptable = "Aceptable" ;
        final String sobresaliente = "Sobresaliente";
        final String excelente = "Excelente";
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("su nota: ");
        double nota = sc.nextDouble();
        
       
        
        
        if (nota < 0 || nota > 5){
            System.out.print("Nota fuera del rango (0 - 5)");
    
        }else{
            if (nota >= 0 && nota <= 2.9) {
            System.out.println(insuficiente);
            
            }else if(nota >= 3.0 && nota <= 3.9) {
            System.out.println(aceptable);
            
            }else if(nota >= 4.0 && nota <= 4.5) {
            System.out.println(sobresaliente);
            
            }else{
            System.out.println(excelente);
            }
        }
    }
}
    

