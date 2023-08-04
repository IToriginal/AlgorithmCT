package solvedAc.class2;

import java.io.*;
import java.util.*;

public class _11866_Josephus0 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();
        Queue<Integer> queue = new LinkedList<>();
        String[] input = br.readLine().split(" ");

        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);

        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }
        result.append("<");

        while (queue.size() > 1) {
            for (int i = 0; i < k - 1; i++) {
                queue.offer(queue.poll());
            }
            result.append(queue.poll()).append(", ");
        }
        result.append(queue.poll()).append(">");
        System.out.println(result);
    }
}
