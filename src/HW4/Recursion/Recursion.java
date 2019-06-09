package HW4.Recursion;

public class Recursion {

    public void recursion(int n) {
        if (n > 5) {
            return;
        }
        System.out.println(n);
        recursion(n + 1);
    }

    public int sumDigitsOfNumber(int num) {
        int sum = 0;
        if (num != 0) {
            sum += num % 10;
            sumDigitsOfNumber(num / 10);
        }
        return sum;
    }
}
