package inflearn.기본._02_Array._01_큰수출력하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    private static int n;
    private static int[] arr;

    private String solution() {
        StringBuilder result = new StringBuilder();
        result.append(arr[0]).append(" ");
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i - 1]) {
                result.append(arr[i]).append(" ");
            }
        }
        return result.toString();
    }

    private void inputData() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine()); // 6
        arr = Arrays.stream(br.readLine().split(" ")) // 7 3 9 5 6 12
                .mapToInt(Integer::parseInt)
                .toArray();
    }

    public static void main(String[] args) throws IOException {
        Main m = new Main();
        m.inputData();
        System.out.println(m.solution());
    }

}
