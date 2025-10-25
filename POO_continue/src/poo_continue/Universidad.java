package poo_continue;

import javax.swing.JOptionPane;

public class Universidad {

    public static void main(String[] args) {
        
        Persona estudiante1 = new Persona("Joshua", "Inciarte", "+57 315", 20, false); //if -void constructor (default values)
        
        System.out.println("Estudiante1 = " + estudiante1.getNombres());
        double pagar = estudiante1.pagarSubsidio();
        System.out.println("Pago: " + pagar);
        
    }
    
}
