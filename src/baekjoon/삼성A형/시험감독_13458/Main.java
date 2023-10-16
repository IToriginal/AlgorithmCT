package baekjoon.삼성A형.시험감독_13458;

import java.io.*;

public class Main {
    public long solution(int n, int b, int c, int[] arr) {
        long answer = 0;
        answer += n;
        for (int i = 0; i < n; i++) {
            arr[i] -= b;
            if (arr[i] <= 0) continue;
            answer += arr[i] / c;
            if (arr[i] % c != 0) answer++;
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] input1 = br.readLine().split(" ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(input1[i]);
        String[] input2 = br.readLine().split(" ");
        int b = Integer.parseInt(input2[0]);
        int c = Integer.parseInt(input2[1]);
        System.out.println(T.solution(n, b, c, arr));
    }
}
