package solvedAc.class3.Z_1074;

import java.io.*;
import java.util.*;

public class Main {
    static int n, r, c, answer;
    private void recursion(int x, int y, int size) {
        if (size == 1) return;
        int newSize = size / 2;
        if (r < x + newSize && c < y + newSize) {
            recursion(x, y, newSize);
        }
        if (r < x + newSize && c >= y + newSize) {
            answer += (size * size) / 4;
            recursion(x, y + newSize, newSize);
        }
        if (r >= x + newSize && c < y + newSize) {
            answer += ((size * size) / 4) * 2;
            recursion(x + newSize, y, newSize);
        }
        if (r >= x + newSize && c >= y + newSize) {
            answer += ((size * size) / 4) * 3;
            recursion(x + newSize, y + newSize, newSize);
        }
    }

    public int solution(int[] arr) {
        answer = 0;
        n = arr[0];
        r = arr[1];
        c = arr[2];
        recursion(0, 0, (int)Math.pow(2, n));
        return answer;
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[3];
        String[] input = br.readLine().split(" ");
        arr[0] = Integer.parseInt(input[0]); // n
        arr[1] = Integer.parseInt(input[1]); // r
        arr[2] = Integer.parseInt(input[2]); // c
        System.out.println(T.solution(arr));
    }
}
