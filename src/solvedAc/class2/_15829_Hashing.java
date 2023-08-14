package solvedAc.class2;

import java.io.*;

public class _15829_Hashing {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int L = Integer.parseInt(br.readLine());
        String input = br.readLine();
        long sum = 0;
        long pow = 1;
        int M = 1234567891;
        int base = 31;

        for (int i = 0; i < L; i++) {
            sum = (sum + (input.charAt(i) - 'a' + 1) * pow) % M;
            pow = (pow * base) % M;
        }
        System.out.println(sum);
    }
}
