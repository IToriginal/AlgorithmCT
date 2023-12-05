package inflearn.기본._01_String._10_가장짧은문자거리;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static String s;
    private static char t;

    private int[] solution() {
        int[] answer = new int[s.length()];
        int p = 1000;

        // Forward pass
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == t) {
                p = 0;
                answer[i] = p;
            } else {
                p++;
                answer[i] = p;
            }
        }

        // Backward pass
        p = 1000;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == t) {
                p = 0;
            } else {
                p++;
                answer[i] = Math.min(answer[i], p);
            }
        }

        return answer;
    }

    private void inputData() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        s = input[0];
        t = input[1].charAt(0);
    }

    public static void main(String[] args) throws IOException {
        Main m = new Main();
        m.inputData();
        for (int dist : m.solution()) System.out.print(dist + " ");
    }

}
