
package methods;
public class Ejemplo1 {
    public static void main(String[] args) {
        
        
        int numero1 = 12;
        int numero2 = 13;
        int total = sumar(numero1,numero2);
        System.out.println(total);
        
        int numero3 = 10;
        int total2 = sumar(numero1,numero3);
        System.out.println(total2);
        
        double numero4 = 12.5;
        double numero5 = 5.5;
        double total3 = sumar(numero4,numero5);
    }
    
    public static int sumar(int numero1,int numero2){
        return numero1+numero2;
    }
    
    public static double sumar(double numero1,double numero2){
        return numero1+numero2;
    }
    
}
