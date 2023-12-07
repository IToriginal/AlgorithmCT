package inflearn.기본._03_TwoPointers_SlidingWindow_Math._01_두배열합치기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    private int n, m;
    private int[] arrA, arrB;

    private int[] solution() {
        int[] result = new int[n + m];
        System.arraycopy(arrA, 0, result, 0, n);
        System.arraycopy(arrB, 0 , result, n, m);
        Arrays.sort(result);
        return result;
    }

    private void inputData() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arrA = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        m = Integer.parseInt(br.readLine());
        arrB = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }

    public static void main(String[] args) throws IOException {
        Main m = new Main();
        m.inputData();
        for (int data : m.solution()) {
            System.out.print(data + " ");
        }
    }

}
