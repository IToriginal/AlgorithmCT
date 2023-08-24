package inflearn._04_HashMap_HashSet_TreeSet._04_모든아나그램찾기;

import java.io.*;
import java.util.*;

public class MyAnswer2 {
    public int solution(String s1, String s2) {
        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> standard = new HashMap<>();

        int answer = 0;

        char[] arr = s1.toCharArray();

        for (char x : s2.toCharArray()) {
            standard.put(x, standard.getOrDefault(x, 0) + 1);
        }

        for (int i = 0; i < s2.length() - 1; i++) {
            map.put(s1.charAt(i), map.getOrDefault(s1.charAt(i), 0) + 1);
        }

        int lp = 0, rp = s2.length() - 1;
        for (int i = rp; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            if (map.equals(standard)) {
                answer++;
            }
            map.put(arr[lp], map.get(arr[lp]) - 1);
            if (map.get(arr[lp]) == 0) map.remove(arr[lp]);
            lp++;
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        MyAnswer2 T = new MyAnswer2();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1 = br.readLine();
        String s2 = br.readLine();
        System.out.println(T.solution(s1, s2));
    }
}
