package inflearn.기본._04_HashMap_HashSet_TreeSet._04_모든아나그램찾기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

    private char[] s, t;

    private int solution() {
        int answer = 0;
        Map<Character, Integer> compareMap = new HashMap<>();
        Map<Character, Integer> targetMap = new HashMap<>();

        for (char ch : t) {
            int currentValue = targetMap.getOrDefault(ch, 0) + 1;
            targetMap.put(ch, currentValue);
        }

        for (int i = 0; i < t.length - 1; i++) {
            int currentValue = compareMap.getOrDefault(s[i], 0) + 1;
            compareMap.put(s[i], currentValue);
        }

        int lPo = 0;
        for (int rPo = t.length - 1; rPo < s.length; rPo++) {
            int currentValue = compareMap.getOrDefault(s[rPo], 0) + 1;
            compareMap.put(s[rPo], currentValue);
            if (compareMap.equals(targetMap)) {
                answer++;
            }

            int removeValue = compareMap.get(s[lPo]) - 1;
            compareMap.put(s[lPo], removeValue);

            if (compareMap.get(s[lPo]) == 0) {
                compareMap.remove(s[lPo]);
            }
            lPo++;
        }

        return answer;
    }

    private void inputData() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        s = br.readLine().toCharArray();
        t = br.readLine().toCharArray();
    }

    public static void main(String[] args) throws IOException {
        Main m = new Main();
        m.inputData();
        System.out.println(m.solution());
    }

}
