package inflearn._02_Array._01_큰수출력하기;

import java.io.*;

public class MyAnswer {

    public String solution(int n, String str) {
        String answer = "";

        String[] arr = str.split(" ");
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(arr[i]);
        }

        int start = 0;
        answer += numbers[start] + " ";

        for (int i = 1; i < n; i++) {
            if (numbers[start] < numbers[i]) {
                answer += numbers[i] + " ";
            }
            start++;
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        MyAnswer T = new MyAnswer();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 6
        String str = br.readLine(); // 7 3 9 5 6 12
        System.out.println(T.solution(N, str)); // 7 9 6 12
    }
}
