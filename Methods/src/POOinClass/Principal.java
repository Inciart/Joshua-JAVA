
package POOinClass;

import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Joshua", 20, "192562", 1.78, 58);
        //System.out.println("es mayor de edad = " + persona1.esMayorEdad());
        JOptionPane.showMessageDialog(null,"es Mayor de edad:" + persona1.esMayorEdad());
        JOptionPane.showMessageDialog(null,"imc de la persona:" + persona1.mostrarImc());
                
    }
    
}
