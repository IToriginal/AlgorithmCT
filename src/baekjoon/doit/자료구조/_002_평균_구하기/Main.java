package baekjoon.doit.자료구조._002_평균_구하기; // BOJ1546 - B1

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    private static double findMaxValue(double[] scores) {
        return Arrays.stream(scores)
                .max()
                .orElse(0);
    }

    private static double[] parseInput(String[] input) {
        return Arrays.stream(input)
                .mapToDouble(Double::parseDouble)
                .toArray();
    }

    private static double CalcAvg(int N, String[] input) {
        double[] parse = parseInput(input);
        double maxValue = findMaxValue(parse);
        return Arrays.stream(parse)
                .map(score -> score / maxValue * 100)
                .average()
                .orElse(0);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        System.out.print(CalcAvg(N, input));
    }

}
