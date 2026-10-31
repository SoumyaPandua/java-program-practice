// Largest of Two Numbers
// Read two integers and print the larger number.
// Handle the case where both numbers are equal.

import java.util.Scanner;
public class LargestTwoNums{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st num: ");
        int num1 = sc.nextInt();
        System.out.print("Enter 2nd num: ");
        int num2 = sc.nextInt();

        if (num1 > num2){
            System.out.println("Num1 is greater");
        }else if (num2 > num1){
            System.out.println("Num2 is greater");
        }else{
            System.out.println("2 nums are equal");
        }
    }
}