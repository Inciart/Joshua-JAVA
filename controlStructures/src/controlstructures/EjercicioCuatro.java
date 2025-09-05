/*
4. Find the IMC of a patient and know their 
   classification according to the following
   table.
 */
package controlstructures;
import java.util.Scanner;

public class EjercicioCuatro {
    public static void main(String[] args) {
        //IMC = peso/(estarura)^2
        final double imc;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese su peso: ");
        double peso = sc.nextDouble();
        
        System.out.print("Ingrese su altura: ");
        double altura = sc.nextDouble();
        
        imc = peso/Math.pow(altura, 2);
        
        
        if (imc < 0 && imc > 70){
            System.out.println("Datos incoherentes o descomunales");
        }else{
            if (imc > 0 && imc < 18.5 ){
                System.out.println("Esta bajo de peso");
        }   else if (imc > 18.5 && imc < 24.9){
                System.out.println("Peso normal");
        }   else if (imc > 25 && imc < 29.9){
                System.out.println("sobrepeso");
        }   else if (imc > 30 && imc < 34.9){
            System.out.println("obesidad I");
        }   else if (imc > 35 && imc < 39.9){
            System.out.println("obesidad II");
        }   else if (imc > 40 && imc < 49.9){
            System.out.println("obesidad III");
        }   else{
            System.out.println("obesidad IV");  
        }
            
        System.out.println("IMC =  " + imc);
    }
}
}