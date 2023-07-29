package solvedAc.beginner;

import java.io.*;

public class _15552_FastPlus {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();

        int n = Integer.parseInt(input);
        for (int i = 0; i < n; i++) {
            String numbers = br.readLine();
            String[] number = numbers.split(" ");

            int a = Integer.parseInt(number[0]);
            int b = Integer.parseInt(number[1]);
            int result = a + b;

            bw.write(result + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
