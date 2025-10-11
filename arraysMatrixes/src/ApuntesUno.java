
public class ApuntesUno {
    public static void main(String[] args) {
        int[] digitos = {5,10,15, 43, 25, 12, 23, 64, 73};
        final int NUM = 1; 
        
        for (int i = 0; i < digitos.length; i++) {
            System.out.println("Posicion " + (i+NUM) + ": " + digitos[i]);
        }
        
        int i = 0;
        System.out.println("--Numeros--");
         for (int digito : digitos) {
             if (digito%2 == 0) {
                 System.out.println("par: " +  digito);
             }
             if (digito%2 != 0 ){
                digitos[i] = digito+NUM ; 
                System.out.println("Asignado a par: " + digitos[i]);
             }
         }
    }
}
