package inflearn.기본._01_String._12_암호;

import java.io.*;

public class 제출 {
    public static int CODE_LEN = 7;
    public String solution(int n, String str) {
        String answer = "";
        String[] secret = new String[n];
        for (int i = 0; i < n; i++) {
            secret[i] = str.substring(i * CODE_LEN, (i + 1) * CODE_LEN);
            int transfer = Integer.parseInt(secret[i]
                .replace('#', '1')
                .replace('*', '0'), 2);
            answer += (char)transfer;
        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        제출 T = new 제출();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // 4
        String str = br.readLine(); // #****###**#####**#####**##**
        System.out.println(T.solution(n, str)); // COOL
    }
}
