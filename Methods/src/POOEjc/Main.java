package POOEjc;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Libro libro1 = new Libro("Stephen King", "El resplandor", 688, true);
        JOptionPane.showMessageDialog(null, "Seleccione aca informacion del libro: \n1. nombre del autor\n2.Titulo del libro\n3. Numero de paginas\n4. estado de prestamo");
        Libro.seleccion = Integer.parseInt(JOptionPane.showInputDialog("opciones: 1 - 4"));
        switch (Libro.seleccion) {
            case 1:
                libro1.nombreAutor();
                break;
            case 2:
                libro1.tituloLibro();
                break;
            case 3:
                libro1.numeroPaginas();
                break;
            case 4:
                libro1.estadoPrestamo();
                break;
            default:
            JOptionPane.showMessageDialog(null, "Opción inválida", "Error", JOptionPane.ERROR_MESSAGE);
            System.err.println("Error: Opción no válida");
            break;
        }
    }
}
