/*
contadores y acumuladores; entiende la diferencia 
 */
package arraysmatrixes;
public class ApunteClase {
    public static void main(String[] args) {
        int[] edades = new int[5];
        
        edades[0] = 17;
        edades[1] = 18;
        edades[2] = 19;
        edades[3] = 18;
        edades[4] = 17;
        
        /*
        int acumulador = 0;
        for (int edad: edades) {
            acumulador = acumulador + edad;
        }
        int cantidad = edades.length;
        int promedio = acumulador/cantidad;
        System.out.println("Promedio de edades " + promedio);
        */
        
        int contador = 0;
        for (int edad: edades) {      
            if (edad >= 18){
                contador = contador + 1; 
            }
                
        }
        System.out.println("Si hay mayores de edad, hay: " + contador);
    }
}
