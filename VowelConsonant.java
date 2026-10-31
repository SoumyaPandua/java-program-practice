// Vowel or Consonant
// Read an English alphabet character and determine whether it is a vowel or consonant. Handle uppercase and lowercase letters.

import java.util.Scanner;
public class VowelConsonant{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter character: ");
        char ch = sc.next().charAt(0);

        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')){

            ch = Character.toLowerCase(ch);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                System.out.println("It is a vowel");
            }else{
                System.out.println("It is a consonant");
            }
        }else{
            System.out.println("It is an invalid character");
        }
    }
}