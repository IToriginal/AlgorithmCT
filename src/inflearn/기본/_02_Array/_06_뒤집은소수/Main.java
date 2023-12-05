package inflearn.기본._02_Array._06_뒤집은소수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Main {

    private static int n;
    private static int[] arr;

    private boolean isPrime(int number) {
        return number >= 2 && IntStream.rangeClosed(2, (int) Math.sqrt(number))
                .allMatch(i -> number % i != 0);
    }

    private int reverseNumber(int number) {
        String numString = String.valueOf(number);
        String rev = new StringBuilder(numString)
                .reverse()
                .toString();
        return Integer.parseInt(rev);
    }

    private List<Integer> solution() {
        List<Integer> result = new ArrayList<>();
        for (int number : arr) {
            int rev = reverseNumber(number);
            if (isPrime(rev)) {
                result.add(rev);
            }
        }
        return result;
    }

    private void inputData() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
    public static void main(String[] args) throws IOException {
        Main m = new Main();
        m.inputData();
        for (int number : m.solution()) {
            System.out.print(number + " ");
        }
    }

}
