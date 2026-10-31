// Grade Calculator
// Read marks from 0 to 100 and assign grades:
// A: 90–100, B: 80–89, C: 70–79, D: 60–69, F: below 60.
// Reject marks outside the valid range.
import java.util.Scanner;
public class GradeCalculator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your mark: ");
        int marks = sc.nextInt();
        if (marks > 100 || marks < 0){
            System.out.println("Invalid mark");
        }else if(marks >= 90 && marks <=100){
            System.out.println("Grade A");
        }else if(marks >= 80 && marks <=89){
            System.out.println("Grade B");
        }else if(marks >= 70 && marks <= 79){
            System.out.println("Grade C");
        }else if(marks >= 60 && marks <=69){
            System.out.println("Grade D");
        }else{
            System.out.println("Fail");
        }
        sc.close();
    }
}