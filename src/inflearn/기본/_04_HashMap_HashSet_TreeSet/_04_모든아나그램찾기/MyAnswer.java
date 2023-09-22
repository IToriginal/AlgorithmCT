package inflearn.기본._04_HashMap_HashSet_TreeSet._04_모든아나그램찾기;

import java.io.*;
import java.util.*;

/**
 * 2023. 08. 24 (목): 1차 구현 실패
 */

public class MyAnswer {
    public int solution(String s1, String s2) {
        int answer = 0;

        HashMap<Character, Integer> map1 = new HashMap<>();
        for (char x : s2.toCharArray()) {
            map1.put(x, map1.getOrDefault(x, 0) + 1);
        }

        char[] arr = s1.toCharArray();
        HashMap<Character, Integer> map2 = new HashMap<>();

        // while (true) {
        //     boolean chk = true;
        //     int sp = 0;
        //     for (int i = sp; i < sp + map1.size(); i++) { // 0 ~ 2
        //         map2.put(arr[i], map2.getOrDefault(arr[i], 0) + 1);
        //     }
        //
        //     for (char map1Key : map1.keySet()) {
        //         for (char map2Key : map2.keySet()) {
        //             if (!map1.get(map1Key).equals(map2.get(map2Key))) chk = false;
        //         }
        //     }
        //
        //     if (chk) answer++;
        // }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        MyAnswer T = new MyAnswer();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1 = br.readLine();
        String s2 = br.readLine();
        System.out.println(T.solution(s1, s2));
    }
}
