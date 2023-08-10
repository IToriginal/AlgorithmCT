package solvedAc.class2;

import java.io.*;
import java.util.*;

public class _1978_소수찾기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }

        int count = 0;
        for (int number : numbers) {
            boolean primeChk = true;
            if (number == 1) continue;
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    primeChk = false;
                    break;
                }
            }
            count++;
        }
        System.out.println(count);
    }
}
