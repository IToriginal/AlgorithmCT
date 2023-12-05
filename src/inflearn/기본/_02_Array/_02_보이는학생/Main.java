package inflearn.기본._02_Array._02_보이는학생;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    private static int n;
    private static int[] arr;

    private int solution() {
        int count = 0;
        int maxHeight = Integer.MIN_VALUE;
        for (int student : arr) {
            if (student > maxHeight) {
                count++;
                maxHeight = student;
            }
        }
        return count;
    }

    private void inputData() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }

    public static void main(String[] args) throws IOException {
        Main m = new Main();
        m.inputData();
        System.out.println(m.solution());
    }

}
