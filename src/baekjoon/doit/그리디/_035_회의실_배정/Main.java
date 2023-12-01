package baekjoon.doit.그리디._035_회의실_배정; // BOJ1931 - S1

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    private static int n;
    private static int[][] time;

    private int solution() {
        int count = 0;

        Arrays.sort(time, (dataA, dataB) -> {
            if (dataB[1] == dataA[1]) {
                return Integer.compare(dataA[0], dataB[0]);
            }
            return Integer.compare(dataA[1], dataB[1]);
        });

        int end = -1;
        for (int i = 0; i < n; i++) {
            int start = time[i][0];
            if (start >= end) {
                end = time[i][1];
                count++;
            }
        }
        return count;
    }

    private void inputData() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        time = new int[n][2];
        for (int i = 0; i < n; i++) {
            String[] data = br.readLine().split(" ");
            time[i][0] = Integer.parseInt(data[0]); // start
            time[i][1] = Integer.parseInt(data[1]); // end
        }
    }

    public static void main(String[] args) throws IOException {
        Main m = new Main();
        m.inputData();
        System.out.println(m.solution());
    }

}
