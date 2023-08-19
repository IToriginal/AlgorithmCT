package inflearn._02_Array._04_피보나치수열;

import java.io.*;

public class MyAnswer {
    public String solution (int N) {
        String answer = "1 1 ";

        int[] arr = new int[N];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i < N; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
            answer += arr[i] + " ";
        }

        return answer;
    }
    public static void main(String[] args) throws IOException {
        MyAnswer T = new MyAnswer();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // int N = Integer.parseInt(br.readLine());
        int N = 10;
        System.out.println(T.solution(N));
    }
}
