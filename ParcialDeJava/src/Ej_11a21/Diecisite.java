
package Ej_11a21;
public class Diecisite {
     public static void main(String[] args) {
        
        // CONSTANTES para las vocales
        final char VOCAL_A = 'a';
        final char VOCAL_E = 'e';
        final char VOCAL_I = 'i';
        final char VOCAL_O = 'o';
        final char VOCAL_U = 'u';
        
        // Array con lista de letras
        char[] letras = {
            'p', 'a', 'r', 'e', 'n', 't', 'e', 's', 'i', 's', 
            'u', 'n', 'i', 'v', 'e', 'r', 's', 'i', 'd', 'a', 'd'
        };
        
        // Contadores inicializados en 0
        int contadorVocales = 0;
        int contadorConsonantes = 0;
        
        // Mostrar la lista completa de letras
        System.out.println("LISTA DE LETRAS:");
        for (int i = 0; i < letras.length; i++) {
            System.out.print(letras[i] + " ");
        }
        System.out.println("\nTotal de letras: " + letras.length);
        
        System.out.println("\n--- CLASIFICACIÓN VOCAL/CONSONANTE ---");
        
        // Recorrer array usando for each
        for (char letra : letras) {
            
            // Convertir a minúscula para comparación
            char letraMinuscula = Character.toLowerCase(letra);
            
            // Condicionales if para verificar si es vocal
            if (letraMinuscula == VOCAL_A || 
                letraMinuscula == VOCAL_E || 
                letraMinuscula == VOCAL_I || 
                letraMinuscula == VOCAL_O || 
                letraMinuscula == VOCAL_U) {
                
                contadorVocales++;
                System.out.println(letra + " -> VOCAL");
                
            } else {
                contadorConsonantes++;
                System.out.println(letra + " -> CONSONANTE");
            }
        }
        
        // Mostrar resultados finales
        System.out.println("\n--- RESUMEN DE CONTEO ---");
        System.out.println("Total de letras: " + letras.length);
        System.out.println("Vocales encontradas: " + contadorVocales);
        System.out.println("Consonantes encontradas: " + contadorConsonantes);
        
        // Verificación usando operadores aritméticos
        int totalVerificacion = contadorVocales + contadorConsonantes;
        System.out.println("Verificación total: " + totalVerificacion);
        
        // Mostrar las vocales encontradas
        System.out.println("\n--- VOCALES IDENTIFICADAS ---");
        System.out.print("Vocales: ");
        for (char letra : letras) {
            char letraMinuscula = Character.toLowerCase(letra);
            if (letraMinuscula == VOCAL_A || 
                letraMinuscula == VOCAL_E || 
                letraMinuscula == VOCAL_I || 
                letraMinuscula == VOCAL_O || 
                letraMinuscula == VOCAL_U) {
                System.out.print(letra + " ");
            }
        }
        System.out.println();
    }
}
