package baa_kingDog.deque._5430_AC; // BOJ5430 - G5

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    private String solution(String p, int n, String arrStr) {
        Deque<Integer> deque = new LinkedList<>();
        StringTokenizer st = new StringTokenizer(arrStr, "[],");
        while (st.hasMoreTokens()) {
            deque.add(Integer.parseInt(st.nextToken()));
        }

        boolean isReverse = false;

        for (char func : p.toCharArray()) {
            if (func == 'R') {
                isReverse = !isReverse;
            } else {
                if (deque.isEmpty()) {
                    return "error";
                }

                if (isReverse) {
                    deque.removeLast();
                } else {
                    deque.removeFirst();
                }
            }
        }

        StringBuilder sb = new StringBuilder("[");
        while (!deque.isEmpty()) {
            sb.append(isReverse ? deque.removeLast() : deque.removeFirst());
            if (!deque.isEmpty()) {
                sb.append(',');
            }
        }
        sb.append(']');

        return sb.toString();
    }

    public static void main(String[] args) throws IOException {
        Main m = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        for (int testCase = 1; testCase <= T; testCase++) {
            String p = br.readLine();
            int n = Integer.parseInt(br.readLine());
            String arrStr = br.readLine();
            result.append(m.solution(p, n, arrStr)).append("\n");
        }
        System.out.println(result);
    }

}
