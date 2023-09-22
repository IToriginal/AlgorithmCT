package inflearn.응용._01_시뮬레이션_구현._01_사다리타기;

import java.util.*;
import java.io.*;

public class Answer {
    public char[] solution(int n, int[][] ladder){
        char[] answer = new char[n];
        for (int i = 0; i < n; i++) answer[i] = (char)(i + 65);
        for (int[] line : ladder) {
            for (int x : line) {
                char tmp = answer[x];
                answer[x] = answer[x - 1];
                answer[x - 1] = tmp;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Answer T = new Answer();
        System.out.println(Arrays.toString(T.solution(5, new int[][]{{1, 3}, {2, 4}, {1, 4}})));
        System.out.println(Arrays.toString(T.solution(7, new int[][]{{1, 3, 5}, {1, 3, 6}, {2, 4}})));
        System.out.println(Arrays.toString(T.solution(8, new int[][]{{1, 5}, {2, 4, 7}, {1, 5, 7}, {2, 5, 7}})));
        System.out.println(Arrays.toString(T.solution(12, new int[][]{{1, 5, 8, 10}, {2, 4, 7}, {1, 5, 7, 9, 11}, {2, 5, 7, 10}, {3, 6, 8, 11}})));
    }
}
