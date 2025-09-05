
package controlstructures;

import java.util.Scanner;

public class EjercicioUnoV2 {
    public static void main(String[] args) {
        final int CERO = 0;
        final int UNO = 1;
        final int DOS = 2;
        final int TRES = 3;
        final int CUATRO = 4;
        final int CINCO = 5;
        final int SEIS = 6;
        final int SIETE = 7;
        final int OCHO = 8;
        final int NUEVE = 9;
        
        String palabra = "";
        Scanner sc = new Scanner(System.in);//'objeto' Scanner llamado sc
        
        System.out.println("Ingrese un digito: ");
        byte digito = sc.nextByte();
        
        
        if (digito == CERO ){
            palabra = "Cero";
        }
        else if (digito == UNO){
            palabra = "Uno";
        }
        else if (digito == DOS){
            palabra = "Dos";
        }
        else if (digito == TRES){
            palabra = "Tres";
        }
        else if (digito == CUATRO){
            palabra = "Cuatro";
        }
        else if (digito == CINCO){
            palabra = "Cinco";
        }
        else if (digito == SEIS){
            palabra = "Seis";
        }
        else if (digito == SIETE){
            palabra = "Siete";
        }
        else if (digito == OCHO){
            palabra = "Ocho";
        }
        else if (digito == NUEVE){
            palabra = "Nueve";
        }else{
            System.out.println("numero ingresado debe ser de un digito");
            palabra = "¡No reconocido!";
        }
        System.out.println("numero en palabras: " + palabra);
}}
