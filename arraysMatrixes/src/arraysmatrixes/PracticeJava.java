//tarea: preguntar cada parte de la matriz y definir si 'T' es matriz
package arraysmatrixes;
public class PracticeJava {
    public static void main(String[] args) {
        final String[][] MATRIZ_VOCALES = {{"a","e","i","o","u"}, {"A","E","I","O","U"}};
        
        String letra = "T";
        
        for (String[] vocales : MATRIZ_VOCALES ) {
            for (String vocal : vocales) {
                if (!letra.equalsIgnoreCase(vocal)){
                    System.out.println("");
                }
            }
        }
    }
}
