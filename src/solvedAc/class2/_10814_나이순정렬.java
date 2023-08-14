package solvedAc.class2;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class _10814_나이순정렬 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();
        int N = Integer.parseInt(br.readLine()); // 회원 수

        String[][] list = new String[N][2];
        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");
            list[i][0] = input[0]; // 나이
            list[i][1] = input[1]; // 이름
        }
        Arrays.sort(list, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
            }
        });

        for (String[] strings : list) {
            result.append(strings[0]).append(" ").append(strings[1]).append("\n");
        }
        System.out.println(result);
    }
}
