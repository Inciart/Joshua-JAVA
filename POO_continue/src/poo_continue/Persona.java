
package poo_continue;
public class Persona {
    protected String nombres;
    protected String apellidos;
    protected String numeroCelular;
    protected int edad;
    protected boolean esExtranjero;
    public static final double SUBSIDIO = 100000;

    public Persona(String nombres, String apellidos, String numeroCelular, int edad, boolean esExtranjero) {
        this.setNombres(nombres);
        this.setApellidos(apellidos);
        this.setNumeroCelular(numeroCelular);
        this.setEdad(edad);
        this.setEsExtranjero(esExtranjero);
    }
    
    public double pagarSubsidio(){
        if(this.esExtranjero){
            return Persona.SUBSIDIO;
        }
        return 0.0;
    }
    
    
    @Override
    public String toString() {
        return "Persona{" + "nombres=" + nombres + ", apellidos=" + apellidos + ", numeroCelular=" + numeroCelular + ", edad=" + edad + ", esExtranjero=" + esExtranjero + '}';
    }//toString permite ver el valor de los atributos de mi objeto, en caso de no haberlos, le dara valores default

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNumeroCelular() {
        return numeroCelular;
    }

    public void setNumeroCelular(String numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean getEsExtranjero() {
        return esExtranjero;
    }

    public void setEsExtranjero(boolean esExtranjero) {
        this.esExtranjero = esExtranjero;
    }

    
    
}
