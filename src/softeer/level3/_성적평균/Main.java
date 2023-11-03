package softeer.level3._성적평균;

import java.io.*;
import java.util.*;

public class Main {
    private List<Integer> getRangeValue(int start, int end, int[] arr) {
        List<Integer> rangeList = new ArrayList<>();
        for (int i = start - 1; i <= end - 1; i++) {
            rangeList.add(arr[i]);
        }
        return rangeList;
    }

    public List<String> solution(int k, int[] scores, int[][] section) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            int startIndex = section[i][0];
            int endIndex = section[i][1];
            List<Integer> target = getRangeValue(startIndex, endIndex, scores);
            double sum = target.stream().mapToDouble(Double::valueOf).sum();
            double avg = sum / target.size();
            result.add(String.format("%.2f", avg));
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line1 = br.readLine().split(" ");
        int n = Integer.parseInt(line1[0]);
        int k = Integer.parseInt(line1[1]);

        String[] line2 = br.readLine().split(" ");
        int[] scores = new int[n];
        for (int i = 0; i < n; i++) {
            scores[i] = Integer.parseInt(line2[i]);
        }
        int[][] section = new int[k][2];
        for (int i = 0; i < k; i++) {
            String[] line3 = br.readLine().split(" ");
            section[i][0] = Integer.parseInt(line3[0]);
            section[i][1] = Integer.parseInt(line3[1]);
        }
        for (String avg: T.solution(k, scores, section)) {
            System.out.println(avg);
        }
    }
}
