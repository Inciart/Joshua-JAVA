package poo_continue;
public class Estudiante extends Persona{
    private String codigo;
    public static final double SUBSIDIO = 50000;

    public Estudiante(String codigo, String nombres, String apellidos, String numeroCelular, int edad, boolean esExtranjero) {
        super(nombres, apellidos, numeroCelular, edad, esExtranjero);
        this.codigo = codigo;
    }
    
    public double pagarSubsidio(){
        
        if(super.getEsExtranjero()){//uso el get para traer el atributo, el set para determinarlo
            return super.pagarSubsidio() + Estudiante.SUBSIDIO;
        }
        return 0.0;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    
}
