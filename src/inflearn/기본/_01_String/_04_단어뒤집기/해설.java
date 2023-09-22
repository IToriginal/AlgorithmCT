package inflearn.기본._01_String._04_단어뒤집기;

import java.io.*;
import java.util.*;

public class 해설 {
    public ArrayList<String> solution(int N, String[] str) {
        ArrayList<String> answer = new ArrayList<>();
        for (String x : str) {
            char[] s = x.toCharArray();
            int leftPointer = 0;
            int rightPointer = x.length() - 1;

            while (leftPointer < rightPointer) {
                char tmp = s[leftPointer];
                s[leftPointer] = s[rightPointer];
                s[rightPointer] = tmp;
                leftPointer++;
                rightPointer--;
            }
            String tmp = String.valueOf(s);
            answer.add(tmp);
        }
        /*
        for (String x : str) {
            String tmp = new StringBuilder(x).reverse().toString();
            answer.add(tmp);
        }
         */
        return answer;
    }
    public static void main(String[] args) throws IOException {
        해설 T = new 해설();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] str = new String[N];
        for (int i = 0; i < N; i++) {
            str[i] = br.readLine();
        }
        for (String x : T.solution(N, str)) {
            System.out.println(x);
        }
    }
}
