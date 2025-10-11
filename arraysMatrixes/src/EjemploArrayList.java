import java.util.ArrayList;
import java.util.Scanner;

public class EjemploArrayList {
    public static void main(String[] args) {
        // Crear ArrayList dinámico
        ArrayList<String> nombres = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        // Llenar el ArrayList
        System.out.println("Ingresa nombres (escribe 'fin' para terminar):");
        String entrada;
        while (!(entrada = scanner.nextLine()).equals("fin")) {
            nombres.add(entrada);
        }
        
        // Mostrar contenido
        System.out.println("Lista actual: " + nombres);
        // Buscar un nombre
        System.out.print("¿Qué nombre quieres buscar? ");
        String nombreBuscado = scanner.nextLine();
        
        // Aquí viene la lógica del -1
        int indice = nombres.indexOf(nombreBuscado);
        
        if (indice != -1) {
            System.out.println("✓ Encontrado en la posición: " + indice);
            System.out.println("El nombre es: " + nombres.get(indice));
        } else {
            System.out.println("✗ No se encontró el nombre en la lista");
        }
        
        scanner.close();
    }
}