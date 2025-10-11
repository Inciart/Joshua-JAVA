/*
4. A teacher wants to know the average age of his class and verify
    if it is over 15 years old.
 */
package estructurasDeControl;
public class ejercicio4 {
    public static void main(String[] args) {
        
        String respuesta;
        int estudiante1 = 13;
        int estudiante2 = 17;
        int estudiante3 = 18;
        double promedioEdad;
        promedioEdad = (estudiante1 + estudiante2 + estudiante3)/3;
        
        if (promedioEdad > 15){
        respuesta = "Es mayor a 15 años de edad";
        }else{
            respuesta = "Es menor a 15 años de edad";
        }
        System.out.println("El promedio de edad es: " + promedioEdad + " y " + respuesta);
    }
    
}
