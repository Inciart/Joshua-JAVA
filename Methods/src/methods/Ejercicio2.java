/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package methods;

/**
 *
 * @author Pc
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] numeros = new int [2];
        numeros[0] = 3;
        numeros[1] = 5;
        
        modificarNumero(numeros);
        System.out.println(numeros[1]);
        
        
    }
    
    public static void modificarNumero(int[] numeros){
        numeros[1] = 6;
    }
    
}
