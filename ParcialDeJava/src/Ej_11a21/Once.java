
package Ej_11a21;
public class Once {
     public static void main(String[] args) {
        
        
        final String NOMBRE_BUSCADO = "Luis";
        
        
        String[] estudiantes = {
            "Carlos", 
            "Luis", 
            "Maria", 
            "Luis", 
            "Ana", 
            "Pedro", 
            "Luis"
        };
        
        int contadorLuis = 0;
        for (String estudiante : estudiantes) {

            if (estudiante.equalsIgnoreCase(NOMBRE_BUSCADO)) {
                contadorLuis++;
            }
        }
        System.out.println("Lista de estudiantes:");
        for (int i = 0; i < estudiantes.length; i++) {
            System.out.println((i + 1) + ". " + estudiantes[i]);
        }
        
        System.out.println("\nCantidad de estudiantes llamados " + NOMBRE_BUSCADO + ": " + contadorLuis);
    }
}
    

