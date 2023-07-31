package solvedAc.class1;

import java.io.*;

public class _2439_PrintOutStars_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int line = Integer.parseInt(br.readLine());

        for (int i = 1; i <= line; i++) {
            for (int j = 0; j < line-i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
