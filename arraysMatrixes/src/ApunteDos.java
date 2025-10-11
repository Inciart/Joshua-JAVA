/*
Tienes una lista de 9 numeros, ahora debes
contar cuantos son pares y cuantos impares. 
*/
public class ApunteDos {
    public static void main(String[] args) {
        
        
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8 , 9};
    
        int contadorPar = 0;
        int contadorImpar = 0;
        
        for (int numero: numeros) {
            if (numero%2 == 0 ) {
                contadorPar++;
            } else {
                contadorImpar++;
            }
        }
        System.out.println("Numeros pares: " + contadorPar + "\nNumeros impares: " + contadorImpar);
    }
    
}
