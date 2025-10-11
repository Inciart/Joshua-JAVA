
public class ApuntesArrayu {
    public static void main(String[] args) {
        int[] numeros = {5, 15, 10, 7};
        int acumulador = 0;
        int totalNumeros = numeros.length;
        for (int i = 0; i < totalNumeros; i++) {
            acumulador += numeros[i];
        }
        System.out.println("acumulador = " + acumulador);
    }
}
