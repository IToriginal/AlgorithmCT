package solvedAc.beginner;

import java.io.*;

public class _2739_MultiplicationTable {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int n = Integer.parseInt(input);

        for (int i = 1; i <= 9; i++) {
            int result = n * i;
            System.out.println(n + " * " + i + " = " + result);
        }
    }
}
