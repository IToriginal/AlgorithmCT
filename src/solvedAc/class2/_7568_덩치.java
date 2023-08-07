package solvedAc.class2;

import java.io.*;

public class _7568_덩치 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] dataArray = new int[n][2];

        for (int i = 0; i < n; i++) {
            String[] values = br.readLine().split(" ");
            dataArray[i][0] = Integer.parseInt(values[0]); // 몸무게
            dataArray[i][1] = Integer.parseInt(values[1]); // 키
        }

        for (int i = 0; i < n; i++) {
            int rank = 1;
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    continue;
                } else if (dataArray[i][0] < dataArray[j][0] && dataArray[i][1] < dataArray[j][1]) {
                    rank++;
                }
            }
            System.out.print(rank + " ");
        }
    }
}
