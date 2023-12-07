package inflearn.기본._03_TwoPointers_SlidingWindow_Math._02_공통원소구하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    private int n, m;
    private int[] arrA, arrB;

    private List<Integer> solution() {
        List<Integer> answer = new ArrayList<>();
        int pointA = 0, pointB = 0;
        while (pointA < n && pointB < m) {
            if (arrA[pointA] == arrB[pointB]) {
                answer.add(arrA[pointA]);
                pointA++;
                pointB++;
            } else if (arrA[pointA] < arrB[pointB]) {
                pointA++;
            } else {
                pointB++;
            }
        }
        return answer;
    }

    private void inputData() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arrA = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .sorted()
                .toArray();
        m = Integer.parseInt(br.readLine());
        arrB = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .sorted()
                .toArray();
    }

    public static void main(String[] args) throws IOException {
        Main m = new Main();
        m.inputData();
        for (int common : m.solution()) {
            System.out.print(common + " ");
        }
    }

}
