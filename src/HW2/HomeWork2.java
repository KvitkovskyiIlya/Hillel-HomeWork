package HW2;

import java.util.Arrays;
import java.util.Random;

public class HomeWork2 {
    public static void main(String[] args) {
        int[] array = generateRandomIntArr(15, 50);
        int[] newArray = {12345, 324235, 2234, 22, 235235, 12315, 5432};
        int min = findMinValue(array);
        int max = findMaxValue(array);

        System.out.println(Arrays.toString(array));
        evenValue(array);
        System.out.println();
        oddValue(array);
        System.out.println();

        // Цикл для вывода простых чисел

        System.out.print("Prime Value: ");
        for (int i = 0; i < array.length; i++) {

            if (primeNumber(array[i]) == 1) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();

        for (int i = 0; i < newArray.length; i++) {
            if (numbersAreDifferent(newArray[i])){
                System.out.println("Число " + newArray[i] + " состоит только из различных цифр");
            }
        }

        fibonacci(1, 1);
        System.out.println("Min value = " + min);
        System.out.println("Max value = " + max);

        System.out.println("New Array = " + Arrays.toString(newArray));
        lengthofnumbers(newArray, 0, 0);

        System.out.println("Matrix Multiplication");
        int[][] firstMatrix = {{8, 5}, {9, 7}};
        int[][] secondMatrix = {{3, 2}, {8, 4}};
        int[][] resultMatrix = new int[firstMatrix.length][secondMatrix[0].length];
        for (int i = 0; i < firstMatrix.length; i++) {
            for (int j = 0; j < secondMatrix[i].length; j++) {
                for (int a = 0; a < secondMatrix.length; a++) {
                    resultMatrix[i][j] += firstMatrix[i][a] * secondMatrix[a][j];
                }
            }
        }
        for (int i = 0; i < firstMatrix.length; i++) {
            for (int j = 0; j < resultMatrix[0].length; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Square Matrix");
        squareMatrix(25, 5);

        // Вывод второго варианта реализации (Числа которые состоят только из различных чисел)

      /*  System.out.print("The numbers in which the numbers do not repeat: ");
        for (int elem : newArray) {
            if (isDistinct(elem)) {
                System.out.print(elem + " ");
            }
        }*/
    }

    public static int[] generateRandomIntArr(int arrayLength, int upperBound) {
        int[] array = new int[arrayLength];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(upperBound);
        }
        return array;
    }

    public static void evenValue(int[] array) {
        System.out.print("Even Value = ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }
    }

    public static void oddValue(int[] array) {
        System.out.print("Odd Value = ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.print(array[i] + " ");
            }
        }
    }

    private static int primeNumber(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return 0;
            }
            if (i > Math.sqrt(number)) {
                return 1;
            }
        }
        return 0;
    }

    public static void fibonacci(int n0, int n1) {
        int n2;
        System.out.print("Fibonacci Value = " + n0 + " " + n1 + " ");
        for (int i = 3; i <= 20; i++) {
            n2 = n0 + n1;
            System.out.print(n2 + " ");
            n0 = n1;
            n1 = n2;
        }
        System.out.println();
    }

    public static int findMaxValue(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    public static int findMinValue(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    public static void lengthofnumbers(int[] newArray, int longestValue, int shortestValue) {
        int longLength = Integer.MIN_VALUE;
        int shortLength = Integer.MAX_VALUE;
        for (int value : newArray) {
            int i = value; // Присваиваем текущее значение
            int numberLength = 0;

            while (value != 0) {
                int currentValue = value % 10;
                value -= currentValue;
                value /= 10;
                numberLength++;
            }
            if (numberLength >= longLength) {
                longestValue = i;
                longLength = numberLength;
            }
            if (numberLength <= shortLength) {
                shortestValue = i;
                shortLength = numberLength;
            }
        }
        System.out.println("The longest =  " + longestValue + " long =  " + longLength);
        System.out.println("The shorest = " + shortestValue + " short = " + shortLength);

    }

    public static void squareMatrix(int a, int n) {
        while (n * n < a) {
            n++;
        }
        int initialValue = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (initialValue <= a) {
                    System.out.print((initialValue++) + "\t");
                }
            }
            System.out.println();
        }
    }

    // 7. Задать массив с n чисел. Найти числа, состоящее только из различных цифр.

    public static boolean numbersAreDifferent (int number){
        int [] count = new int[10];
        boolean result = true;
        int temp = number;

        for (int i = 0; i < count.length; i++){
            while (temp != 0) {
                int value = temp % 10;
                temp = temp / 10;
                count [value] += 1;

                if (count[value] > 1) {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }

    // Второй вариант реализации

   /* private static boolean isDistinct(int x) {
        String str = String.valueOf(x);
        for (int i = 0; i < str.length() - 1; i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    } */
}
