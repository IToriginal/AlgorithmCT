package inflearn.기본._04_HashMap_HashSet_TreeSet._02_아나그램;

import java.io.*;
import java.util.*;

public class MyAnswer {
    public String solution(String s1, String s2) {
        HashMap<Character, Integer> map1 = new HashMap<>();
        for (char x : s1.toCharArray()) {
            map1.put(x, map1.getOrDefault(x, 0) + 1);
        }

        HashMap<Character, Integer> map2 = new HashMap<>();
        for (char x : s2.toCharArray()) {
            map2.put(x, map2.getOrDefault(x, 0) + 1);
        }

        int count = map1.size();
        for (char key1 : map1.keySet()) {
            for (char key2 : map2.keySet()) {
                if (key1 == key2 && map1.get(key1).equals(map2.get(key2))) {
                    count--;
                }
            }
        }
        if (count == 0) return "YES";
        else return "NO";
    }
    public static void main(String[] args) throws IOException {
        MyAnswer T = new MyAnswer();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1 = br.readLine();
        String s2 = br.readLine();
        System.out.println(T.solution(s1, s2));
    }
}
