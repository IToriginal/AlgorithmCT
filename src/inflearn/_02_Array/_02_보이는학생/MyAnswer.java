package inflearn._02_Array._02_보이는학생;

import java.io.*;

public class MyAnswer {

    public int solution(int N, String s) {
        int answer = 0;
        int max = 0;

        String[] arr = s.split(" ");
        int[] studentsH = new int[N];
        for (int i = 0; i < N; i++) {
            studentsH[i] = Integer.parseInt(arr[i]);
        }

        for (int i = 0; i < N; i++) {
            if (max < studentsH[i]) {
                max = studentsH[i];
                answer++;
            }
        }

        return answer;
    }
    public static void main(String[] args) throws IOException {
        MyAnswer T = new MyAnswer();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // int N = Integer.parseInt(br.readLine());
        // String s = br.readLine();
        int N = 8;
        String s = "130 135 148 140 145 150 150 153";
        System.out.println(T.solution(N, s));

    }
}
