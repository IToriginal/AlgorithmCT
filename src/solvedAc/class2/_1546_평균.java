package solvedAc.class2;

import java.io.*;

public class _1546_평균 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // 1000 이하
        String[] input = br.readLine().split(" ");
        double[] scores = new double[input.length];
        double sum = 0;
        double max = 0;

        for (int i = 0; i < n; i++) {
            double score = Double.parseDouble(input[i]);
            if (score > max) {
                max = score;
            }
            scores[i] = score;
        }

        for (int i = 0; i < n; i++) {
            scores[i] = scores[i] / max * 100;
            sum += scores[i];
        }
        System.out.println(sum/n);
    }
}
