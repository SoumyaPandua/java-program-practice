// Type Casting
// Convert a double value into an integer and an integer into a double.
// Print the values before and after conversion.
public class TypeCasting{
    public static void main(String[] args){
        double d = 10.55;
        System.out.println("before type casting: " + d);
        int typed = (int) d;
        System.out.println("after type casting: " + typed);
        int num = 5;
        System.out.println("before type casting: " + num);
        double typenum = (double) num;
        System.out.println("after type casting: " + typenum);
    }
}