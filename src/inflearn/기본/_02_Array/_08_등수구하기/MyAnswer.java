package inflearn.기본._02_Array._08_등수구하기;

import java.io.*;
import java.util.Stack;

public class MyAnswer {
    public int[] solution(int N, String s) {
        Stack<Integer> stack = new Stack<>();
        String[] split = s.split(" ");

        int[] scores = new int[N];
        for (int i = 0; i < N; i++) {
            scores[i] = Integer.parseInt(split[i]);
            stack.push(scores[i]);
        }

        int[] rank = new int[N];
        for (int i = 0; i < N; i++) {
            int count = 1;
            int tmp = stack.peek();
            stack.pop();
            for (int j = 0; j < N; j++) {
                if (tmp < scores[j]) {
                    count++;
                }
            }
            rank[i] = count;
        }
        return rank;
    }

    public static void main(String[] args) throws IOException {
        MyAnswer T = new MyAnswer();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String s = br.readLine();
        int[] result = T.solution(N, s);
        for (int i = result.length - 1; i >= 0; i--) {
            System.out.print(result[i] + " ");
        }
    }
}
