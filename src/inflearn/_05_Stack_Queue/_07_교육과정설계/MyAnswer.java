package inflearn._05_Stack_Queue._07_교육과정설계;

import java.io.*;
import java.util.*;

public class MyAnswer {
    public String solution(String str1, String str2) {
        Deque<Character> reqSubject = new ArrayDeque<>(); // 필수과목

        for (int i = 0; i < str1.length(); i++) reqSubject.add(str1.charAt(i));

        for (int i = 0; i < str2.length(); i++) {
            if (!reqSubject.isEmpty() && reqSubject.peekFirst() == str2.charAt(i)) {
                reqSubject.pollFirst();
            }
        }

        if (reqSubject.size() == 0) return "YES";
        else return "NO";
    }

    public static void main(String[] args) throws IOException {
        MyAnswer T = new MyAnswer();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        String str2 = br.readLine();
        System.out.println(T.solution(str1, str2));
    }
}
