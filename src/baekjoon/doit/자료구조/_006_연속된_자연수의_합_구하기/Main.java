package baekjoon.doit.자료구조._006_연속된_자연수의_합_구하기; // BOJ2018 - S5

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private int solution(int N) {
        int result = 1;
        int sum = 1;
        int start = 1, end = 1;

        while (end != N) {
            if (sum == N) {
                result++;
                end++;
                sum += end;
            } else if (sum > N) {
                sum -= start;
                start++;
            } else {
                end++;
                sum += end;
            }
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        System.out.println(T.solution(N));
    }

}
