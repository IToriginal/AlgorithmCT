package inflearn.기본._04_HashMap_HashSet_TreeSet._01_학급회장_해쉬;

import java.io.*;
import java.util.*;

public class MyAnswer {
    public char solution(int n, String s) {
        char answer = ' ';

        HashMap<Character, Integer> map = new HashMap<>();
        for (char x : s.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        int maxValue = Integer.MIN_VALUE;
        for (char key : map.keySet()) {
            int count = map.get(key);
            if (count > maxValue) {
                maxValue = count;
                answer = key;
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        MyAnswer T = new MyAnswer();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        System.out.println(T.solution(n, s));
    }
}
