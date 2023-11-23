package baekjoon.doit.정렬._015_수_정렬하기_1; // BOJ2750 - B2

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 버블정렬 연습문제
 */
public class Main {

    public int[] solution(int n, int[] numbers) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int tmp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = tmp;
                }
            }
        }
        return numbers;
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] numbers = br.lines().limit(n)
                .mapToInt(Integer::parseInt)
                .toArray();
        Arrays.stream(T.solution(n, numbers)).forEach(System.out::println);
    }

}
