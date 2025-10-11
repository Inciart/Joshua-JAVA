package arraysmatrixes;
public class Notes {
    public static void main(String[] args) {
        double[][] matriz = {{2,4},{6,1},{5,7,9}};
        
        
        double mayor = 0;
        double menor = matriz[0][0];
        
        // Recorremos toda la matriz
        for (double[] numeros : matriz){
            for (double numero : numeros){
                if (numero > mayor) {
                    mayor = numero;
                }
                if (numero < menor){
                    menor = numero;
                }
            }
        }
        
        System.out.println("El número mayor de la matriz es: " + mayor);
        System.out.println("El número menor de la matriz es: " + menor);
    }
}