package solvedAc.class2;

import java.io.*;

public class _1929_소수구하기 {
    public static boolean[] prime;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();
        String[] input = br.readLine().split(" ");
        int m = Integer.parseInt(input[0]);
        int n = Integer.parseInt(input[1]);
        prime = new boolean[n + 1];
        prime();
        for (int i = m; i <= n; i++) {
            if (!prime[i]) {
                result.append(i).append("\n");
            }
        }
        System.out.println(result);
    }

    public static void prime() {
        prime[0] = prime[1] = true; // true: 소수 X, false: 소수 O

        for (int i = 2; i < Math.sqrt(prime.length); i++) {
            if (prime[i]) {
                continue;
            }
            for (int j = i * i; j < prime.length; j += i) {
                prime[j] = true;
            }
        }
    }
}
