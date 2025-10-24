
package POOEjc;

import javax.swing.JOptionPane;

public class Libro{
    public String autor;
    public String titulo;
    public int paginas;
    public boolean prestamo;
    
    public static int seleccion;
    
    public static String nombreDeAutor;
    public static String tituloDeLibro;
    public static int numeroDePaginas;
    public static String estado;


    public Libro(String autor,String titulo, int paginas, boolean prestamo) {
        this.autor = autor;
        this.titulo = titulo;
        this.paginas = paginas;
        this.prestamo = prestamo;
    }
    
    public void  nombreAutor(){
        JOptionPane.showMessageDialog(null, "nombre del autor: " + this.autor);
        
    }
    public void tituloLibro(){
        JOptionPane.showInputDialog(null, "titulo del libro: " + this.titulo);
        
    }
    public void numeroPaginas(){
        JOptionPane.showInputDialog("numero de paginas: " + this.paginas);
        
    }
    public void estadoPrestamo(){
        
        if (this.prestamo == true ){
            Libro.estado = "Prestado";
        }else{
            Libro.estado = "Devuelto";
        }
        JOptionPane.showMessageDialog(null,"estado de prestamo del libro: " + Libro.estado);
       
    }
    
    
}
