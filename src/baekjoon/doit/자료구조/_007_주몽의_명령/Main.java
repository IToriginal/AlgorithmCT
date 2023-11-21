package baekjoon.doit.자료구조._007_주몽의_명령; // BOJ1940 - S4

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    private int solution(int N, int M, int[] numbers) {
        int result = 0;
        int start = 0, end = N - 1;

        while (start != end) {
            int sum = numbers[start] + numbers[end];
            if (sum == M) {
                result++;
                start++;
            } else if (sum < M) {
                start++;
            } else {
                end--;
            }
        }

        return result;
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        int[] numbers = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .sorted()
                .toArray();
        System.out.println(T.solution(N, M, numbers));
    }

}
