package inflearn._01_String._04_단어뒤집기;

import java.io.*;
import java.util.*;

public class 제출 {
    public StringBuilder solution(int N, String[] str) {
        StringBuilder result = new StringBuilder();

        for (String word : str) {
            Stack<String> stack = new Stack<>();

            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                stack.add(String.valueOf(c));
            }

            for (int i = 0; i < word.length(); i++) {
                result.append(stack.pop());
            }

            result.append("\n");
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        제출 T = new 제출();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] str = new String[N];
        for (int i = 0; i < N; i++) {
            str[i] = br.readLine();
        }
        System.out.println(T.solution(N, str));
    }
}
