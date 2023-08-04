package solvedAc.class2;

import java.io.*;

public class _2869_SnailsWantToGoUp {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        int a = Integer.parseInt(input[0]); // + 오전. 올라갈 수치
        int b = Integer.parseInt(input[1]); // - 오후. 떨어질 수치
        int v = Integer.parseInt(input[2]); // 목표 수치

        int day = (v - b) / (a - b);
        if ((v - b) % (a - b) != 0) {
            day++;
        }

        System.out.println(day);
    }
}
