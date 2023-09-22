package inflearn.기본._01_String._03_문장속단어;

import java.io.*;

public class 제출 {

    public String solution(String str) {
        String result = "";
        String[] words = str.split(" ");
        int maxLength = 0;

        for (String word : words) {
            if (maxLength < word.length()) {
                maxLength = word.length();
                result = word;
            }
        }
        return result;
    }
    public static void main(String[] args) throws IOException {
        제출 T = new 제출();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        System.out.println(T.solution(input));
    }
}
