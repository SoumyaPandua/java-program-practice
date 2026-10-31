public class TemperatureConverter{
    public static void main(String[] args){
        // Convert Celsius to Fahrenheit.
        // Formula: F = (C * 9 / 5) + 32
        float celsius = 37;
        float fahrenheit = (celsius * 9/5) + 32;
        System.out.println(fahrenheit);
    }
}