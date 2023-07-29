package solvedAc.beginner;

import java.io.*;

public class _5597_TaskConfirmation {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] flag = new boolean[31];

        for (int i = 1; i <= 28; i++) {
            String input = br.readLine();
            int number = Integer.parseInt(input);
            flag[number] = true;
        }

        for (int i = 1; i <= 30; i++) {
            if (!flag[i]) {
                System.out.println(i);
            }
        }
        br.close();
    }
}
