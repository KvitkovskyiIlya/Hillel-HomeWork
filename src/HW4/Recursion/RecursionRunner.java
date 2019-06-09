package HW4.Recursion;

public class RecursionRunner {
    public static void main(String[] args) {
        int n = 1;
        Recursion recursion = new Recursion();
        recursion.recursion(n);
        System.out.print("Sum digits of number is " + recursion.sumDigitsOfNumber(1234));
    }
}
