package solvedAc.class3.나는야포켓몬마스터이다솜_1620;

import java.io.*;
import java.util.*;

public class Main {
    static int n, m;
    static HashMap<String, Integer> map = new HashMap<>();
    static boolean typeCheck(String s) {
        return s.chars().allMatch(Character::isDigit);
    }
    
    public String[] solution(String[] pokemon, String[] question) {
        String[] answer = new String[m];

        for (int i = 1; i <= n; i++) {
            String name = pokemon[i - 1];
            map.put(name, i);
        }

        for (int i = 0; i < m; i++) {
            if (typeCheck(question[i])) {
                int idx = Integer.parseInt(question[i]);
                answer[i] = pokemon[idx - 1];
            } else {
                answer[i] = String.valueOf(map.get(question[i]));
            }
        }

        return answer;
    }
    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // N = 도감에 수록되어 있는 포켓몬의 개수, M = 문제의 개수
        String[] input = br.readLine().split(" ");
        n = Integer.parseInt(input[0]); // ex) 26
        m = Integer.parseInt(input[1]); // ex) 5

        String[] pokemon = new String[n];
        for (int i = 0; i < n; i++) pokemon[i] = br.readLine();

        String[] question = new String[m];
        for (int i = 0; i < m; i++) question[i] = br.readLine();

        for (String x : T.solution(pokemon, question)) System.out.println(x);
    }
}
