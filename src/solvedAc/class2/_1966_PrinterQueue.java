package solvedAc.class2;

import java.io.*;
import java.util.*;

public class _1966_PrinterQueue {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();
        int testCase = Integer.parseInt(br.readLine());

        while (testCase-- > 0) {
            String[] input = br.readLine().split(" ");
            int n = Integer.parseInt(input[0]);
            int m = Integer.parseInt(input[1]);

            LinkedList<int[]> queue = new LinkedList<>();

            String[] priorities = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                queue.offer(new int[]{i, Integer.parseInt(priorities[i])});
            }

            int count = 0;
            while (!queue.isEmpty()) {
                int[] front = queue.poll();
                boolean isMax = true;

                for (int i = 0; i < queue.size(); i++) {
                    if (front[1] < queue.get(i)[1]) {
                        queue.offer(front);

                        for (int j = 0; j < i; j++) {
                            queue.offer(queue.poll());
                        }

                        isMax = false;
                        break;
                    }
                }

                if (!isMax) {
                    continue;
                }

                count++;
                if (front[0] == m) {
                    break;
                }
            }
            result.append(count).append('\n');
        }
        System.out.println(result);
    }
}
