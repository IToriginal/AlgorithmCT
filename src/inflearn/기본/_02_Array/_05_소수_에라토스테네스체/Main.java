package inflearn.기본._02_Array._05_소수_에라토스테네스체;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

public class Main {

    private static int n;

    private boolean isPrime(int number) {
        return number >= 2 && IntStream.rangeClosed(2, (int) Math.sqrt(number))
                .allMatch(i -> number % i != 0);
    }

    private int solution() {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            if (isPrime(i)) {
                result++;
            }
        }
        return result;
    }

    private void inputData() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
    }

    public static void main(String[] args) throws IOException {
        Main m = new Main();
        m.inputData();
        System.out.println(m.solution());
    }

}
