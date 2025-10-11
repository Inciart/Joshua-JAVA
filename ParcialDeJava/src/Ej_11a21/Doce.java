
package Ej_11a21;
public class Doce {
     public static void main(String[] args) {
        
        // Array con los 8 nombres de estudiantes
        String[] estudiantes = {
            "Ana", 
            "Carlos", 
            "Diana", 
            "Eduardo", 
            "Fernanda", 
            "Gabriel", 
            "Helena", 
            "Ignacio"
        };
        
        // CONSTANTES para las posiciones
        final int PRIMERA_POSICION = 0;
        final int ULTIMA_POSICION = estudiantes.length - 1;
        final int POSICION_MEDIO = estudiantes.length / 2; // Para 8 elementos, posición 4 (índice 4)
        
        // Mostrar toda la lista numerada
        System.out.println("Lista completa de estudiantes:");
        for (int i = 0; i < estudiantes.length; i++) {
            System.out.println((i + 1) + ". " + estudiantes[i]);
        }
        
        System.out.println("Primer estudiante: " + estudiantes[PRIMERA_POSICION]);
        
        // Imprimir estudiante del medio
        System.out.println("Estudiante del medio: " + estudiantes[POSICION_MEDIO]);
        
        // Imprimir último estudiante
        System.out.println("Último estudiante: " + estudiantes[ULTIMA_POSICION]);
        
        // Información adicional sobre las posiciones
        System.out.println("\n--- INFORMACIÓN DE POSICIONES ---");
        System.out.println("Total de estudiantes: " + estudiantes.length);
        System.out.println("Posición del primero (índice): " + PRIMERA_POSICION);
        System.out.println("Posición del medio (índice): " + POSICION_MEDIO);
        System.out.println("Posición del último (índice): " + ULTIMA_POSICION);
    }
    
}
