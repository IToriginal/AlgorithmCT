package solvedAc.class1;

import java.io.*;

public class _2562_Maximum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = 0;
        int maxPos = 0;

        for (int i = 1; i < 10; i++) {
            int number = Integer.parseInt(br.readLine());
            if (number > max) {
                max = number;
                maxPos = i;
            }
        }
        System.out.println(max + "\n" + maxPos);
    }
}
