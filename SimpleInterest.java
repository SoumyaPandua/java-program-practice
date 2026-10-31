public class SimpleInterest{
    public static void main(String[] args){
        // Calculate simple interest using principal, rate, and time.
        // Formula: SI = (P * R * T) / 100
        float principal = 10000;
        float rate = 2;
        float time = 1;
        float SI = (principal * time * rate) / 100;

        System.out.println(SI);
    }
}