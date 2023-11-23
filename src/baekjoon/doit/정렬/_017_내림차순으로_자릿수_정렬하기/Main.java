package baekjoon.doit.정렬._017_내림차순으로_자릿수_정렬하기; // BOJ1427 - S5

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 선택정렬 연습
 */
public class Main {

    private int[] solution(String number) {
        int[] numbers = Arrays.stream(number.split(""))
                .mapToInt(Integer::parseInt)
                .toArray();
        int n = numbers.length;
        for (int i = 0; i < n; i++) {
            int max = i;
            for (int j = i + 1; j < n; j++) {
                if (numbers[j] > numbers[max]) {
                    max = j;
                }
            }
            if (numbers[i] < numbers[max]) {
                int tmp = numbers[i];
                numbers[i] = numbers[max];
                numbers[max] = tmp;
            }
        }
        return numbers;
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String number = br.readLine();
        Arrays.stream(T.solution(number)).forEach(System.out::print);
    }

}
