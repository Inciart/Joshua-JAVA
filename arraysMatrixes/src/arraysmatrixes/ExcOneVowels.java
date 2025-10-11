/*
1. Teach the vowels to the system store them in an array, 
   then ask for a letter on the keyboard and check if it 
   is a vowel
*/

package arraysmatrixes;
import java.util.Scanner;
public class ExcOneVowels {
    public static void main(String[] args) {
        String[] vowels = {"a","e","i","o","u"};
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese letra: ");
        String letter = sc.next().toLowerCase();
        //Boolean isVowel = false;
        String answer = "No" ;
        
        for (String i : vowels) {
            if (letter.equals(i)) {
                //isVowel = true;
                answer = "Si";
                break; 
            }
        }
       
        System.out.println("¿La letra ingresada es una vocal? --> " + answer);
    }
    
}
