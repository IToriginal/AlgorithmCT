package solvedAc.class2;

import java.io.*;

public class _2609_GCDLCM {
    public int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    public int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] numbers = br.readLine().split(" ");

        int a = Integer.parseInt(numbers[0]);
        int b = Integer.parseInt(numbers[1]);

        _2609_GCDLCM solution = new _2609_GCDLCM();
        System.out.println(solution.gcd(a, b));
        System.out.println(solution.lcm(a, b));
    }
}
