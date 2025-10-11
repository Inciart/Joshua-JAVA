/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package methods;

/**
 *
 * @author Pc
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double base = 4;
        double altura = 5; 
        double totalArea = area(base,altura);
        System.out.println(totalArea);
        
        double totalPerimetro = perimetro(base,altura);
        System.out.println(totalPerimetro);
    }
    
    public static double area(double base, double altura){
        return base*altura;
    }
    
    public static double perimetro(double base,double altura){
        return (base*2)+(altura*2);
    }
}
