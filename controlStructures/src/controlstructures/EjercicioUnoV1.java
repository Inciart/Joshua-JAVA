package controlstructures;
import java.util.Scanner;
/*
1. Request a digit by keyboard and display its value in words on the console.

        if (digito == cero ){
            palabra = "Cero";
        }
        if (digito == uno){
            palabra = "Uno";
        }
        if (digito == dos){
            palabra = "Dos";
        }
        if (digito == tres){
            palabra = "Tres";
        }
        if (digito == cuatro){
            palabra = "Cuatro";
        }
        if (digito == cinco){
            palabra = "Cinco";
        }
        if (digito == seis){
            palabra = "Seis";
        }
        if (digito == siete){
            palabra = "Siete";
        }
        if (digito == ocho){
            palabra = "Ocho";
        }
        if (digito == nueve){
            palabra = "Nueve";
        }else {
            System.out.println("numero ingresado debe ser de un digito");
            palabra = "¡No reconocido!";
        }
        System.out.println("numero en palabras: " + palabra);
*/
public class EjercicioUnoV1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//'objeto' Scanner llamado sc
        
        System.out.println("Ingrese un digito: ");
        byte digito = sc.nextByte();
        
        String palabra = "";//String es una clase
        
        switch (digito){
            case 1 -> palabra = "uno";
            case 2 -> palabra = "dos";
            case 3 -> palabra = "tres";
            case 4 -> palabra = "cuatro";
            case 5 -> palabra = "cinco";
            case 6 -> palabra = "seis";
            case 7 -> palabra = "siete";
            case 8 -> palabra = "siete";
        }
        System.out.println("respuesta = " + palabra);
    }

}
