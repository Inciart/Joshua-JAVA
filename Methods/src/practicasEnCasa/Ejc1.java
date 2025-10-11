/*
Ejercicio 10 Java.- Introducir N sueldos,
y al final mostrarle el sueldo mayor(Con JOptionPane).

        // Dialogo de mensaje
        JOptionPane.showMessageDialog(null, "¡Hola, mundo!");

        // Dialogo de entrada
        String nombre = JOptionPane.showInputDialog("¿Cuál es tu nombre?");
 */
package practicasEnCasa;

import javax.swing.JOptionPane;

public class Ejc1 {
    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null, "Comparacion de sueldos"); 
        double contadorMayor = 0;       
        int cantidadSueldo = Integer.parseInt(JOptionPane.showInputDialog("ingrese cantidad de sueldos"));
        double[] sueldos = new double[cantidadSueldo];
        
        ingresoSueldos(sueldos,cantidadSueldo);
        double mayor = definirSueldomayor(sueldos, contadorMayor);
        JOptionPane.showMessageDialog(null, "El sueldo mayor es: " + mayor );

    }    
    public static double[] ingresoSueldos(double[] sueldos, int cantidadSueldo){
        for (int i = 0; i < cantidadSueldo; i++) {
           sueldos[i] = Double.parseDouble(JOptionPane.showInputDialog("Ingrese sueldo #" + (i+1) + ": ")); 
        }
        return sueldos;
        
    }
    public static double definirSueldomayor(double[] sueldos, double contadorMayor){
        for (double sueldo:sueldos){
            if (sueldo > contadorMayor){
                contadorMayor = sueldo;
            }
        }
        return contadorMayor;
    }
}
