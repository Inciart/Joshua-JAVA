
package estructurasDeControl;

public class introALasCondicionales {
    public static void main(String[] args) {
        
        final int MAYOR_EDAD = 18;
        int edad = 17;
        
        String respuestaDescriptiva;
        
        if(edad >= MAYOR_EDAD) {
            respuestaDescriptiva = "Es mayor de edad";
        }else {
            respuestaDescriptiva = "Es menor de edad";
        }
        System.out.println("respuesta = " + respuestaDescriptiva);
        
        
            
    }
}
