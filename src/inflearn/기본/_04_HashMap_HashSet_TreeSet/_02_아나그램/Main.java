package inflearn.기본._04_HashMap_HashSet_TreeSet._02_아나그램;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

    private char[] s1, s2;

    private String solution() {
        Map<Character, Integer> compareMap = new HashMap<>();

        for (char alphabet : s1) {
            int currentAmount = compareMap.getOrDefault(alphabet, 0) + 1;
            compareMap.put(alphabet, currentAmount);
        }

        for (char alphabet: s2) {
            if (!compareMap.containsKey(alphabet) || compareMap.get(alphabet) == 0) {
                return "NO";
            }
            compareMap.put(alphabet, compareMap.get(alphabet) - 1);
        }

        return "YES";
    }

    private void inputData() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        s1 = br.readLine().toCharArray();
        s2 = br.readLine().toCharArray();
    }

    public static void main(String[] args) throws IOException {
        Main m = new Main();
        m.inputData();
        System.out.println(m.solution());
    }

}
