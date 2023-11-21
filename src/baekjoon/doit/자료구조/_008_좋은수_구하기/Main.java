package baekjoon.doit.자료구조._008_좋은수_구하기; // BOJ1253 - G4

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    private int solution(int n, int[] numbers) {
        int result = 0;

        for (int i = 0; i < n; i++) {
            int start = 0, end = n - 1;
            int target = numbers[i];

            while (start != end) {
                int sum = numbers[start] + numbers[end];
                if (target == sum) {
                    if (start != i && end != i) {
                        result++;
                        break;
                    } else if (start == i) {
                        start++;
                    } else {
                        end--;
                    }
                } else if (target < sum) {
                    end--;
                } else {
                    start++;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] numbers = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .sorted()
                .toArray();
        System.out.println(T.solution(N, numbers));
    }

}
