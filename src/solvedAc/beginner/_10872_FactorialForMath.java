package solvedAc.beginner;

import java.io.*;

public class _10872_FactorialForMath {
    // 재귀함수 Factorial
    public static int factorial(int a) {
        if (a <= 0) {
            return 1;
        } else {
            return a *= factorial(a - 1);
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        int n = Integer.parseInt(input);

        // for 문 Factorial
        int result = 1;

        for (int i = 1; i <= n ; i++) {
            result *= i;
        }

        System.out.println(result);
        System.out.println(factorial(n));
    }
}
