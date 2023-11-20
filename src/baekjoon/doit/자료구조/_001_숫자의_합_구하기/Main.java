package baekjoon.doit.자료구조._001_숫자의_합_구하기; // BOJ11720 - B2

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    private static int arrSum(String[] input) {
        return Arrays.stream(input)
                .mapToInt(Integer::parseInt)
                .sum();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split("");
        System.out.println(arrSum(input));
    }

}
