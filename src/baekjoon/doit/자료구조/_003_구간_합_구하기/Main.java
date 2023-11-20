package baekjoon.doit.자료구조._003_구간_합_구하기; // BOJ11659 - S3

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private int[] nestedSum(int[] data) {
        int[] nestedSum = new int[data.length];
        for (int i = 1; i <= data.length - 1; i++) {
            nestedSum[i] = nestedSum[i - 1] + data[i];
        }
        return nestedSum;
    }

    private int[] solution(int[] data, int[][] sectionInfo) {
        int[] result = new int[sectionInfo.length];
        int[] nestedSum = nestedSum(data);
        for (int i = 0; i < sectionInfo.length; i++) {
            int start = sectionInfo[i][0];
            int end = sectionInfo[i][1];
            result[i] = nestedSum[end] - nestedSum[start - 1];
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nAndM = br.readLine().split(" ");
        int N = Integer.parseInt(nAndM[0]);
        int M = Integer.parseInt(nAndM[1]);

        int[] data = new int[N + 1];
        String[] numbers = br.readLine().split(" ");
        for (int i = 1; i <= N; i++) {
            data[i] = Integer.parseInt(numbers[i - 1]);
        }

        int[][] sectionInfo = new int[M][2];
        for (int i = 0; i < M; i++) {
            String[] section = br.readLine().split(" ");
            sectionInfo[i][0] = Integer.parseInt(section[0]);
            sectionInfo[i][1] = Integer.parseInt(section[1]);
        }

        for (int result : T.solution(data, sectionInfo)) {
            System.out.println(result);
        }
    }

}
