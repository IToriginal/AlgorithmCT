package inflearn._01_String._06_중복문자제거;

import java.io.*;
import java.util.*;

public class 제출 {

    public String solution(String str) {
        String answer = "";
        char[] s = str.toCharArray();
        HashSet<Character> set = new HashSet<>();
        for (char x : s) {
            if (set.add(x)) {
                answer += x;
            }
        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        제출 T = new 제출();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine(); //ksekkset
        System.out.println(T.solution(str)); // kset
    }
}
