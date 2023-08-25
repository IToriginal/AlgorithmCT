package inflearn._05_Stack_Queue._03_크레인인형뽑기_카카오;

import java.io.*;
import java.util.*;

/**
 * 2023. 08. 25 (금): 1차 구현 실패
 */

public class MyAnswer {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for (int pos : moves) {
            for (int i = 0; i < board.length; i++) {
                if (board[i][pos - 1] != 0) {
                    int tmp = board[i][pos - 1];
                    board[i][pos - 1] = 0;
                    if (!stack.isEmpty() && tmp == stack.peek()) {
                        answer += 2;
                        stack.pop();
                    } else stack.push(tmp);
                    break;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        MyAnswer T = new MyAnswer();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] board = new int[n][n];
        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            for (int j = 0; j < n; j++) {
                board[i][j] = Integer.parseInt(input[j]);
            }
        }
        int m = Integer.parseInt(br.readLine());
        int[] moves = new int[m];
        String[] input2 = br.readLine().split(" ");
        for (int i = 0; i < m; i++) {
            moves[i] = Integer.parseInt(input2[i]);
        }
        System.out.println(T.solution(board, moves));
    }
}