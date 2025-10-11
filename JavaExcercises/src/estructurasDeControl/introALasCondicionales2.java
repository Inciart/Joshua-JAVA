
package estructurasDeControl;
import java.util.Scanner;

public class introALasCondicionales2 {
    public static void main(String[] args) {
        
        final String solucion = "llaves";
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Chiquito como un raton, pero cuida la casa como un leon");
        String repuestaUsuario = sc.next();
        
        String respuesta;
        
        //equals ignore case para ignorar mayusculas y minusculas
        if (repuestaUsuario.equalsIgnoreCase(solucion))
        {
            respuesta = "Adivinaste";
        }else{
            respuesta = "No adivinaste";
        }
        System.out.println(respuesta);
        sc.close();
    }
}
