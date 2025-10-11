
package POOinClass;
public class Persona {
    
       public String nombre;
       public int edad;
       public String documento;
       public double estatura;
       public double peso;
       
       public static int mayorEdad = 18;

    public Persona(String nombre, int edad, String documento, double estatura, double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.documento = documento;
        this.estatura = estatura;
        this.peso = peso;
    }
    
    public boolean esMayorEdad(/*No necesito parametros, ya estan en Principal*/){
        if (this.edad >= Persona.mayorEdad){
            return true;
        }
        return false;
    }
    
    
    
    
    public double mostrarImc(/*No necesito parametros, ya estan en Principal*/){
        double imc = this.peso /this.estatura*this.estatura;
        return imc;
    }
    
    
}

