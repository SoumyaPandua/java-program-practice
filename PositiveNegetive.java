// Positive, Negative, or Zero
// Read a number and classify it as positive, negative, or zero.

import java.util.Scanner;

public class PositiveNegetive{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num: ");
        int num = sc.nextInt();
        if (num > 0){
            System.out.println("+VE");
        } else if(num < 0){
            System.out.println("-VE");
        }else{
            System.out.println("ZERO");
        }
    }
}