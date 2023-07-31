package solvedAc.class1;

import java.io.*;
import java.util.*;

public class _1157_StudyWord {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<Character, Integer> map = new HashMap<>();
        String input = br.readLine();
        char[] word = input.toCharArray();

        for (int i = 0; i < word.length; i++) {
            word[i] = Character.toUpperCase(word[i]);
            map.put(word[i], 0);
        }

        for (char key : word) {
            if (map.containsKey(key)) {
                map.put(key, map.get(key) + 1);
            }
        }

        int maxValue = 0;
        char maxKey = ' ';
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            char key = entry.getKey();
            int value = entry.getValue();
            if (value > maxValue) {
                maxValue = value;
                maxKey = key;
            } else if (value == maxValue) {
                maxKey = '?';
            }
        }
        System.out.println(maxKey);
    }
}
