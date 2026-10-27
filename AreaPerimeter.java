// Area and Perimeter
//    Calculate the area and perimeter of a rectangle using its length
//    and breadth.

public class AreaPerimeter{
    public static void main(String[] args){
        float length = 10;
        float breadth = 8;

        double area = length * breadth;

        double perimeter = 2 * (length + breadth);

        System.out.println("Area is: " + area + " & perimeter is: " + perimeter);
    }
}