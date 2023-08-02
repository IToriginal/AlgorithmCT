package solvedAc.class2;

import java.io.*;

public class _11050_BinomialCoefficient {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] numbers = br.readLine().split(" ");

        int num1 = Integer.parseInt(numbers[0]);
        int num2 = Integer.parseInt(numbers[1]);
        int numerator = 1;
        int denominator = 1;

        for (int i = num1; i > num1 - num2; i--) {
            numerator *= i;
        }

        for (int i = num2; i > 0 ; i--) {
            denominator *= i;
        }
        System.out.println(numerator / denominator);
    }
}
