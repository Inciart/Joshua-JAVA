package Ej_11a21;
public class Catorce {
    public static void main(String[] args) {
        
        final double LIMITE_INSUFICIENTE = 3.0;
        final double LIMITE_ACEPTABLE = 3.5;
        final double LIMITE_SOBRESALIENTE = 4.5;
        final double LIMITE_EXCELENTE = 5.0;
               
        double[] notas = {
            2.5, 3.8, 4.2, 4.8, 2.1, 
            3.2, 4.6, 4.9, 3.7, 4.3
        };
                
        int contadorInsuficiente = 0;
        int contadorAceptable = 0;
        int contadorSobresaliente = 0;
        int contadorExcelente = 0;
        
        System.out.println("LISTA DE NOTAS:");
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota " + (i + 1) + ": " + notas[i]);
        }
        
        
        for (double nota : notas) {
            if (nota < LIMITE_INSUFICIENTE) {
                contadorInsuficiente++;
                System.out.println("Nota " + nota + " -> Insuficiente");
                
            } else if (nota >= LIMITE_INSUFICIENTE && nota < LIMITE_ACEPTABLE) {
                contadorAceptable++;
                System.out.println("Nota " + nota + " -> Aceptable");
                
            } else if (nota >= LIMITE_ACEPTABLE && nota < LIMITE_SOBRESALIENTE) {
                contadorSobresaliente++;
                System.out.println("Nota " + nota + " -> Sobresaliente");
                
            } else if (nota >= LIMITE_SOBRESALIENTE && nota <= LIMITE_EXCELENTE) {
                contadorExcelente++;
                System.out.println("Nota " + nota + " -> Excelente");
            }
        }
        
        // Mostrar resultados finales
        System.out.println("\n--- RESUMEN DE CLASIFICACIÓN ---");
        System.out.println("Total de notas: " + notas.length);
        System.out.println("Insuficientes (< 3.0): " + contadorInsuficiente);
        System.out.println("Aceptables (3.0 - 3.4): " + contadorAceptable);
        System.out.println("Sobresalientes (3.5 - 4.4): " + contadorSobresaliente);
        System.out.println("Excelentes (4.5 - 5.0): " + contadorExcelente);
        
        // Verificación usando operadores aritméticos
        int totalVerificacion = contadorInsuficiente + contadorAceptable + contadorSobresaliente + contadorExcelente;
        System.out.println("Verificación total: " + totalVerificacion);
    }
}
