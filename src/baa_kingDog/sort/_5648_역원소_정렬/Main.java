package baa_kingDog.sort._5648_역원소_정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static StringBuilder result = new StringBuilder();
    static int n;
    static long[] numbers;

    public static void main(String[] args) throws IOException {
        init();
        print();
    }

    private static void init() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        numbers = new long[n];
        int cnt = 0;

        do {
            while (st.hasMoreTokens()) {
                String strNum = st.nextToken();
                StringBuilder rev = new StringBuilder(strNum).reverse();
                numbers[cnt++] = Long.parseLong(rev.toString());
            }
            if (!st.hasMoreTokens() && cnt != n) {
                st = new StringTokenizer(br.readLine());
            }
        } while (cnt != n);

        Arrays.sort(numbers);
    }

    private static void print() {
        for (long number : numbers) {
            result.append(number).append("\n");
        }
        System.out.print(result);
    }

}