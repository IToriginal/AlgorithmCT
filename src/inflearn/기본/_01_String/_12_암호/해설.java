package inflearn.기본._01_String._12_암호;

import java.io.*;

public class 해설 {
    public String solution(int n, String str) {
        String answer = "";
        for (int i = 0; i < n; i++) {
            String tmp = str.substring(0, 7).replace('#', '1').replace('*', '0');
            int num = Integer.parseInt(tmp, 2);
            answer += (char)num;
            str = str.substring(7);
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        해설 T = new 해설();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // 4
        String str = br.readLine(); // #****###**#####**#####**##**
        System.out.println(T.solution(n, str)); // COOL
    }
}
