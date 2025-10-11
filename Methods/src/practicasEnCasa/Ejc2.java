/*
Ejercicio 11 Java.- de 5 alumnos, 
saber cuáles reprobaron(Con ventanas emergentes).
 */

package practicasEnCasa;

import javax.swing.JOptionPane;

public class Ejc2 {
    public static void main(String[] args) {
        final double NOTA_APROBACION = 3.0;
        String[] estudiantes = {"Juan", "Pedro", "Mateo", "Jhon"};
        double[] notas = new double[estudiantes.length];
        int counter = 0;
        int contadorPasaron = 0;
        int contadorPerdieron = 0;
        
        ingresoNotas(estudiantes,notas);
        
        
        for(double nota:notas){
            if (nota>=NOTA_APROBACION){
                System.out.println(estudiantes[counter]+" Aprobo con: " + notas[counter]);
                counter++;
                contadorPasaron++;
            }else{
               System.out.println(estudiantes[counter] + " Reprobo con: " + notas[counter]);
               counter++;
               contadorPerdieron++;
            }
        }
        
        System.out.println("cantidad de estudiantes que pasaron y perdieron\n: " + contadorPasaron + "; " + contadorPerdieron );
    }
    
    public static double[] ingresoNotas(String[] estudiantes, double[] notas){
        for (int i = 0 ; i < estudiantes.length; i++ ){
            notas[i] = Double.parseDouble(JOptionPane.showInputDialog("ingrese Nota#" + (i+1) + ": " ));
        }
        return notas;
    }
    
    
}
