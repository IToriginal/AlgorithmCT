package inflearn._02_Array._08_등수구하기;

import java.io.*;

public class MyAnswer2 {
    public String solution(int n, int[] arr) {
        String answer = "";
        for (int i = 0; i < n; i++) {
            int rank = 1;
            for (int j = 0; j < n; j++) {
                if (arr[j] > arr[i]) {
                    rank++;
                }
            }
            answer += rank + " ";
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        MyAnswer2 T = new MyAnswer2();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }
        System.out.println(T.solution(n, arr));
    }
}
