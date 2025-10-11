
package apuntes;
public class apuntes {
    public static void main(String[] args) {
        String sexo = "F";
        String respuesta;
        final String GENERO_MASCULINO = "M";
        final String GENERO_FEMENINO = "F";
        final String GENERO_INDETERMINADO = "I";
        
        
        switch (sexo) 
        {
            case GENERO_MASCULINO:
                respuesta = "Es varon";
                break;
            
            case GENERO_FEMENINO:
                respuesta = "Es mujer";
                break;
                
            case GENERO_INDETERMINADO:
                respuesta = "Indetermidano";
                break;
        }
        //System.out.println(respuesta);
        /*
        if(sexo.equalsIgnoreCase(GENERO_FEMENINO)){
            System.out.println("Es una mujer");
            
        }else if(sexo.equalsIgnoreCase(GENERO_MASCULINO)){
            System.out.println("Es un hombre");
                    
        }else if(sexo.equalsIgnoreCase(GENERO_INDETERMINADO)){
            System.out.println("Indeterminado");
        }
     */
}}
